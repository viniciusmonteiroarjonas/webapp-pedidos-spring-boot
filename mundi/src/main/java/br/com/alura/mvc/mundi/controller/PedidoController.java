package br.com.alura.mvc.mundi.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.alura.mvc.mundi.dto.PedidoDto;
import br.com.alura.mvc.mundi.model.Pedido;
import br.com.alura.mvc.mundi.repository.PedidoRepository;

@Controller
@RequestMapping("pedido")
public class PedidoController {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@GetMapping("novo")
	public String novo(PedidoDto requisicao) {
		return "pedido/novo";
	}
	
	@PostMapping("novo")
	public String create(@Valid PedidoDto requisicao, BindingResult result) {
		
		if(result.hasErrors()) {
			return "pedido/novo";
		}
		
		Pedido pedido = requisicao.toPedido();
		pedidoRepository.save(pedido);
		
		return "pedido/novo";
	}
	

}
