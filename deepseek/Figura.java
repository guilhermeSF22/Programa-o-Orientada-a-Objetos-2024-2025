package Atividade004.AtividadeAvaliativa004.deepseek;

public abstract class Figura {
    private String tipo;
    private String cor;

    public Figura(String tipo, String cor) {
        this.tipo = tipo;
        this.cor = cor;
    }

    // Método que será sobrescrito pelas subclasses
    public double calcularArea() {
        return 0;
    }

    // Getters e Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo +
               "\nCor: " + cor +
               "\nÁrea: " + calcularArea() + "\n";
    }
}
