import br.com.appcompras.CartaoDeCredito;
import br.com.appcompras.Compra;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class MainAppCompras {

    public static void main(String[] args) {
        //Declarando que o sistema ficará scaneando as ações do usuário
        Scanner entradaUsuario = new Scanner(System.in);

        System.out.println("Bem Vindo ao APP de  COMPRAS");

        System.out.println("Informe o limite do seu cartão:");
        double limiteCartao = entradaUsuario.nextDouble();

        CartaoDeCredito cartaoDeCredito = new CartaoDeCredito(limiteCartao);

        if (cartaoDeCredito.getLimite() > 0) {

            boolean continuar = true;
            int querContinuar;

            while (continuar == true ) {

                System.out.println("Descrição do Produto:");
                String descricaoProduto = entradaUsuario.next();

                System.out.println("Valor do Produto:");
                int valorProduto = entradaUsuario.nextInt();

                if (valorProduto <= cartaoDeCredito.getSaldo()) {

                    //Alimentando o objeto compra
                    Compra compra = new Compra(descricaoProduto, valorProduto);
                    //Adicionando compra no cartão
                    cartaoDeCredito.addCompra(compra);

                    System.out.println("Você comprou um(a) " + compra.getDescricaoProduto() + " no valor de R$ " + compra.getValorProduto() + ".");
                    System.out.println("O limite do seu cartão foi atualizado para R$ " + cartaoDeCredito.getSaldo() + ".");

                    System.out.println("Suas compras no Cartão:");
                    //Ordena a lista pela implementação da interface Comparable
                    Collections.sort(cartaoDeCredito.getCompras());
                    //Lista todas as compras ordenadas por valor (Crescente)
                    for(Compra c : cartaoDeCredito.getCompras()) {
                        System.out.println(c.getDescricaoProduto() + " - R$" + c.getValorProduto());
                    }

                    System.out.println("Para continuar digite 1 e para sair digite 0");
                    querContinuar = entradaUsuario.nextInt();


                    if (querContinuar == 1) {
                        continuar = true;
                    } else {
                        System.out.println("Finalizando compra...");
                        continuar = false;
                    }
                }else{
                    System.out.println("Limite insuficiente!");
                    System.out.println("Para continuar digite 1 e para sair digite 0");
                    querContinuar = entradaUsuario.nextInt();

                    if (querContinuar == 1) {
                        continuar = true;
                    } else {
                        System.out.println("Finalizando compra...");
                        continuar = false;
                    }
                }
            }
        }else{
            System.out.println("Cartão sem limite!");
        }

    }

}
