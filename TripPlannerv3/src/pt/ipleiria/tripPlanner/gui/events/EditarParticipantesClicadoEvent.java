/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipleiria.tripPlanner.gui.events;

import java.util.EventObject;
import pt.ipleiria.tripPlanner.gui.Models.Participante;

/**
 *
 * @author Cristiano
 */
public class EditarParticipantesClicadoEvent extends EventObject{
    
    String string = "Editar Participante";
    Participante participante;
    public EditarParticipantesClicadoEvent(Object source, Participante participante){
        super(source);
        this.participante = participante;
    }
    
    public String getString(){
        return string;
    }
    
    public Participante getParticipante(){
        return participante;
    }
    
}
