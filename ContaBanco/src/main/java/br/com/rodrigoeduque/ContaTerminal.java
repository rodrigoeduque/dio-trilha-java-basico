package br.com.rodrigoeduque;


import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o numero da Conta: ");
        Integer conta = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o Nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o Saldo da Conta: ");
        Double saldo =  Double.parseDouble(scanner.nextLine());


        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " +
                conta + " e seu saldo " + saldo + " já está disponível para saque");

        scanner.close();

        }
    }
