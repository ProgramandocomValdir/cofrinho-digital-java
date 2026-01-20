// Dolar.java
// Classe que representa a moeda Dólar, com taxa de conversão ajustável pelo usuário.

public class Dolar extends Moeda {

    // Taxa padrão. Pode ser alterada pelo menu de câmbio.
    private static double TAXA_CONVERSAO = 5.20;

    public Dolar(double valor) {
        super(valor); // aqui eu passo o valor para a classe mãe (Moeda)
    }

    // Converte o valor do Dólar para Reais
    @Override
    public double toReais() {
        return valor * TAXA_CONVERSAO;
    }

    // Nome da moeda (usado no listar do Cofrinho)
    @Override
    public String getNome() {
        return "Dólar (USD)";
    }

    // Permite alterar a taxa pelo menu
    public static void setTaxa(double novaTaxa) {
        TAXA_CONVERSAO = novaTaxa;
    }

    public static double getTaxa() {
        return TAXA_CONVERSAO;
    }
}

