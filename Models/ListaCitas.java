/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 *
 * @author Saliim
 */
public class ListaCitas implements IManager<Citas> {

private Set<Citas> listaCita;

   public boolean add(Citas cita){
         Citas current = get(cita);
        if(current!=null)
            return false;
        listaCita.add(cita);
        return true;
   }
    
    public Citas get(Citas cita){
          for (Citas current : listaCita) {
            if (cita.equals(current)) {
                return current;
            }
        }
        return null;
    }
        
    public boolean set(Citas cita){
            for(Citas x:listaCita){
            if(cita.equals(x)){
                cita.modificarCita(cita.getFecha(), cita.getHora());
                return true;   
            }
             
        }
        return false;
    }
        
    public List getAll(){
              if (listaCita.isEmpty()) {
            return null;
        }
 return new ArrayList<>(listaCita);    
    }

 public Citas BuscarID(int id){
     
   for(Citas c:listaCita){
      if(c.getId()==id){
          return c;
      } 
   } 
   return null;
 }
    
    }
    

