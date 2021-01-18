package PracticaPrimerSemana;

public class Deportivo extends Barco {
	private int potenciaCV;

	public Deportivo(int matricula, int eslora, int anioFabricacion, int potenciaCV) {
		super(matricula, eslora, anioFabricacion);
		this.potenciaCV = potenciaCV;
	}

	public int getPotenciaCV() {
		return potenciaCV;
	}

	public void setPotenciaCV(int potenciaCV) {
		this.potenciaCV = potenciaCV;
	}

	@Override
	public String toString() {
		return "Deportivo [potenciaCV=" + potenciaCV + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int devolverModulo() {
		return (getEslora() * 10) + this.potenciaCV;
	}
}
