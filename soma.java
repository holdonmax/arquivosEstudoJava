//importaçao da classe Scanner para entrada manual de valores
import java.util.Scanner;
public  class soma{
    public static void main(String[] args) {

        //Criaçao do objeto Scanner
        Scanner input = new Scanner(System.in);
       
        
        //chamo a entrada via teclado do numeroA

        System.out.println("Digite  um numero: ");
        int numeroA;
        //declaro e  ja uso a variavel
        numeroA = input.nextInt();

        //chamo a entrada via teclado do  numeroB
        System.out.println("Digite outro numero: ");
        int numeroB;
        // declaraçao feita e ja usada 
        numeroB = input.nextInt();

        //chamada para a funçao de soma
        int soma;
        soma = numeroA + numeroB;
        

        //impressao  do dado via println
        System.out.println("O resultado de \n"+ numeroA + " + "+ numeroB + " = "+ soma);

        System.out.println("A soma = "+(numeroA+numeroB));

        //imprime  formatado atravez  do printf
        System.out.printf(" a soma eh %d%n",(numeroA+numeroB));
    }
}