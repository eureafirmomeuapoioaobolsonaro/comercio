package com.itbinf2dm.comercio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
@RequestMapping("/comercio/produtos")
public class lojaController {
	
@GetMapping("/listar")
public String listarProdutos() {
	return "produtos";
	
}

	

}
