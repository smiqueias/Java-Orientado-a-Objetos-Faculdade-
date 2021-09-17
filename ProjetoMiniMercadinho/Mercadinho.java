package MiniProjetoMercadinho;

import java.util.Scanner;

public class Mercadinho {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] produtos = new String[2];
        Float[] precos = new Float[2];
        int qtdProdutos = produtos.length;

        addingProductsAndPrices(produtos, scan, precos);

        System.out.println("Deseja realizar uma compra?");
        String resposta = scan.next();

        if (resposta.equals("SIM") || resposta.equals("Sim") || resposta.equals("sim")) {

            System.out.println("Produtos e Preços ");
            System.out.println("------------------");

            for (int i = 0; i < produtos.length; i++) {
                System.out.println("O produto " + produtos[i] + " tem o valor de R$ " + precos[i] + " reais.");

            }
            System.out.println("----------------------");

            for (int i = 0; i < produtos.length; i++) {

                System.out.println("Qual produto deseja comprar?");
                String produtoComprar = scan.next();

                searchProductPosition(produtoComprar, produtos);
                int posicaoProduto = searchProductPosition(produtoComprar, produtos);

                System.out.println("Produto escolhido | " + produtos[posicaoProduto]);
                System.out.println("Preço | " + precos[posicaoProduto]);
                System.out.println("Insira o valor do pagamento");
                float pagamentoCliente = scan.nextFloat();

                Caixa caixa = new Caixa();
                Pagar pagamento = new Pagar(pagamentoCliente, precos[posicaoProduto]);

                pagamento.pagamento(caixa);

            }
        }

    }

    public static int searchProductPosition(String produtoParaPesquisar, String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(produtoParaPesquisar)) {
                return i;
            }

        }
        return 0;
    }

    public static void addingProductsAndPrices(String[] produtos, Scanner scan, Float[] precos) {
        for (int i = 0; i < produtos.length; i++) {
            try {
                System.out.print("Adicione um produto ao seu inventário! | ");
                String produtosAdd = scan.next();
                produtos[i] = produtosAdd;

                System.out.print("Indique o valor do produto " + " | ");
                float valorProdutos = scan.nextFloat();
                precos[i] = valorProdutos;

            } catch (Exception e) {
                System.out.println("USE VIRGULA INVÉS DE PONTO");
                System.out.println(e.getMessage());
                e.printStackTrace();

            }
        }
    }

}
