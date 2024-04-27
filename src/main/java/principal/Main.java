package principal;

import model.dato.DBGenerator;
import ventanas.VentanaMenuBienvenida;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        DBGenerator.iniciarBD("Universidad");
        VentanaMenuBienvenida ventanaMenuBienvenida = new VentanaMenuBienvenida();

    }

}