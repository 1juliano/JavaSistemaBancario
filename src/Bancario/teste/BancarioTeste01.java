package Bancario.teste;

import Bancario.dominio.Bancario01;

public class BancarioTeste01 {
    static void main(String[] args) {
        Bancario01 conta01 = new Bancario01();
        Bancario01 conta02 = new Bancario01();

        conta01.setTitular("Rafael");
        conta01.setNumeroConta(1001);

        conta02.setTitular("Ana");
        conta02.setNumeroConta(1002);

        conta01.depositar(1000);
        conta01.sacar(350);

        conta02.depositar(500);

        System.out.println("========== CONTA 01 ==========");
        conta01.exibirDados();

        System.out.println("\n========== CONTA 02 ==========");
        conta02.exibirDados();

        conta01.depositar(-100);
        conta01.sacar(5000);

        conta02.depositar(0);
        conta02.sacar(-50);

        conta01.transferir(conta02, 150);

        System.out.println("\n========== APÓS TRANSFERÊNCIA ==========");
        System.out.println(conta01.getTitular() + ": R$ "
                + conta01.getSaldo());

        System.out.println(conta02.getTitular() + ": R$ "
                + conta02.getSaldo());


    }
    }

