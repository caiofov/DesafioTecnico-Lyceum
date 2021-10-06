package questao3;

public class Lampada {
	boolean estado;
	
	Lampada(boolean estado){
		this.estado = estado;
	}
	
	void ligar() {estado = true;}
	void desligar() {estado = false;}
	void imprimir() {
		if(estado) {
			System.out.println("Lâmpada ligada");
		}
		else {
			System.out.println("Lâmpada desligada");
		}
	}
}
