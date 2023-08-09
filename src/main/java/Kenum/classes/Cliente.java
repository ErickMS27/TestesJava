package Kenum.classes;

public class Cliente {
    public enum TipoPagamento {
        A_VISTA, A_PRAZO;
    }

    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.getNome() +
                ", tipoPagamento=" + tipoPagamento +
                ", numero=" + tipoCliente.getTipo() +
                '}';
    }

    public Cliente(String nome, TipoCliente tipo, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipo;
        this.tipoPagamento = tipoPagamento;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamaento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}
