package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {

		// Fluxo de entrada com um Arquivo
//		OutputStream fos = new FileOutputStream("lorem2.txt"); // lê bits e bytes
//		Writer osw = new OutputStreamWriter(fos); // bites em caracteres, lê um de cada vez
//		BufferedWriter bw = new BufferedWriter(osw); // preenche uma linha com caracteres

//		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));

//		PrintStream ps = new PrintStream(new File("lorem2.txt"));
		PrintWriter ps = new PrintWriter("lorem2.txt");
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
		ps.println();
		ps.println();
		ps.println();
		ps.println();
		ps.println("linha com nada escrito");
		ps.close();
	}
}
