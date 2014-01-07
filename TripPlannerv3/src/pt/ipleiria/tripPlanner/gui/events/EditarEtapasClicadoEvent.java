/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipleiria.tripPlanner.gui.events;

import java.util.EventObject;
import pt.ipleiria.tripPlanner.gui.Models.Etapa;
import pt.ipleiria.tripPlanner.gui.Models.Participante;

/**
 *
 * @author Ricardo
 */

public class EditarEtapasClicadoEvent extends EventObject {
String string = "Editar Etapa";
Etapa etapa;
    public EditarEtapasClicadoEvent(Object source, Etapa etapa) {
        super(source);
        this.etapa = etapa;
    }
      public String getString(){
        return string;
    }
    
    public Etapa getEtapa(){
        return etapa;
    }
}
