package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		Scanner leia = new Scanner (System.in);

		double fahrenheit,celsius;
	
		
		
		System.out.println(" Temperatura em fahrenheit:");
		fahrenheit = leia.nextDouble();//Campo aonde chama trazer apenas numero.	
		
				
		
		System.out.println("Temperatura em Celsius :" +(celsius = 5 * ((fahrenheit - 32)/9))+ " Graus ");
		leia.close();
		
		
		
		
	}

}