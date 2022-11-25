package aocREADMEfiller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Test {

	public static void main(String[] args) throws IOException {

		Path filePath1 = Path.of("/home/marek/Dokumente/IT/aocREADMEfiller/aocREADMEfiller/READMEtemp.md");
		String temp = Files.readString(filePath1);

		Path filePath2 = Path.of("/home/marek/Dokumente/IT/AdventOfCode2022/Tag01/src/Tag1.java");
		String code = Files.readString(filePath2);
		
		Path filePath3 = Path.of("/home/marek/Dokumente/IT/AdventOfCode2022/Tag01/input.txt");
		String input = Files.readString(filePath3);

		Path filePath4 = Path.of("/home/marek/Dokumente/IT/AdventOfCode2022/Tag01/output.txt");
		String output = Files.readString(filePath4);
		
		String newtemp;
		
		newtemp = temp.replace("CODE", code);
	
		temp = newtemp.replace("INPUT", input);
		newtemp = temp.replace("OUTPUT", output);
		
		FileWriter myWriter = new FileWriter(new File("/home/marek/Dokumente/IT/AdventOfCode2022/Tag01/README.md"));
		myWriter.write(newtemp);

	}

}
