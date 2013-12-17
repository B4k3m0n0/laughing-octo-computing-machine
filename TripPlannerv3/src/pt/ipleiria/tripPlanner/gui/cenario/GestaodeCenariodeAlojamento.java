package pt.ipleiria.tripPlanner.gui.cenario;

import java.util.ArrayList;
import java.util.List;
import pt.ipleiria.tripPlanner.gui.events.CompararCenarioAlojamentoClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.CompararCenarioAlojamentoClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.EditarCenarioAlojamentoClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.EditarCenarioAlojamentoClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.InserirCenarioAlojamentoClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.InserirCenarioAlojamentoClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.VisualizarCenarioAlojamentoClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.VisualizarCenarioAlojamentoClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.VoltarGestaoCenarioAlojamentoClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.VoltarGestaoCenarioAlojamentoClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.VoltarMenuCenariosClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.VoltarMenuCenariosClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.VoltarMenuPrincipalEvent;
import pt.ipleiria.tripPlanner.gui.events.VoltarMenuPrincipalListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class GestaodeCenariodeAlojamento extends javax.swing.JPanel {

    private List<VisualizarCenarioAlojamentoClicadoListener> visualizarCenarioAlojamentoClicadoListener;
    private List<CompararCenarioAlojamentoClicadoListener> compararCenarioAlojamentoClicadoListener;
    private List<VoltarMenuCenariosClicadoListener> voltarMenuCenariosClicadoListener;
    private List<InserirCenarioAlojamentoClicadoListener> inserirCenarioAlojamentoClicadoListener;
    private List<EditarCenarioAlojamentoClicadoListener> editarCenarioAlojamentoClicadoListener;
    private List<VoltarGestaoCenarioAlojamentoClicadoListener> voltarGestaoCenarioAlojamentoClicadoListener;

    /**
     * Creates new form GestãodeCenáriodeAlojamento
     */
    public GestaodeCenariodeAlojamento() {
        initComponents();
        
        this.visualizarCenarioAlojamentoClicadoListener = new ArrayList<>();
        this.compararCenarioAlojamentoClicadoListener = new ArrayList<>();
        this.voltarMenuCenariosClicadoListener = new ArrayList<>();
        this.inserirCenarioAlojamentoClicadoListener = new ArrayList<>();
        this.editarCenarioAlojamentoClicadoListener = new ArrayList<>();
        this.voltarGestaoCenarioAlojamentoClicadoListener = new ArrayList<>();
    }
    
    public synchronized void addVisualizarCenarioAlojamentoClicadoListener(VisualizarCenarioAlojamentoClicadoListener listener){
        this.visualizarCenarioAlojamentoClicadoListener.add(listener);
    }
    
    public synchronized void removeVisualizarCenarioAlojamentoClicadoListener(VisualizarCenarioAlojamentoClicadoListener listener){
        this.visualizarCenarioAlojamentoClicadoListener.remove(listener);
    }

    protected synchronized void fireVisualizarCenarioAlojamentoClicadoEvent(){
        for(VisualizarCenarioAlojamentoClicadoListener listener : this.visualizarCenarioAlojamentoClicadoListener){
        VisualizarCenarioAlojamentoClicadoEvent evento = new VisualizarCenarioAlojamentoClicadoEvent(this);
        listener.visualizarCenarioAlojamentoClicado(evento);
        }
    }
    
    public synchronized void addCompararCenarioAlojamentoClicadoListener(CompararCenarioAlojamentoClicadoListener listener){
        this.compararCenarioAlojamentoClicadoListener.add(listener);
    }
    
    public synchronized void removeCompararCenarioAlojamentoClicadoListener(CompararCenarioAlojamentoClicadoListener listener){
        this.compararCenarioAlojamentoClicadoListener.remove(listener);
    }

    protected synchronized void fireCompararCenarioAlojamentoClicadoEvent(){
        for(CompararCenarioAlojamentoClicadoListener listener : this.compararCenarioAlojamentoClicadoListener){
        CompararCenarioAlojamentoClicadoEvent evento = new CompararCenarioAlojamentoClicadoEvent(this);
        listener.compararCenarioAlojamentoClicado(evento);
        }
    }
    
    public synchronized void addInserirCenarioAlojamentoClicadoListener(InserirCenarioAlojamentoClicadoListener listener) {
        this.inserirCenarioAlojamentoClicadoListener.add(listener);
    }

    public synchronized void removeInserirCenarioAlojamentoClicadoListener(InserirCenarioAlojamentoClicadoListener listener) {
        this.inserirCenarioAlojamentoClicadoListener.remove(listener);
    }

    protected synchronized void fireInserirCenarioAlojamentoClicadoEvent() {
        for (InserirCenarioAlojamentoClicadoListener listener : this.inserirCenarioAlojamentoClicadoListener) {
            InserirCenarioAlojamentoClicadoEvent evento = new InserirCenarioAlojamentoClicadoEvent(this);
            listener.inserirCenarioAlojamentoClicado(evento);
        }
    }

    public synchronized void addEditarCenarioAlojamentoClicadoListener(EditarCenarioAlojamentoClicadoListener listener) {
        this.editarCenarioAlojamentoClicadoListener.add(listener);
    }

    public synchronized void removeEditarCenarioAlojamentoClicadoListener(EditarCenarioAlojamentoClicadoListener listener) {
        this.editarCenarioAlojamentoClicadoListener.remove(listener);
    }

    protected synchronized void fireEditarCenarioAlojamentoClicadoEvent() {
        for (EditarCenarioAlojamentoClicadoListener listener : this.editarCenarioAlojamentoClicadoListener) {
            EditarCenarioAlojamentoClicadoEvent evento = new EditarCenarioAlojamentoClicadoEvent(this);
            listener.editarCenarioAlojamentoClicado(evento);
        }
    }
    
    public synchronized void addVoltarMenuCenariosClicadoListener(VoltarMenuCenariosClicadoListener listener) {
        this.voltarMenuCenariosClicadoListener.add(listener);
    }

    public synchronized void removeVoltarMenuCenariosClicadoListener(VoltarMenuCenariosClicadoListener listener) {
        this.voltarMenuCenariosClicadoListener.remove(listener);
    }

    protected synchronized void fireVoltarMenuCenariosClicadoEvent() {
        for (VoltarMenuCenariosClicadoListener listener : this.voltarMenuCenariosClicadoListener) {
            VoltarMenuCenariosClicadoEvent evento = new VoltarMenuCenariosClicadoEvent(this);
            listener.voltarMenuCenariosAlojamentoClicado(evento);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jbCriar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbPesquisar = new javax.swing.JButton();
        jbComparar = new javax.swing.JButton();
        jbVoltar = new javax.swing.JButton();
        tfPesquisar = new javax.swing.JTextField();
        lblLocalidades = new javax.swing.JLabel();
        lblParticipantes = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jbCriar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/ipleiria/tripPlanner/gui/Imagens/Inserir1.png"))); // NOI18N
        jbCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCriarActionPerformed(evt);
            }
        });

        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/ipleiria/tripPlanner/gui/Imagens/eliminar1.png"))); // NOI18N

        jbEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/ipleiria/tripPlanner/gui/Imagens/editar.png"))); // NOI18N
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/ipleiria/tripPlanner/gui/Imagens/lupa.png"))); // NOI18N
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        jbComparar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/ipleiria/tripPlanner/gui/Imagens/synchronize_256.png"))); // NOI18N
        jbComparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCompararActionPerformed(evt);
            }
        });

        jbVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/ipleiria/tripPlanner/gui/Imagens/back-trans.png"))); // NOI18N
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
            }
        });

        tfPesquisar.setText("Pesquisar");
        tfPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPesquisarActionPerformed(evt);
            }
        });

        lblLocalidades.setText("Cenário Alojamento");

        lblParticipantes.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblParticipantes.setText("Cenário Alojamento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbCriar)
                        .addGap(35, 35, 35)
                        .addComponent(jbEliminar)
                        .addGap(37, 37, 37)
                        .addComponent(jbEditar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLocalidades)
                    .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbComparar, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbVoltar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jbPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(lblParticipantes)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblParticipantes)
                        .addGap(18, 18, 18)
                        .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLocalidades)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jbPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbComparar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCriar)
                    .addComponent(jbEliminar)
                    .addComponent(jbEditar)
                    .addComponent(jbVoltar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
        this.fireVisualizarCenarioAlojamentoClicadoEvent();
    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void jbCompararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCompararActionPerformed
        this.fireCompararCenarioAlojamentoClicadoEvent();
    }//GEN-LAST:event_jbCompararActionPerformed

    private void jbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarActionPerformed
        this.fireVoltarMenuCenariosClicadoEvent();
    }//GEN-LAST:event_jbVoltarActionPerformed

    private void jbCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCriarActionPerformed
        this.fireInserirCenarioAlojamentoClicadoEvent();
    }//GEN-LAST:event_jbCriarActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        this.fireEditarCenarioAlojamentoClicadoEvent();
    }//GEN-LAST:event_jbEditarActionPerformed

    private void tfPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPesquisarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbComparar;
    private javax.swing.JButton jbCriar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbVoltar;
    private javax.swing.JLabel lblLocalidades;
    private javax.swing.JLabel lblParticipantes;
    private javax.swing.JTextField tfPesquisar;
    // End of variables declaration//GEN-END:variables
}
