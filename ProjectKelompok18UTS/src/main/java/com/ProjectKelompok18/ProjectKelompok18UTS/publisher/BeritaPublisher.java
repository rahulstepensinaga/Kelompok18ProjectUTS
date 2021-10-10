package com.ProjectKelompok18.ProjectKelompok18UTS.publisher;

import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProjectKelompok18.ProjectKelompok18UTS.config.Config;
import com.ProjectKelompok18.ProjectKelompok18UTS.dto.Berita;
import com.ProjectKelompok18.ProjectKelompok18UTS.dto.StatusBerita;

@RestController
@RequestMapping("/berita")
public class BeritaPublisher { 
	
	@Autowired
	private RabbitTemplate template;
	
	@PostMapping("/{namamediaBerita}")
	public String bookOrder(@RequestBody Berita berita, @PathVariable String namamediaBerita) {
		berita.setIdBerita(UUID.randomUUID().toString());
		
		StatusBerita statusBerita = new StatusBerita(berita, "Proses", "Berhasil nambahkan berita pada media " + namamediaBerita);
		template.convertAndSend(Config.EXCHANGE, Config.ROUTING_KEY, statusBerita);
		return "Berhasil!!!";
	}
}