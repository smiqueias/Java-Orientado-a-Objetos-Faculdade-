import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Notepad> notepads = new ArrayList<Notepad>();
        Scanner input = new Scanner(System.in);
        String option;
        boolean start = true;
        menu();
        while(start) {

            option = input.nextLine();

            switch (option) {
                case "1":
                    System.out.print("Informe o nome do bloco de notas: ");
                    String name = input.next();
                    input.nextLine();
                    System.out.print("Data: ");
                    String date = input.next();
                    input.nextLine();
                    System.out.print("Informação do bloco de notas: ");
                    String information = input.next();
                    input.nextLine();
                    notepads.add(new Notepad(name,date,information));
                    System.out.println(" ======= Bloco de notas cadastrado com sucesso =======");
                    System.out.println("Informe a opçao desejada: ");
                    break;
                case "2":
                    System.out.println("======= Blocos de notas =======");
                    for ( Notepad notepad : notepads ) {
                        System.out.println("Informação: " + notepad.getInformation());
                        System.out.println("Nome: " + notepad.getName());
                        System.out.println("Data de criação: " + notepad.getDate());
                        System.out.println("----------------------------------------");
                    }
                    System.out.println("Informe a opçao desejada: ");
                    break;
                case "3":
                    for (int i=0; i < notepads.size();i++) {
                        Notepad notepad = notepads.get(i);
                        System.out.println("[" + i + "] " + notepad.getInformation());
                    }
                    System.out.println("Insira o indice do bloco de notas que deseja atualizar: ");
                    int reference = input.nextInt();
                    input.nextLine();
                    System.out.println("Novo bloco de notas: ");
                    String newNotePad = input.nextLine();
                    System.out.println("Nova data do bloco de notas: ");
                    String newDateNotePad = input.nextLine();
                    System.out.println("Nova infomacao bloco de notas: ");
                    String newInformationNotePad = input.nextLine();

                    Notepad notepad = notepads.get(reference);
                    notepad.setDate(newDateNotePad);
                    notepad.setInformation(newInformationNotePad);
                    notepad.setName(newNotePad);

                   System.out.println(" ======= Bloco de notas atualizado com sucesso =======");
                   System.out.println("Informe a opçao desejada: ");
                   break;
                case "4":
                    for (int i=0; i < notepads.size();i++) {
                        Notepad notepad1 = notepads.get(i);
                        System.out.println("[" + i + "] " + notepad1.getInformation());
                    }
                    System.out.println("Insira o indice do bloco de notas que deseja excluir: ");
                    int reference1 = input.nextInt();
                    input.nextLine();
                    notepads.remove(reference1);
                    System.out.println(" ======= Bloco de notas atualizado com sucesso =======");
                    System.out.println("Informe a opçao desejada: ");
                    break;
                case "5":
                    start = false;
                    break;
            }
        }

    }

    public static void menu() {
        System.out.println("[1] Inserir novo bloco de notas");
        System.out.println("[2] Listar todos os bloco de notas");
        System.out.println("[3] Alterar um bloco de notas");
        System.out.println("[4] Excluir um bloco de notas");
        System.out.println("[5] Finalizar");
        System.out.print("Informe a opçao desejada: ");

    }
}
