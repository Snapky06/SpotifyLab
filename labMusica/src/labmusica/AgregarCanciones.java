
package labmusica;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import labmusica.ImagenesUsuario;


public class AgregarCanciones extends javax.swing.JFrame {
    private JTunes tunes;
    private Main mainFrame;
    public ImageIcon icono;
    
    public AgregarCanciones(Main mainFrame, JTunes tunes) {
        initComponents();
        this.mainFrame = mainFrame;
        this.tunes = tunes; 
        this.setLocationRelativeTo(null);
        guardarCodigo.setEnabled(true);
        guardarNombre.setEnabled(true);
        guardarPrecio.setEnabled(true);
    }
  
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JButton();
        imagen = new javax.swing.JButton();
        codigo = new javax.swing.JButton();
        precio = new javax.swing.JButton();
        guardarCodigo = new javax.swing.JTextField();
        guardarNombre = new javax.swing.JTextField();
        guardarPrecio = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        ImagenSel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 51));

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar canciones");

        nombre.setBackground(new java.awt.Color(0, 102, 51));
        nombre.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        nombre.setText("Nombre:");
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        imagen.setBackground(new java.awt.Color(0, 102, 51));
        imagen.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        imagen.setText("Imagen");
        imagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagenActionPerformed(evt);
            }
        });

        codigo.setBackground(new java.awt.Color(0, 102, 51));
        codigo.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        codigo.setText("codigo:");
        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });

        precio.setBackground(new java.awt.Color(0, 102, 51));
        precio.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        precio.setText("Precio :");
        precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioActionPerformed(evt);
            }
        });

        guardarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarCodigoActionPerformed(evt);
            }
        });

        guardarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarNombreActionPerformed(evt);
            }
        });

        guardarPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarPrecioActionPerformed(evt);
            }
        });

        guardar.setBackground(new java.awt.Color(0, 102, 51));
        guardar.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        guardar.setText("guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        regresar.setBackground(new java.awt.Color(0, 102, 51));
        regresar.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        regresar.setText("regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        ImagenSel.setBackground(new java.awt.Color(51, 51, 0));
        ImagenSel.setFont(new java.awt.Font("Showcard Gothic", 1, 12)); // NOI18N
        ImagenSel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(371, 371, 371)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codigo)
                            .addComponent(nombre)
                            .addComponent(precio)
                            .addComponent(imagen))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(guardarNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                                    .addComponent(guardarPrecio)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(ImagenSel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(guardarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(guardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(regresar)))
                .addContainerGap(321, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(294, 294, 294))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1)
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigo)
                    .addComponent(guardarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre)
                    .addComponent(guardarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precio)
                    .addComponent(guardarPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imagen)
                    .addComponent(ImagenSel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar)
                    .addComponent(regresar))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
    
    }//GEN-LAST:event_nombreActionPerformed

    private void precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioActionPerformed

    }//GEN-LAST:event_precioActionPerformed

    private void guardarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarCodigoActionPerformed

    private void guardarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarNombreActionPerformed

    private void guardarPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarPrecioActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        String codigo = guardarCodigo.getText();
        String nombre = guardarNombre.getText();
        String precio = guardarPrecio.getText();

        if (codigo.trim().isEmpty() || nombre.trim().isEmpty() || precio.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, llene todos los campos.", "Error", JOptionPane.PLAIN_MESSAGE);
            return;
        }

        if (this.icono == null) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una imagen para la cancion.", "Error", JOptionPane.PLAIN_MESSAGE);
            return;
        }

        boolean success = tunes.addSong(codigo, nombre, precio, this.icono);

        if (success) {
            JOptionPane.showMessageDialog(this, "Cancion agregada con exito", "Exito", JOptionPane.PLAIN_MESSAGE);
            

            guardarCodigo.setText("");
            guardarNombre.setText("");
            guardarPrecio.setText("");
            ImagenSel.setIcon(null);
            ImagenSel.setText("");
            this.icono = null;
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo agregar la cancion. El codigo ya existe o no hay espacio.", "Error", JOptionPane.PLAIN_MESSAGE);
        }                 
    }//GEN-LAST:event_guardarActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        this.setVisible(false); 
        mainFrame.setVisible(true);
        
    }//GEN-LAST:event_regresarActionPerformed

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed

    }//GEN-LAST:event_codigoActionPerformed

    private void imagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagenActionPerformed

    ImageIcon original = ImagenesUsuario.chooseImage(this);
    if (original != null) {
       
        Image tamano = original.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        this.icono = new ImageIcon(tamano);
        
        
        ImagenSel.setText("");
        ImagenSel.setIcon(this.icono);
    } else {
       
        this.icono = null;
    }

    }//GEN-LAST:event_imagenActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImagenSel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton codigo;
    private javax.swing.JButton guardar;
    private javax.swing.JTextField guardarCodigo;
    private javax.swing.JTextField guardarNombre;
    private javax.swing.JTextField guardarPrecio;
    private javax.swing.JButton imagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton nombre;
    private javax.swing.JButton precio;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables


}
