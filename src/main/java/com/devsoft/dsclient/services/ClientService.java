package com.devsoft.dsclient.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsoft.dsclient.dto.ClientDTO;
import com.devsoft.dsclient.entities.Client;
import com.devsoft.dsclient.repositories.ClientRepository;

@ Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public ClientDTO findById(Long id) {
		Optional<Client> result = repository.findById(id);
		Client client = result.get();
		ClientDTO dto = new ClientDTO(client);
		return dto;
	}
	
	@Transactional(readOnly = true)
	public List<ClientDTO> findAll(){
		List<Client> result = repository.findAll();
		return result.stream().map(x -> new ClientDTO(x)).toList();
	}
}
