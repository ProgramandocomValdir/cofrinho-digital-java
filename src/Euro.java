// Euro.java
// Classe que representa o Euro. Aqui eu deixo a taxa de conversão editável,
// porque pelo menu o usuário pode alterar o valor conforme a cotação do dia.

public class Euro extends Moeda {

    // Aqui eu defino uma taxa padrão de conversão.
    // Se o usuário quiser mudar essa taxa pelo menu, ele consegue.
    private static double TAXA_CONVERSAO = 5.50;

    // Construtor: toda vez que eu criar um Euro, passo o valor em euros.
    public Euro(double valor) {
        super(valor); // envio esse valor para o construtor da classe mãe (Moeda)
    }

    @Override
    public double toReais() {
        // Para converter euro para real, eu só multiplico pelo valor da taxa.
        // Exemplo: 10 euros * 5.50 = 55 reais.
        return valor * TAXA_CONVERSAO;
    }

    @Override
    public String getNome() {
        // Apenas retorno o nome da moeda.
        return "Euro (EUR)";
    }

    // Métodos estáticos para permitir alterar a taxa de conversão pelo menu.
    // Aqui o usuário pode atualizar a cotação quando quiser.
    public static void setTaxa(double novaTaxa) {
        TAXA_CONVERSAO = novaTaxa;
    }

    // Só retorna a taxa atual, caso eu queira exibir no menu.
    public static double getTaxa() {
        return TAXA_CONVERSAO;
    }
}

