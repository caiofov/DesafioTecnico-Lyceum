package questao3;

public class Main {
	public static void main(String[] args) {
		Lampada lampada = new Lampada(true);
		
		//desligar a lâmpada
		lampada.desligar();
		lampada.imprimir();
		
		//ligar a lâmpada
		lampada.ligar();
		lampada.imprimir();
	}
}
