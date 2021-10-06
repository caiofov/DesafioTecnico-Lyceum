package questao1;

public class Aluno {
	Prova prova1;
	Prova prova2;
	
	Aluno(){}
	Aluno(Prova prova1, Prova prova2){
		this.prova1 = prova1;
		this.prova2 = prova2;
	}
	double calcularMedia() {
		double media = (prova1.calcularNotaTotal()+prova2.calcularNotaTotal())/2;
		return media;		
	}
	
	//setar nota para as provas
	void setNota(Prova prova, int numParte, double nota) {
		prova.setNota(numParte, nota);
	}
	void setNota(int numProva, int numParte, double nota) {
		switch (numProva) {
			case 1:
				prova1.setNota(numParte, nota);
				break;
			case 2:
				prova2.setNota(numParte, nota);
				break;
			default:
				System.out.println("Não existe essa prova.");
				break;
		}
	}
}
