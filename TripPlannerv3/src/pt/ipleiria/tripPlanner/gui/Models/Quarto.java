/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pt.ipleiria.tripPlanner.gui.Models;

/**
 *
 * @author DELL
 */
public class Quarto {
    private String designacao;
    private String camas;
    private String tipoCama;
    private String custo;
    private String tipoCusto;

    public Quarto(String designacao,String camas, String tipoCama, String custo, String tipoCusto) {
        this.designacao = designacao;
        this.camas = camas;
        this.tipoCama = tipoCama;
        this.custo = custo;
        this.tipoCusto = tipoCusto;
    }

    public String getDesignacao() {
        return designacao;
    }

    public String getCamas() {
        return camas;
    }

    public String getTipoCama() {
        return tipoCama;
    }

    public String getCusto() {
        return custo;
    }

    public String getTipoCusto() {
        return tipoCusto;
    }        
}