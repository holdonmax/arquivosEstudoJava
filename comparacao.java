import java.util.Scanner;
public class comparacao{
    public static void main(String[] args) {

        //criaçao do objeto Scanner
        Scanner input = new Scanner(System.in);
  
        //chamada para entrada de dado via teclado
        System.out.println("Entre com  o  numero a ser  comparado: ");
        int A;//variavel sendo declarada
        A = input.nextInt();

        
        //chamada para entrada
        System.out.println("entre com o  outro valor  a ser comparado: ");
        int B;//declaraçao da variavel
        B = input.nextInt();

        if(A == B)
        System.out.println("O numero "+A+" eh  = "+ B+" Logo a soma = "+(A+B));

        if(A != B)
        System.out.println("O numero "+A+" eh diferente  de "+ B);

        if(A < B)
        System.out.println("O numero "+A + " eh  menor que "+ B);

        if(A > B)
        System.out.println("O numero "+A +" eh maior que "+B);

        if(A <= B)
        System.out.println("O numero "+A + " eh menor  ou igual a "+B);

        //if simples que fala que é maior ou  igual
        if(A >= B)
        System.out.println("O numero "+A + " eh maior ou igual a "+B);
    
    }//fim do metodo main
}//fim da classe comparaçao