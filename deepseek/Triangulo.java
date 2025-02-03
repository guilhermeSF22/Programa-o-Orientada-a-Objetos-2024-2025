package Atividade004.AtividadeAvaliativa004.deepseek;

public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(String cor, double base, double altura) {
        super("triângulo", cor);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    // Getters e Setters específicos
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
