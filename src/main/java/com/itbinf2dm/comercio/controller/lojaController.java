package com.itbinf2dm.comercio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
@RequestMapping("/comercio/produtos")
public class lojaController {
	Lista<Produto> listadeprodutos = new Arraylist<Produto>();
	
@GetMapping("/listar")
public String listarProdutos() {
	Produto p1 = new Produto();
	p1.id = 20l;
	p1.setNome("Máquina de Lavar Brastemp 12 litros");
	p1.setCodigoBarras("JGIEI453JD2KMEU5311");
	p1.setprecos(123445.32);
	
	listadeProdutos.add(p1);
	return "produtos";
	
}
@GetMapping("/novo-prod")
public String novoProduto() {
	return "novo-prod";
}
	

}
