import java.util.Scanner;

public class Principal {
	
    // Aqui eu deixo separados os códigos de cores ANSI, só pra deixar o menu mais bonito no console
    private static final String RESET = "\u001B[0m";
    private static final String VERDE = "\u001B[32m";
    private static final String AZUL = "\u001B[34m";
    private static final String CIANO = "\u001B[36m";
    private static final String VERMELHO = "\u001B[31m";
    private static final String LILAS = "\u001B[95m";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // Aqui eu crio o objeto do Cofrinho, onde eu vou armazenar todas as moedas
        Cofrinho cofre = new Cofrinho();
        
        int opcao;

        // Esse do-while serve para manter o menu rodando até eu escolher a opção 0 (sair)
        do {
          	System.out.println(VERDE + "\n==============================");
          	System.out.println(LILAS +"       | MENU COFRINHO |" + RESET);
            System.out.println(VERDE +"==============================" + RESET);
              
            // Aqui são as opções que o usuário pode escolher
            System.out.println("1 - Adicionar Moeda");
            System.out.println("2 - Remover Moeda");
            System.out.println("3 - Listar Moedas");
            System.out.println("4 - Total convertido para Real");
            System.out.println("0 - Encerrar");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt(); // Aqui eu leio a opção digitada pelo usuário

            switch (opcao) {

                case 1:
                    // Aqui eu trato a parte de adicionar uma nova moeda ao cofrinho
                    System.out.println("\nEscolha o tipo de moeda:");
                    System.out.println("1 - Real");
                    System.out.println("2 - Dólar");
                    System.out.println("3 - Euro");
                    System.out.print("Opção: ");
                    int tipo = sc.nextInt();

                    System.out.print("Digite o valor: ");
                    double valor = sc.nextDouble();

                    // Aqui eu verifico qual tipo de moeda o usuário escolheu
                    if (tipo == 1) {
                        cofre.adicionar(new Real(valor));
                    } else if (tipo == 2) {
                        cofre.adicionar(new Dolar(valor));
                    } else if (tipo == 3) {
                        cofre.adicionar(new Euro(valor));
                    } else {
                        // Caso o usuário tente colocar um tipo que não existe
                        System.out.println(VERMELHO + "Tipo inválido!" + RESET);
                    }
                    break;

                case 2:
                    // Aqui o usuário informa qual moeda (pelo índice) vai ser removida do cofrinho
                    System.out.print("Informe o índice da moeda para remover: ");
                    int indice = sc.nextInt();
                    cofre.remover(indice);
                    break;

                case 3:
                    // Aqui eu mando listar todas as moedas que estão atualmente dentro do cofrinho
                    cofre.listar();
                    break;

                case 4:
                    // Aqui eu pego a soma total de todas as moedas convertidas para reais
                    double total = cofre.totalConvertido();
                    System.out.printf("Total convertido para Real: R$ %.2f\n", total);
                    break;

                case 0:
                    // Aqui apenas finalizo o programa quando o usuário escolhe sair
                    System.out.println(CIANO + "Encerrando..." + RESET);
                    break;

                default:
                    // Caso o usuário digite algo que não existe no menu
                    System.out.println(VERMELHO + "Opção inválida!" + RESET);
            }

        } while (opcao != 0); // Enquanto não for 0, o menu continua rodando

        sc.close(); // No final, fecho o scanner
    }
}
