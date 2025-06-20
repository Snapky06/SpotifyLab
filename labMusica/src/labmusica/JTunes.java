/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labmusica;

import javax.swing.ImageIcon;

public class JTunes {

    private Song[] canciones;


    public JTunes() {
        canciones = new Song[100];
    }

    public boolean addSong(String codigo, String nombre, String precio, ImageIcon imagenDisco) {
        for (int i = 0; i < canciones.length; i++) {
            if (canciones[i] != null && canciones[i].getCodigo().equals(codigo)) {
                return false; 
            }
        }

        for (int i = 0; i < canciones.length; i++) {
            if (canciones[i] == null) {
                canciones[i] = new Song(codigo, nombre, precio, imagenDisco);
                return true; 
            }
        }

        return false; // 
    }

    public Song searchsong(String codigo) { 
        for (int i = 0; i < canciones.length; i++) {
            if (canciones[i] != null && canciones[i].getCodigo().equals(codigo)) {
                return canciones[i];
            }
        }
        return null;
    }

    public void rateSong(String codigo, int stars) { 
        Song song = searchsong(codigo);
        if (song != null) {
            song.addstars(stars);
        }
    }

    public Song[] getAllSongs() {
        int contador = 0;
        for (int i = 0; i < canciones.length; i++) {
            if (canciones[i] != null) {
                contador++;
            }
        }

        Song[] songvalidas = new Song[contador];
        int pos = 0;
        for (int i = 0; i < canciones.length; i++) {
            if (canciones[i] != null) {
                songvalidas[pos++] = canciones[i];
            }
        }
        return songvalidas;
    }
}
