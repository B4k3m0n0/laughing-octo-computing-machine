/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipleiria.tripPlanner.gui.events;

import java.util.ArrayList;
import java.util.EventObject;
import pt.ipleiria.tripPlanner.gui.Models.CenarioAlojamento;

/**
 *
 * @author Cristiano
 */
public class CompararCenarioAlojamentoClicadoEvent extends EventObject{
    
    ArrayList<CenarioAlojamento> cenariosAlojamento;
    public CompararCenarioAlojamentoClicadoEvent(Object source, ArrayList<CenarioAlojamento> cenariosSelected){
        super(source);
        cenariosAlojamento = cenariosSelected;
    }
    
    public ArrayList<CenarioAlojamento> getCenariosSelected(){
        return cenariosAlojamento;
    }
    
}
