/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package igu;

/**
 *
 * @author usuario
 */
public class Planes extends javax.swing.JFrame {

    /**
     * Creates new form Planes
     */
    public Planes() {
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
        panelMain = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAlumnoProfesor = new javax.swing.JButton();
        btnPlanes = new javax.swing.JButton();
        btnDisciplina = new javax.swing.JButton();
        btnBdd = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelMain.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        panelMain.setForeground(new java.awt.Color(0, 0, 0));
        panelMain.setAlignmentX(1.0F);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/igu/WhatsApp Image 2024-11-10 at 15.43.27.jpeg"))); // NOI18N
        jLabel3.setText("jLabel1");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/igu/WhatsApp Image 2024-11-10 at 15.34.50 (1).jpeg"))); // NOI18N
        jLabel4.setText("jLabel1");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel4.setMaximumSize(new java.awt.Dimension(618, 23));

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

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
                .addComponent(btnAlumnoProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btnDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnPlanes, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btnBdd, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );

        lblNombre.setFont(new java.awt.Font("Monocraft", 1, 36)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("Java Traincing Center");
        lblNombre.setToolTipText("");
        lblNombre.setAlignmentX(300.0F);
        lblNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        lblNombre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 959, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnBddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBddActionPerformed
        Bdd bdd = new Bdd();
        bdd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBddActionPerformed

    private void btnPlanesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlanesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPlanesActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlumnoProfesor;
    private javax.swing.JButton btnBdd;
    private javax.swing.JButton btnDisciplina;
    private javax.swing.JButton btnPlanes;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JPanel panelMain;
    // End of variables declaration//GEN-END:variables
}
