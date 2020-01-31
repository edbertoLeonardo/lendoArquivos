package application;

import java.io.File;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		File file  = new File("c:\\Users\\edble\\Teste_Lendo_Arquivo.txt");
		Scanner scanner = null;
		try {
			scanner = new Scanner(file);
			while(scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
		} 
		catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
		finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}
