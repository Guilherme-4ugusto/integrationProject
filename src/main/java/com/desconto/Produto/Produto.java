package com.desconto.Produto;

public class Produto {
    private String descricao;
    private long id;
    private float valorCompra;
    private float valorVenda;

    public Produto(String descricao, long id, float valorCompra, float valorVenda) {
        this.descricao = descricao;
        this.id = id;
        this.valorCompra = valorCompra;
        this.valorVenda = valorVenda;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }
}
