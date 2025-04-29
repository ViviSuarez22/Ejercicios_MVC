package Sumador.Controller;
import Sumador.Model.SumaModel;
import Sumador.View.SumaView;
import java.util.Scanner;
import java.util.InputMismatchException;

public class SumaController {
    private SumaModel modelo;
    private SumaView vista;

    public SumaController(SumaModel modelo, SumaView vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar(){
        Scanner scanner = new Scanner(System.in);
        int numero1=0, numero2=0;

        boolean error = false;

        try {
            vista.pedirNumero(1);
            numero1 = scanner.nextInt();

            vista.pedirNumero(2);
            numero2 = scanner.nextInt();
        } catch (InputMismatchException e) {
            vista.mostrarError("Entrada inválida. Por favor, introduce solo números enteros.");
            error = true;
        } finally {
            scanner.close();
        }

        if (!error) {
            int resultado = modelo.sumar(numero1, numero2);
            vista.mostrarSuma(resultado);
        }
    }
}
