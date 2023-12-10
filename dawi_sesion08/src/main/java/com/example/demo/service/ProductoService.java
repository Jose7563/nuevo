package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Producto;
import com.example.demo.repository.ProductoRepository;

@Service
public class ProductoService {

	@Autowired
	ProductoRepository repository;
	
	//CRUD
	
	//Select
	public List<Producto> productoSel(){
		return repository.findAll();
	}
	
	//Insert y Update
	public Producto productoInsUpd(Producto producto) {
		return repository.save(producto);
	}
	
	//Select * from Where id = {id}
	public Producto productoGet(String id) {
		return repository.findById(id)
				.orElse(new Producto());
	}
	
	//Delete
	public void productoDel(String id) {
		repository.deleteById(id);
	}	
}
