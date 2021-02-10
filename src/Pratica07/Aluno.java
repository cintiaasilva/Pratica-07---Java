package Pratica07;

public class Aluno {
	int ra;
	String nome;
	double nota;
	
	public Aluno(int ra, String nome, double nota) {
		this.ra = ra;
		this.nome = nome;
		this.nota = nota;
	}

	public String toString() {
		return "Aluno [ra=" + ra + ", nome=" + nome + ", nota=" + nota +  "]";
	}
	
}
