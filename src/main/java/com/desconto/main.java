package com.desconto;

import com.desconto.Produto.Produto;
import com.desconto.util.Util;

public class main {
    public static void main(String [] args){
        float lucroMinimo = 30;
        Produto produto = new Produto("camisa", 1, 78, 150);
        float valorComDesconto = Util.calcularValorComDesconto(produto, 10);
        System.out.println("O valor com desconto é: "+valorComDesconto);
        System.out.println(Util.isValorComDescontoMenorQueValorDeCompra(produto, valorComDesconto) ? "Desconto inválido!! Excede o valor da compra do produto." : "Desconto válido!!");
        float lucroVenda = Util.calcularPercentualDeLucroDaVenda(produto, valorComDesconto);
        System.out.println("O lucro da venda é: "+lucroVenda+"%");
        System.out.println(lucroVenda < lucroMinimo ? "Desconto inválido!! O lucro com desconto é menor que o lucro mínimo." : "Desconto válido!!");
    }
}
