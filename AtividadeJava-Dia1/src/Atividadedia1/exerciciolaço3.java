package Atividadedia1;

import java.util.Scanner;

public class exerciciolaço3 {
	
		public static void main(String[] args) {
			int idade;
			
			Scanner ler = new Scanner(System.in);
		
			System.out.println("Entre com sua idade :");
			idade = ler.nextInt();
			
			if (idade>=10 && idade<=14) {
				
				System.out.println("Categoria Infantil");
			}
			if (idade>=15 && idade<=17) {
				
				System.out.println("Categoria Juvenil");
			}
			if (idade>=18 && idade<=25) {
				
				System.out.println("Categoria Adulto");
			}
		
		
		
		
		
	}
}
