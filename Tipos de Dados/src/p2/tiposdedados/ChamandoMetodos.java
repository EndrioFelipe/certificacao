package p2.tiposdedados;

class Pessoa {
	String nome;
	int idade;

	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setNome(String nome,
			int
			idade    //pode haver essas estranhas quebras de linha
			) {
		this.idade = idade;
		this.nome = nome;
	}
	
	public String imprime() {
		return getNome();//é possível chamar um método em outro método. O 'this.' é opcional
	}
	
	void x() {
		System.out.println("vazio");
	}
	
}

class Calculadora{
	
	//varargs só aceita um tipo, pode até colocar tipo object, mas terá q fazer cast
	//O varargs DEVE ser o último argumento do método
	public int soma (String nome, int... numeros) {
		int sum = 0;
		for(int i = 0; i < numeros.length; i++) {//o varargs transforma o argumento em um array
			sum += numeros[i];
		}
		return sum;
	}
	
	//E se passarmos um argumento do mesmo tipo do varaargs antes dele?
	//o somatório só considera a partir do segundo elemento
	public int soma2 (int numero, int... numeros) { //ass
		int sum = 0;
		for(int i = 0; i < numeros.length; i++) {//o varargs transforma o argumento em um array
			sum += numeros[i];
		}
		return sum;
	}
	
	//Definir assim é a mesma coisa?
	//public int soma (String nome, int[] numeros)...
	//Não! Um varargs é um array, mas um array não é um varargs. Nesse casom, teríamos que passar
	//um array como um argumento, não uma sequência de númeors como está sendo feito.
	//Mas o inverso é válido, se vc passar c.soma(new int [] {1,5}). Nesse caso é possível
}

public class ChamandoMetodos {
	public static void main(String[] args) {
		//////////////////TESTA PESSOA/////////////////////////
		
		Pessoa p = new Pessoa();
		
		//se um método pede 2 argumentos, então todos eles serão obrigatórios ao serem chamados
		p.setNome("joão"
				,
				15);//na chamada do método também podem existir essas quebras de linha estranhas
		System.out.println(p.getIdade());
		System.out.println(p.imprime());//por alguma razão isso não é possível invocar o 
		//getNome() indiretamente a partir do imprime() se ele for void, mas se for tipado
		// é possível
		
		new Pessoa().x();//imprime vazio
		
		
		//////////////////TESTA CALCULADORA/////////////////////////
		
		Calculadora c = new Calculadora();
		System.out.println(c.soma("asdf",3,5,54,8,51,54,48,545));
		//System.out.println(c.soma());//se vc não colocar nada, vira um array de tamanho zero e 
		//devolve zero
		System.out.println(c.soma("saf"));//aqui imprime zero, pq não passou nada para o varargs
		System.out.println(c.soma2(1, 2, 5));//o somatório só considera a partir do segundo elemento
		System.out.println(c.soma("teste", new int [] {1,5}));//é possível passar um array para um 
		//varargs.
		
		
	}
}
