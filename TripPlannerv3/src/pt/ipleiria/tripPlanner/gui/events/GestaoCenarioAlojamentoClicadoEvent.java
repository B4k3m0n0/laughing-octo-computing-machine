/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipleiria.tripPlanner.gui.events;

import java.util.EventObject;
import pt.ipleiria.tripPlanner.gui.Models.Viagem;

/**
 *
 * @author Cristiano
 */
public class GestaoCenarioAlojamentoClicadoEvent extends EventObject{
    
    private Viagem viagem;
    public GestaoCenarioAlojamentoClicadoEvent(Object source, Viagem viagem){
        super(source);
        this.viagem = viagem;
    }

    public Viagem getViagem() {
        return viagem;
    }
    
}
