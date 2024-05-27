package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Livre;

public interface DvdRepository extends JpaRepository<Livre, Integer> {

}
