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


}
