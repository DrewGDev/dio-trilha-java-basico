package application;

import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Andrew");

        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        cc.depositar(100);

        cc.transferir(poupanca, 100);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
