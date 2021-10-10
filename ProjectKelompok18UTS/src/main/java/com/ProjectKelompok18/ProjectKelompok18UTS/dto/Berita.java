package com.ProjectKelompok18.ProjectKelompok18UTS.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Berita {
	private String idBerita;
	private String judulBerita;
	private String isiBerita;
	private String kategoriBerita;
	
	public Berita() {
		
	}
	
	public Berita(String idBerita, String judulBerita, String isiBerita, String kategoriBerita) {
		this.idBerita = idBerita;
		this.judulBerita = judulBerita;
		this.isiBerita = isiBerita;
		this.kategoriBerita = kategoriBerita;
	}
	
	public String getIdBerita() {
		return idBerita;
	}
	public void setIdBerita(String idBerita) {
		this.idBerita = idBerita;
	}
	public String getJudulBerita() {
		return judulBerita;
	}
	public void setJudulBerita(String judulBerita) {
		this.judulBerita = judulBerita;
	}
	public String getIsiBerita() {
		return isiBerita;
	}
	public void setIsiBerita(String isiBerita) {
		this.isiBerita = isiBerita;
	}
	public String getKategoriBerita() {
		return kategoriBerita;
	}
	public void setKategoriBerita(String kategoriBerita) {
		this.kategoriBerita = kategoriBerita;
	}
}
