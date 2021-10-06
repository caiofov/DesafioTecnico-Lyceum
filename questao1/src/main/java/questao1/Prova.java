package questao1;

public class Prova {
	double notaParte1;
	double notaParte2;
	
	Prova(){}
	
	Prova(double parte1, double parte2){
		setNotas(parte1, parte2);
	}
	double calcularNotaTotal() {
		double notaTotal = notaParte1 + notaParte2;
		if(notaTotal > 10) {
			return 10;
		}
		else {
			return notaTotal;
		}
	}
	
	void setNota(int parte, double nota) {
		switch (parte){
			case 1:
				notaParte1 = nota;
				break;
			case 2:
				notaParte2 = nota;
				break;
			default:
				System.out.println("Não existe essa parte");
				break;
		}
	}
	
	void setNotas(double parte1, double parte2) {
		notaParte1 = parte1;
		notaParte2 = parte2;
	}
}
