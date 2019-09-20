package p2.tiposdedados;

class Carros {
	String modelo;
	int ano;
	
	Carros(){
		modelo = "asdf"; //aqui quando não tem o shadowing não precisa do this, ele é opcional
	}
	
	public String dasfads(String modelo) {
		return modelo = modelo; //agora precisa do this
		
	}
	
}

public class LendoEscrevendoCamposDeObjetos {
	public static void main (String args[]) {
		Carros carro =  new Carros();
		System.out.println(carro.modelo); //o ponto serve para referenciar as variáveis membro
		carro.dasfads("ssss");
		System.out.println(carro.modelo);
	}
}
