package variaveisGlobaisLocais;

public class VariaveisGlobalELocal {

	static int idadeJoaoGlobal = 22;
	
	public static void main(String[]args) {
		
		int maiorIdade = 18;
		System.out.println("Valor da variavel local = " + maiorIdade);
		
		
		idadeJoao();
		
	}
	
	public static void idadeJoao () {
		System.out.println("Idade global do Joao é: " + idadeJoaoGlobal);
	}
}
