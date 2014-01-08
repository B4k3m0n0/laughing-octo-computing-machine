/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipleiria.tripPlanner.gui.Models;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Cristiano
 */
public class DadosAplicacao {
    
    private static final DadosAplicacao instance = new DadosAplicacao();
    
    public static DadosAplicacao getInstance() {
        return instance;
    }
    private ArrayList<Participante> participantes;
    private ArrayList<Viagem> viagens;
    private ArrayList<Etapa> etapas;
    private ArrayList<Alojamento> alojamentos;
    private ArrayList<Localidade> localidades;
    private Participante logado;
    private ArrayList<Quarto> quartos;
    private ArrayList<CenarioAlojamento> cenariosDeAlojamento;
    private Participante systemAdmin;
    private ArrayList<Reserva> reservas;

    private DadosAplicacao() {
        participantes = new ArrayList<>();
        etapas = new ArrayList<>();
        alojamentos = new ArrayList<>();
        viagens = new ArrayList<>();
        quartos = new ArrayList<>();
        localidades = new ArrayList<>();
        cenariosDeAlojamento = new ArrayList<>();
        reservas = new ArrayList<>();
        
        criarDadosTeste();
    }
    
    private void criarDadosTeste() {
        
        Calendar dataNascJoao = Calendar.getInstance();
        
        dataNascJoao.setTime(new Date(92, 3, 12));
        
        ArrayList<String> permissoes;
        permissoes = new ArrayList<>();
        
        ArrayList<Localidade> localidade = new ArrayList<>();
        ArrayList<Quarto> quartos = new ArrayList<>();
        
        String pass = "1234";
        String pass1 = "a";
        
        Participante participante1;
        
        participante1 = new Participante("Rafael", dataNascJoao, 12175988, "Leiria", 5, false, "rafa", pass.toCharArray(), false);
        adicionarParticipante(participante1);
        systemAdmin = participante1;
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String dataNasc = formatter.format(dataNascJoao.getTime());

        
        Participante participante2;
        participante2 = new Participante("Andre", dataNascJoao, 14187566, "Leiria", 5, false, "14187566", dataNasc.toCharArray(), true);
        adicionarParticipante(participante2);
        
        Viagem viagem1;
        viagem1 = new Viagem(pass1, etapas, alojamentos, pass1);
        viagens.add(viagem1);
        
        addLocalidade(new Localidade("Leiria"));
        localidade.add(new Localidade("Leiria"));
        
        Etapa etapa1;
        etapa1 = new Etapa("Etapa2", new Localidade("Pombal City"), new Localidade("Leiria"), localidade, 30, 1, 1, 1);
        etapas.add(etapa1);
        
        addQuarto(new Quarto("quarto 1", "2", "Individual", "50", "quarto"));
        quartos.add(new Quarto("quarto 1", "2", "Individual", "50", "quarto"));
        Alojamento alojamento1;

        alojamento1 = new Alojamento("Alojamento 1", "3.1111423", "-1.312421", "Albergue", quartos, "11", "8h","21", "214598745", "Rua da brilhantina", "", new Localidade("Lisboa"));

        alojamentos.add(alojamento1);

        

        
        Reserva reserva1;
        reserva1 = new Reserva(etapa1, quartos, participantes, alojamento1);
        reservas.add(reserva1);
        
            

    }

    
    public Participante getSystemAdmin() {
        return systemAdmin;
    }
    

    public void atualizarEtapa(Etapa e) {
        int indice = 0;
        for (int i = 0; i < etapas.size(); i++) {
            if (etapas.get(i).getDesignacao().equals(e.getDesignacao())) {
                indice = i;
                break;
            }
        }
        etapas.set(indice, e);
    }
    
    public void addReserva(Reserva reserva){
        reservas.add(reserva);
    }


    public void addAlojamento(Alojamento alojamento) {
        alojamentos.add(alojamento);
    }
    
    public void removeAlojamento(Alojamento alojamento) {
        alojamentos.remove(alojamento);
    }
    
    public void addViagem(Viagem viagem) {
        viagens.add(viagem);
    }
    
    public void addEtapa(Etapa etapa) {
        etapas.add(etapa);
    }
    
    public void addLocalidade(Localidade localidade) {
        
        localidades.add(localidade);
    }
    
    public void addQuarto(Quarto quarto) {
        quartos.add(quarto);
    }
    
    public ArrayList<Quarto> getQuartos() {
        return quartos;
    }
    
    public ArrayList<Alojamento> getAlojamentos() {
        return alojamentos;
    }
    
    public ArrayList<Localidade> getLocalidades() {
        return localidades;
    }
    
    public ArrayList<Viagem> getViagens() {
        return (ArrayList<Viagem>) viagens.clone();
    }
    
    public ArrayList<Etapa> getEtapas() {
        return (ArrayList<Etapa>) etapas.clone();
    }
    
    public ArrayList<Reserva> getReservas() {
        return (ArrayList<Reserva>) reservas.clone();
    }

    public void adicionarParticipante(Participante p) {
        participantes.add(p);
    }
    
    public void atualizarParticipante(Participante p) {
        int indice = 0;
        for (int i = 0; i < participantes.size(); i++) {
            if (participantes.get(i).getBI() == p.getBI()) {
                indice = i;
                break;
            }
        }
        participantes.set(indice, p);
    }
    
    public ArrayList<Participante> getParticipantes() {
        return (ArrayList<Participante>) participantes.clone();
    }
    
    public void setLogado(Participante participante) {
        this.logado = participante;
    }
    
    public Participante getLogado() {
        return logado;
    }
    
    public Viagem getViagem(Viagem viagem) {
        for (Viagem v : viagens) {
            if (v.equals(viagem)) {
                return v;
            }
        }
        return null;
    }
    
    public ArrayList<CenarioAlojamento> getCenarioAlojamento() {
        return cenariosDeAlojamento;
    }
    
    public void adicionarCenarioAlojamento(CenarioAlojamento cenarioAlojamento) {
        cenariosDeAlojamento.add(cenarioAlojamento);
    }
    
    public void removerCenarioAlojamento(CenarioAlojamento cenarioAlojamentoSelected) {
        for (CenarioAlojamento cenarioAlojamento : cenariosDeAlojamento) {
            if (cenarioAlojamento == cenarioAlojamentoSelected) {
                cenariosDeAlojamento.remove(cenarioAlojamento);
            }
        }
    }
    
    public Etapa getEtapa(Etapa etapa) {
        for (Etapa e : etapas) {
            if (e.equals(etapa)) {
                return e;
            }
        }
        return null;
    }
    
    public void atualizarCenarioAlojamento(CenarioAlojamento cenarioAlojamento) {
        for (int i = 0; i < cenariosDeAlojamento.size(); i++) {
            if (cenariosDeAlojamento.get(i).getDesignacao().equals(cenarioAlojamento.getDesignacao())) {
                cenariosDeAlojamento.set(i, cenarioAlojamento);
                return;
            }
        }
    }
    
    public void removeParticipante(Participante p) {
        this.participantes.remove(p);
        
    }
}
