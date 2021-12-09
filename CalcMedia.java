package introduçao;

import java.util.Scanner;

public class CalcMedia {

	public static void main(String[] args) {
		int anos, Ameses , Bmeses ,dias,tanos,tbmeses,tmeses, res;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite quantos anos voce tem ");
		anos=entrada.nextInt();
		System.out.println("Digite quantos meses de 31 dias voce tem ");
		Ameses=entrada.nextInt();
		System.out.println("Digite quantos meses de 30 dias você tem ");
		Bmeses=entrada.nextInt();
		System.out.println(" Digite quantos dias você tem ");
		dias=entrada.nextInt();
		
		tanos=(anos*365);
		tmeses=(Ameses*31);
		tbmeses=(Bmeses*30);
		res=tanos+tmeses+tbmeses+dias;
		System.out.println(" Voce tem " +res+" anos de vida");
		
	}

}
