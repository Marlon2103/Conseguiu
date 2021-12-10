package repetiçao;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int i=0,ia=0,ib=0;
      Scanner entrada = new Scanner(System.in);
      
      
      
      while(i!=99) {
      System.out.println("Digite sua idade ");
	  i=entrada.nextInt();
      
      
    	 if(i<21) 
    	 {ia=ia+1;}
    	 if(i>50){
    		 ib=ib+1;
    	 }
    	    
    	  
    		 System.out.println("Pessoas com 21 anos são "+ia );
    		 System.out.println("Pessoas com mais de 50 são "+ib );
    	 }
    	    
      System.out.println("Voce precisa digitar idade menor que 99 ");
	}

}
