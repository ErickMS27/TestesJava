package Kenum.test;

import Kenum.classes.Cliente;
import Kenum.classes.TipoCliente;

public class ClienteTest {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Erick", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.A_PRAZO);
        System.out.println(TipoCliente.PESSOA_FISICA.getId());
        System.out.println(TipoCliente.PESSOA_JURIDICA.getId());
        System.out.println(cliente);
    }

}
