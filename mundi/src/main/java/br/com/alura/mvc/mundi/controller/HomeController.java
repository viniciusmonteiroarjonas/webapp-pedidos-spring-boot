package br.com.alura.mvc.mundi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mundi.model.Pedido;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String Home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Xiomi Readmi Note 8");
		pedido.setUrlImage("https://i.zst.com.br/thumbs/12/1c/30/1365880066.jpg");
		pedido.setUrlProduto("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTawgzAt19LcnIzrCSOq66gHwam8zwmKMEcPg&usqp=CAU");
		pedido.setDescricao("Precisa adicionar uma descrição do produto detalhada");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}

}
