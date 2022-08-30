package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {

		// Fluxo de entrada com um Arquivo
//		OutputStream fos = new FileOutputStream("lorem2.txt"); // lê bits e bytes
//		Writer osw = new OutputStreamWriter(fos); // bites em caracteres, lê um de cada vez
//		BufferedWriter bw = new BufferedWriter(osw); // preenche uma linha com caracteres

		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");

		bw.newLine();
		bw.newLine();
		bw.write("linha com nada escrito");

		bw.close();
	}

}
