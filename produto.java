import java.util.Scanner;

import java.util.Scanner;
public class produto{
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("entre  com o numero");
    int A;
    A = input.nextInt();

   System.out.println("Entre  com outro numero");
   int B;
   B = input.nextInt();

   System.out.println("Entre com um terceiro numero");
   int C;
   C = input.nextInt();

   int resultado;
   resultado = A*B*C;

   System.out.println(resultado);
   

   System.out.println(resultado);

   System.out.printf("O valor = %s%n",resultado);
}
}