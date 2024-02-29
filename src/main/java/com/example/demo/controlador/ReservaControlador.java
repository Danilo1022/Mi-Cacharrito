package com.example.demo.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Carro;
import com.example.demo.modelo.Reserva;
import com.example.demo.modelo.Usuario;
import com.example.demo.repositorio.RepositorioCarro;
import com.example.demo.repositorio.RepositorioReserva;
import com.example.demo.repositorio.RepositorioUsuario;

@RestController
@RequestMapping("/ver/e2")
public class ReservaControlador {

    @Autowired
    private RepositorioReserva repositorio;
    @Autowired
    private RepositorioUsuario repositorioU;
    @Autowired
	private RepositorioCarro repositorioC;
    

    @GetMapping("/reservar")
    public List<Reserva> guardarReserva() {
    	
    	Usuario u= this.repositorioU.findById(111L).get();
    	Carro c = this.repositorioC.findById(124L).get();
    	Integer i= c.getCantidadPuesto()- c.getDisponibilidad();
    	int  f= c.getDisponibilidad(); 
    	
    	Reserva r = new Reserva(10000,"12/08","La Dorada","10:PM",1,2);
		this.repositorio.save(r);
        return this.repositorio.findAll();
    }

    @GetMapping("/reservas")
    public List<Reserva> verReservas() {
        return repositorio.findAll();
    }
}


