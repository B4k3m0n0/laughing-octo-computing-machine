/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipleiria.tripPlanner.gui.Models;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Cristiano
 */
public class Participante {

    private String nome;
    private Calendar dataNasc;
    private int BI;
    private String localidade;
    private int ICF;
    private boolean autor;
    private String username;
    private char[] password;
    private boolean primeiroLogin;

    public Participante(String nome, Calendar dataNasc, int BI, String localidade, int ICF, boolean administrador, String username, char[] password, boolean primeiroLogin) {

        this.nome = nome;
        this.dataNasc = dataNasc;
        this.BI = BI;
        this.localidade = localidade;
        this.ICF = ICF;
        this.autor = administrador;
        this.username = username;
        this.password = password;
        this.primeiroLogin = primeiroLogin;
        
    }

    public void setPrimeiroLogin(boolean primeiroLogin) {
        this.primeiroLogin = primeiroLogin;
    }

    public boolean isPrimeiroLogin() {
        return primeiroLogin;
    }

    public String getNome() {
        return nome;
    }

    public Calendar getDataNasc() {
        return dataNasc;
    }

    public int getBI() {
        return BI;
    }

    public String getLocalidade() {
        return localidade;
    }

    public int getICF() {
        return ICF;
    }

    public String getUsername() {
        return username;
    }

    public char[] getPassword() {
        return password;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNasc(Calendar dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void setBI(int BI) {
        this.BI = BI;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public void setICF(int ICF) {
        this.ICF = ICF;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public boolean isAutor() {
        return autor;
    }

    public void setAutor(boolean autor) {
        this.autor = autor;
    }
    
    
}
