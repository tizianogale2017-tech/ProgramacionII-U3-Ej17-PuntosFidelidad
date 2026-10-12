package Ejercicio17_puntosFidelidad;

public class Main {
    public static void main(String[] args) {
        CuentaFidelidad cuenta = new CuentaFidelidad("SOC-300", "PLATA");
        System.out.println("Socio " + cuenta.getNumeroSocio() + " (" + cuenta.getNivelMembresia() + ")");

        System.out.println("Compra de 20000 -> +" + cuenta.acumularPuntos(20000.0) + " puntos");
        System.out.println("Compra de 8000 -> +" + cuenta.acumularPuntos(8000.0) + " puntos");
        System.out.println("Puntos acumulados: " + cuenta.getPuntosAcumulados());

        System.out.println("Canjear premio de 400 puntos: " + (cuenta.canjearPremio(400) ? "OK" : "FALLIDO (puntos insuficientes)"));
        System.out.println("Canjear premio de 5000 puntos: " + (cuenta.canjearPremio(5000) ? "OK" : "FALLIDO (puntos insuficientes)"));

        System.out.println("Puntos finales: " + cuenta.getPuntosAcumulados());
    }
}
