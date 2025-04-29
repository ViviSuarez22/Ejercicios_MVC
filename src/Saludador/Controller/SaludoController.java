package Saludador.Controller;
import Saludador.Model.SaludoModel;
import Saludador.View.SaludoView;
import java.util.Scanner;

public class SaludoController {
    SaludoModel modelo;
    SaludoView vista;

    public SaludoController(SaludoModel modelo, SaludoView vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar(){
        vista.pedirNombre();
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.nextLine();
        modelo.setNombreUsuario(nombre);
        vista.mostrarSaludo(nombre);
        scanner.close();

    }
}
