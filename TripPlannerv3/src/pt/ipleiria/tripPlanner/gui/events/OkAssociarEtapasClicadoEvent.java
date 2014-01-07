/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipleiria.tripPlanner.gui.events;

import java.util.EventObject;
import pt.ipleiria.tripPlanner.gui.Models.Etapa;
import pt.ipleiria.tripPlanner.gui.Models.Viagem;

/**
 *
 * @author Ricardo
 */
public class OkAssociarEtapasClicadoEvent extends EventObject {

    Etapa etapa;
    
    public OkAssociarEtapasClicadoEvent(Object source,Etapa etapa) {
        super(source);
        this.etapa = etapa;
    }

    public Etapa getEtapa() {
        return etapa;
    }
    
    
}
