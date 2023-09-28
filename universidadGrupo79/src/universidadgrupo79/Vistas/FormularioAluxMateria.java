/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo79.Vistas;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import universidadgrupo79.AccesoaDatos.AlumnoData;
import universidadgrupo79.AccesoaDatos.InscripcionData;
import universidadgrupo79.AccesoaDatos.MateriasData;
import universidadgrupo79.Entidades.Alumno;
import universidadgrupo79.Entidades.Materia;


public class FormularioAluxMateria extends javax.swing.JInternalFrame {
private DefaultTableModel tablaAlu = new DefaultTableModel();
    
    public FormularioAluxMateria() {
        initComponents();
        cargaCombo();
        armarCabecera();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jCmaterias = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTalumnos = new javax.swing.JTable();
        jBsalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Listado de Alumnos por Materia");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Seleccione una Materia:");

        jCmaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmateriasActionPerformed(evt);
            }
        });

        jTalumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTalumnos);

        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jBsalir)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(18, 18, 18)
                                            .addComponent(jCmaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 19, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(142, 142, 142))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCmaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(jBsalir)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jCmateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmateriasActionPerformed
        // TODO add your handling code here:
//        limpiarTabla();
//        
//
//        InscripcionData id = new InscripcionData();
//        Materia mat = (Materia) jCmaterias.getSelectedItem();
//        ArrayList<Alumno> alumnos = new ArrayList<>();
//        alumnos = id.obtenerAlumnosXMateria(mat.getIdMateria());
//
//        cargarTabla(alumnos);
    }//GEN-LAST:event_jCmateriasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<Materia> jCmaterias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTalumnos;
    // End of variables declaration//GEN-END:variables
private void cargaCombo() {
        MateriasData md = new MateriasData();
        ArrayList<Materia> mat = new ArrayList<>();
        mat = (ArrayList<Materia>) md.listarMaterias();
        
        for (Materia materia : mat) {
            jCmaterias.addItem(materia);
            
        }
    }
private void armarCabecera() {
        tablaAlu.addColumn("ID");
        tablaAlu.addColumn("DNI");
        tablaAlu.addColumn("Nombre");
        tablaAlu.addColumn("Apellido");
        jTalumnos.setModel(tablaAlu);

    }
private void cargarTabla(ArrayList<Alumno> alu) {

        for (Alumno alumno  : alu) {
            Object[] newalu = {alumno.getIdAlumno(),alumno.getDni(), alumno.getNombre(), alumno.getApellido()};
            tablaAlu.addRow(newalu);

        }
    }

    private void limpiarTabla() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
