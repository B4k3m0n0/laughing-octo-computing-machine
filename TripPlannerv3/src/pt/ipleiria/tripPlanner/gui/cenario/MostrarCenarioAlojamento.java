/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pt.ipleiria.tripPlanner.gui.cenario;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ListCellRenderer;
import pt.ipleiria.tripPlanner.gui.Models.CenarioAlojamento;
import pt.ipleiria.tripPlanner.gui.Utils.CellRendererCenarioAlojamento;
import pt.ipleiria.tripPlanner.gui.events.ConfirmarClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.ConfirmarClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.OkInserirCenarioAlojamentoClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.OkInserirCenarioAlojamentoClicadoListener;

/**
 *
 * @author DELL
 */
public class MostrarCenarioAlojamento extends javax.swing.JPanel {

    private List<OkInserirCenarioAlojamentoClicadoListener> okInserirCenarioAlojamentoClicadoListener;
    /**
     * Creates new form PesquisarCenarioAlojamento
     */
    public MostrarCenarioAlojamento() {
        initComponents();
        
        this.okInserirCenarioAlojamentoClicadoListener = new ArrayList<>();
    }
    
    
        public synchronized void addOkInserirCenarioAlojamentoClicadoListener(OkInserirCenarioAlojamentoClicadoListener listener) {
        this.okInserirCenarioAlojamentoClicadoListener.add(listener);
    }

    public synchronized void removeOkInserirCenarioAlojamentoClicadoListener(OkInserirCenarioAlojamentoClicadoListener listener) {
        this.okInserirCenarioAlojamentoClicadoListener.remove(listener);
    }

    protected synchronized void fireOkInserirCenarioAlojamentoClicadoEvent() {
        for (OkInserirCenarioAlojamentoClicadoListener listener : this.okInserirCenarioAlojamentoClicadoListener) {
            OkInserirCenarioAlojamentoClicadoEvent evento = new OkInserirCenarioAlojamentoClicadoEvent(this);
            listener.okInserirCenarioAlojamentoClicado(evento);
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

        lblCenarioAlojamento = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        lblCenarioAlojamento.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblCenarioAlojamento.setText("Lista de Alojamentos no cenario de alojamento XPTO:");

        btnOk.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnOk.setText("Ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel1.setText("Mostrar Cenario de Alojamento");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCenarioAlojamento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(btnOk)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(lblCenarioAlojamento)
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOk)
                .addContainerGap(37, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
         this.fireOkInserirCenarioAlojamentoClicadoEvent();
    }//GEN-LAST:event_btnOkActionPerformed

    public void preencherCampos(CenarioAlojamento cenarioAlojamento){
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCenarioAlojamento;
    // End of variables declaration//GEN-END:variables
}
