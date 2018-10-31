package io.github.jhipster.demo.store.client;

import java.util.ArrayList;
import java.util.List;

import io.github.jhipster.demo.store.client.dto.ProductOrderDTO;

public class CrmClientFallback implements CrmClient {
	
	@Override
	public List<ProductOrderDTO> getAllCrmProductOrders() {
		return new ArrayList<>();
	}
}