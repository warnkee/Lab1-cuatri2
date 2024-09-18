
package Models;

import java.time.LocalDate;


public class Citas {
  private LocalDate fecha;
  private LocalDate hora;
  private Clientes cliente;
  private Medico medico;
  private String motivo;
  private boolean activa;

    public Citas(LocalDate fecha, LocalDate hora, Clientes cliente, Medico medico, String motivo, boolean activa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.medico = medico;
        this.motivo = motivo;
        this.activa = activa;
    }

    public Citas() {
    }

    public Citas(LocalDate fecha, LocalDate hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    public boolean isActiva() {
        return activa;
    }

    public void cancelarCita() {
        this.activa = false;
    }
    
    public void modificarCita(LocalDate fech, LocalDate hor){
     this.fecha = fech;
        this.hora = hor;
}


    public LocalDate getFecha() {
        return fecha;
    }

    public LocalDate getHora() {
        return hora;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public Medico getMedico() {
        return medico;
    }

    public String getMotivo() {
        return motivo;
    }

    @Override
    public String toString() {
        return "Citas{" + "fecha=" + fecha + ", hora=" + hora + ", cliente=" + cliente + ", medico=" + medico + ", motivo=" + motivo + '}';
    }
  
  
}
