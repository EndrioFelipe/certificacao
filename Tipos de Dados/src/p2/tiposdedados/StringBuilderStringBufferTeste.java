package p2.tiposdedados;

public class StringBuilderStringBufferTeste {
	public static void main(String[] args) {
		StringBuffer bf = new StringBuffer("água");
		bf.append(" - ");
		bf.append("boa para beber");
		System.out.println(bf.toString());
		
		StringBuffer bf2 = new StringBuffer(50); //isso aqui não é q ele vai criar uma string 
		//com 50, mas que o array desse objeto será de tamanho 50
		System.out.println(bf2.toString() );//não aparece nada. O toString() não é muito necessário
		//já que o System.out.println() já chama o método toString() implicitamente
		
		StringBuffer bf3 = new StringBuffer(bf);
		bf3.append("aaaaaaaaaaaaa");
		System.out.println(bf3);
		
	//////////////////////////MUDANDO PARA STRINGBUILDER///////////////////////////////////////	
		StringBuilder sb = new StringBuilder("água");
		sb.append(" - ");
		sb.append("boa para beber");
		System.out.println(bf.toString());
		
		StringBuilder sb2 = new StringBuilder(50); //isso aqui não é q ele vai criar uma string 
		//com 50, mas que o array desse objeto será de tamanho 50
		System.out.println(bf2.toString() );//não aparece nada. O toString() não é muito necessário
		//já que o System.out.println() já chama o método toString() implicitamente
		
		StringBuilder sb3 = new StringBuilder(sb);
		sb3.append("aaaaaaaaaaaaa");
		sb3.append('x');//é possíve concatenar um char com o método append do StringBuilder/StringBuffer
		//isso acontece pq qualquer coisa q vc passa para o append ele transforma em Object e depois
		//chama o método toString()		
		sb3.append(sb);//concatenou com o próprio sb
		sb3.append(new Carrinho());//concatena o endereço de memória do objeto
		System.out.println(sb3);
		
		
		//Aparentemente não há diferença entra StringBuffer (que é de uma versão mais antiga do java)
		//e StringBuilder (mais recente). A diferença é q o StringBuffer tem acesso sincronizado a
		//cada um dos métodos. Isso tudo tem a ver com threads
		
		StringBuilder sb4 = new StringBuilder("12356789");
		sb4.insert(3, "4"); //adicionando o número 4  na sequência 123456789
		sb4.delete(5, 8);//apagando do 6 (deleta a partir da posição escolhida) até o 8 (deleta
		//até o número anterior da posição escolhida)
		System.out.println(sb4);
		
		//Para converter todo o valor de sb4 para String, é preciso explicitar, caso contrário,
		//não irá rodar
		String teste = sb4.toString();
		System.out.println(teste);
		System.out.println(sb4.reverse());
		
		System.out.println("---------------");
		StringBuffer bf5 = new StringBuffer("Endrio");
		
		bf5.substring(2);
		System.out.println(bf5.substring(2));//substring pega a partir da posição escolhida em diante
		System.out.println(bf5.substring(2, 4));
		System.out.println(bf5.subSequence(2, 4)); //substring e subSequence tem o mesmo comportamento
		
		//Os métodos substring e subSequence é só um recorte, ele não altera o objeto em si
		System.out.println(bf5);
	}
}
