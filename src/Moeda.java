// Moeda.java
// Aqui é a classe mãe (abstrata). Todas as moedas vão herdar dela.
// Coloquei o valor e um método para converter para reais, mas deixo
// a conversão para as classes filhas fazerem (polimorfismo).

public abstract class Moeda {
    protected double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    // Cada moeda tem sua própria forma de converter para reais,
    // por isso deixo esse método abstrato para ser sobrescrito.
    public abstract double toReais();

    public double getValor() {
        return valor;
    }

    // Nome da moeda (cada classe filha devolve o seu)
    public abstract String getNome();

    @Override
    public String toString() {
        return String.format("%s: %.2f (em reais = %.2f)", getNome(), valor, toReais());
    }
}
