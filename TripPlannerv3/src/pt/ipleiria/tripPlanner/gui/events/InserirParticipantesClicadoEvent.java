/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipleiria.tripPlanner.gui.events;

import java.util.EventObject;

/**
 *
 * @author Cristiano
 */
public class InserirParticipantesClicadoEvent extends EventObject{
    
    String string = "Inserir Participante";
    public InserirParticipantesClicadoEvent(Object source){
        super(source);
        
    }
    
    public String getString(){
        return string;
    }
    
}
