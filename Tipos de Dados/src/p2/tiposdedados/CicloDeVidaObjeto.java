package p2.tiposdedados;

class Carrinho{
	int ano;
	String modelo;
}

class CarrosRef {
	Carrinho c1;
	Carrinho c2;
}


public class CicloDeVidaObjeto {
	public static void main(String[]args) {
		Carrinho a; //isso aqui não é um objeto
		Carrinho carrinho = new Carrinho(); //isso é um obj por causa do new e por causa do 
		//construtor 'Carrinho()' e 'carrinho' é uma variável
		//de referência, não o objeto em si.
		new Carrinho(); //esse é um novo objeto, mas sem uma variável de referência
		
		carrinho.ano = 2015;
		carrinho.modelo = "palio";
		System.out.println(carrinho.ano); //aqui mostra 2015
		
		CarrosRef carros = new CarrosRef();
		carros.c1 = carrinho;
		System.out.println("carros ref: "+carros.c1.ano);
		
		carrinho = new Carrinho(); //fazer carrinho que é do tipo Carrinho referenciar um novo objeto
		//mata a referência anterior e o objeto anterior não é mais acessível a partir desse ponto do código. 
		//As atribuições de ano e modelo não aparecem mais.
		System.out.println(carrinho.getClass());
		System.out.println(carrinho.ano); //aqui não é mais mostrado 2015
		carrinho.ano = 2016;
		System.out.println("carrinho apontando para um novo objeto: "+carrinho.ano); 
		System.out.println("carros ref: "+carros.c1.ano);//apesar da variável de refereência 'carrinho'
		//ter deixado de aopntar para aquele objeto anterior, a outra variável 'carros.c1' substituiu
		//a variável 'carrinho' naquele objeto. Então o objeto cujo ano é 2015 ainda é acessível
		//e não pode ser elegível pelo garbage collector para ser jogado fora da memória
		
		carrinho = null; //atribuir null para carrinho remove a referência anterior, então,
		//a partir desse ponto do código, nós temos dois objetos inacessíveis, o que tinha recebido
		//ano 2015 e o que tinha recebido ano 2016
		
		//System.out.println(carrinho.ano); //null pointer exception
		
		if(15 > 10) {
			Carrinho carrinho2 = new Carrinho();
			carrinho2.ano = 2019; //O objeto referenciado por carrinho2 só é acessível aqui dentro
			//do bloco porque ele é referenciado por uma variável local 
		}
		//A partir daqui o objeto referenciado por carrinho2 não é mais acessível nem a própria variável
		
		//PEGADINHA
		
		
		for(int i=0; i<10; i++) {
			Carrinho carrinho3 = new Carrinho();
			//dentro desse loop teremos 10 variáveis referenciando 10 novos objetos, mas todas só
			//serão acessíveis aqui dentro	
		}
		//carrinho3 não é mais acessível aqui
		System.out.println("-----------");
		
		Carrinho carrinho4 = null;
		for(int i=0; i<10; i++) {
			carrinho4 = new Carrinho();	
			//aqui só vai valer o último carrinho4, pq à medida que foi atribuindo um novo objeto
			//para essa variável de referência, os anteriores ficavam inacessíveis
			System.out.println("carrinho4 no loop: "+carrinho4);
		}
		System.out.println("carrinho4 fora do loop: "+carrinho4);
		
		//QUANDO UM OBJETO SE TORNA INACESSÍVEL, ELE É RECOLHIDO PELO GARBAGE
		//COLLECTOR DO JAVA, ELE É JOGADO FORA DA MEMÓRIA. MAS ISSO NÃO SIGNIFICA QUE ELE É
		//JOGADO FORA NO MOMENTO EM QUE ELE SE TORNA INACESSÍVEL, ELES SE TORNAM ELEGÍVEIS PARA
		//SEREM JOGADOS FORA. NA VERDADE NÃO TEM COMO SABER QUANDO O GARBAGE COLLECTOR VAI
		//JOGAR UM OBJETO FORA DURANTE O TEMPO DE EXECUÇÃO, POR ISSO NÃO DÁ PRA SABER QUANDO
		//O OBJETO SERÁ JOGADO FORA.
		
	}
}
