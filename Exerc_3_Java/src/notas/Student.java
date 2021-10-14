package notas;

public class Student {

	public String aluno;
	public double notaUm, notaDois, notaTres;

	public double gradeFinal() {

		return notaUm + notaDois + notaTres;

	}

	public double aprovacao() {

		if (gradeFinal() < 60.0) {
			return 60.0 - gradeFinal();
		} else {

			return 0.0;

		}

	}

}
