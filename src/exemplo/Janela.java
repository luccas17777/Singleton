package exemplo;

public class Janela {
	private static final Janela INSTANCE = new Janela();
	private static final String Teste = "Exemplo singleton publico";

	
	public static final String Singleton = "Exemplo Singleton Publico";
	
	private Janela() {
		
	}
	
	public static Janela getInstance() {
		return INSTANCE;
	}
	
	public static void Fechar() {
		System.out.println("Abrir Fechar!");
	}

}
