/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pt.ipleiria.tripPlanner.gui.Models;

import java.util.ArrayList;

/**
 *
 * @author Ricardo
 */
public class Etapa {
    private String designacao;
    private Localidade localInicio;
    private Localidade localidadeFinal;
    private ArrayList<Localidade> listaLocalidades;
    private int distanciaTotal;
    private int altitudeAcumulada;
    private int altitudeMaxima;
    private int altitudeMinima;
    private ArrayList<Participante> participantes; 

    public Etapa(String designacao,Localidade localInicio, Localidade localidadeFinal, ArrayList<Localidade> listaLocalidades, int distanciaTotal, int altitudeAcumulada, int altitudeMaxima, int altitudeMinima) {
        this.designacao = designacao;
        this.localInicio = localInicio;
        this.localidadeFinal = localidadeFinal;
        this.listaLocalidades = listaLocalidades;
        this.distanciaTotal = distanciaTotal;
        this.altitudeAcumulada = altitudeAcumulada;
        this.altitudeMaxima = altitudeMaxima;
        this.altitudeMinima = altitudeMinima;
        participantes = new ArrayList<>();
    }

    public String getDesignacao() {
        return designacao;
    }

    public Localidade getLocalInicio() {
        return localInicio;
    }

    public Localidade getLocalidadeFinal() {
        return localidadeFinal;
    }

    public ArrayList<Localidade> getListaLocalidades() {
        return listaLocalidades;
    }

    public int getDistanciaTotal() {
        return distanciaTotal;
    }

    public int getAltitudeAcumulada() {
        return altitudeAcumulada;
    }

    public int getAltitudeMaxima() {
        return altitudeMaxima;
    }

    public int getAltitudeMinima() {
        return altitudeMinima;
    }

    public void setParticipantes(ArrayList<Participante> participantes) {
        this.participantes = participantes;
    }

    @Override
    public String toString() {
        return designacao;
    }

   
    
    
}
