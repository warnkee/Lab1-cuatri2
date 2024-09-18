/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.time.LocalDate;

/**
 *
 * @author Student
 */
public class Medico {
    private String id; // Cédula
    private String numeroMedico;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String telefono;
    private String correo;
    private String especialidad;
    private double salario;

    // Constructor
    public Medico(String id, String numeroMedico, String nombre, LocalDate fechaNacimiento,
                  String telefono, String correo, String especialidad, double salario) {
        this.id = id;
        this.numeroMedico = numeroMedico;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.correo = correo;
        this.especialidad = especialidad;
        this.salario = salario;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public String getNumeroMedico() {
        return numeroMedico;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public double getSalario() {
        return salario;
    }

    // Método para mostrar información del médico
    @Override
    public String toString() {
        return "Médico [ID=" + id + ", Número=" + numeroMedico + ", Nombre=" + nombre +
               ", Fecha Nac.=" + fechaNacimiento + ", Teléfono=" + telefono +
               ", Correo=" + correo + ", Especialidad=" + especialidad + 
               ", Salario=" + salario + "]";
    }
}
