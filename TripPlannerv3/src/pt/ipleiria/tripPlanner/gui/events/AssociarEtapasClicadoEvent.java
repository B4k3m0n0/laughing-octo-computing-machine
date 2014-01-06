/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipleiria.tripPlanner.gui.events;

import java.util.EventObject;
import pt.ipleiria.tripPlanner.gui.Models.Etapa;

/**
 *
 * @author Ricardo
 */
public class AssociarEtapasClicadoEvent extends EventObject {

    Etapa etapa;
    
    public AssociarEtapasClicadoEvent(Object source, Etapa etapa) {
        super(source);
        this.etapa = etapa;
    }

    public Etapa getEtapa() {
        return etapa;
    }
    
}
