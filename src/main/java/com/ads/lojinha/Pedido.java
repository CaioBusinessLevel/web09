package com.ads.lojinha;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    private int codigoCliente;      // código do cliente que fez o pedido
    private LocalDateTime dataPedido;
    private double valorTotal;
    private String formaPagamento;  // ex: PIX, CARTAO, BOLETO
    private String status;          // ex: ABERTO, PAGO, ENVIADO, ENTREGUE, CANCELADO
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getCodigoCliente() {
        return codigoCliente;
    }
    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
    public LocalDateTime getDataPedido() {
        return dataPedido;
    }
    public void setDataPedido(LocalDateTime dataPedido) {
        this.dataPedido = dataPedido;
    }
    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public String getFormaPagamento() {
        return formaPagamento;
    }
    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }


}
