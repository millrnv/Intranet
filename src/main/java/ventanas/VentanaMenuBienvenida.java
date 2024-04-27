package ventanas;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaMenuBienvenida extends Ventana {

    public static void main(String[] args) {

        VentanaMenuBienvenida ventana = new VentanaMenuBienvenida();

    }

    private JLabel textoMenu;
    private JButton botonRegistrarEstudiante;
    private JButton botonRegistrarCarrera;
    private JButton botonBuscarEstudiante;
    private JButton botonSalida;


    public VentanaMenuBienvenida() {
        super("Intranet",500,520);
        generarElementosVentana();

    }

    private void generarElementosVentana(){
        generarMensajeMenu();
        generarBotonRegistrarEstudiante();
        generarBotonRegistrarCarrera();
        generarBotonBuscarEstudiante();
        generarBotonSalir();

    }

    private void generarMensajeMenu() {
        String textoBienvenida = "Intranet";
        super.generarJLabelEncabezado(this.textoMenu, textoBienvenida, 130, 30, 300, 30);
    }

    //Boton para registrar estudiante
    private void generarBotonRegistrarEstudiante() {
        String textoBoton = "Registrar Estudiante";
        this.botonRegistrarEstudiante = super.generarBoton(textoBoton, 150, 180, 175, 40);
        this.add(this.botonRegistrarEstudiante);
        this.botonRegistrarEstudiante.addActionListener(this);
    }

    //Boton para registrar carrera

    private void generarBotonRegistrarCarrera(){
        String textoBoton = "Registrar Carrera";
        this.botonRegistrarCarrera = super.generarBoton(textoBoton, 150, 100, 175, 40);
        this.add(this.botonRegistrarCarrera);
        this.botonRegistrarCarrera.addActionListener(this);
    }

    //Boton para salir
    private void generarBotonSalir() {
        String textoBoton = "Salir";
        this.botonSalida = super.generarBoton(textoBoton, 150, 420, 175, 40);
        this.add(this.botonSalida);
        this.botonSalida.addActionListener(this);
    }

    //Boton para buscar estudiante
    private void generarBotonBuscarEstudiante() {
        String textoBoton = "Buscar Estudiante";
        this.botonBuscarEstudiante = super.generarBoton(textoBoton, 150, 260, 175, 40);
        this.add(this.botonBuscarEstudiante);
        this.botonBuscarEstudiante.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource() == this.botonRegistrarEstudiante){
            try {
                VentanaRegistrarEstudiante ventanaRegistroEstudiante = new VentanaRegistrarEstudiante();

            } catch (ClassNotFoundException ex){
                ex.printStackTrace();
            }
            this.dispose();

        }

        if(e.getSource() == this.botonRegistrarCarrera){
            VentanaRegistrarCarrera ventanaRegistroCarrera = new VentanaRegistrarCarrera();
            this.dispose();
        }

        if(e.getSource() == this.botonBuscarEstudiante){

            try {
                VentanaBuscarEstudiante ventanaBuscarEstudiante = new VentanaBuscarEstudiante();
            }catch(ClassNotFoundException ex){
                ex.printStackTrace();
            }
            this.dispose();
        }
        if(e.getSource() == this.botonSalida){
            this.dispose();
            System.exit(0);
        }

    }











}
