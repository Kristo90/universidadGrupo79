/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo79.Vistas;

/**
 *
 * @author krist
 */
public class Pantalla extends javax.swing.JFrame {

    /**
     * Creates new form Pantalla
     */
    public Pantalla() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EscritorioPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmalumno = new javax.swing.JMenuItem();
        jmMaterias = new javax.swing.JMenu();
        jMFMaterias = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);

        javax.swing.GroupLayout EscritorioPrincipalLayout = new javax.swing.GroupLayout(EscritorioPrincipal);
        EscritorioPrincipal.setLayout(EscritorioPrincipalLayout);
        EscritorioPrincipalLayout.setHorizontalGroup(
            EscritorioPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1012, Short.MAX_VALUE)
        );
        EscritorioPrincipalLayout.setVerticalGroup(
            EscritorioPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 679, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(102, 153, 255));

        jMenu1.setText("Alumno");
        jMenu1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jmalumno.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jmalumno.setText("Formulario de Alumno");
        jmalumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmalumnoActionPerformed(evt);
            }
        });
        jMenu1.add(jmalumno);

        jMenuBar1.add(jMenu1);

        jmMaterias.setText("Materia");
        jmMaterias.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jmMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmMateriasActionPerformed(evt);
            }
        });

        jMFMaterias.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMFMaterias.setText("Formulario de Materia");
        jMFMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMFMateriasActionPerformed(evt);
            }
        });
        jmMaterias.add(jMFMaterias);

        jMenuBar1.add(jmMaterias);

        jMenu3.setText("Administración");
        jMenu3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenuItem3.setText("Manejo de Inscripciones");
        jMenu3.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenuItem4.setText("Modificación de Notas");
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Consultas");
        jMenu4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Salir");
        jMenu5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EscritorioPrincipal)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EscritorioPrincipal)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmalumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmalumnoActionPerformed
        
        // Remover la pantalla principal
        EscritorioPrincipal.removeAll();
        // Redibuja el escritorio principal
        EscritorioPrincipal.repaint();
        // Crear el objeto de la ventana fomulario alunmo(Clase)
        FormularioAlumno fa = new FormularioAlumno();
        // Hacer visible el objeto (ventana formulario)
        fa.setVisible(true);
        
        // Escritorio principal agregar el Objeto (ventana formilario)
        EscritorioPrincipal.add(fa);
        
    }//GEN-LAST:event_jmalumnoActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jmMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmMateriasActionPerformed
        // TODO add your handling code here:
          // Remover la pantalla principal
        EscritorioPrincipal.removeAll();
        // Redibuja el escritorio principal
        EscritorioPrincipal.repaint();
        // Crear el objeto de la ventana fomulario alunmo(Clase)
        FormularioMaterias fm = new FormularioMaterias();
              
        // Escritorio principal agregar el Objeto (ventana formilario)
        EscritorioPrincipal.add(fm);
        fm.setVisible(true);
        
    }//GEN-LAST:event_jmMateriasActionPerformed

    private void jMFMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMFMateriasActionPerformed
        // TODO add your handling code here:
                // TODO add your handling code here:
          // Remover la pantalla principal
        EscritorioPrincipal.removeAll();
        // Redibuja el escritorio principal
        EscritorioPrincipal.repaint();
        // Crear el objeto de la ventana fomulario alunmo(Clase)
        FormularioMaterias fm = new FormularioMaterias();
              
        // Escritorio principal agregar el Objeto (ventana formilario)
        EscritorioPrincipal.add(fm);
        fm.setVisible(true);
    }//GEN-LAST:event_jMFMateriasActionPerformed

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
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane EscritorioPrincipal;
    private javax.swing.JMenuItem jMFMaterias;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenu jmMaterias;
    private javax.swing.JMenuItem jmalumno;
    // End of variables declaration//GEN-END:variables
}
