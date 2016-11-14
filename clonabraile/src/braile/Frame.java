package braile;

import java.awt.Desktop;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;

public class Frame extends javax.swing.JFrame {

    int b = 0;
    ArrayList<String> Cadena = new ArrayList<>();

    public Frame() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel1.setText("Texto a traducir");

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("Traducir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        if (jTextField1.getText().isEmpty()) {
            limpiar();
        } else {
            if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                if (b == 1) {
                    jLabel2.setIcon(null);
                }
                if (b == 2) {
                    jLabel3.setIcon(null);
                }
                if (b == 3) {
                    jLabel4.setIcon(null);
                }
                if (b == 4) {
                    jLabel5.setIcon(null);
                }
                if (b == 5) {
                    jLabel6.setIcon(null);
                }
                if (b == 6) {
                    jLabel7.setIcon(null);
                }
                if (b == 7) {
                    jLabel8.setIcon(null);
                }
                if (b == 8) {
                    jLabel9.setIcon(null);
                }
                if (b == 9) {
                    jLabel10.setIcon(null);
                }
                if (b == 10) {
                    jLabel11.setIcon(null);
                }
                Cadena.remove(Cadena.size() - 1);
                b--;
            } else {
                if (jTextField1.getText().endsWith(" ")) {
                    b++;
                    Cadena.add(" ");
                } else {
                    try {
                        if (b >= 10) {
                            limpiar();
                        }
                        b++;
                        String a = jTextField1.getText().substring(jTextField1.getText().length() - 1);
                        Cadena.add(a);
                        imagen(a, b);
                    } catch (Exception e) {
                        System.out.println("Error " + e);
                    }
                }
            }
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser Seleccionar_Archivo;
        Seleccionar_Archivo = new JFileChooser();
        int opcion = Seleccionar_Archivo.showSaveDialog(null);
        if (opcion == JFileChooser.APPROVE_OPTION) {
            try {
                File f;
                String cad = "";
                f = new File(Seleccionar_Archivo.getSelectedFile()+".html");
                //Escritura
                try {

                    FileWriter w = new FileWriter(f);
                    try (BufferedWriter bw = new BufferedWriter(w); PrintWriter wr = new PrintWriter(bw)) {
                        wr.append("<HTML>"
                                + "	<HEAD>"
                                + "           <TITLE>Traducci&oacute;n a Braile</TITLE>"
                                + "	</HEAD>"
                                + "	<BODY>"
                                + "           <H2>");
                        
                        for (String Cadena1 : Cadena) {
                            ITraductor Traductor = new Traductor(Cadena1);
                            Traductor.imprimir();
                            
                            if (Cadena1.equals(" ")) {
                                wr.append("&ensp;");
                            }
                            if (Cadena1.equals("a")) {
                                wr.append("&#10241;");
                            }
                            if (Cadena1.equals("b")) {
                                wr.append("&#10243;");
                            }
                            if (Cadena1.equals("c")) {
                                wr.append("&#10249;");
                            }
                            if (Cadena1.equals("d")) {
                                wr.append("&#10265;");
                            }
                            if (Cadena1.equals("e")) {
                                wr.append("&#10257;");
                            }
                            if (Cadena1.equals("f")) {
                                wr.append("&#10251;");
                            }
                            if (Cadena1.equals("g")) {
                                wr.append("&#10267;");
                            }
                            if (Cadena1.equals("h")) {
                                wr.append("&#10259;");
                            }
                            if (Cadena1.equals("i")) {
                                wr.append("&#10250;");
                            }
                            if (Cadena1.equals("j")) {
                                wr.append("&#10266;");
                            }
                            if (Cadena1.equals("k")) {
                                wr.append("&#10245;");
                            }
                            if (Cadena1.equals("l")) {
                                wr.append("&#10247;");
                            }
                            if (Cadena1.equals("m")) {
                                wr.append("&#10253;");
                            }
                            if (Cadena1.equals("n")) {
                                wr.append("&#10269;");
                            }
                            if (Cadena1.equals("o")) {
                                wr.append("&#10261;");
                            }
                            if (Cadena1.equals("p")) {
                                wr.append("&#10255;");
                            }
                            if (Cadena1.equals("q")) {
                                wr.append("&#10271;");
                            }
                            if (Cadena1.equals("r")) {
                                wr.append("&#10263;");
                            }
                            if (Cadena1.equals("s")) {
                                wr.append("&#10254;");
                            }
                            if (Cadena1.equals("t")) {
                                wr.append("&#10270;");
                            }
                            if (Cadena1.equals("u")) {
                                wr.append("&#10277;");
                            }
                            if (Cadena1.equals("v")) {
                                wr.append("&#10279;");
                            }
                            if (Cadena1.equals("w")) {
                                wr.append("&#10298;");
                            }
                            if (Cadena1.equals("x")) {
                                wr.append("&#10285;");
                            }
                            if (Cadena1.equals("y")) {
                                wr.append("&#10301;");
                            }
                            if (Cadena1.equals("z")) {
                                wr.append("&#10293;");
                            }
                            cad += Cadena1 + "&ensp;";
                            
                        }
                        wr.append("</H2> <H3>" + cad + "</H3> "
                                + "     </BODY>"
                                + "</HTML>");
                    }
                } catch (IOException e) {
                    System.out.println(e);
                }
            } catch (Exception ex) {
                System.out.println(ex);
            }
            int respuesta = JOptionPane.showConfirmDialog(null, "Desea Abrir el documento", "Alerta!", JOptionPane.YES_NO_OPTION);
            if (respuesta == YES_NO_OPTION) {
                try {
                    File path = new File(Seleccionar_Archivo.getSelectedFile() + ".html");
                    Desktop.getDesktop().open(path);
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    public void imagen(String a, int b) {
        ImageIcon img = new ImageIcon("src/img/" + a + ".png");
        System.out.println(b);
        if (b == 1) {
            jLabel2.setIcon(new ImageIcon(img.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_SMOOTH)));
        }
        if (b == 2) {
            jLabel3.setIcon(new ImageIcon(img.getImage().getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_SMOOTH)));
        }
        if (b == 3) {
            jLabel4.setIcon(new ImageIcon(img.getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_SMOOTH)));
        }
        if (b == 4) {
            jLabel5.setIcon(new ImageIcon(img.getImage().getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_SMOOTH)));
        }
        if (b == 5) {
            jLabel6.setIcon(new ImageIcon(img.getImage().getScaledInstance(jLabel6.getWidth(), jLabel6.getHeight(), Image.SCALE_SMOOTH)));
        }
        if (b == 6) {
            jLabel7.setIcon(new ImageIcon(img.getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_SMOOTH)));
        }
        if (b == 7) {
            jLabel8.setIcon(new ImageIcon(img.getImage().getScaledInstance(jLabel8.getWidth(), jLabel8.getHeight(), Image.SCALE_SMOOTH)));
        }
        if (b == 8) {
            jLabel9.setIcon(new ImageIcon(img.getImage().getScaledInstance(jLabel9.getWidth(), jLabel9.getHeight(), Image.SCALE_SMOOTH)));
        }
        if (b == 9) {
            jLabel10.setIcon(new ImageIcon(img.getImage().getScaledInstance(jLabel10.getWidth(), jLabel10.getHeight(), Image.SCALE_SMOOTH)));
        }
        if (b == 10) {
            jLabel11.setIcon(new ImageIcon(img.getImage().getScaledInstance(jLabel11.getWidth(), jLabel11.getHeight(), Image.SCALE_SMOOTH)));
        }

    }

    public void limpiar() {
        jLabel2.setIcon(null);
        jLabel3.setIcon(null);
        jLabel4.setIcon(null);
        jLabel5.setIcon(null);
        jLabel6.setIcon(null);
        jLabel7.setIcon(null);
        jLabel8.setIcon(null);
        jLabel9.setIcon(null);
        jLabel10.setIcon(null);
        jLabel11.setIcon(null);
        b = 0;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
