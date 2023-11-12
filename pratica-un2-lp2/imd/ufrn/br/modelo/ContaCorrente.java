package imd.ufrn.br.modelo;

import java.util.Scanner;
import java.io.*;
import imd.ufrn.br.modelo.SeguroVida;
import imd.ufrn.br.modelo.Pessoa;

public class ContaCorrente implements ITributavel extends Pessoa{

    private String agencia;
    private String numero;
    private double saldo;
    private static final double taxaContaCorrente = 0.0038; //final??

    public double jurosCDB(double getSalario()){
        salarioInvestimento = getSalario() * (1 + taxaContaCorrente);
        return salarioInvestimento;
    }

    double calcularTributos(double getSalario()) {
        double salarioTributado = getSalario() - (getSalario() * taxaSalario);
        return salarioTributado;
    }

    double salarioTaxaDescontada(double getSalario()) {
            void salarioDescontado = getSalario() - taxaFixaSeguroVida;
            return salarioDescontado;
        }

    void sacar(double valor) {
        Scanner s = new Scanner(System.in);
        valorDebitado = ScannerObject.nextDouble();
        System.out.println("Insira o valor a ser debitado da conta: ");

        if(valorDebitado < getSalario()){
            salarioDebitado = getSalario() - valorDebitado;
            System.out.println("Seu saldo é R$" + salarioDebitado);
        } else if(valorDebitado > getSalario()) {
            System.out.println("Salário insuficiente");
        } else {
            System.out.println("Insira um valor a ser debitado");
        }

    }
    void depositar(double valor){
        Scanner s = new Scanner(System.in);
        valorDepositado = ScannerObject.nextDouble();
        System.out.println("Insira o valor a ser depositado da conta: ");
        if(valorDepositado > 0) {
            salarioDepositado = getSalario() + valorDepositado;
            System.out.println("Seu saldo atual é R$" + salarioDepositado);
        } else {
            System.out.println("Insira valores válidos.");
        }
    }
    boolean transiferir(double valor, ContaCorrente cc) {
        Scanner s = new Scanner(System.in);
        valorTransferido = ScannerObject.nextDouble();
        System.out.println("Insira o valor a ser transferido da conta: ");
        if(valorDepositado > 0) {
            System.out.println("Insira a conta a ser transferido o valor: ");
            Scanner t = new Scanner(System.in);
            Conta = ScannerObject.nextString();

        }

    } else {
            System.out.println("Insira valores válidos.");
        }
}
