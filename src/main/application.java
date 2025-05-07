package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class application {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		try{ 
			System.out.println();
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (InputMismatchException e) {
			System.out.println("Essa opção não está na lista!");
			System.out.println();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Não tem nenhum item nessa posição, tente novamente!");
			System.out.println();
		}

		System.out.println("Obrigado por usar nosso programa!");

		sc.close();
	}	
}
