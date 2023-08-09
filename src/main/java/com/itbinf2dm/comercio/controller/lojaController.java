package com.itbinf2dm.comercio.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2dm.comercio.model.Produto;

@Controller
@RequestMapping("/comercio/produtos")
public class lojaController {
	List<Produto> listaDeProdutos = new ArrayList<Produto>();
	
@GetMapping("/listar")
public String listarProdutos(Model model) {
	Produto p1 = new Produto();
	p1.setId  (20l);
	p1.setNome("Máquina de Lavar Brastemp 12 litros");
	p1.setCodigoBarras("JGIEI453JD2KMEU5311");
	p1.setPreco(123445.32);
	p1.setDescricao("maquinas de lavar suas roupas imundas e fedidas");
	p1.setCodStatus("cabo felas");
		listaDeProdutos.add(p1);
	
	Produto p2 = new Produto();
	p2.setId  (21l);
	p2.setNome("tv sansungo 69 polegadas ");
	p2.setCodigoBarras("l3lfespwepovowl=wpr1121");
	p2.setPreco(123445.32);
	p2.setDescricao("tv para ver aquela novelinha aquele fut de cria");
	p2.setCodStatus("ainda tem felas");

	listaDeProdutos.add(p2);
	model.addAttribute("listaDeProdutos",listaDeProdutos);
	return "produtos";
	
}
@GetMapping("/novo-prod")
public String novoProduto(Model model, Produto produto) {
	model.addAttribute("produto",produto);
	return"novo-prod";
}
@PostMapping("/add-prod")
public String gravarNovoProduto(Model model, Produto produto) {
 {
	listaDeProdutos.add(produto);
   return 	"redirect:/comercio/produtos/listar";
}
}
}
