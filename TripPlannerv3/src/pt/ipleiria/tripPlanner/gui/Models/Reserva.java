/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pt.ipleiria.tripPlanner.gui.Models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
class Reserva {
    private Etapa etapa;
    private ArrayList<Quarto> quartos;
    private ArrayList<Participante> participantes;
    private Alojamento alojamento;

    public Reserva(Etapa etapa, ArrayList<Quarto> quartos, ArrayList<Participante> participantes, Alojamento alojamento) {
        this.etapa = etapa;
        this.quartos = quartos;
        this.participantes = participantes;
        this.alojamento = alojamento;
    }

    public Etapa getEtapa() {
        return etapa;
    }

    public ArrayList<Quarto> getQuartos() {
        return quartos;
    }

    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }

    public Alojamento getAlojamento() {
        return alojamento;
    }
 
}
