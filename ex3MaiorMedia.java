import java.util.Scanner;

public class ex3MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
        int count = 0;

        do { //--Fazer isso
            
            System.out.println("Numero: ");
            numero = scan.nextInt();//--guarda a entrada no usuario em 'numero'
            soma = soma + numero;

            if (numero > maior) //--regra para saber o maior numero digitado
                maior = numero;
            count++;

        } while (count < 5); //--enquanto isso for verdade

        System.out.println("A Soma dos numeros: " + soma);
        System.out.println("O maior Numero foi o " + maior);
        System.out.println("O media foi " + (soma / count));
    }
}
/*
 * Faça um programa que leia 5 números
 * e informe o maior número
 * e a média desses números.
 */
