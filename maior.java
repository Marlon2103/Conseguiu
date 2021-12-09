package testes;

import java.util.Scanner;

public class maior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a,b,c;
         Scanner entrada = new Scanner(System.in);
         System.out.println("Digite o primeiro valor ");
         a=entrada.nextInt();
         System.out.println("Digite o segundo valor ");
         b=entrada.nextInt();
         System.out.println("Digite o terceiro valor ");
         c=entrada.nextInt();
         
         if (a>b && a>c) {
        	 System.out.println("O maior numero é "+a+":");
         }
         if(b>a && b>c) {
        	 System.out.println("O maior nunmero é "+b+":");
         }
         else 
        	System.out.println("O maior numero é "+c+" :");
         
	}

}
