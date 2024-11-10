/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package igu;

import gimnasio.Profesor;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author usuario
 */
public class Disciplina extends javax.swing.JFrame {

    /**
     * Creates new form Disciplina
     */
    public Disciplina() {
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        lblNombre = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnBdd = new javax.swing.JButton();
        btnPlanes = new javax.swing.JButton();
        btnDisciplina = new javax.swing.JButton();
        btnAlumnoProfesor = new javax.swing.JButton();
        panelMain = new javax.swing.JPanel();
        comboD = new javax.swing.JComboBox<>();
        lblCupos = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblDisciplina = new java.awt.Label();
        listaProfesores = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNombre.setFont(new java.awt.Font("Monocraft", 1, 36)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("Java Training Center");
        lblNombre.setToolTipText("");
        lblNombre.setAlignmentX(300.0F);
        lblNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lblNombre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblNombre.setPreferredSize(new java.awt.Dimension(970, 666));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btnBdd.setBackground(new java.awt.Color(255, 255, 255));
        btnBdd.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnBdd.setForeground(new java.awt.Color(0, 0, 0));
        btnBdd.setText("Base de datos");
        btnBdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBddActionPerformed(evt);
            }
        });

        btnPlanes.setBackground(new java.awt.Color(255, 255, 255));
        btnPlanes.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnPlanes.setForeground(new java.awt.Color(0, 0, 0));
        btnPlanes.setText("Planes");
        btnPlanes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlanesActionPerformed(evt);
            }
        });

        btnDisciplina.setBackground(new java.awt.Color(255, 255, 255));
        btnDisciplina.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnDisciplina.setForeground(new java.awt.Color(0, 0, 0));
        btnDisciplina.setText("Disciplinas");
        btnDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisciplinaActionPerformed(evt);
            }
        });

        btnAlumnoProfesor.setBackground(new java.awt.Color(255, 255, 255));
        btnAlumnoProfesor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAlumnoProfesor.setForeground(new java.awt.Color(0, 0, 0));
        btnAlumnoProfesor.setText("Alumno / Profesor");
        btnAlumnoProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlumnoProfesorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBdd, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlanes, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlumnoProfesor))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(btnAlumnoProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btnDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnPlanes, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btnBdd, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        panelMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panelMain.setAlignmentX(1.0F);

        comboD.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboD.setForeground(new java.awt.Color(0, 0, 0));
        comboD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Musculación", "Yoga" }));
        comboD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDActionPerformed(evt);
            }
        });

        lblCupos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblCupos.setForeground(new java.awt.Color(0, 0, 0));
        lblCupos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCupos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblCupos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Profesor");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Cupos ");

        lblDisciplina.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblDisciplina.setText("Seleccione la disciplina");

        listaProfesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaProfesoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addComponent(lblDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboD, javax.swing.GroupLayout.Alignment.TRAILING, 0, 145, Short.MAX_VALUE)
                            .addComponent(listaProfesores, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCupos, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(208, 208, 208))))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCupos, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(listaProfesores))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 958, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Random randomYoga = new Random();
    Random randomMusc = new Random();

    int cuposDisponiblesY = randomYoga.nextInt(31);
    int cuposDisponiblesM = randomMusc.nextInt(61);

    private void comboDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDActionPerformed
        String seleccion = comboD.getSelectedItem().toString();

        // Limpiar la lista antes de agregar los nuevos elementos
        listaProfesores.removeAllItems();

        ArrayList<Profesor> profesores = Profesor.getProfesores();

        //Tambien hay qyue ver esto para que muestre profesores de acuerdo a la seleccion de clase y que muestre lo de la base de datos, no lo de las listas.
        switch (seleccion) {
            case "Musculación":
                for (Profesor profes : profesores) {

                    lblCupos.setText("" + cuposDisponiblesM);
                    if (profes.getDisciplina().equals("Musculación")) {
                        listaProfesores.addItem(profes.getNombre());

                    }

                }

                break;

            case "Yoga":
                for (Profesor profes : profesores) {
                    lblCupos.setText("" + cuposDisponiblesY);
                    if (profes.getDisciplina().equals("Yoga")) {
                        listaProfesores.addItem(profes.getNombre());

                    }
                }

                break;
        }

    }//GEN-LAST:event_comboDActionPerformed


    private void btnAlumnoProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlumnoProfesorActionPerformed
        profesorAlumno newframe = new profesorAlumno();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAlumnoProfesorActionPerformed

    private void btnDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisciplinaActionPerformed
        Disciplina disciplinas = new Disciplina();
        disciplinas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDisciplinaActionPerformed

    private void btnPlanesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlanesActionPerformed
        // TODO add your handling code here:
        Planes planes = new Planes();
        planes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPlanesActionPerformed

    private void listaProfesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaProfesoresActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_listaProfesoresActionPerformed

    private void btnBddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBddActionPerformed
        // TODO add your handling code here:
        Bdd bdd = new Bdd();
        bdd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlumnoProfesor;
    private javax.swing.JButton btnBdd;
    private javax.swing.JButton btnDisciplina;
    private javax.swing.JButton btnPlanes;
    private javax.swing.JComboBox<String> comboD;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel lblCupos;
    private java.awt.Label lblDisciplina;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JComboBox<String> listaProfesores;
    private javax.swing.JPanel panelMain;
    // End of variables declaration//GEN-END:variables
}
