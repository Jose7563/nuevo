package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_productos")
public class Producto {
	@Id
	@Column(name = "id_prod ")
	private String id;
	@Column(name = "des_prod ")
	private String descripcion;
	@Column(name = "stk_prod ")
	private Integer cantidad;
	@Column(name = "pre_prod ")
	private Double precio;
	@JsonBackReference
	@JoinColumn(name = "idcategoria", referencedColumnName = "idcategoria")
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	private Categoria categoria;
	@Column(name = "est_prod ")
	private Boolean estado;
	@JsonBackReference
	@JoinColumn(name = "idproveedor", referencedColumnName = "idproveedor ")
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	private Proveedor proveedor;
}
