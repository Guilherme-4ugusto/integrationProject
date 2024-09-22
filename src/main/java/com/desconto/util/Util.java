package com.desconto.util;

import com.desconto.Produto.Produto;

public class Util {
    public static float calcularValorComDesconto(Produto produto, float porcentagem){
        float valorDesconto = produto.getValorVenda() * (porcentagem/100);
        return produto.getValorVenda() - valorDesconto;
    }

    public static boolean isValorComDescontoMenorQueValorDeCompra(Produto produto, float valorComDesconto){
        return produto.getValorCompra() > valorComDesconto;
    }

    public static float calcularPercentualDeLucroDaVenda(Produto produto, float valorVenda){
        return ((valorVenda - produto.getValorCompra() )/produto.getValorCompra())*100;
    }
}
