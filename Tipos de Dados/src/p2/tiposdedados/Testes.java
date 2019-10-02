package p2.tiposdedados;

public class Testes {
	String msg; //variável se inicia com null
	
	void imprime() {
		//String msg; //variável local tem que ser inicializada
        if (!msg.isEmpty())
            System.out.println(msg);
        else
            System.out.println("vazio");
    }
	
	static String vazio;
	
	public static void main(String[] args) {
		//new Testes().imprime();
		String full = "Bem-vindo " + vazio;
        System.out.println(full);
        
        String a = null;
        System.out.println(a);
        //String e =  new String(a);//NullPointerException
       // System.out.println(e); //NullPointerException
        //String b =  new String(null); //simplesmente não compila
        int s = 10;
        int b = 4;
        double resultado = s/b; //resultado 2 pq está fazendo operação com inteiros
        System.out.println(resultado);
        
        String h = "estudando para a certificação";
      //  h.replace("e", 'a');//não pode substituir uma string por char
        System.out.println(h);
        //h.substring(0,2) = "gua";//comparação não compila. O lado esquerdo de uma comparação
        //deve ser sempre uma variável
        
        StringBuilder sb = new StringBuilder("guilherme");
        System.out.println(sb.indexOf("e") + sb.lastIndexOf("e"));//soma os índices

        
	}
}
