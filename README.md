### Code

'''java

package aocREADMEfiller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int day;
		String newtemp;
		
		System.out.println("Welchen Tag willst du einlesen?");
		day = sc.nextInt();
		
		Path filePath1 = Path.of("/home/marek/Dokumente/IT/aocREADMEfiller/aocREADMEfiller/READMEtemp.md");
		String temp = Files.readString(filePath1);

		Path filePath2 = Path.of("/home/marek/Dokumente/IT/AdventOfCode2022/Tag" + String.format("%02d", day) + "/src/Tag" + day + ".java");
		String code = Files.readString(filePath2);

		Path filePath3 = Path.of("/home/marek/Dokumente/IT/AdventOfCode2022/Tag" + String.format("%02d", day) + "/input.txt");
		String input = Files.readString(filePath3);

		Path filePath4 = Path.of("/home/marek/Dokumente/IT/AdventOfCode2022/Tag" + String.format("%02d", day) + "/output.txt");
		String output = Files.readString(filePath4);

		newtemp = temp.replace("CODE", code);
		temp = newtemp.replace("INPUT", input);
		newtemp = temp.replace("OUTPUT", output);

		FileWriter myWriter = new FileWriter(new File("/home/marek/Dokumente/IT/AdventOfCode2022/Tag01/README.md"));
		myWriter.write(newtemp);
		
		myWriter.close();

	}

}
'''
