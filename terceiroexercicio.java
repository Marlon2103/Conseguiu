package introduçao;

import java.util.Scanner;

public class terceiroexercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int  segundos,horas,minutos,segundo,sobrou;
         Scanner entrada = new Scanner(System.in);
         System.out.println("Digite os segundos ");
         segundos=entrada.nextInt();
         horas=(segundos/3600);
        		    minutos=(segundos % 3600)/60;
        		    segundo=(segundos % 3600)/60;
        		    System.out.println(" Resultado : Horas "+horas+" /minutos  "+minutos+"/ segundos  "+segundos);

         
         
	}

}
