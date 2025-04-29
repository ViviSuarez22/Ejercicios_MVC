package Saludador.View;


public class SaludoView {

    public void pedirNombre(){
        System.out.println("Introduce tu nombre: ");
    }

    public void mostrarSaludo(String nombre){
        System.out.println("Hola, " + nombre + "!");
    }
}
