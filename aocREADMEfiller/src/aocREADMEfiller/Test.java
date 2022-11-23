package aocREADMEfiller;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class Test {

	public static void main(String[] args) throws IOException {
		int day = 0;
		String data = "";
		String newData = "";
		
		Scanner sc = null;
		Scanner scan1 = null;
		Scanner scan2 = null;
		Scanner scan3 = null;

		File Code = new File("test.txt");
		File Input = new File("testInput.txt");
		File Output = new File("testOutput.txt");
		File myFile = new File("READMEtemp.md");
		
		try {
			sc = new Scanner(myFile);
			scan1 = new Scanner(Code);
			scan2 = new Scanner(Input);
			scan3 = new Scanner(Output);

		} catch (FileNotFoundException e) {
			System.out.println("ERROR! File not found");
		}
		data = Files.readString()
		System.out.println(data);
		FileWriter README = new FileWriter("README.md");
		File newFile = new File("README.md");
		while (scan1.hasNextLine()) {
			newData = data.replace("CODE", data);
			

			
			
		}
		
		
		
	}

}
