package Atividade004.AtividadeAvaliativa004.deepseek;

public class Aplicacao {
    public static void main(String[] args) {
        // Criando instâncias
        Retangulo retangulo = new Retangulo("azul", 100, 80);
        Triangulo triangulo = new Triangulo("verde", 100, 80);
        Quadrado quadrado = new Quadrado("Preto", 100);

        // Imprimindo os detalhes das Figuras
        System.out.println(retangulo);
        System.out.println(triangulo);
        System.out.println(quadrado);
    }
}
