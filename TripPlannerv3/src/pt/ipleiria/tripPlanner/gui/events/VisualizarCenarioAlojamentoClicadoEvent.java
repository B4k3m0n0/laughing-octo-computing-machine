/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipleiria.tripPlanner.gui.events;

import java.util.EventObject;
import pt.ipleiria.tripPlanner.gui.Models.CenarioAlojamento;

/**
 *
 * @author Cristiano
 */
public class VisualizarCenarioAlojamentoClicadoEvent extends EventObject{
    
    public CenarioAlojamento cenarioAlojamento;
    public VisualizarCenarioAlojamentoClicadoEvent(Object source, CenarioAlojamento cenarioAlojamento){
        super(source);
        this.cenarioAlojamento = cenarioAlojamento;
    }
    
    public CenarioAlojamento getCenarioAlojamento(){
        return cenarioAlojamento;
    }
}
