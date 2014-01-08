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
public class Viagem {

    String designacao;
    ArrayList<Etapa> etapas;
    ArrayList<Alojamento> alojamentos;
    String tipoViagem;
    ArrayList<Participante> participantes;
    private Participante Autor;
    private ArrayList<Participante> editores;
    ArrayList<Reserva> reservas;
    ArrayList<CenarioAlojamento> cenariosDeAlojamento;


    public Viagem(String designacao, ArrayList<Etapa> etapas, ArrayList<Alojamento> alojamentos, String tipoViagem) {
        this.designacao = designacao;
        this.etapas = etapas;
        this.alojamentos = alojamentos;
        this.tipoViagem = tipoViagem;

        participantes = new ArrayList<>();
        Autor = DadosAplicacao.getInstance().getLogado();
        DadosAplicacao.getInstance().getLogado().setAutor(true);
        cenariosDeAlojamento = new ArrayList<>();

    }

    public Viagem(String designacao, ArrayList<Etapa> etapas, ArrayList<Alojamento> alojamentos, String tipoViagem, ArrayList<Participante> participantes) {
        this.designacao = designacao;
        this.etapas = etapas;
        this.alojamentos = alojamentos;
        this.tipoViagem = tipoViagem;
        this.participantes = participantes;
        cenariosDeAlojamento = new ArrayList<>();
    }

    public String getDesignacao() {
        return designacao;
    }

    public String getTipoViagem() {
        return tipoViagem;
    }

    public ArrayList<Etapa> getEtapas() {
        return etapas;
    }

    public ArrayList<Alojamento> getAlojamentos() {
        return alojamentos;
    }

    public void setParticipantes(ArrayList<Participante> participantes) {
        this.participantes = participantes;
    }

    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }


    public ArrayList<CenarioAlojamento> getCenariosDeAlojamento() {
        return cenariosDeAlojamento;
    }

    public void setEditores(ArrayList<Participante> editores) {
        this.editores = editores;
    }

    public Participante getAutor() {
        return Autor;
    }

    public ArrayList<Participante> getEditores() {
        return editores;
    }
    
    
}
