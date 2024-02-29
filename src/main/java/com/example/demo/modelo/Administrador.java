package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="administrador")

public class Administrador {

        @Id
        @Column(name="admin")
        private Long id;

        @Column(name = "contraseña", length = 50, nullable = false, unique = true )
        private String contraseña;

		public Administrador() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Administrador(Long id, String contraseña) {
			super();
			this.id = id;
			this.contraseña = contraseña;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getContraseña() {
			return contraseña;
		}

		public void setContraseña(String contraseña) {
			this.contraseña = contraseña;
		}
        
    }