// Real.java
// Aqui representa a moeda Real. Como já é nossa moeda base (BRL),
// não preciso fazer nenhuma conversão.

// Classe Real herdando de Moeda
public class Real extends Moeda {

    // Construtor: aqui só passo o valor para a classe mãe (Moeda)
    public Real(double valor) {
        super(valor);
    }

    @Override
    public double toReais() {
        // Como o real já está em reais, só retorno o próprio valor
        return valor; // Conversão 1:1
    }

    @Override
    public String getNome() {
        // Apenas retorno o nome da moeda
        return "Real";
    }
}
