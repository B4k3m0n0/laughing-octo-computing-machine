/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipleiria.tripPlanner.gui.events;

import java.util.ArrayList;
import java.util.EventObject;
import pt.ipleiria.tripPlanner.gui.Models.Participante;

/**
 *
 * @author DELL
 */
public class ConfirmarAssociacaoViagensEvent extends EventObject {

    ArrayList<Participante> participantes;
    ArrayList<Participante> editores;

    public ConfirmarAssociacaoViagensEvent(Object source, ArrayList<Participante> participantes, ArrayList<Participante> editores) {
        super(source);

        this.participantes = participantes;
        this.editores = editores;

    }

    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }

    public ArrayList<Participante> getEditores() {
        return editores;
    }
    
    
}
