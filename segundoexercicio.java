package introduçao;

import java.util.Scanner;

public class segundoexercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int  dia,ano,mes,dias;
       Scanner entrada = new Scanner(System.in);
       System.out.println("Digite Quantos Dias De Vida Você Tem:");
       dia=entrada.nextInt();
       ano=(dia/365);
    	        mes=(dia % 365)/12;
    	        dias=(dia % 365)/31;
    	        System.out.println("Voce possui "+ano+ "/"+mes+"/ "+dia);

	}

}
