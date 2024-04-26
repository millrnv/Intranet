package ventanas;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaMenuBienvenida extends Ventana {

    private JLabel textoMenu;
    private JButton botonRegistrarEstudiante;
    private JButton botonRegistrarCarrera;
    private JButton botonBuscarEstudiante;
    private JButton botonSalida;


    public VentanaMenuBienvenida() {
        super("Intranet",200,200);
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
        super.generarJLabelEncabezado(this.textoMenu, textoBienvenida, 20, 30, 500, 30);
    }

    //Boton para registrar estudiante
    private void generarBotonRegistrarEstudiante() {
        String textoBoton = "Registrar Estudiante";
        this.botonRegistrarEstudiante = super.generarBoton(textoBoton, 175, 100, 150, 40);
        this.add(this.botonRegistrarEstudiante);
        this.botonRegistrarEstudiante.addActionListener(this);
    }

    //Boton para registrar carrera

    private void generarBotonRegistrarCarrera(){
        String textoBoton = "Registrar vehiculo";
        this.botonRegistrarCarrera = super.generarBoton(textoBoton, 175, 180, 150, 40);
        this.add(this.botonRegistrarCarrera);
        this.botonRegistrarCarrera.addActionListener(this);
    }

    //Boton para salir
    private void generarBotonSalir() {
        String textoBoton = "Salir";
        this.botonSalida = super.generarBoton(textoBoton, 175, 420, 150, 40);
        this.add(this.botonSalida);
        this.botonSalida.addActionListener(this);
    }

    //Boton para buscar estudiante
    private void generarBotonBuscarEstudiante() {
        String textoBoton = "Buscar Estudiante";
        this.botonBuscarEstudiante = super.generarBoton(textoBoton, 175, 140, 150, 40);
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
