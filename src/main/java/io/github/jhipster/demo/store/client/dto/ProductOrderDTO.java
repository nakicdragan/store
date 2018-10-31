package io.github.jhipster.demo.store.client.dto;

import java.time.Instant;

public class ProductOrderDTO {
	private Long id;
	private Instant placedDate;
	private String code;
	private String invoiceId;

	public ProductOrderDTO() {
	}
// getter and setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getPlacedDate() {
		return placedDate;
	}

	public void setPlacedDate(Instant placedDate) {
		this.placedDate = placedDate;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}
	
}