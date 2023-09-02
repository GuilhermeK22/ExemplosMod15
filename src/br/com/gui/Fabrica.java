package br.com.gui;

public abstract class Fabrica {
    public Carro criar(String solicitacao) {
        Carro carro = recuperarCarro(solicitacao);
        carro = prepararCarro(carro);
        return carro;
    }
    private Carro prepararCarro(Carro carro) {
        carro.limpo();
        carro.verificacaoMecanica();
        carro.combustivel();
        return carro;
    }
    abstract Carro recuperarCarro(String solicitacao);
}
