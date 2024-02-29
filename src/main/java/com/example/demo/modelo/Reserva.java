package com.example.demo.modelo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "reservas")

public class Reserva {
	

		
 		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id_puesto;
		
		
		@Column(name = "total_pagar", length = 50, nullable = false )
		private Integer total;
		

		@Column(name = "placa", length = 80, nullable = false, unique = true )
		private String placa;
		
		@Column(name = "fecha", length = 100, nullable = false )
		private String fecha;
		
		@Column(name = "destino", length = 100, nullable = false )
		private String destino;
		
		@Column(name = "hora_salida", length = 100, nullable = false )
		private String salida;
		
		@Column(name= "puestos_ocupados", length = 100, nullable = false)
		private Integer ocupados;
		
		@Column(name ="puestos_disponibles", length = 100, nullable = false)
		private Integer disponibles;
		
		@ManyToOne()
		@JoinColumn(name="id",referencedColumnName="id")
		private Usuario usuario;
		
		@ManyToOne()
		@JoinColumn(name="numero_placa",referencedColumnName="numero_placa")
		private Carro carro;

		public Reserva() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Reserva(Integer total, String placa, String fecha, String destino, String salida, Integer ocupados,
				Integer disponibles, Usuario u, Carro c) {
			super();
			this.total = total;
			this.placa = placa;
			this.fecha = fecha;
			this.destino = destino;
			this.salida = salida;
			this.ocupados = ocupados;
			this.disponibles = disponibles;
			this.usuario= usuario;
			this.carro= carro;
		}

		public Long getId_puesto() {
			return id_puesto;
		}

		public void setId_puesto(Long id_puesto) {
			this.id_puesto = id_puesto;
		}

		public Integer getTotal() {
			return total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public String getPlaca() {
			return placa;
		}

		public void setPlaca(String placa) {
			this.placa = placa;
		}

		public String getFecha() {
			return fecha;
		}

		public void setFecha(String fecha) {
			this.fecha = fecha;
		}

		public String getDestino() {
			return destino;
		}

		public void setDestino(String destino) {
			this.destino = destino;
		}

		public String getSalida() {
			return salida;
		}

		public void setSalida(String salida) {
			this.salida = salida;
		}

		public Integer getOcupados() {
			return ocupados;
		}

		public void setOcupados(Integer ocupados) {
			this.ocupados = ocupados;
		}

		public Integer getDisponibles() {
			return disponibles;
		}

		public void setDisponibles(Integer disponibles) {
			this.disponibles = disponibles;
		}

		public Usuario getUsuario() {
			return usuario;
		}

		public void setUsuario(Usuario usuario) {
			this.usuario = usuario;
		}

		public Carro getCarro() {
			return carro;
		}

		public void setCarro(Carro carro) {
			this.carro = carro;
		}

		
}