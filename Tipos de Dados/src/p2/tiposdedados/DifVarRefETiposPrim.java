package p2.tiposdedados;
class Referencia {
	int valor;
}

public class DifVarRefETiposPrim {
	public static void main (String... args) {
		int a = 10;
		int b = a; //isso é copiar o valor, ou seja, não é o mesmo 10, pq se vc somar 5 à variável
		//a, a variável b continuará com o valor 10:
		a = a + 5;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
		Referencia ref1 = new Referencia();
		ref1.valor = 10;
		Referencia ref2 = ref1;
		//aqui é o seguinte, quando vc criou a variável ref1 vc criou uma variável que referencia
		//um objeto do tipo Referencia, ao atribruir ref1 para ref2, ela tab passa a referenciar
		//aquele mesmo objeto que ref1 referencia. Tanto que se eu somar 5 a ref1, ref2 tb vai 
		//apresentar o valor 15:
		
		ref1.valor +=5;
		
		System.out.println("ref1: "+ref1.valor);
		System.out.println("ref2: "+ref2.valor);
		
		//ambas as variáveis ref1 e ref2 apontam para o mesmo endereço de memória, o mesmo objeto.
		
	}
}
