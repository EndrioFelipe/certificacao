package p3.operadores;

public class Aritmetica {
	public static void main(String []args) {
		//ao fazer operações em java, o retorno da operação é no mínimo um int
		short um = 1;
		short dois = 2;
		short resultado = (short) (um + dois);//é preciso adicionar um cast na opeação para short para
		//funcionar, pq o tipo de retorno mínimo de uma operação é int
		int resultadoInt = um + dois; //agora funciona sem cast.
		
		//se houver uma operação entre uma variável menor (int) e uma maoir (long), o retorno do resultado
		//deverá ser sempre do maior.
		int g = 5;
		long h = 5;
		int res = (int) (g + h); //precisa do cast
		long resLong = g + h; //operação com long funciona sem cast
		
		//no caso do float
		int b = 6;
		float n = 6;
		int ress = (int) (b + n);
		float ressFloat = b + n; //mesma coisa que o long e tb a mesma coisa se fosse com o double
		
		//Divisão por zero
//		int j = 5/0; //aqui passa pelo compilador pq não é um erro q ocorrem tem tempo de execução
//		System.out.println(j); //ArithmeticException / by zero --> erro de execução
		
		// Olha essa merda!
		int rr = 5;
		double ll= 0.0;
		double k = rr/ll;
		System.out.println(k);  //resultado: Infinity
		double yy = -8.0 / 0;  
		System.out.println(yy); //resultado: -Infinity
		
		System.out.println(k/yy); //Infinito dividido por -infinito = Not a Number (NaN)
		
		
		
		
		
	}
}
