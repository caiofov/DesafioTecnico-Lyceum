package questao1;

public class Aluno {
	Prova prova1;
	Prova prova2;
	
	Aluno(){} //construtor sem parametros
	Aluno(Prova prova1, Prova prova2){ //recebe as duas provas (os objetos)
		setProvas(prova1,prova2);
	}
	double calcularMedia() {
		double media = (prova1.calcularNotaTotal()+prova2.calcularNotaTotal())/2;
		return media;		
	}
	
	//setar nota para as provas
	void setNota(Prova prova, int numParte, double nota) { //recebe um objeto de prova
		prova.setNota(numParte, nota);
	}
	void setNota(int numProva, int numParte, double nota) { //recebe o número da prova
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
	
	void setProvas(Prova prova1, Prova prova2) { //recebe as duas provas
		this.prova1 = prova1;
		this.prova2 = prova2;
	}
}
