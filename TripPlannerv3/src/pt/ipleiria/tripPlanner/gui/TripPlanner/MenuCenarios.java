/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipleiria.tripPlanner.gui.TripPlanner;

import java.util.ArrayList;
import java.util.List;
import pt.ipleiria.tripPlanner.gui.events.GestaoCenarioAlojamentoClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.GestaoCenarioAlojamentoClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.VoltarMenuPrincipalEvent;
import pt.ipleiria.tripPlanner.gui.events.VoltarMenuPrincipalListener;

/**
 *
 * @author Ricardo
 */
public class MenuCenarios extends javax.swing.JPanel {

    private List<GestaoCenarioAlojamentoClicadoListener> gestaoCenarioAlojamentoClicadoListener;
    private List<VoltarMenuPrincipalListener> voltarMenuPrincipalListener;

    /**
     * Creates new form MenuCenarios
     */
    public MenuCenarios() {
        initComponents();
        this.gestaoCenarioAlojamentoClicadoListener = new ArrayList<>();
        this.voltarMenuPrincipalListener = new ArrayList<>();
    }

    public synchronized void addGestaoCenarioAlojamentoClicadoListener(GestaoCenarioAlojamentoClicadoListener listener) {
        this.gestaoCenarioAlojamentoClicadoListener.add(listener);
    }

    public synchronized void removeGestaoCenarioAlojamentoClicadoListener(GestaoCenarioAlojamentoClicadoListener listener) {
        this.gestaoCenarioAlojamentoClicadoListener.remove(listener);
    }

    protected synchronized void fireGestaoCenarioAlojamentoClicadoEvent() {
        for (GestaoCenarioAlojamentoClicadoListener listener : this.gestaoCenarioAlojamentoClicadoListener) {
            //GestaoCenarioAlojamentoClicadoEvent evento = new GestaoCenarioAlojamentoClicadoEvent(this);
            //listener.gestaoCenarioAlojamentoClicado(evento);
        }
    }

    public synchronized void addVoltarMenuPrincipalListener(VoltarMenuPrincipalListener listener) {
        this.voltarMenuPrincipalListener.add(listener);
    }

    public synchronized void removeVoltarMenuPrincipalListener(VoltarMenuPrincipalListener listener) {
        this.voltarMenuPrincipalListener.remove(listener);
    }

    protected synchronized void fireVoltarMenuPrincipalEvent() {
        for (VoltarMenuPrincipalListener listener : this.voltarMenuPrincipalListener) {
            VoltarMenuPrincipalEvent evento = new VoltarMenuPrincipalEvent(this);
            listener.voltarMenuPrincipal(evento);
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

        btnCenarioAlojamento = new javax.swing.JButton();
        btnCenarioDeslocacao = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(640, 480));
        setMinimumSize(new java.awt.Dimension(640, 480));

        btnCenarioAlojamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/ipleiria/tripPlanner/gui/Imagens/cenarioAlojamento.png"))); // NOI18N
        btnCenarioAlojamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCenarioAlojamentoActionPerformed(evt);
            }
        });

        btnCenarioDeslocacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/ipleiria/tripPlanner/gui/Imagens/cenarioDeslocacao.png"))); // NOI18N

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/ipleiria/tripPlanner/gui/Imagens/back-trans.png"))); // NOI18N
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Cenários");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar)
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnCenarioAlojamento)
                        .addGap(88, 88, 88)
                        .addComponent(btnCenarioDeslocacao))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel1)))
                .addContainerGap(269, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCenarioAlojamento)
                    .addComponent(btnCenarioDeslocacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                .addComponent(btnVoltar)
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCenarioAlojamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCenarioAlojamentoActionPerformed
        this.fireGestaoCenarioAlojamentoClicadoEvent();
    }//GEN-LAST:event_btnCenarioAlojamentoActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.fireVoltarMenuPrincipalEvent();
    }//GEN-LAST:event_btnVoltarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCenarioAlojamento;
    private javax.swing.JButton btnCenarioDeslocacao;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
