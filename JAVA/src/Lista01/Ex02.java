package Lista01;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("DIGITE DOIS NÚMEROS PARA OBTER O RESTO DA DIVISÃO");
		System.out.print("DIGITE O PRIMEIRO NÚMERO:");
		double primeiro = ler.nextDouble();
		
		System.out.print("DIGITE O SEGUNDO NÚMERO:");
		double segundo = ler.nextDouble();
		
		ler.close();
		
		double resto = primeiro % segundo;
		
		System.out.println("O RESTO DA DIVISÃO: " + resto);
	}
 
}
