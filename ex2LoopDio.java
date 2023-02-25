import java.util.Scanner;

/* Um programa que peça uma nota entre zero e dez.
 Mostrar mensagem caso o valor seja invalido e  
 continuar pedindo até que o usuario informe um valor valido
 */

public class ex2LoopDio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;
        System.out.println("Nota: ");
        nota = scan.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("--NOTA INVÁLIDA, Digite Novamente--");
            nota = scan.nextInt();
        }
    }
}
