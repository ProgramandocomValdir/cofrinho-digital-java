import java.util.ArrayList;

public class Cofrinho {
	// Códigos de cores ANSI para o console
    private static final String RESET = "\u001B[0m";
    private static final String VERDE = "\u001B[32m";
    private static final String AZUL = "\u001B[34m";
    private static final String CIANO = "\u001B[36m";
    private static final String VERMELHO = "\u001B[31m";
    private static final String LILAS = "\u001B[95m";


    // Aqui eu criei a lista que vai guardar todas as moedas que forem adicionadas
    private ArrayList<Moeda> listaMoedas = new ArrayList<>();

    // Método para adicionar uma moeda no cofrinho
    public void adicionar(Moeda moeda) {
        listaMoedas.add(moeda);
        System.out.println(AZUL +"Moeda adicionada com sucesso!" + RESET);
    }

    // Método para remover uma moeda pelo índice que o usuário informar
    public void remover(int indice) {
        // Aqui eu verifico se o índice que ele digitou existe na lista
        if (indice < 0 || indice >= listaMoedas.size()) {
            System.out.println(VERMELHO +"Índice inválido!" + RESET);
            return;
        }
        listaMoedas.remove(indice);
        System.out.println(CIANO +"Moeda removida com sucesso!" + RESET);
    }

    // Método para mostrar todas as moedas que estão guardadas no cofrinho
    public void listar() {
        // Se não tiver nada no cofrinho, eu aviso
        if (listaMoedas.isEmpty()) {
            System.out.println(VERMELHO +"O cofrinho está vazio!" + RESET);
            return;
        }

        System.out.println(LILAS +"\n--- LISTA DE MOEDAS ---" + RESET );
        
        // Aqui eu percorro toda a lista e mostro moeda por moeda
        for (int i = 0; i < listaMoedas.size(); i++) {
            System.out.println(i + " - " + listaMoedas.get(i).toString());
        }
    }

    // Método que soma o valor total de todas as moedas convertidas para Real
    public double totalConvertido() {
        double total = 0;

        // Aqui eu somo cada moeda já convertida usando o método toReais()
        for (Moeda m : listaMoedas) {
            total += m.toReais();
        }

        return total;
    }
}
