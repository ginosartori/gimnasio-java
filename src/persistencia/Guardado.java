/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import gimnasio.Alumno;
import gimnasio.Profesor;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static persistencia.Database.connect;

/**
 *
 * @author Sartori
 */
public class Guardado {

    private Component parentComponent;

    //Metodo para guardar alumnos en la base de datos
    public void guardarAlumno(Alumno alumn) {
        String sql = "INSERT INTO Alumnos (nombre, documento, correo, plan) VALUES (?, ?, ?, ?)";
        try (Connection conn = connect(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, alumn.getNombre());
            ps.setInt(2, alumn.obtenerDni());
            ps.setString(3, alumn.getCorreo());
            ps.setString(4, alumn.getPlan());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(parentComponent, "Alumno guardado correctamente.");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(parentComponent, "Error al registrar el alumno." + e.getMessage());
        }
    }

    public void guardarProfesores(Profesor profe) {
        String sql = "INSERT INTO Profesores (nombre, documento, correo, disciplina) VALUES (?, ?, ?, ?)";
        try (Connection conn = connect(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, profe.getNombre());
            ps.setInt(2, profe.obtenerDni());
            ps.setString(3, profe.getCorreo());
            ps.setString(4, profe.getDisciplina());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(parentComponent, "Profesor guardado correctamente.");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(parentComponent, "Error al registrar al profesor." + e.getMessage());
        }
    }
    
}
