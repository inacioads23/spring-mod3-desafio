package com.devsoft.dsclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsoft.dsclient.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
