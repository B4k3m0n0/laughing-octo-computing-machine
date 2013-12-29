/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipleiria.tripPlanner.gui.events;

import java.util.EventObject;
import pt.ipleiria.tripPlanner.gui.Models.Alojamento;

/**
 *
 * @author Cristiano
 */
public class VisualizarAlojamentoClicadoEvent extends EventObject{
    
    Alojamento alojamento;
    public VisualizarAlojamentoClicadoEvent(Object source, Alojamento alojamento){
        super(source);
        this.alojamento = alojamento;
    }

    public Alojamento getAlojamento() {
        return alojamento;
    }
    
}
