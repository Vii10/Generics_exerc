package application;

import java.util.Scanner;

import entities.PrintService;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		PrintService<Integer> ps = new PrintService<>(); //Criando objeto fora do laço for para não haver multiplos objetos
		
		for(int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value); //Adicionando valor na lista
		}
		
		ps.print(); //Chamando o metodo print na classe PrintService
		System.out.print("First: " + ps.first());
		
		sc.close();
	}

}
