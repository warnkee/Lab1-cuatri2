/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Student
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MedicoSet implements IManager<Medico> {
    private Set<Medico> medicos;

    // Constructor
    public MedicoSet() {
        medicos = new HashSet<>();
    }


    // Generar reportes
    public void generarReporte() {
        for (Medico medico : medicos) {
            System.out.println(medico);
        }
    }

    @Override
    public boolean add(Medico element) {
        if(element == null)
            return false;
       medicos.add(element);
       return true;
    }

    @Override
    public Medico get(Medico element) {
         for (Medico medico : medicos) {
            if (medico.getId().equals(element.getId())) {
                return medico;
            }
        }
        return null; // Médico no encontrado
    }

    @Override
    public boolean set(Medico element) {
          if (remove(element)) {
            add(element);
            return true; // Modificación exitosa
        }
        return false; // Médico no encontrado
    }

    @Override
    public boolean remove(Medico element) {
        return medicos.removeIf(medico -> medico.getId().equals(element.getId()));
    }

    @Override
    public List getAll() {
           return new ArrayList<>(medicos);
    }
    
}