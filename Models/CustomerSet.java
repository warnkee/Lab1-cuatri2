/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Saliim
 */
public class CustomerSet implements IMoreManager<Clientes> {
 private HashSet<Clientes> set ;
    
    public CustomerSet(){
          set=new HashSet<>(); 
    }
    
    public boolean add(Clientes element) {
       return set.add(element);
    }

    public Clientes get(Clientes element) {
        for(Clientes current:set){
            if(current.getId()==element.getId())
                return current;
        }
        return null;
    }

    public boolean set(Clientes element) {
        for(Clientes current:set){
            if(current.getId()==element.getId()){
                set.remove(current);
                set.add(element);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(Clientes element) {
           for(Clientes current:set){
            if(current.getId()==element.getId()){
                return set.remove(current);

            }
        }
        return false;
    }

    @Override
    public List getAll() {
        return new ArrayList<>(set);
    }
    
    public String ShowAll() {
    StringBuilder sb = new StringBuilder();
    
    for (Clientes customer : set) {
        sb.append(customer.toString()).append("\n");
    }
    return sb.toString();
}

    


}
