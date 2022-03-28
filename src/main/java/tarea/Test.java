package tarea;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Álvaro
 */
public class Test {

    public static void main(String[] args) {
        // EJEMPLO SENCILLO

        // Construimos la ventana
        JFrame ventanaPrincipal = new JFrame("Álvaro Martínez Flores");

        // Establecemos tamaño y posición
        ventanaPrincipal.setSize(800, 600);
        ventanaPrincipal.setLocationRelativeTo(null);

        // Añadimos un objeto MiPanel al JFrame
        //ventanaPrincipal.add(new MiPanel(Color.cyan));
        //ventanaPrincipal.add(new MiPanel(Color.red));   //se muestra el que se añadio despues

        // Hacemos visible la ventana
        ventanaPrincipal.setVisible(true);

        // Acción por defecto al pulsar el botón de cierre de la ventana
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //******************LAYOUT******************
        // Establecemos el layout del JFrame
        ventanaPrincipal.setLayout(new BorderLayout());

        // Añadimos los paneles en cada posición del BorderLayout
        // Añadir panel amarillo en la posición superior (NORTH)
        ventanaPrincipal.add(new MiPanel(Color.PINK), BorderLayout.NORTH);
        
        // Añadir panel rojo en la posición inferior (SOUTH)
        ventanaPrincipal.add(new MiPanel(Color.DARK_GRAY), BorderLayout.SOUTH);
        // Añadir panel gris en la posición central (CENTER)
        ventanaPrincipal.add(new MiPanel(Color.ORANGE), BorderLayout.CENTER);

        // Añadir panel verde en la posición izquierda (WEST)
        ventanaPrincipal.add(new MiPanel(Color.white), BorderLayout.WEST);

        // Añadir panel cián en la posición derecha (EAST)
        ventanaPrincipal.add(new MiPanel(Color.LIGHT_GRAY), BorderLayout.EAST);
        
        //Para que la ventana no se pueda redimensionar
        ventanaPrincipal.setResizable(false);

        
        // Construimos la ventana
    	JFrame frame = new JFrame("App");
        
	// La ventana no se puede redimensionar
	frame.setResizable(false);
        
	// Posición de la ventana
    	frame.setLocationRelativeTo(null);
        
	// Incluimos el panel en la ventana
    	frame.add(new Saludo());
        
       // Ajusta el frame al contenido
       frame.pack();
       
	// Hacemos visible la ventana
    	frame.setVisible(true);
        
	//Acción por defecto al pulsar el botón de cierre de la ventana
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
    }
}
