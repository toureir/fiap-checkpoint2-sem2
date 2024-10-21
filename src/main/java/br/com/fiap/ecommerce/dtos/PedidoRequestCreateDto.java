package br.com.fiap.ecommerce.dtos;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Data;

@Data
public class PedidoRequestCreateDto {
	private Long idCliente;
	private LocalDate dataPedido;
	private String status;
	private String formaPagamento;
	private BigDecimal valorTotal;
}