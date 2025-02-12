package com.devsoft.dsclient.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsoft.dsclient.entities.Client;
import com.devsoft.dsclient.repositories.ClientRepository;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {
	
	@Autowired
	private ClientRepository repository;
	
	@GetMapping
	public String teste() {
		Optional<Client> result = repository.findById(1L);
		Client client = result.get();
		return client.getName();
	}

}
