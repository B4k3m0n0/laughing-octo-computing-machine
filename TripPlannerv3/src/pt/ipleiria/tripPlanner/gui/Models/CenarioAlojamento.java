/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipleiria.tripPlanner.gui.Models;

import java.util.ArrayList;
import java.util.HashMap;
import pt.ipleiria.tripPlanner.gui.Models.Quarto;

/**
 *
 * @author Ricardo
 */
public class CenarioAlojamento {

    private String designacao;
    private Viagem viagem;
    private HashMap<Etapa, Alojamento> mapaReservas;

    public CenarioAlojamento(String designacao, Viagem viagem, HashMap<Etapa, Alojamento> mapaReservas) {
        this.designacao = designacao;
        this.viagem = viagem;
        this.mapaReservas = mapaReservas;

    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public Viagem getViagem() {
        return viagem;
    }

    public void setViagem(Viagem viagem) {
        this.viagem = viagem;
    }

    public HashMap<Etapa, Alojamento> getMapaReservas() {
        return mapaReservas;
    }

    public void setMapaReservas(HashMap<Etapa, Alojamento> mapaReservas) {
        this.mapaReservas = mapaReservas;
    }
}
