package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {

		// Fluxo de entrada com um Arquivo
		InputStream fis = new FileInputStream("lorem.txt"); // lê bits e bytes
		Reader isr = new InputStreamReader(fis); // bites em caracteres, lê um de cada vez
		BufferedReader br = new BufferedReader(isr); // preenche uma linha com caracteres

		String linha = br.readLine();

		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}

		br.close();
	}

}
