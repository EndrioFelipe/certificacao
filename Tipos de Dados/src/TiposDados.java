class Motor{
	
}

class Carro {
	int ano;
	double renavam;
	char tipoCarro;
	boolean bol;
	Motor motor;
	String palavra;
}

//java até tem tipos implícitos no java8, mas não cai na certificação
public class TiposDados {
	
	//uma variável LOCAL não tem valor padrão, é preciso inicializá-la com algum valor.
	
	public static void main(String[] args) {
		
		Carro carro = new Carro();
		System.out.println("----variáveis membro-------");
		System.out.println("-> Variáveis membro assumem valores padrões");
		System.out.println("ano do carro: "+carro.ano+" renavam: "+carro.renavam); //variável membro, como é o casso dessa variável carro,
		//tem valor padrão, q é zero se for numérico.
		System.out.println("tipo do carro: "+carro.tipoCarro);//aqui o resultado é uma
		//variável em branco. mas tem uma coisa, os chars, por incrível que pareça, são
		//valores numéricos no java, e esse "em branco" é na verdade o valor 0 q não é impresso
		
		System.out.print("char que não mostra nada é igual a zero? ");
		System.out.println(carro.tipoCarro == 0);
		
		//caso do boolean de uma variável membro é false, pq ela é um tipo de variável
		//compatível com numérico, que é zero como padrão q corresponde ao false
		System.out.println("boolean de uma variável membro: "+carro.bol);
		
		System.out.println("--------variável de referência----------");
		//Essa variável é do tipo Motor que Carro referencia
		//o valor padrão de uma referência é null
		System.out.println(carro.motor);
		//A mesma coisa q acontece com a String, q é uma variável da classe String que
		//vira uma referência em Carro
		System.out.println(carro.palavra);
		
		
		System.out.println("--------Variáveis Locais----------");
		System.out.println("->Variáveis Locais não possuem valor padrão!");
		int [] array = new int [10];//no caso de arrays vazios o valor padrão para cada
		//uma das casinhas é 0, no caso de tipos numéricos
		System.out.println(array[0]);
		String [] arrayString = new String [10];
		System.out.println("array string: "+arrayString[0]);
		boolean [] arrayBoolean = new boolean [10];
		System.out.println("array boolean: "+arrayBoolean[0]);
		int idade;
		int gato = 1;
		System.out.println("/-entrando no if-/");
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
		
		System.out.println("-----------Explicação--------------------");
		System.out.println("->De todos os tipos primitivos: int, char, float, double, long, byte, short e boolean"
				+ " o único que não é numérico é o\n boolean. O float e double são de ponto flutuante, o resto é inteiro"
				+ " incluindo o char");
		System.out.println("->No java não tem diferença de signed e unsigned, valores que"
				+ " só aceitam positivo ou negativo.");
		System.out.println("->Apenas o char que só pode ter valores positivos");
		System.out.println("->Variáveis de ponto flutuante podem assumir valores especiais"
				+ " como:\n .+0 e -0;\n .mais ou menos infinito;\n .NAN (Not A Number).");
		System.out.println("->Variáveis de tipos primitivos aceitam valores literais, como:"
				+ " int ano = 1998, no entanto não podemos atribuir\n valores literais a variáveis"
				+ " de referência, como no caso da variável 'motor' e 'palavra', que\n são do tipo"
				+ " 'Motor' e 'String'. Nesses casos a atribuição literal seria\n um endereço de memória,"
				+ " como: String palavra=&3754.");
		System.out.println("->true e false são palavras-chave e valores literais para um boolean.\n"
				+ " No java as palavras-chave são sempre minúsculas.");
		System.out.println("->Valores literias nesses formatos: '1' e '1.1', são por padrão\n"
				+ " int e double respectivamente, mas caso queiramos explicitar que são outra coisa"
				+ " colocamos uma letra no final:\n '15.5f ou 15.5F' para explicitar q é um float"
				+ " ou '15.5l ou 15.5L' para explicitar que é um long. Até para o\n double vc pode"
				+ " explicitar dessa forma, mas não é necessário.");
		System.out.println("->Se vc atribuir um valor para um inteiro dessa forma"
				+ " 'int i = 0761' com um zero na frente, \n isso indica que é um número da base 8 (octal). Só aceita números de 0 a 7.");
		
		int i = 0761;
		System.out.println("i: "+i);
		System.out.println("atribuir um inteiro com '0x' na frente, indica que é um "
				+ "número hexadecimal. Só aceita números de 0 a F.");
		int h = 0xF;
		System.out.println("h: "+h);
		int X = 0XE;
		System.out.println("X: "+X);
		System.out.println("atribuir um inteiro com '0b' na frente, indica que é um "
				+ "número binário. Só aceita números de 0 a 1.");
		int b = 0b11;
		System.out.println("b: "+b);
		int B = 0B0111;
		System.out.println("B: "+B);
		
		System.out.println("->Double e Float podem ser representados como notação científica, mas se for um float tem "
				+ " que colocar o 'f' no final para explicitar:");
		System.out.println("ex: double d = 3.1E2, que é 3.1 x 10^2");
		double d = 3.1E2;
		System.out.println("d: "+d);
		float f = 2e3f;
		System.out.println("f: "+f);
		
		System.out.println("->É possível separar as casas de milhares em números grandes com long\n usando '_',"
				+ " desde que antes e depois do underline tenha um número. É necessário explicita tb:");
		long l = 18_516_816_168_181L;
		System.out.println("l: "+l);
		System.out.println(" .Uma exceção é que pode ter mais de 1 underlines juntos como: 18_516_816__168____181L;");
		System.out.println(" .Outra exceção é que em números hexadecimais o '_' pode ficar entre\n as letras de A a F, mas é pq representam números.");
		
		System.out.println("->Chars podem imprimir unicodes que representam letras:");
		char c = 66;
		System.out.println("c: "+c);
		System.out.println(" .aqui o 66 representa o B maiúsculo.");
		char c2 = 1567;
		System.out.println("c2: "+c2);
		System.out.println(" .aqui o 1567 representa o caractere '؟'.");
		System.out.println(" .Podemos representar os unicodes usando barra invertida e u na frente: ");
		char cu = '\u03A9'; 
		System.out.println("cu: "+cu);
		System.out.println(" .aqui o \u03A9 representa o caractere 'Ω'.");
		
		System.out.println("--------------------Nomes das Variáveis------------------------");
		System.out.println("->Regras:");
		System.out.println(" .não podemos usar palavras reservadas;");
		System.out.println(" .Podemos declarar variáveis com acento, tiu... Ex: int água = 0 ");
		int água = 0;
		System.out.println(" .Podemos declarar variáveis com números, cifrão, letras maiúsculas...");
		int água516156165 = 0; 
		System.out.println(" água516156165: "+água516156165);
		int águ$$a51__6_156165 = 0;
		System.out.println(" águ$$a51__6_156165: "+águ$$a51__6_156165);
		int _águ$$a51__6_156165 = 0;
		System.out.println(" águ$$a51__6_156165: "+_águ$$a51__6_156165);
		int $águ$$a51__6_156165 = 0;
		System.out.println(" $águ$$a51__6_156165: "+$águ$$a51__6_156165);
		System.out.println(" .NÃO PODE COMEÇAR COM NÚMEROS!");
		System.out.println(" .TODAS AS VARIÁVEIS SÃO CASE SENSITIVE.");
		System.out.println(" .Não pode usar no nome das variáveis: #, %, (, &... Apenas '_' e '$'.");
		
		
		System.out.println("palavras reservadas:"
				+ "    abstract\n" + 
				"    assert\n" + 
				"    boolean\n" + 
				"    break\n" + 
				"    byte\n" + 
				"    case\n" + 
				"    catch\n" + 
				"    char\n" + 
				"    class\n" + 
				"    const\n" + 
				"    continue\n" + 
				"    default\n" + 
				"    do\n" + 
				"    double\n" + 
				"    else\n" + 
				"    enum\n" + 
				"    extends\n" + 
				"    false\n" + 
				"    final\n" + 
				"    finally\n" + 
				"    float\n" + 
				"    for\n" + 
				"    goto\n" + 
				"    if\n" + 
				"    implements\n" + 
				"    import\n" + 
				"    instanceof\n" + 
				"    int\n" + 
				"    interface\n" + 
				"    long\n" + 
				"    native\n" + 
				"    new\n" + 
				"    null\n" + 
				"    package\n" + 
				"    private\n" + 
				"    protected\n" + 
				"    public\n" + 
				"    return\n" + 
				"    short\n" + 
				"    static\n" + 
				"    strictfp\n" + 
				"    super\n" + 
				"    switch\n" + 
				"    synchronized\n" + 
				"    this\n" + 
				"    throw\n" + 
				"    throws\n" + 
				"    transient\n" + 
				"    true\n" + 
				"    try\n" + 
				"    void\n" + 
				"    volatile\n" + 
				"    while");
		
		System.out.println("--------------Info adicional-----------");
		System.out.println("->Booleans não aceitam 0 ou 1");
		System.out.println("->Um for de char q vai de uma letra até a outra funciona!");
		for(char c1='a';c1 <= 'z';c1++) {
            System.out.print(c1+", ");
        }
		
		
		
		
	}
}
