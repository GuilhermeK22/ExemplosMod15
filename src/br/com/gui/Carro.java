package br.com.gui;

public abstract class Carro {
    private int cavalosDePotencia;
    private String fonteDeCombustivel;
    private String cor;
    public Carro(int cavalosDePotencia, String fonteDeCombustivel, String cor) {
        this.cavalosDePotencia = cavalosDePotencia;
        this.fonteDeCombustivel = fonteDeCombustivel;
        this.cor = cor;
    }
    public void ligarMotor () {
        System.out.println(getClass().getSimpleName());
        System.out.println("O motor foi iniciado com " + fonteDeCombustivel + "," + " está pronto para ser utilizado " + cavalosDePotencia + "cv. \n");
    }
    public void limpo() {
        System.out.println("O carro foi limpo, e sua cor " + cor.toLowerCase() + " brilha.");
    }
    public void verificacaoMecanica() {
        System.out.println("O carro foi checado pelo mecânico. Tudo parece bom!");
    }
    public void combustivel() {
        System.out.println("O carro está sendo preenchido com " + fonteDeCombustivel.toLowerCase() + ".");
    }
}
