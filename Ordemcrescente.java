package testes;

import java.util.Scanner;

public class Ordemcrescente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int a,b,c;
          Scanner entrada = new Scanner(System.in);
          System.out.println("Digite o primeiro numero : ");
          a=entrada.nextInt();
          System.out.println("Digite o segundo numero : ");
          b=entrada.nextInt();
          System.out.println("Digite o terceiro numero : ");
          c=entrada.nextInt();
          
          if (a<b && b<c) {
        	  System.out.println("A ordem ´crescente é "+a+" / "+b+" / "+c);
          }
          if(a<c && c<b) {
        	  System.out.println("A ordem crescente é "+a+" / "+c+" / "+b);
          }
          if (b<a && a<c) {
        	  
             	  System.out.println("A ordem crescente é "+b+" / "+a+" / "+c);
          }
          if(b<c && c<a) {
        	  System.out.println("A ordem crescente é "+b+" / "+c+" / "+a);
          }
          if(c<a && a<b) {
        	  System.out.println("A ordem crescente é "+c+" / "+a+" / "+b);
          }
          if(c<b && b<a) {
        	  System.out.println("A ordem crescente é "+c+" / "+b+" / "+a);
          }
	}

}
