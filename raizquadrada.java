package testes;

import java.util.Scanner;

public class raizquadrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int x,y;
       Scanner entrada = new Scanner(System.in);
       System.out.println("Digite um valor :");
       x=entrada.nextInt();
       
       if(x%2==0){
    	   System.out.println("O numero é par e a raiz quadrada é "+Math.sqrt(x));
       }
       
       else 
    	   System.out.println("O numero é impar e ele elevado a 2 é "+((x)*(x))+" :");
       
       
       
	}

}
