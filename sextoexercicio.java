package introduçao;

import java.util.Scanner;

public class sextoexercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x1,x2,y1,y2,total;
        Scanner entrada = new Scanner(System.in);
        System.out.println(" Digite o valor de x1 :");
        x1=entrada.nextInt();
        System.out.println("Digite o valor de x2 :");
        x2=entrada.nextInt();
        System.out.println("Digite o valor de y1 :");
        y1=entrada.nextInt();
        System.out.println("Digite o valor de y2 :");
        y2=entrada.nextInt();
        total=((x1-x2)*(x1-x2)+(y2-y1)*(y2-y1));
        System.out.println("O resultado é "+total);
        }

}
