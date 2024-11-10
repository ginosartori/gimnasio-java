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
    public void guardarAlumno(Alumno alumno) throws SQLException {
        String sql = "INSERT TO Alumnos (nombre, dni, correo, plan) VALUES (?, ?, ?, ?)";
        try (Connection conn = connect(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, alumno.getNombre());
            ps.setInt(2, alumno.obtenerDni());
            ps.setString(3, alumno.getCorreo());
            ps.setString(4, alumno.getPlan());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(parentComponent, "Alumno guardado correctamente.");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(parentComponent, "Error al registrar el alumno.");
        }
    }

    public void guardarProfesores(Profesor profesor) {
        String sql = "INSERT TO Profesores (nombre, dni, correo, disciplina) VALUES (?, ?, ?, ?)";
        try (Connection conn = connect(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, profesor.getNombre());
            ps.setInt(2, profesor.getDni());
            ps.setString(3, profesor.getCorreo());
            ps.setString(4, profesor.getDisciplina());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(parentComponent, "Profesor guardado correctamente.");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(parentComponent, "Error al registrar al profesor.");
        }
    }
}
