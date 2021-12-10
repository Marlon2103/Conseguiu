package repetiçao;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x=0,number=0;
        do {
        	Scanner entrada = new Scanner(System.in);
        	System.out.println("Digite um numero pequeno gafanhoto : ");
        	x=entrada.nextInt();
        	number=x+number;
        }while(x!=0);
        
        System.out.println("O total pequeno gafanhoto é "+number);
	}

}
