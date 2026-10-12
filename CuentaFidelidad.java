package Ejercicio17_puntosFidelidad;

public class CuentaFidelidad {
    private String numeroSocio;
    private String nivelMembresia;
    private int puntosAcumulados;

    public CuentaFidelidad(String numeroSocio, String nivelMembresia) {
        if (!nivelMembresia.equals("BRONCE") && !nivelMembresia.equals("PLATA") && !nivelMembresia.equals("ORO")) {
            throw new IllegalArgumentException("Nivel inválido: use BRONCE, PLATA u ORO.");
        }
        this.numeroSocio = numeroSocio;
        this.nivelMembresia = nivelMembresia;
        this.puntosAcumulados = 0;
    }

    private double multiplicadorDelNivel() {
        if (nivelMembresia.equals("ORO")) {
            return 2.0;
        }
        if (nivelMembresia.equals("PLATA")) {
            return 1.5;
        }
        return 1.0;
    }

    public int acumularPuntos(double montoCompra) {
        if (montoCompra <= 0) {
            return 0;
        }
        int puntosGanados = (int) (montoCompra / 100 * multiplicadorDelNivel());
        puntosAcumulados += puntosGanados;
        return puntosGanados;
    }

    public boolean canjearPremio(int puntosRequeridos) {
        if (puntosRequeridos <= 0 || puntosRequeridos > puntosAcumulados) {
            return false;
        }
        puntosAcumulados -= puntosRequeridos;
        return true;
    }

    public int getPuntosAcumulados() {
        return puntosAcumulados;
    }

    public String getNumeroSocio() {
        return numeroSocio;
    }

    public String getNivelMembresia() {
        return nivelMembresia;
    }
}
