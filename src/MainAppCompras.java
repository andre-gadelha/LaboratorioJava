import java.util.Scanner;

public class MainAppCompras {

    public static void main(String[] args) {
        //Declarando que o sistema ficará scaneando as ações do usuário
        Scanner entradaUsuario = new Scanner(System.in);

        System.out.println("Bem Vindo ao APP de  COMPRAS");

        System.out.println("Informe o limite do seu cartão:");
        int limiteCartao = entradaUsuario.nextInt();

        if (limiteCartao > 0) {

            boolean continuar = true;
            int querContinuar;

            while (continuar == true ) {

                System.out.println("Descrição do Produto:");
                String descricaoProduto = entradaUsuario.next();

                System.out.println("Valor do Produto:");
                int valorProduto = entradaUsuario.nextInt();

                if ( valorProduto <= limiteCartao) {

                    limiteCartao -= valorProduto;

                    System.out.println("Você comprou um(a) " + descricaoProduto + " no valor de R$ " + valorProduto + ".");
                    System.out.println("O limite do seu cartão foi atualizado para R$ " + limiteCartao + ".");

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
