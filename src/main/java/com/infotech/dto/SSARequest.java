package com.infotech.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class SSARequest {
	private String name;
	//@JsonFormat(shape = Shape.STRING, pattern = "dd-MM-yyyy")
	private LocalDate dob;
	private Long ssn;

	public SSARequest() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Long getSsn() {
		return ssn;
	}

	public void setSsn(Long ssn) {
		this.ssn = ssn;
	}



}
