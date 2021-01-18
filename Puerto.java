

package PracticaPrimerSemana;

import java.util.ArrayList;
import java.util.List;

public class Puerto {
    List<Alquiler> alquileres;
    List<Barco> barcos;
    int contadorBarco;
    int contadorAlquiler;

    public Puerto() {
        this.contadorBarco = 0;
        this.contadorAlquiler = 0;
        this.barcos = new ArrayList<>();
        this.alquileres = new ArrayList<>();
    }


    /***************************************/
    public void agregarBarco(Barco barco) {
        barcos.add(barco);
    }

    public int calcularCostoAlquiler(Alquiler alquiler) {
        int diasOcupacion = alquiler.getFechaFinal() - alquiler.getFechaInicial();
        int modulo = alquiler.getBarco().devolverModulo();
        int resultado = (diasOcupacion * modulo) * 2;
        return resultado;
    }

    public void generarAlquiler(String nombreCliente, long dniCliente, int fechaInicial, int fechaFinal,
                                int posicionAmarre, int barcoId) {
        Barco barco = this.barcos.get(barcoId);
        Alquiler alquiler = new Alquiler(nombreCliente, dniCliente, fechaInicial, fechaFinal, posicionAmarre, barco);
        alquiler.setCostoAlquiler(calcularCostoAlquiler(alquiler));
        alquileres.add(alquiler);

    }

    public String mostrarBarcos() {
        String mensaje = "";
        for (int i = 0; i < this.barcos.size(); i++) {
            mensaje += barcos.get(i).toString() + "[ID del barco=" + i + "] \n";
        }
        return mensaje;
    }

    public String mostrarAlquileres() {
        String mensaje = "";
        for (int i = 0; i < this.alquileres.size(); i++) {
            mensaje += alquileres.get(i).toString() + "\n";
        }
        return mensaje;

    }

    public String mostrarMayorAlquiler() {
        Alquiler mayor = alquileres.get(0);
        for (int i = 0; i < this.alquileres.size(); i++) {
            if (alquileres.get(i).getCostoAlquiler() > mayor.getCostoAlquiler()) {
                mayor = alquileres.get(i);
            }
        }
        String mensaje = "El mayor alquiler tiene un valor de " + mayor.getCostoAlquiler() + " y proviene del Cliente "
                + mayor.getNombreCliente();
        return mensaje;
    }

    public String mostrarMenorAlquiler() {
        Alquiler menor = alquileres.get(0);
        for (int i = 0; i < this.alquileres.size(); i++) {
            if (alquileres.get(i).getCostoAlquiler() < menor.getCostoAlquiler()) {
                menor = alquileres.get(i);
            }
        }
        String mensaje = "El menor alquiler tiene un valor de " + menor.getCostoAlquiler() + " y proviene del Cliente "
                + menor.getNombreCliente();
        return mensaje;
    }

    public int promedio() {
        int suma = 0;
        for (int i = 0; i < this.alquileres.size(); i++) {
            suma += alquileres.get(i).getCostoAlquiler();
        }

        return (suma / this.alquileres.size());
    }
}
