package com.desconto.util;

import com.desconto.Produto.Produto;
import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class UtilTest {

    private Produto produto = new Produto("camisa", 1, 20, 30);


    @Test
    public void deveRetornarValorComDescontoIgualAVinteESete() {
        float valorComDesconto = Util.calcularValorComDesconto(produto, 10F);
        Assert.assertEquals(27, valorComDesconto, 0);
    }

    @Test
    public void deveRetornarFalseParaValorComDescontoMenor(){
        boolean isValorComDescontoMenor = Util.isValorComDescontoMenorQueValorDeCompra(produto, 30);
        Assert.assertFalse("O valor com desconto deveria ser maior que o valor de compra", isValorComDescontoMenor);
    }

    @Test
    public void deveRetornarLucroDeCinquentaPorcento(){
        float porcentagemLucro = Util.calcularPercentualDeLucroDaVenda(produto, 30);
        Assert.assertEquals(50, porcentagemLucro, 0);
    }
}
