/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Student
 */
import java.util.HashSet;
import java.util.Set;

public class MedicoSet {
    private Set<Medico> medicos;

    // Constructor
    public MedicoSet() {
        medicos = new HashSet<>();
    }

    // Agregar médico
    public void agregarMedico(Medico medico) {
        medicos.add(medico);
    }

    // Eliminar médico
    public boolean eliminarMedico(String id) {
        return medicos.removeIf(medico -> medico.getId().equals(id));
    }

    // Buscar médico
    public Medico buscarMedico(String id) {
        for (Medico medico : medicos) {
            if (medico.getId().equals(id)) {
                return medico;
            }
        }
        return null; // Médico no encontrado
    }

    // Modificar médico
    public boolean modificarMedico(String id, Medico nuevoMedico) {
        if (eliminarMedico(id)) {
            agregarMedico(nuevoMedico);
            return true; // Modificación exitosa
        }
        return false; // Médico no encontrado
    }

    // Listar médicos
    public Set<Medico> listarMedicos() {
        return new HashSet<>(medicos); // Retornar una copia del set
    }

    // Generar reportes
    public void generarReporte() {
        for (Medico medico : medicos) {
            System.out.println(medico);
        }
    }
}