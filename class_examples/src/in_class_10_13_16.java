import java.util.Scanner;
import java.io.*;
public class in_class_10_13_16 {
	public static void main(String args[]) throws IOException {
		String inString;
		int inint;
		PrintWriter out = new PrintWriter(new FileWriter("./src/outFile.dat"));
		out.println("opened outFile.dat");
		Scanner in = new Scanner(new FileReader("./src/inFile.dat"));
		out.println("opened inFile.dat\n"
				+"printing String from Scanner object: ");
		inString = (in.hasNextInt()?"":"*** inFile.dat is empty ***");
		while (in.hasNextLine()){
			inint = (int)Math.pow(in.nextInt(),2);
//			out.println(inint);
			System.out.println(inint);
			inString += inint + "\n";
		}
		System.out.print("================\n" + inString);
		

		out.println(inString);
		in.close();
		out.close();
				
			
	}
	
	
//	  public static void main(String args[]) throws IOException  {
//	    int count = 0;
//	    Scanner in = new Scanner(new FileReader("BP"));
//	    int thisBP;                           
//	    System.out.println("Blood pressures on file BP: ");
//	    // Assumption: There are at least 100 values
//	    while (count <= 100) { //count-controlled loop
//	        thisBP = in.nextInt(); //read int from file
//	        System.out.print(thisBP + " ");
//	        count++;
//	    }
//	    System.out.println();
//	    in.close(); //close file
//	  }
	
//  public static void main(String args[]) throws IOException {
//	    Scanner in = new Scanner(new FileReader("BP"));
//	    int thisBP;                           
//	    System.out.println("Blood pressures on file BP: ");
//
//	    while (in.hasNextInt()) { 
//	      thisBP = in.nextInt();
//	      System.out.print(thisBP + " ");
//	    }
//	    System.out.println();
//	    in.close();
//	  }
}


