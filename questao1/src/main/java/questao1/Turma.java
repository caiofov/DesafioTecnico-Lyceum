package questao1;

public class Turma {
	Aluno aluno1;
	Aluno aluno2;
	Aluno aluno3;
	Turma(){}
	
	Turma(Aluno aluno1, Aluno aluno2, Aluno aluno3){
		this.aluno1 = aluno1;
		this.aluno2 = aluno2;
		this.aluno3 = aluno3;
	}
	
	double calcularMedia() {
		double media = (aluno1.calcularMedia() + aluno2.calcularMedia() + aluno3.calcularMedia())/3;
		return media;
	
	}
}
