package testes;

import java.util.Scanner;

public class categoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a,cat_a,cat_b,cat_c;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua idade " );
        a=entrada.nextInt();
        
        if (a>9 && a<=14) {
        	System.out.println("Você pertence a categoria Infantil .");
        }
        if (a>14 && a<=17) {
        	System.out.println("Voce pertence a categoria Juvenil .");
        }
        if(a>17 && a<=25) {
        	System.out.println("Voce pertence a categoria Adulto .");
        }
        if (a<=9 || a>25)
        	System.out.println("Digite um numero entre 14 e 25 .");
	}

}
