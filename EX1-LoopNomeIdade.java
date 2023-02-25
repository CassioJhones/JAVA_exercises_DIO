import java.util.Scanner; //---importar biblioteca scanner
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //--scanner para pegar entradas do usuario

        String nome;//-variavel nome
        int idade;//-variavel idade

        while (true) {
            System.out.println("Nome: ");
            nome = scan.next(); //--atribui a entrada do usuario a var nome

            if (nome.equals("0") ) break; //--se o nome for =0 sair do laço
            System.out.println("Idade: ");
            idade = scan.nextInt();//--atribui a entrada do usuario a var idade

            System.out.println(nome + " tem apenas " + idade +" anos");
        }
        System.out.println("--SAIU DO LAÇO WHILE..."); //--exibe somente ao sair do laço
    }
}
