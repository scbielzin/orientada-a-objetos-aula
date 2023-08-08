/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    int valor = 1;

		do {
		    System.out.println("Digite um valor: ");
		    Scanner entrada = new Scanner(System.in); // new cria objeto
		    valor = entrada.nextInt(); //le um valor
    		System.out.println("You've digited: "+ valor);
    		
    		if(valor > 100) {
    		    System.out.println("Greater than 100");
    		} else { 
    		    System.out.println("Less than 100");
    		}
 	
		}while(valor != 0);
		System.out.println(somar(23,23));
	}
	
	//Outras ações: equivalente a funções
	static int somar(int x, int y) {
	    return x+y;	    
	} 
}
