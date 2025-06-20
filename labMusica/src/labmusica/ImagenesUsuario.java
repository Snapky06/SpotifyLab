/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labmusica;

import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;


public class ImagenesUsuario {
   
    public static String nombreArchivoSeleccionado;

    public static ImageIcon chooseImage(JFrame parent) {
        
        JFileChooser eligirimg = new JFileChooser();
        
        FileNameExtensionFilter tipo = new FileNameExtensionFilter("Imagenes (*.jpg, *.jpeg, *.png, *.gif)","jpg", "jpeg", "png", "gif");
        eligirimg.setFileFilter(tipo);
        eligirimg.setAcceptAllFileFilterUsed(false); 

        
        int resultado = eligirimg.showOpenDialog(parent);
        if (resultado == JFileChooser.APPROVE_OPTION) {
            File dato = eligirimg.getSelectedFile();
            
            
            nombreArchivoSeleccionado = dato.getName();
            
            return new ImageIcon(dato.getAbsolutePath());
        } else {
            
            nombreArchivoSeleccionado = null;
            
            return null;
        }
    }
  
}
