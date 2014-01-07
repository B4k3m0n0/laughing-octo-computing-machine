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
public class Alojamento {
    private String designacao;
    private String longitude;
    private String latitude;
    private String tipo;
    private ArrayList<Quarto> listaQuartos;
    private String horarioFunc;
    private String checkin;
    private String contactos;
    private String morada;
    private String observacoes;
    private String checkout;
    private String localidade;

    public Alojamento(String designacao, String longitude, String latitude, String tipo, ArrayList<Quarto> listaQuartos, String horarioFunc, String checkin,String checkout, String contactos, String morada, String observacoes, String localidade) {
        this.designacao = designacao;
        this.longitude = longitude;
        this.latitude = latitude;
        this.tipo = tipo;
        this.listaQuartos = listaQuartos;
        this.horarioFunc = horarioFunc;
        this.checkin = checkin;
        this.checkout = checkout;
        this.contactos = contactos;
        this.morada = morada;
        this.observacoes = observacoes;
        this.localidade = localidade;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getCheckout() {
        return checkout;
    }
    

    public String getDesignacao() {
        return designacao;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getTipo() {
        return tipo;
    }

    public ArrayList<Quarto> getListaQuartos() {
        return listaQuartos;
    }

    public String getHorarioFunc() {
        return horarioFunc;
    }

    public String getCheckin() {
        return checkin;
    }

    public String getContactos() {
        return contactos;
    }

    public String getMorada() {
        return morada;
    }

    public String getObservacoes() {
        return observacoes;
    }
    


    
    
}
