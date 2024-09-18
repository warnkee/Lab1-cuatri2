
package Controllers;

import Models.Citas;
import Models.Clientes;
import Models.IManager;
import Models.IMoreManager;
import Models.Medico;
import Views.IView;
import java.time.LocalDate;
import java.util.List;

public class CitaController {
    private IManager<Citas> model;
    private IView<Citas> view;
    
     public CitaController(IManager model, IView view) {
        this.model = model;
        this.view = view;
    }

    public void insert(LocalDate fecha, LocalDate hora, Clientes cliente, Medico medico, String motivo){
        Citas cita;
            cita=new Citas(fecha,hora,cliente,medico,motivo);
            
    }

    public void update(LocalDate fecha, LocalDate hora, int id ){
        Citas cita = new Citas(fecha,hora,id);
        if (cita!=null){
            cita.modificarCita(fecha, hora);
            if (model.set(cita))
                view.showMessage("Cliente actualizado.");
            else
               view.showErrorMessage("Error al actualizar.");
        }else{
            view.showErrorMessage("Error cliente no encontrado");
        }
    }
    
    
    public void read(int id){
        Clientes customer = new Clientes(id);
        customer=(Clientes) model.get(customer);
        if (customer!=null){
            view.display(customer);
        }else{
            view.showErrorMessage("Error cliente no encontrado");
        }
    }
    
    public void readAll(){
        List<Clientes> customers=model.getAll();
        if(customers!=null){
            view.displayAll(customers);
        }else{
            view.showErrorMessage("No hay datos");
        }
    }

    
}
