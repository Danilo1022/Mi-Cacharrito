package com.example.demo.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Carro;
import com.example.demo.modelo.Reserva;

@Repository
public interface RepositorioCarro extends JpaRepository<Carro, Long>{


}