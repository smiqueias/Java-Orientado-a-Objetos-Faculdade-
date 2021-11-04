import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Products> products = new ArrayList<Products>(10);
        Scanner input = new Scanner(System.in);
        boolean running = true;
        String option;

        while (running) {

            showMenu();

            try {
                option = input.nextLine();
                switch (option) {
                    case "1":
                        insertProducts(products, input);
                        break;
                    case "2":
                        getAllProducts(products);
                        break;
                    case "3":
                        deleteProductById(products, input);
                        break;
                    case "4":
                        running = false;
                        System.out.println("Encerrando o programa...");
                        break;
                }
            }
            catch (InputMismatchException e) {
                e.printStackTrace();
                System.out.println("Entrada inválida.");
                System.out.println(e.getMessage());
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Erro inesperado.");
                System.out.println(e.getMessage());
            }


        }


    }

    private static void showMenu() {
        System.out.println("[1] Inserir produto");
        System.out.println("[2] Listar todos os produtos");
        System.out.println("[3] Excluir um produto");
        System.out.println("[4] Finalizar");
        System.out.print("Informe a opçao desejada: \n");
    }

    private static void insertProducts(ArrayList<Products> products, Scanner input) {
        String description;
        double price;
        String name;

        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Insira o nome do produto: ");
                name = input.next();
                input.nextLine();

                System.out.println("Insira a descrição do produto: ");
                description = input.next();
                input.nextLine();


                System.out.println("Insira preço do produto: ");
                price = input.nextDouble();
                input.nextLine();

                products.add(new Products(name, description, price));
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
                System.out.println("Posição não existente no vetor.");
                System.out.println(e.getMessage());

            } catch (InputMismatchException e) {
                e.printStackTrace();
                System.out.println("Entrada inválida.");
                System.out.println(e.getMessage());
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Erro inesperado.");
                System.out.println(e.getMessage());
            }
        }
    }

    private static void getAllProducts(ArrayList<Products> products) {

        if (products.size() == 0) {
            System.out.println("Não há produtos cadastrados.");
        } else {
            try {
                for (Products products1 : products) {
                    System.out.println("=================================");
                    System.out.println("Nome - " + products1.getName());
                    System.out.println("Descrição - " + products1.getDescription());
                    System.out.println("Preço - " + products1.getPrice());
                }
            } catch (NullPointerException e) {
                e.printStackTrace();
                System.out.println("Elemento inexistente. Posição inválida no vetor");
                System.out.println(e.getMessage());
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Erro inesperado.");
                System.out.println(e.getMessage());
            }
        }
    }

    private static void deleteProductById(ArrayList<Products> products,Scanner input) {

        if (products.size() == 0) {
            System.out.println("Não há produtos cadastrados.");
        } else {
            for (int i = 0; i < products.size() ; i++) {
                System.out.println("===== ÍNDICES =====");
                System.out.println("[" + i + "] " + products.get(i).getName());
            }
            System.out.println("Insira o indice do producto que deseja excluir: ");
            try {
                int index = input.nextInt();
                products.remove(index);
                System.out.println("Produto removido com sucesso!");
            }  catch (InputMismatchException e) {
                e.printStackTrace();
                System.out.println("Entrada inválida.");
                System.out.println(e.getMessage());
            }
        }
    }

}
