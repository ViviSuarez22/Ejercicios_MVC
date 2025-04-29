package Saludador;

import Saludador.Controller.SaludoController;
import Saludador.Model.SaludoModel;
import Saludador.View.SaludoView;

public class Main {
    public static void main(String[] args) {
        SaludoModel modelo = new SaludoModel();
        SaludoView vista = new SaludoView();
        SaludoController controlador = new SaludoController(modelo, vista);

        controlador.iniciar();
    }
}
