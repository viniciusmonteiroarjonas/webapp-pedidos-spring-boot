package br.com.alura.mvc.mundi.dto;

import javax.validation.constraints.NotBlank;

import br.com.alura.mvc.mundi.model.Pedido;

public class PedidoDto {

	@NotBlank
	private String nomeProduto;
	
	@NotBlank
	private String urlProduto;
	
	@NotBlank
	private String urlImage;
	
	private String descricao;

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getUrlProduto() {
		return urlProduto;
	}

	public void setUrlProduto(String urlProduto) {
		this.urlProduto = urlProduto;
	}

	public String getUrlImagem() {
		return urlImage;
	}

	public void setUrlImagem(String urlImagem) {
		this.urlImage = urlImagem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Pedido toPedido() {
		Pedido pedido = new Pedido();
		pedido.setDescricao(descricao);
		pedido.setNomeProduto(nomeProduto);
		pedido.setUrlImage(urlImage);
		pedido.setUrlProduto(urlProduto);
		return pedido;
	}

}
