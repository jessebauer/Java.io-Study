package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {

		Socket s = new Socket(); // rede / console / arquivo (tipos de saida)
		InputStream fis = s.getInputStream(); // lê bits e bytes
		Reader isr = new InputStreamReader(fis); // bites em caracteres, lê um de cada vez
		BufferedReader br = new BufferedReader(isr); // preenche uma linha com caracteres

		OutputStream fos = s.getOutputStream(); // lê bits e bytes/ lugar de saída
		Writer osw = new OutputStreamWriter(fos); // bites em caracteres, lê um de cada vez
		BufferedWriter bw = new BufferedWriter(osw); // preenche uma linha com caracteres

		String linha = br.readLine();

		while (linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			bw.flush();
			linha = br.readLine();
		}

		br.close();
		bw.close();
	}

}
