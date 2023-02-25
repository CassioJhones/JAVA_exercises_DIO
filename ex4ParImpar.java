import java.util.Scanner;

public class ex4ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdNumeros;
        int numero;
        int qtPares = 0, qtImpares = 0;

        System.out.println("Quantidade de numeros: ");
        qtdNumeros = scan.nextInt(); //--Guarda a entrada no usuario em 'qtdNumeros'

        int count = 0;
        do{ //--Faça isso
            System.out.println("Numero: ");
            numero = scan.nextInt();  //--Guarda a entrada no usuario em 'numero'

            if(numero % 2 == 0) qtPares++; //--Regra para saber se um numero é par
            else qtImpares++;
            count ++;//--Incrementa 1 após cada loop

        }while(count < qtdNumeros); //--Enquanto isso for verdade

        System.out.println("Quantidade de Pares: " + qtPares);
        System.out.println("Quantidade de Impares: " + qtImpares);

    }
}

/*
Faça um programa que peça 5 números inteiros,
calcule e mostre a quantidade de pares
e a quantidade de impares.
*/
