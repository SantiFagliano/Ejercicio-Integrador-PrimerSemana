import java.util.Iterator;

//package PracticaPrimerSemana;

public class Puerto {
	Alquiler[] alquileres;
	Barco[] barcos;
	int contadorBarco;
	int contadorAlquiler;

	public Puerto() {
		this.contadorBarco = 0;
		this.contadorAlquiler = 0;
		this.barcos = new Barco[999];
		this.alquileres = new Alquiler[999];
	}

	public int getContadorAlquiler() {
		return contadorAlquiler;
	}

	public void setContadorAlquiler(int contadorAlquiler) {
		this.contadorAlquiler = contadorAlquiler;
	}

	public Alquiler[] getAlquileres() {
		return alquileres;
	}

	public void setAlquileres(Alquiler[] alquileres) {
		this.alquileres = alquileres;
	}

	public Barco[] getBarcos() {
		return barcos;
	}

	public void setBarcos(Barco[] barcos) {
		this.barcos = barcos;
	}

	/***************************************/
	public void agregarBarco(Barco barco) {
		barcos[this.contadorBarco] = barco;
		this.contadorBarco++;
	}

	public int calcularCostoAlquiler(Alquiler alquiler) {
		int diasOcupacion = alquiler.getFechaFinal() - alquiler.getFechaInicial();
		int modulo = alquiler.getBarco().devolverModulo();
		int resultado = (diasOcupacion * modulo) * 2;
		return resultado;
	}

	public void generarAlquiler(String nombreCliente, long dniCliente, int fechaInicial, int fechaFinal,
			int posicionAmarre, int barcoId) {
		Barco barco = this.barcos[barcoId];
		Alquiler alquiler = new Alquiler(nombreCliente, dniCliente, fechaInicial, fechaFinal, posicionAmarre, barco);
		alquiler.setCostoAlquiler(calcularCostoAlquiler(alquiler));
		alquileres[this.contadorAlquiler] = alquiler;
		this.contadorAlquiler++;
	}

	public String mostrarBarcos() {
		String mensaje = "";
		for (int i = 0; i < this.contadorBarco; i++) {
			mensaje += this.barcos[i].toString() + "[ID del barco=" + i + "] \n";
		}
		return mensaje;
	}

	public String mostrarAlquileres() {
		String mensaje = "";
		for (int i = 0; i < this.contadorAlquiler; i++) {
			mensaje += alquileres[i].toString() + "\n";
		}
		return mensaje;

	}

	public String mostrarMayorAlquiler() {
		Alquiler mayor = alquileres[0];
		for (int i = 0; i < this.contadorAlquiler; i++) {
			if (alquileres[i].getCostoAlquiler() > mayor.getCostoAlquiler()) {
				mayor = alquileres[i];
			}
		}
		String mensaje = "El mayor alquiler tiene un valor de " + mayor.getCostoAlquiler() + " y proviene del Cliente "
				+ mayor.getNombreCliente();
		return mensaje;
	}

	public String mostrarMenorAlquiler() {
		Alquiler menor = alquileres[0];
		for (int i = 0; i < this.contadorAlquiler; i++) {
			if (alquileres[i].getCostoAlquiler() < menor.getCostoAlquiler()) {
				menor = alquileres[i];
			}
		}
		String mensaje = "El menor alquiler tiene un valor de " + menor.getCostoAlquiler() + " y proviene del Cliente "
				+ menor.getNombreCliente();
		return mensaje;
	}

	public int promedio() {
		int suma = 0;
		for (int i = 0; i < this.contadorAlquiler; i++) {
			suma += alquileres[i].getCostoAlquiler();
		}

		return (suma / this.contadorAlquiler);
	}
}
