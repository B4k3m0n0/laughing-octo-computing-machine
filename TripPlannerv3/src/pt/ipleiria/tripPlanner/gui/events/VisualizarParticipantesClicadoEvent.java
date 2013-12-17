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
public class VisualizarParticipantesClicadoEvent extends EventObject{
    
    Participante participante;
    public VisualizarParticipantesClicadoEvent(Object source, Participante participante){
        super(source);
        this.participante = participante;
    }
    
    public Participante getParticipante(){
        return participante;
    }
}
