package core13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		showFileInputOutputStream();
		showFileReaderWriter();
		showBufferedReaderWriter();
	}
	/**
	 * 
	 * @throws IOException
	 * FileInputStream / FileOutputStream - для низькорівневих байтових потоків, кожен байт читається окремо
	 * При читанні кирилиці виникнуть проблеми, оскільки для її представлення потрібно 2 байти
	 */
	public static void showFileInputOutputStream() throws IOException {
		
		FileInputStream in = new FileInputStream("/home/amilovskiy/Desktop/first.txt");
		FileOutputStream out = new FileOutputStream("/home/amilovskiy/Desktop/second.txt");
		
		int k;
		
		while ((k = in.read()) != -1) {
			
			System.out.println(Character.toChars(k));
			out.write(k);
		}	
		
		in.close();
		out.close();
	}
	/**
	 * 
	 * @throws IOException
	 * FileReader / FileReader - для символьних потоків
	 * Кава сама візьме на себе правильне кодування символів
	 */
	public static void showFileReaderWriter() throws IOException {
		
		FileReader inputStream = new FileReader("/home/amilovskiy/Desktop/first.txt");
		FileWriter outputStream = new FileWriter("/home/amilovskiy/Desktop/second.txt");
			
		int k;
			
		while ((k = inputStream.read()) != -1) {
				
			outputStream.write(k);
			System.out.println(Character.toChars(k));
		}
			
		inputStream.close();
		outputStream.close();
	}
	/**
	 * 
	 * @throws IOException
	 * BufferedReader / BufferedWriter - буферезовані потоки 
	 * Працюють через буфер в пам'яті
	 * Текст може читатись цілими рядками
	 */
	public static void showBufferedReaderWriter() throws IOException {
		
		BufferedReader buffReader = new BufferedReader(new FileReader("/home/amilovskiy/Desktop/first.txt"));
		BufferedWriter buffWriter = new BufferedWriter(new FileWriter("/home/amilovskiy/Desktop/second.txt")); 

		String k;
		
		while ((k = buffReader.readLine()) != null) {
			
			buffWriter.write(k);
			System.out.println(k);
		}
		
		buffReader.close();
		buffWriter.close();
			
	}
}




