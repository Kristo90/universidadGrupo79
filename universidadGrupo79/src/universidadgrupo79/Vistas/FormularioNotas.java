package universidadgrupo79.Vistas;

import static java.rmi.Naming.list;
import java.util.ArrayList;
import static java.util.Collections.list;
import javax.swing.table.DefaultTableModel;
import universidadgrupo79.AccesoaDatos.AlumnoData;
import universidadgrupo79.AccesoaDatos.InscripcionData;
import universidadgrupo79.AccesoaDatos.MateriasData;
import universidadgrupo79.Entidades.Alumno;
import universidadgrupo79.Entidades.Inscripcion;
import universidadgrupo79.Entidades.Materia;

public class FormularioNotas extends javax.swing.JInternalFrame {

    private DefaultTableModel tablaNota = new DefaultTableModel();

    public FormularioNotas() {
        initComponents();
        cargaCombo();
        armarCabecera();
        jbGuardar.setEnabled(false);
    }InscripcionData id=new InscripcionData();
    Inscripcion insc=new Inscripcion();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jcbSelec = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtNotas = new javax.swing.JTable();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Carga de Notas");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Seleccione un alumno :");

        jcbSelec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbSelecMouseClicked(evt);
            }
        });
        jcbSelec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSelecActionPerformed(evt);
            }
        });

        jtNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Nota"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtNotas);

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(232, 232, 232))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbSalir))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(33, 33, 33)
                                    .addComponent(jcbSelec, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbSelec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbSalir))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jcbSelecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbSelecMouseClicked


    }//GEN-LAST:event_jcbSelecMouseClicked

    private void jcbSelecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSelecActionPerformed
        // TODO add your handling code here:
        limpiarTabla();
        jbGuardar.setEnabled(true);

        InscripcionData id = new InscripcionData();
        Alumno alu = (Alumno) jcbSelec.getSelectedItem();
        ArrayList<Materia> materias = new ArrayList<>();
        materias = id.listarMateriaIns(alu.getIdAlumno());

        cargarTabla(materias);


    }//GEN-LAST:event_jcbSelecActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
        MateriasData md = new MateriasData();
        InscripcionData id = new InscripcionData();
        Alumno alu = new Alumno();
        int filaS = jtNotas.getSelectedRow();

        if (filaS != -1) {

            int idMat = (Integer) jtNotas.getValueAt(filaS, 0);

            Materia materia = md.buscarMateria(idMat);
//          
//            
//            double nota = Double.parseDouble(comboNota.getSelectedItem().toString());
//            int idAlumno = comboAlumno.getItemAt(comboAlumno.getSelectedIndex()).getIdAlumno();
            Inscripcion inscrip = new Inscripcion((Alumno) jcbSelec.getSelectedItem(), materia, jtNotas.getSelectedColumn());
            int idAlumno = alu.getIdAlumno();
            //double nota= ;
                    //id.actualizarNota(idAlumno, idMat, null);
    }//GEN-LAST:event_jbGuardarActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> jcbSelec;
    private javax.swing.JTable jtNotas;
    // End of variables declaration//GEN-END:variables

    private void cargaCombo() {
        AlumnoData aluD = new AlumnoData();
        ArrayList<Alumno> alu = new ArrayList<>();
        alu = (ArrayList<Alumno>) aluD.listarAlumno();

        for (Alumno alumno : alu) {
            jcbSelec.addItem(alumno);
        }
    }

    private void armarCabecera() {

        tablaNota.addColumn("Codigo");
        tablaNota.addColumn("Nombre");
        tablaNota.addColumn("Nota");
        jtNotas.setModel(tablaNota);
    }

    private void cargarTabla(ArrayList<Materia> mat) {

        for (Materia materia : mat) {
            Object[] newmat = {materia.getIdMateria(), materia.getNombre(), null};
            tablaNota.addRow(newmat);

        }
    }

    private void limpiarTabla() {

        tablaNota.setRowCount(0);
    }
}
