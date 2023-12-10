package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_proveedor")
public class Proveedor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idproveedor")
	private Integer id;
	
	@Column(name = "nombre_rs")
	private String nombre;
	
	@Column
	private String telefono;
	
	@Column
	private String email;
	
//	@JsonManagedReference
//	@OneToMany(cascade = CascadeType.ALL, 
//			mappedBy = "proveedor", fetch = FetchType.LAZY)
//    private Set<Producto> productos;
}