package questao1;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Prova prova1aluno1 = new Prova();
		Prova prova2aluno1 = new Prova(1.0, 7.0); //atribuindo valor as notas na declaração
		
		prova1aluno1.setNota(1, 4.0); //nota parte 1
		prova1aluno1.setNota(2, 2.5); //nota parte 2
		
		Aluno aluno1 = new Aluno(prova1aluno1, prova2aluno1); //passando as provas na declaração
		
		//criando das provas na declaração (maneira mais rápida)
		Aluno aluno2 = new Aluno(new Prova(6.5,3.5), new Prova(0, 3.0));
		Aluno aluno3 = new Aluno (new Prova(5,4), new Prova(6, 1.5));
		
		Turma turma = new Turma(aluno1,aluno2,aluno3);
		
		//arraylist para facilitar o print
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(aluno1);
		alunos.add(aluno2);
		alunos.add(aluno3);
		
		System.out.println("            Prova 1     |    Prova 2  ");
		System.out.println("         Pt 1 - Pt 2    |  Pt 1 - Pt 2");
		
		for(int i = 0; i < alunos.size(); i++) {
			System.out.println("Aluno "+(i+1)+":    "+alunos.get(i).prova1.notaParte1 + " ; "+ alunos.get(i).prova1.notaParte2+ "      "+ alunos.get(i).prova2.notaParte1 + " ; " + alunos.get(i).prova2.notaParte2);
		}
		
		System.out.println("\nMédia da turma: " + turma.calcularMedia());
	
	}
}
