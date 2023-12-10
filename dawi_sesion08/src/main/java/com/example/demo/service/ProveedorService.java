package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Proveedor;
import com.example.demo.repository.ProveedorRepository;

@Service
public class ProveedorService {
	@Autowired
	ProveedorRepository repository;

	public List<Proveedor> proveedorSel() {
		return repository.findAll();
	}

	public Proveedor proveedorInsUpd(Proveedor proveedor) {
		return repository.save(proveedor);
	}

	public Proveedor proveedorGet(Integer id) {
		return repository.findById(id).orElse(new Proveedor());
	}

	public void proveedorDel(Integer id) {
		repository.deleteById(id);
	}
}
