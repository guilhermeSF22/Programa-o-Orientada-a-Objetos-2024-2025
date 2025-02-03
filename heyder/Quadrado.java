package Atividade004.AtividadeAvaliativa004;

public class Quadrado extends Figura {
    private double lado;

    public Quadrado(String cor, double lado) {
        super("quadrado", cor);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    // Getter e Setter específico
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}