package p2.tiposdedados;

public class CriarManipularStrings {
	public static void main(String... args) {
		//2 maneiras tradicionais de criar string
		String nomeDireto = "java";
		String nomeIndireto = new String("java2");
		
		//criar string a partir de um array de chars
		char[] chars = new char[] {'j', 'a', 'v', 'a', '3'};
		String nomePorChars = new String (chars);
		
		//criar strings a partir de StringBuffer e/ou StringBuilder
		StringBuffer sb = new StringBuffer("java4");
		//String nomePorSB = sb; assim não é possível nem com SB's e array de chars
		String nomePorSB = new String(sb);
		
		String nulo = null; //é um valor possível q pode dar NullPointerException se for chamado
		//exemplo:
		//System.out.println(nulo.toString());//NullPointerException
		
		//concatenação
		String concatena = "égua " + "do " + "mar.";
		//concatenar com null
		String concatenaNull = "égua " + null + " nada";		
		System.out.println(concatenaNull);//aparece o null no meio. Bizarro!
		//concatenar números
		System.out.println(concatena + 1500);//o número vira string
		System.out.println(concatena + 1500 + 8);//o 8 é concatenado ao 1500
		System.out.println(1500 + 8 + " "+ concatena);//aqui ele faz a soma primeiro e o 8 é somado
		//o que contou aí foi a precedência dos operadores, enquanto não tinha passado por nenhuma
		//string, um '+' entre um número e outro segnifica soma.
		System.out.println(1500 + (1 + concatena)); //nesse caso com o parênteses concatena
		System.out.println(1511 + ( 00 + concatena));//só considera 1 zero
		System.out.println(1511 + ( 0 + (0 + concatena)));//só assim para ter os 2 zeros
		
		
		//*******************STRINGS SÃO IMUTÁVEIS***********************
		
		String s  = "endrio"; //como String cria sempre um objeto, suas variáveis são 
		//de referêcia
		s.toUpperCase(); //aqui chama um novo objeto pra colocar uppercase, mas sua referência
		//é perdida assim q passar dessa linha
		System.out.println(s);//chama o objeto original da variável de referência e
		//continuou minúsculo
		s = s.toUpperCase(); //agora sim vc está atribuindo o novo objeto à variável de referência
		//original
		System.out.println(s);
		
		//STRINGS SÃO ARRAYS
		
		System.out.println(s.charAt(0));
		try {
			System.out.println(s.charAt(10)); //Posição que não existe = StringIndexOutOfBoundsException
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("posição 10 que não existe: StringIndexOutOfBoundsException");
		}
		
		//tamanho
		System.out.println(s.length());
		System.out.println("afasfdasdfas".length());
		//está vazio?
		System.out.println("".isEmpty());
		System.out.println("      ".isEmpty());//não está vazia, está cheia de caracteres espaço
		
		//Outros métodos que funcionam em String
		//toUpperCase(), toLoweCase(), trim(), concat(), substring(), replace()
		
		//trim()
		
		System.out.println("    ".trim().isEmpty());//o trim() tira os espaços q não estão
		//entre caracteres q não são espaços. Como não tem nenhum caractere além do espaço, devolve
		//o false, pq o trim tirou todos os espaços
		System.out.println("b u r r o".trim());//os espaços continuam
		System.out.println("           burro              ".trim());//os espaços antes de depois de 
		//burro somem
		System.out.println("     b u r r o     ".trim());//os espaços entre as letras continuam
		
		
		//replace()
		
		System.out.println(s.replace("E", "A")); // troca o E por A
		System.out.println(s); //mas a String s permanece imutável
		System.out.println(s.replace("END", "FIM"));
		
		
		//substring()
		
		System.out.println(s.substring(2));//começa a partir do D de ENDRIO: DRIO
		//System.out.println(s.substring(-1));//StringIndexOutOfBoundsException
		System.out.println(s.substring(1,5));//NDRI
		
		
		//equals()
		
		System.out.println("Java".equals("java"));//false		
		System.out.println("Java".equalsIgnoreCase("java"));//true
		
		
		//compareTo()
		
		System.out.println("endrio".compareTo("ameixa"));//número positivo, pq 
		//endrio, por causa do 'e', vem depois de ameixa, por causa do 'a'. 'e' vem
		//depois de 'a'
		System.out.println("endrio".compareTo("endrio"));//0 pq são iguais
		System.out.println("endrio".compareTo("gato"));//negativo, gato vem depois
		System.out.println("ameixa".compareTo("Ameixa"));//positivo, pq 'a' vem depois de 'A'
		System.out.println("Ameixa".compareTo("ameixa"));//negativo
		System.out.println("água".compareTo("agua"));//possitivo, 'a' vem depois de 'á'
		System.out.println("á".compareTo("A"));//positivo 'A' vem depois de 'á'
		System.out.println("Ameixa".compareToIgnoreCase("ameixa"));//0 iguais
		
		
		//indexOf()
		
		System.out.println("Vou jogar bola hoje à noite".indexOf('o'));//pega o primeiro 'o'
		//q encontrar e devolve sua posição: 1. Qdo um letra, aceita char
		System.out.println("Vou jogar bola hoje à noite".indexOf("v"));//é case Sensitive: -1
		System.out.println("Vou jogar bola hoje à noite".indexOf("V"));//devolve 0 e usa aspas
		//duplas
		System.out.println("Vou jogar bola hoje à noite jogar".indexOf("jogar")); //pega o 
		//índice do início da palavra: 4. Pega tb a primeira palavra q aparece
		System.out.println("Vou jogar bola hoje à noite".indexOf("pagar"));//buscar uma palavra
		//que não existe: devolve -1
		System.out.println("Vou jogar bola hoje à noite".indexOf("Vo"));//palavras incompletas:
		//funciona devolvendo o índice de seu início 0
		System.out.println("Vou jogar bola hoje à noite".indexOf("o", 7));//o primeiro 'o' a
		//partir da posição 5: devolve 11
		
		//procurar de trás pra frente lastIndexOf()
		
		System.out.println("Vou jogar bola hoje à noite".lastIndexOf("o"));//pegou o último 'o'
		System.out.println("Vou jogar bola hoje à noite".lastIndexOf("gado"));//não existe: -1
		System.out.println("Vou jogar bola hoje à noite".lastIndexOf("jogar"));//ainda
		//devolve o índice do início da palavra
		System.out.println("Vou jogar bola hoje à noite jogar".lastIndexOf("o"));
		//devolve o índice inicial da última palavra q encontrou: 29
		
		System.out.println("Vou jogar bola hoje à noite".lastIndexOf("o", 25));//considerando
		//as primeiras 25 posições, pegue o útimo "o": 23
		System.out.println("Vou jogar bola hoje à noite".lastIndexOf("o", 7));//considerando
		//as primeiras 7 posições, pegue o útimo "o": 5
		
		
		//startsWith()
		
		System.out.println("Vou jogar bola hoje à noite jogar".startsWith("Vou"));//true
		System.out.println("Vou jogar bola hoje à noite jogar".startsWith("vou"));//false
		//é case sensitive
		System.out.println("Vou jogar bola hoje à noite jogar".startsWith("jogar"));//false
		System.out.println("Vou jogar bola hoje à noite jogar".endsWith("jogar"));//true
		
		
	}
}
