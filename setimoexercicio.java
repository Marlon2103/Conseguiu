package introduçao;

import java.util.Scanner;

public class setimoexercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a,b,c,d,e,f,x,y;
      Scanner entrada = new Scanner(System.in);
      System.out.println("Digite o valor de a :");
      a=entrada.nextInt();
      System.out.println("Digite o valor de b :");
      b=entrada.nextInt();
      System.out.println("Digite o valor de c :");
      c=entrada.nextInt();
      System.out.println("Digite o valor de d :");
      d=entrada.nextInt();
      System.out.println("Digite o valor de e :");
      e=entrada.nextInt();
      System.out.println("Digite o valor de f :");
      f=entrada.nextInt();
      x=((c*e)-(b*f)/(a*e)-(b*d));
      y=((a*f)-(c*d)/(a*e)-(b*d));
      System.out.println("O resultado é "+x+" e"+y);

      
	}

}
