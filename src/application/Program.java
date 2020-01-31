package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
	public static void main(String[] args) {

		String[] lines =  new String[] { "Teste", "Palavras para teste", "Mais palavras"};
		
		String path = "c:\\Users\\edble\\Criar_Pasta.txt";
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))){
			for (String line : lines) {
				bufferedWriter.write(line);
				bufferedWriter.newLine();
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
