package io.github.jhipster.demo.store.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.github.jhipster.demo.store.client.dto.ProductOrderDTO;

@FeignClient(name = "crm", fallback = CrmClientFallback.class)
public interface CrmClient {
	@RequestMapping(method = RequestMethod.GET, value = "/api/product-orders")
	public List<ProductOrderDTO> getAllCrmProductOrders();
}
