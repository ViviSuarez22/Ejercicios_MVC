package Sumador;

import Sumador.Controller.SumaController;
import Sumador.Model.SumaModel;
import Sumador.View.SumaView;

public class Main {
    public static void main(String[] args) {
        SumaModel modelo = new SumaModel();
        SumaView vista = new SumaView();
        SumaController controlador = new SumaController(modelo, vista);
        controlador.iniciar();
    }
}
