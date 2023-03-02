public class array_inverso {
    public static void main(String[] args) {
        int[] vetorUm = { 9, 6, 3, 5, 4, 8 }; // declaração de um vetor tipo inteiro
        System.out.println("--Vetor: ");

        int count = 0;
        while (count < (vetorUm.length)) { // --Repete enquanto o count for menor que o vetor
            System.out.print(vetorUm[count] + ", ");
            count++;
        }
        System.out.print("\n--Vetor Invertido: \n");
        for (int i = (vetorUm.length - 1); i >= 0; i--) {
            System.out.print(vetorUm[i] + ", ");

        }

    }
}

// criar vetor de 6 numeros inteiros e mostralos na ordem inversa
