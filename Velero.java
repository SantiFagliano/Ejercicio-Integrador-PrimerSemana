package PracticaPrimerSemana;

public class Velero extends Barco {
	private int numeroMastiles;

	public Velero(int matricula, int eslora, int anioFabricacion, int numeroMastiles) {
		super(matricula, eslora, anioFabricacion);
		this.numeroMastiles = numeroMastiles;
	}

	public int getNumeroMastiles() {
		return numeroMastiles;
	}

	public void setNumeroMastiles(int numeroMastiles) {
		this.numeroMastiles = numeroMastiles;
	}

	@Override
	public String toString() {
		return "Velero [numeroMastiles=" + numeroMastiles + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int devolverModulo() {
		return (getEslora() * 10) + this.numeroMastiles;
	}
}
