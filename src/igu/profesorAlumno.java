/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package igu;

import gimnasio.Alumno;
import gimnasio.Clases;
import gimnasio.ClasesAbstractFactory;
import gimnasio.ClasesConcrectFactory;
import gimnasio.Profesor;
import javax.swing.JOptionPane;
import persistencia.Database;
import persistencia.Guardado;

/**
 *
 * @author usuario
 */
public class profesorAlumno extends javax.swing.JFrame {
    
    private Profesor Profesor;

    /**
     * Creates new form profesorAlumno
     */
    public profesorAlumno() {
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

        jMenu1 = new javax.swing.JMenu();
        panelMain4 = new javax.swing.JPanel();
        btnCombo = new javax.swing.JComboBox<>();
        txtDni = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtDisciplina = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnAsignar = new javax.swing.JButton();
        txtPlan = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelP = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelD = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAlumnoProfesor = new javax.swing.JButton();
        btnPlanes = new javax.swing.JButton();
        btnDisciplina = new javax.swing.JButton();
        btnBdd = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelMain4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panelMain4.setAlignmentX(1.0F);

        btnCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "             ", "Alumnos", "Profesores" }));
        btnCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComboActionPerformed(evt);
            }
        });

        btnAsignar.setText("Asignar");
        btnAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarActionPerformed(evt);
            }
        });

        txtPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlanActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre y Apellido");

        jLabel2.setText("Correo Electrónico");

        labelP.setText("Plan");

        jLabel4.setText("Documento");

        labelD.setText("Disciplina");

        javax.swing.GroupLayout panelMain4Layout = new javax.swing.GroupLayout(panelMain4);
        panelMain4.setLayout(panelMain4Layout);
        panelMain4Layout.setHorizontalGroup(
            panelMain4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMain4Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(panelMain4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelMain4Layout.createSequentialGroup()
                        .addGroup(panelMain4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelP, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelD, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelMain4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMain4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtDisciplina, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                .addComponent(txtDni, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                .addComponent(txtPlan))
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(316, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMain4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        panelMain4Layout.setVerticalGroup(
            panelMain4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMain4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addGroup(panelMain4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelMain4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panelMain4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelMain4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelP, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelMain4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelD, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(btnAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        btnAlumnoProfesor.setBackground(new java.awt.Color(255, 255, 255));
        btnAlumnoProfesor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAlumnoProfesor.setForeground(new java.awt.Color(0, 0, 0));
        btnAlumnoProfesor.setText("Alumno / Profesor");
        btnAlumnoProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlumnoProfesorActionPerformed(evt);
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

        btnBdd.setBackground(new java.awt.Color(255, 255, 255));
        btnBdd.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnBdd.setForeground(new java.awt.Color(0, 0, 0));
        btnBdd.setText("Base de datos");
        btnBdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBdd, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlanes, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlumnoProfesor))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnAlumnoProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(btnDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnPlanes, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btnBdd, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        lblNombre.setFont(new java.awt.Font("Monocraft", 1, 36)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("Java Training Center");
        lblNombre.setToolTipText("");
        lblNombre.setAlignmentX(300.0F);
        lblNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lblNombre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelMain4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMain4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlumnoProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlumnoProfesorActionPerformed
        

    }//GEN-LAST:event_btnAlumnoProfesorActionPerformed

    private void btnDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisciplinaActionPerformed
        Disciplina disciplinas = new Disciplina();
        disciplinas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDisciplinaActionPerformed

    private void btnComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComboActionPerformed
        String seleccion = btnCombo.getSelectedItem().toString();
        
        if ("Alumnos".equalsIgnoreCase(seleccion)) {
            txtNombre.setVisible(true);
            txtDni.setVisible(true);
            txtCorreo.setVisible(true);
            txtPlan.setVisible(true);
            labelD.setVisible(false);
            txtDisciplina.setVisible(false);
            labelP.setVisible(true);
        }
        
        if ("Profesores".equalsIgnoreCase(seleccion)) {
            txtNombre.setVisible(true);
            txtDni.setVisible(true);
            txtCorreo.setVisible(true);
            txtDisciplina.setVisible(true);
            labelP.setVisible(false);
            txtPlan.setVisible(false);
            labelD.setVisible(true);
        }
        

    }//GEN-LAST:event_btnComboActionPerformed

    private void btnAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarActionPerformed
        Guardado guardado = new Guardado();
        String selection = btnCombo.getSelectedItem().toString();
        if ("Alumnos".equalsIgnoreCase(selection)) {
            String nombre = txtNombre.getText();
            int dni = Integer.parseInt(txtDni.getText());
            String correo = txtCorreo.getText();
            String plan = txtPlan.getText();
            
            if (!txtPlan.getText().equalsIgnoreCase("Musculación") && !txtPlan.getText().equalsIgnoreCase("Yoga")) {
                JOptionPane.showMessageDialog(rootPane, "Por favor, ingrese un plan dentro de los existentes.");
                return;
            }
            
            Alumno alumno = new Alumno(nombre, dni, correo, plan);
            
            guardado.guardarAlumno(alumno);
            
            limpiarCampo();
            
        } else if ("Profesores".equalsIgnoreCase(selection)) {
            String nombre = txtNombre.getText();
            int dni = Integer.parseInt(txtDni.getText());
            String correo = txtCorreo.getText();
            if (!correoValido(correo)) {
                JOptionPane.showMessageDialog(this, "Correo electrónico inválido. Por favor, ingrese uno válido.");
                return;
            }
            String disciplina = txtDisciplina.getText();
            
            Profesor profesor = new Profesor(nombre, dni, correo, disciplina);
            
            guardado.guardarProfesores(profesor);
            
            limpiarCampo();
            
        }
    }//GEN-LAST:event_btnAsignarActionPerformed

    /* Metodo que no se como implementar correctamente para validar las entradas. (problemas con DNI)
    private void validacionEntradas(String nombre, String correo, String disciplina, String plan) {
        String select = btnCombo.getSelectedItem().toString();
        switch (select) {
            case "Alumnos":
                if (nombre.isEmpty() || correo.isEmpty() || plan.isEmpty()) {
                    JOptionPane.showMessageDialog(rootPane, "Complete la información en todos los campos.");
                    
                }
                break;

            case "Profesores":
                if (nombre.isEmpty() || correo.isEmpty() || disciplina.isEmpty()) {
                    JOptionPane.showMessageDialog(rootPane, "Complete la información en todos los campos.");
                    
                }
                break;
        }
        return;
        
    }
     */
    private void txtPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlanActionPerformed

    private void btnPlanesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlanesActionPerformed
        // TODO add your handling code here:
        Planes planes = new Planes();
        planes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPlanesActionPerformed

    private void btnBddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBddActionPerformed
        Bdd bdd = new Bdd();
        bdd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBddActionPerformed
    
    private boolean correoValido(String correo) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return correo.matches(regex);
    }
    
    private void limpiarCampo() {
        txtNombre.setText("");
        txtDni.setText("");
        txtCorreo.setText("");
        if (btnCombo.getSelectedItem().equals("Profesores")) {
            txtDisciplina.setText("");
        }
        if (btnCombo.getSelectedItem().equals("Alumnos")) {
            txtPlan.setText("");
        }
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlumnoProfesor;
    private javax.swing.JButton btnAsignar;
    private javax.swing.JButton btnBdd;
    private javax.swing.JComboBox<String> btnCombo;
    private javax.swing.JButton btnDisciplina;
    private javax.swing.JButton btnPlanes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelD;
    private javax.swing.JLabel labelP;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JPanel panelMain4;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDisciplina;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPlan;
    // End of variables declaration//GEN-END:variables
}
