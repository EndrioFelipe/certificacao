

//java até tem tipos implícitos no java8, mas não cai na certificação
public class TiposDados {
	
	//uma variável LOCAL não tem valor padrão, é preciso inicializá-la com algum valor.
	
	public static void main(String[] args) {
		int idade;
		int gato = 1;
		if(gato > 10) { 
			idade=10;
			System.out.println(idade);
		} else {
			//Se vc inicializar a variável também no else, aí garante que a variável será inicializada
			//de um jeito ou de outro, evitando o "The local variable idade may not have been initialized"
			idade = 0;
			System.out.println("outra coisa");
		}
		
		System.out.println(idade);//mesmo que essa condição propicie a atribuição de um valor 
		//para a variável, ele da o erro "The local variable idade may not have been initialized"
		//evitando um eventual erro, mas se tirar esse System.out.println o código funciona.
		
	}
}
