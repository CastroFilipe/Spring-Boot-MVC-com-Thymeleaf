package com.filipe.demo.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.filipe.demo.domain.Funcionario;
import com.filipe.demo.domain.UF;
import com.filipe.demo.service.InterfaceCargoService;
import com.filipe.demo.service.InterfaceFuncionarioService;
import com.filipe.demo.domain.Cargo;

@Controller
@RequestMapping("/funcionarios")
public class FuncionarioController {
	
	@Autowired
	private InterfaceFuncionarioService funcionarioService;
	
	@Autowired
	private InterfaceCargoService cargoService;

	@GetMapping("/cadastrar")
	public String cadastrar() {
		return "funcionario/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar() {
		return "funcionario/lista";
	}
	
	@PostMapping("/salvar")
	public String salvar(Funcionario funcionario, RedirectAttributes attr) {
		funcionarioService.salvar(funcionario);
		attr.addFlashAttribute("success", "Funcionário inserido com sucesso");
		return "redirect:/funcionarios/cadastrar";
	}
	
	@ModelAttribute("cargos")
	public List<Cargo> getCargos(){
		return cargoService.buscarTodos();
	}

	@ModelAttribute("ufs")
	public UF[] getUFs() {
		return UF.values();
	}
}
