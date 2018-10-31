package io.github.jhipster.application.web.rest;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import io.github.jhipster.application.web.api.OrdersApiDelegate;
import io.github.jhipster.application.web.api.model.Order;
import io.github.jhipster.application.web.api.model.Orders;
import io.github.jhipster.demo.store.client.AccountancyClient;
import io.github.jhipster.demo.store.client.CrmClient;
import io.github.jhipster.demo.store.client.dto.InvoiceDTO;
import io.github.jhipster.demo.store.client.dto.ProductOrderDTO;

/**
 * REST controller for managing the current user's account.
 */
@Component
public class OrdersResource implements OrdersApiDelegate {

	private final CrmClient crmClient;
	private final AccountancyClient accountancyClient;

	public OrdersResource(CrmClient crmClient, AccountancyClient accountancyClient) {
		this.crmClient = crmClient;
		this.accountancyClient = accountancyClient;
	}

	@Override
	public ResponseEntity<Orders> getDetailedOrders() {
		List<ProductOrderDTO> allCrmProductOrders = crmClient.getAllCrmProductOrders();
		Orders orders = new Orders();
		for (ProductOrderDTO crmOrder : allCrmProductOrders) {
		Order order = new Order();
		order.setId(crmOrder.getId());
		order.setCode(crmOrder.getCode());
		String invoiceId = crmOrder.getInvoiceId();
		order.setInvoiceId(invoiceId);
		InvoiceDTO invoice = accountancyClient.getInvoice(invoiceId);
		order.setPaymentAmount(invoice.getPaymentAmount());
		order.setPaymentMethod(invoice.getPaymentMethod());
		order.setPaymentStatus(invoice.getStatus());
		order.setPaymentDate(LocalDateTime.ofInstant(invoice.getDate(), ZoneId.systemDefault()).toString());
		orders.add(order);
		}
		return new ResponseEntity<>(orders, HttpStatus.OK);
		
	}
}