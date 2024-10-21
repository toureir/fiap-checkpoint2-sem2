package br.com.fiap.ecommerce.dtos;

import lombok.Data;

@Data
public class ClienteRequestUpdateDto {
	private String nome;
	private String cep;
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String municipio;
	private String uf;
}