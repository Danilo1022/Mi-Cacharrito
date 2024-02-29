package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Carros")

public class Carro {

        @Id
        @Column(name="numero_placa")
        private Long id;

            @Column(name = "cantidad_puesto", length = 100, nullable = false )
            private Integer cantidadPuesto;

            @Column(name = "disponibilidad", length = 100, nullable = false )
            private Integer disponibilidad;

			public Carro() {
				super();
				// TODO Auto-generated constructor stub
			}

			public Carro(Long id, Integer cantidadPuesto, Integer disponibilidad) {
				super();
				this.id = id;
				this.cantidadPuesto = cantidadPuesto;
				this.disponibilidad = disponibilidad;
			}

			public Long getId() {
				return id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public Integer getCantidadPuesto() {
				return cantidadPuesto;
			}

			public void setCantidadPuesto(Integer cantidadPuesto) {
				this.cantidadPuesto = cantidadPuesto;
			}

			public Integer getDisponibilidad() {
				return disponibilidad;
			}

			public void setDisponibilidad(Integer disponibilidad) {
				this.disponibilidad = disponibilidad;
			}

			
            
}