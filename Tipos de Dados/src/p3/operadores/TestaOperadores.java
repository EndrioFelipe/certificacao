package p3.operadores;

import java.util.ArrayList;
import java.util.List;


public class TestaOperadores {
	public static void main (String[]args) {
		//o primeiro operador é o de atribuição '='
		int idade = 15;
		
		//em byte, short e char, o java vereifica se os valores são válidos em tempo de compilação
		
		//ordem dos tipos primitivos inteiros: byte, short (o char tb é um tipo primitivo inteiro e é do mesmo
		//tamanho do short, mas só suporta números positivos), int, long.
		
		char t = 65;//ok
//		char yy = -2;//ops
		
		short ss = 5;
//		char ppp = ss;//char não aceita short pq ele pode ser negativo
//		short op = t;//nem o short aceita o char
		
		int hj = t; //int e long aceitam char
		long jk = t;
		int opk = 15;
		//mas não o contrário
//		char asdfa = opk;
		
		//Os tipos mais abrangentes suportam os menos abrangentes, mas não o contrário:
		long l = 15; //cabe um int aqui
		short s = 12; //o java automaticamente converte os valores literais para os tipos q estão sendo atribuídos
		
//		s = l;//não pode passar long para short
//		idade = l;//nem long para inteiro
//		s = idade; //nem inteiro para short e por aí vai
		
		double d = 15.0;
		float f = 30.0f;
		
		d = f;//double suporta valor de float e de valores inteiros
		double db = 45.0f;
		db = s;
		
		//não é possível colocar ponto flutuante em inteiro
		double aaa = 12.56;
//		int gg = aaa; //vai perder precisão
		
		//floats suporta valores inteiros e double
		float a  = l;
		float y = (float) db; //para float receber um double, precisa do cast, logo não pode de maneira natural.
		
		//***************TABELA DE ACEITAÇÃO*******************
		//byte -> short -> int -> long
		//float -> double  
		//char -> int ; char -> long
		
		//VARIÁVEIS DE REFERÊNCIA
		
		ArrayList<String> lista = new ArrayList<>();
		ArrayList<String> lista2 = lista; //variáveis de referência podem receber a mesma referência de memória de
		//outra variável de referência
		
		//Como ArrayList() implementa a interface List, é possível atribuir um ArrayList para um List.
		//Isso é uma forma de polimorfismo
		List<String> lista3 = new ArrayList<>();//Como sempre o mais abrangente recebe o menos abrangente

		
	}
}
