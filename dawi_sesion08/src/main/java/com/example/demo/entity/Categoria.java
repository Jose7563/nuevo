package com.example.demo.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_categorias")
public class Categoria implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "idcategoria")
	private Integer id;
	
	@Column
	private String descripcion;
	
//	@JsonManagedReference
//	@OneToMany(cascade = CascadeType.ALL, 
//			mappedBy = "categoria", fetch = FetchType.LAZY)
//    private Set<Producto> productos;
}
