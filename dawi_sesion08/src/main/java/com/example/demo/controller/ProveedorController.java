package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Proveedor;
import com.example.demo.service.ProveedorService;

@Controller
public class ProveedorController {

	@Autowired
	ProveedorService service;

	@GetMapping("/proveedores")
	public String proveedorSel(Model model) {
		model.addAttribute("proveedores", service.proveedorSel());
		return "proveedores";
	}

	@GetMapping("/proveedoresNuevo")
	public String nuevo(Model model) {
		model.addAttribute("proveedor", new Proveedor());
		return "proveedoresIns";
	}

	@PostMapping("/proveedoresIns")
	public String proveedorIns(@Validated Proveedor proveedor, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "proveedoresIns";
		}
		service.proveedorInsUpd(proveedor);
		return "redirect:/proveedores";
	}
	
	@GetMapping("/proveedoresGet/{id}")
	public String actualizar(@PathVariable("id") Integer id,Model model) {
		model.addAttribute("proveedor", service.proveedorGet(id));
		return "proveedoresUpd";
	}
	
	@PostMapping("/proveedoresUpd")
	public String proveedoresUpd(@Validated Proveedor proveedor, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "proveedoresIns";
		}
		service.proveedorInsUpd(proveedor);
		return "redirect:/proveedores";
	}
	
	@GetMapping("/proveedoresDel")
	public String proveedoresDel(@RequestParam("id") Integer id) {
		service.proveedorDel(id);
		return "redirect:/proveedores";
	}
}
