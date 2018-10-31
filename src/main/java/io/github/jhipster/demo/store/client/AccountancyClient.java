package io.github.jhipster.demo.store.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.github.jhipster.demo.store.client.dto.InvoiceDTO;

@FeignClient("accountancy")
public interface AccountancyClient {
	@RequestMapping(method = RequestMethod.GET, value = "/api/invoices/{id}")
	InvoiceDTO getInvoice(@PathVariable("id") String id);
}