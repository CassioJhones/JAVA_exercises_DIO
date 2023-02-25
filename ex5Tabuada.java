import java.util.Scanner;

public class ex5Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tabuada;

        System.out.println("Qual Tabuada: ");
        tabuada = scan.nextInt(); //--Guarda a entrada no usuario em 'tabuada'
        System.out.println("Tabuada do " + tabuada);

        for(int count = 1 ; count <= 10; count++ ){ //--For (VARIAVEL;CONDIÇÃO;INCREMENTO)
            System.out.println(tabuada +" x "+count+" = "+ (tabuada*count));
        }
    }
}

/*
gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
*/
