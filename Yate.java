package PracticaPrimerSemana;

public class Yate extends Barco {
	private int potenciaCV;
	private int numeroDeCamarotes;

	public Yate(int matricula, int eslora, int anioFabricacion, int potenciaCV, int numeroDeCamarotes) {
		super(matricula, eslora, anioFabricacion);
		this.potenciaCV = potenciaCV;
		this.numeroDeCamarotes = numeroDeCamarotes;
	}

	public int getPotenciaCV() {
		return potenciaCV;
	}

	public void setPotenciaCV(int potenciaCV) {
		this.potenciaCV = potenciaCV;
	}

	public int getNumeroDeCamarotes() {
		return numeroDeCamarotes;
	}

	public void setNumeroDeCamarotes(int numeroDeCamarotes) {
		this.numeroDeCamarotes = numeroDeCamarotes;
	}

	@Override
	public String toString() {
		return "Yate [potenciaCV=" + potenciaCV + ", numeroDeCamarotes=" + numeroDeCamarotes + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	public int devolverModulo() {
		return (getEslora() * 10) + this.potenciaCV + this.numeroDeCamarotes;

	}
}
