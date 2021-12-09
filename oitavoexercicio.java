package introduçao;

import java.util.Scanner;

public class oitavoexercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int f,c,i,pd;
       Scanner entrada = new Scanner(System.in);
       System.out.println("Digite o custo de fabrica :");
       f=entrada.nextInt();
       pd=(f*28)/100;
       i=(f*45)/100;
   	   c=f+pd+i;
   	   System.out.println("O custo do consumidor é "+c);

	}

}
