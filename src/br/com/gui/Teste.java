package br.com.gui;

public class Teste {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("A", false);
        Fabrica fabrica = getSemContratosFabrica(cliente1);
        Carro carro1 = fabrica.criar(cliente1.getPedido());
        carro1.ligarMotor();

    }
    private static Fabrica getSemContratosFabrica(Cliente cliente) {
        if (cliente.isContratoEmpresa()) {
            return new ContratosFabrica();
        } else {
            return new SemContratosFabrica();
        }
    }
}
