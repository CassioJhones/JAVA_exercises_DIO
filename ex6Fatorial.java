import java.util.Scanner;

public class ex6Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    int numero;
    System.out.print("QUAL NUMERO: ");
    numero = scan.nextInt(); //--Guarda a entrada no usuario em 'numero'
    System.out.println("FATORIAL DO NUMERO: " + numero);

    int multiplicacao = 1;
    System.out.print(numero+"! = ");

    for(int i = numero; i >= 1; i--){
        multiplicacao = multiplicacao * i;
    }
    System.out.println(multiplicacao);
    }
}
/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
