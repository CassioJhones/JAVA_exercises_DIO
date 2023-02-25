import java.util.Scanner; //--Importar biblioteca scanner

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //--Scanner para pegar entradas do usuario

        String nome;//--Variavel nome
        int idade;//--Variavel idade

        while (true) {
            System.out.println("Nome: ");
            nome = scan.next(); //--Guarda a entrada do usuario em 'nome'

            if (nome.equals("0") ) break; //--Parar o laço Se o nome for = 0
            System.out.println("Idade: ");
            idade = scan.nextInt();//--Guarda a entrada do usuario em 'idade'

            System.out.println(nome + " tem apenas " + idade +" anos");
        }
        System.out.println("--SAIU DO LAÇO WHILE..."); //--Exibe somente ao sair do laço
    }
}
