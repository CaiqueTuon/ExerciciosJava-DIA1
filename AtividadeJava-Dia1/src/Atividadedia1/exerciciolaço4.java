package Atividadedia1;

import java.util.Scanner;

public class exerciciola�o4 {

	public static void main(String[] args) {
		int numero;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com um numero :");
		numero = ler.nextInt();
		
		if(numero%2 == 0)
		{
			numero = (int) Math.sqrt(numero);
			
			System.out.println("O numero � par e sua raiz � : "+ numero);
			
		}
		
		else
		{
			numero = (int) Math.pow(numero,2);
			
			System.out.println("O numero � impar e sua potencia quadrada � :"+ numero);
		}

}
	
}
