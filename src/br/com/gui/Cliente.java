package br.com.gui;

public class Cliente {
    private String pedido;
    private boolean contratoEmpresa;

    public Cliente(String pedido, boolean contratoEmpresa) {
        this.contratoEmpresa = contratoEmpresa;
        this.pedido = pedido;
    }
    public boolean isContratoEmpresa() {
        return contratoEmpresa;
    }
    public String getPedido() {
        return pedido;
    }
}
