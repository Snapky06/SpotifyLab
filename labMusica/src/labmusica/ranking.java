/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package labmusica;

import javax.swing.JOptionPane;

/**
 *
 * @author saidn
 */
public class ranking extends javax.swing.JFrame {
    private Main mainFrame;
    private JTunes tunes;
    private Song songToRate;

    /**
     * Creates new form ranking
     */
    public ranking(Main mainFrame, JTunes tunes) {
        initComponents();
        this.mainFrame = mainFrame;
        this.tunes = tunes;
        this.setLocationRelativeTo(null);
        
       
        this.guardarRanking.setEnabled(false);
        this.guardar.setEnabled(false);
    }
    
      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        codigo = new javax.swing.JButton();
        ranking = new javax.swing.JButton();
        guardarCodigo = new javax.swing.JTextField();
        guardarRanking = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 51));

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("calificar ");

        codigo.setBackground(new java.awt.Color(0, 102, 51));
        codigo.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        codigo.setText("codigo de la cancion:");
        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });

        ranking.setBackground(new java.awt.Color(0, 102, 51));
        ranking.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        ranking.setText("Calificacion");
        ranking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rankingActionPerformed(evt);
            }
        });

        guardarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarCodigoActionPerformed(evt);
            }
        });

        guardarRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarRankingActionPerformed(evt);
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

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Presione para comprobar si el codigo existe");

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
                            .addComponent(ranking))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(guardarRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guardarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(guardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(regresar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(542, 542, 542)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(405, 405, 405)
                        .addComponent(jLabel2)))
                .addContainerGap(321, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigo)
                    .addComponent(guardarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ranking)
                    .addComponent(guardarRanking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
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

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
       String codigo = guardarCodigo.getText();
        if (codigo.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese un codigo para buscar.", " Vacio", JOptionPane.PLAIN_MESSAGE);
            return;
        }

        songToRate = tunes.searchsong(codigo); 

        if (songToRate != null) {
            String songInfo = "<html>Cancion: " + songToRate.getNombre() + "<br>Rating Actual: " + String.format("%.2f", songToRate.songRating()) + "</html>"; 
            JOptionPane.showMessageDialog(this, songInfo, "Cancion Encontrada", JOptionPane.PLAIN_MESSAGE);
            guardarRanking.setEnabled(true);
            guardar.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(this, "Cancion no encontrada.", "Error", JOptionPane.PLAIN_MESSAGE);
            songToRate = null;
            guardarRanking.setEnabled(false);
            guardarRanking.setText("");
            guardar.setEnabled(false);
        }
    }//GEN-LAST:event_codigoActionPerformed

    private void rankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankingActionPerformed
   
    }//GEN-LAST:event_rankingActionPerformed

    private void guardarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarCodigoActionPerformed
        if (songToRate == null) {
            JOptionPane.showMessageDialog(this, "Primero busque una cancion.", "Error", JOptionPane.PLAIN_MESSAGE);
            return;
        }

        try {
            int rankingValue = Integer.parseInt(guardarRanking.getText());
            if (rankingValue < 1 || rankingValue > 5) {
                JOptionPane.showMessageDialog(this, "Por favor ingrese un rating entre 1 y 5.", "Error de Validacion", JOptionPane.PLAIN_MESSAGE);
                return;
            }
            
            tunes.rateSong(songToRate.getCodigo(), rankingValue);
            JOptionPane.showMessageDialog(this, "Rating guardado exitosamente para la cancion " + songToRate.getNombre() + "", "Exito", JOptionPane.PLAIN_MESSAGE);
            
           
            songToRate = null;
            guardarCodigo.setText("");
            guardarRanking.setText("");
            guardarRanking.setEnabled(false);
            guardar.setEnabled(false);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese un numero valido para el rating.", "Error de Formato", JOptionPane.PLAIN_MESSAGE);
        }    
    }//GEN-LAST:event_guardarCodigoActionPerformed

    private void guardarRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarRankingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarRankingActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        if (songToRate == null) {
            JOptionPane.showMessageDialog(this, "Primero busque una cancion.", "Error", JOptionPane.PLAIN_MESSAGE);
            return;
        }

        try {
            int rankingValue = Integer.parseInt(guardarRanking.getText());
            if (rankingValue < 1 || rankingValue > 5) {
                JOptionPane.showMessageDialog(this, "Por favor ingrese un rating entre 1 y 5.", "Error de Validacion", JOptionPane.PLAIN_MESSAGE);
                return;
            }
            
            tunes.rateSong(songToRate.getCodigo(), rankingValue); 
            JOptionPane.showMessageDialog(this, "Rating guardado exitosamente para la cancion " + songToRate.getNombre() + "", "Exito", JOptionPane.PLAIN_MESSAGE); 
            
        
            songToRate = null;
            guardarCodigo.setText("");
            guardarRanking.setText("");
            guardarRanking.setEnabled(false);
            guardar.setEnabled(false);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese un numero valido para el rating.", "Error de Formato", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        this.dispose();
    mainFrame.setVisible(true);
    }//GEN-LAST:event_regresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton codigo;
    private javax.swing.JButton guardar;
    private javax.swing.JTextField guardarCodigo;
    private javax.swing.JTextField guardarRanking;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton ranking;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables
}
