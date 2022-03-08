package br.com.ZTesting;

import java.util.Scanner;

public class Pergunta{
	
	 Scanner entrada= new Scanner(System.in);
	 
	 private char marcaProcessador; 
	 private char ModeloProcessadorIntel;
	 private char modeloProcessadorAMD;
	 private char marcaPlaca;
	 private char modeloPlaca;
	 private String memoriaRam;
	 
	 
	 void escolhaMarcaProcessador () {
		 System.out.println("Qual a Marca do seu processador?\n1.Intel\n2.AMD");
		 marcaProcessador = entrada.next().charAt(0);
	 }
	 
	 void escolhaProcessador () {
		 System.out.println("Qual o Modelo do seu processador?\n1.Intel\n2.AMD");
		 setMarcaProcessador(entrada.next().charAt(0));
		 
		 if ( getMarcaProcessador() == 1) {
			 System.out.println("Selecione o Modelo Intel do seu processador:");
			 System.out.println("1.Core 2 duo E4500\n2.I3 4330\n3.i5-8400");
			 setModeloProcessador(entrada.next().charAt(0));
			 
		 } else if ( getMarcaProcessador() ==2) {
			 System.out.println("Selecione o Modelo AMD do seu processador:");
			 System.out.println("1.Athlon 64 X2 4800 plus\n2.ryzen 3 1200\n3.ryzen 3 3300x");
		 
			 
		 }
	 }

	public char getMarcaProcessador() {
		return marcaProcessador;
	}

	public void setMarcaProcessador(char marcaProcessador) {
		this.marcaProcessador = marcaProcessador;
	}

	public char getModeloProcessador() {
		return modeloProcessador;
	}

	public void setModeloProcessador(char modeloProcessador) {
		this.modeloProcessador = modeloProcessador;
	}

	public char getMarcaPlaca() {
		return marcaPlaca;
	}

	public void setMarcaPlaca(char marcaPlaca) {
		this.marcaPlaca = marcaPlaca;
	}

	public char getModeloPlaca() {
		return modeloPlaca;
	}

	public void setModeloPlaca(char modeloPlaca) {
		this.modeloPlaca = modeloPlaca;
	}

	public String getMemoriaRam() {
		return memoriaRam;
	}

	public void setMemoriaRam(String memoriaRam) {
		this.memoriaRam = memoriaRam;
	}
	
}
