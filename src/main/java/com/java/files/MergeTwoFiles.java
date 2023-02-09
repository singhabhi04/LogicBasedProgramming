package com.java.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MergeTwoFiles {
	/*
	 * two files sem1.txt and sem2.txt have marks for that sem.Create a file
	 * finalSem.txt and combine both marks in that
	 */
	public static void main(String[] args) throws IOException {

		PrintWriter pw = new PrintWriter("finalSem.txt");
		BufferedReader br1 = new BufferedReader(new FileReader("sem1.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("sem2.txt"));
		String line1 = br1.readLine();
		String line2 = br2.readLine();
		while ((line1 != null) || (line2 != null)) {

			String[] sub1 = line1.split("-");
			String[] sub2 = line2.split("-");

			pw.println(sub1[0] + "-" + (Integer.parseInt(sub2[1].trim()) + Integer.parseInt(sub2[1].trim())));

			line1 = br1.readLine();
			line2 = br2.readLine();
		}
		pw.flush();
		br1.close();
		br2.close();
		pw.close();
	}

}
