package com.ProjectKelompok18.ProjectKelompok18UTS.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor 
@ToString

public class StatusBerita {

	private Berita berita;
	private String status;
	private String message;
	
	public StatusBerita(Berita berita, String status, String message) {
		this.berita = berita;
		this.status = status;
		this.message = message;
	}

	public Berita getBerita() {
		return berita;
	}

	public void setBerita(Berita berita) {
		this.berita = berita;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
