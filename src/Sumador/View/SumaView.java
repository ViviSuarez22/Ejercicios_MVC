package Sumador.View;

public class SumaView {

    public void pedirNumero(int orden){
        System.out.print("Introduce el número " + orden + ": ");
    }
    public void mostrarSuma(int suma){
        System.out.println("La suma es: " + suma);
    }

    public void mostrarError(String mensaje){
        System.err.println("Error: " + mensaje);
    }
}
