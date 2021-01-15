//package PracticaPrimerSemana;

public class Alquiler {
	private String nombreCliente;
	private long dniCliente;
	private int fechaInicial;
	private int fechaFinal;
	private int posicionAmarre;
	
	private Barco barco;
	private int costoAlquiler;

	public Alquiler(String nombreCliente, long dniCliente, int fechaInicial, int fechaFinal, int posicionAmarre,
			Barco barco) {
		this.nombreCliente = nombreCliente;
		this.dniCliente = dniCliente;
		this.fechaInicial = fechaInicial;
		this.fechaFinal = fechaFinal;
		this.posicionAmarre = posicionAmarre;
		this.setBarco(barco);
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public long getDniCliente() {
		return dniCliente;
	}

	public void setDniCliente(long dniCliente) {
		this.dniCliente = dniCliente;
	}

	public int getFechaInicial() {
		return fechaInicial;
	}

	public void setFechaInicial(int fechaInicial) {
		this.fechaInicial = fechaInicial;
	}

	public int getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(int fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public int getDiasDeOcupacion() {
		return posicionAmarre;
	}

	public void setDiasDeOcupacion(int diasDeOcupacion) {
		this.posicionAmarre = diasDeOcupacion;
	}

	public int getCostoAlquiler() {
		return costoAlquiler;
	}

	public void setCostoAlquiler(int costoAlquiler) {
		this.costoAlquiler = costoAlquiler;
	}

	public Barco getBarco() {
		return barco;
	}

	public void setBarco(Barco barco) {
		this.barco = barco;
	}

	@Override
	public String toString() {
		return "Alquiler [nombreCliente=" + nombreCliente + ", dniCliente=" + dniCliente + ", fechaInicial="
				+ fechaInicial + ", fechaFinal=" + fechaFinal + ", posicionAmarre=" + posicionAmarre + ", barco="
				+ barco.toString() + ", costoAlquiler=" + costoAlquiler + "]";
	}

}
