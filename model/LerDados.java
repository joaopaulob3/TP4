package model;

import java.util.Scanner;

public abstract class LerDados {
	public static String lerString() {
		Scanner leitor = new Scanner(System.in);
		return leitor.nextLine();
	}
	
	public static int lerInt(int argumento) {
		try {
			Scanner leitor = new Scanner(System.in);
			argumento = leitor.nextInt();
		} catch (java.util.InputMismatchException exception) {
			System.out.print(">>>Digite um valor v�lido: ");
			argumento = lerInt(argumento);
		}
		
		if (argumento < 0) {
			System.out.print(">>>Digite um valor v�lido: ");
			argumento = lerInt(argumento);
		}
		
		return argumento;
	}
	
	public static double lerDouble(double argumento) {
		try {
			Scanner leitor = new Scanner(System.in);
			argumento = leitor.nextDouble();
		} catch (java.util.InputMismatchException exception) {
			System.out.print(">>>Digite um valor v�lido: ");
			argumento = lerDouble(argumento);
		}
		
		if (argumento < 0) {
			System.out.print(">>>Digite um valor v�lido: ");
			argumento = lerDouble(argumento);
		}
		
		return argumento;
	}
	
	public static char lerChar(char argumento) {
		try {
			Scanner leitor = new Scanner(System.in);
			argumento = leitor.next().charAt(0);
		} catch (java.util.InputMismatchException exception) {
			System.out.print(">>>Digite um valor v�lido: ");
			argumento = lerChar(argumento);
		}
		return argumento;
	}

}