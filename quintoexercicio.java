package introduçao;

import java.util.Scanner;

public class quintoexercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a,b,c,total,a1,a2,a3;
      Scanner entrada = new Scanner(System.in);
      System.out.println("Digite o valor de a: ");
      a=entrada.nextInt();
      System.out.println("Digite o valor de b : ");
      b=entrada.nextInt();
      System.out.println("Digite o valor de c : ");
      c=entrada.nextInt();
      a1=a*2;
      a2=b*3;
      a3=c*5;
   	  total=(a1+a2+a3)/10;
   	  System.out.println("A media ponderada é "+total);


	}

}
