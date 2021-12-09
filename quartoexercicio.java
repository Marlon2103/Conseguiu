package introduçao;

import java.util.Scanner;

public class quartoexercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a,b,c,d,r,s;
      Scanner entrada = new Scanner(System.in);
      System.out.println("Digite o valor de a :");
      a=entrada.nextInt();
      System.out.println("Digite o valor de b :");
      b=entrada.nextInt();
      System.out.println("Digite o valor de c :");
      c=entrada.nextInt();
      r=(a + b)*(a+b);
      s=(b+c)*(b+c);
      d=(r+s)/2;
    		  
    		  System.out.println("O resultado de D é "+d);


	}

}
