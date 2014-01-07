/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipleiria.tripPlanner.gui.events;

import java.util.EventObject;
import pt.ipleiria.tripPlanner.gui.Models.CenarioAlojamento;

/**
 *
 * @author Ricardo
 */
public class EditarCenarioAlojamentoClicadoEvent extends EventObject{
   
    CenarioAlojamento cenarioAlojamento;
    public EditarCenarioAlojamentoClicadoEvent(Object source, CenarioAlojamento cenarioAlojamento){
        super(source);   
        this.cenarioAlojamento = cenarioAlojamento;
    }
    
    public CenarioAlojamento getCenarioAlojamento(){
        return cenarioAlojamento;
    }
}
