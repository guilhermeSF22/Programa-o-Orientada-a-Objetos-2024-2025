package Atividade004.AtividadeAvaliativa004.deepseek;

public class Retangulo extends Figura {
    private double comprimento;
    private double largura;

    public Retangulo(String cor, double comprimento, double largura) {
        super("retângulo", cor);
        this.comprimento = comprimento;
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return comprimento * largura;
    }

    // Getters e Setters específicos
    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
}
