/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pt.ipleiria.tripPlanner.gui.Models;

import java.util.ArrayList;
import pt.ipleiria.tripPlanner.gui.Models.Quarto;

/**
 *
 * @author Ricardo
 */
public class CenarioAlojamento {
    private String designacao;
    private ArrayList<Etapa> etapas;
    private ArrayList<Alojamento> alojamentosReservados;


    public CenarioAlojamento(String designacao, ArrayList<Alojamento> alojamentos){
        this.designacao = designacao;
        this.alojamentosReservados = alojamentos;
        
    }

    public String getDesignacao() {
        return designacao;
    }

    public ArrayList getAlojamentos() {
        return alojamentosReservados;
    }

    public void setEtapas(ArrayList<Etapa> etapas) {
        this.etapas = etapas;
    }

}
