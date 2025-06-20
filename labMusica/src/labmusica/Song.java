/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labmusica;

import javax.swing.ImageIcon;

public class Song {
private String codigo;
    private String nombre;
    private String precio;
    private int sumaEstrellas;
    private int totalReviews;
    private ImageIcon imagenDisco; 

    
    public Song(String codigo, String nombre, String precio, ImageIcon imagenDisco) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.imagenDisco = imagenDisco;
        this.sumaEstrellas = 0;
        this.totalReviews = 0;
    }

    
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public ImageIcon getImagenDisco() {
        return imagenDisco;
    }

    
     
    public void addstars(int stars) {
        if (stars >= 0 && stars <= 5) {
            sumaEstrellas += stars;
            totalReviews++;
        }
    }

    
    public double songRating() {
        if (totalReviews == 0) {
            return 0.0;
        }
        return (double) sumaEstrellas / totalReviews;
    }
    
}
