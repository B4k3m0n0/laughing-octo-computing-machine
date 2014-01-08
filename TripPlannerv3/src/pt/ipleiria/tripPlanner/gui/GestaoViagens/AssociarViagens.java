/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipleiria.tripPlanner.gui.GestaoViagens;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import pt.ipleiria.tripPlanner.gui.Models.DadosAplicacao;
import pt.ipleiria.tripPlanner.gui.Models.Participante;
import pt.ipleiria.tripPlanner.gui.Models.Viagem;
import pt.ipleiria.tripPlanner.gui.Utils.CellRendererParticipante;
import pt.ipleiria.tripPlanner.gui.events.ConfirmarAssociacaoViagensEvent;
import pt.ipleiria.tripPlanner.gui.events.ConfirmarAssociacaoViagensListener;

/**
 *
 * @author DELL
 */
public class AssociarViagens extends javax.swing.JPanel {

    private List<ConfirmarAssociacaoViagensListener> confirmarAssociacaoViagensListener;

    private ArrayList<Participante> participantesModelList;
    private DefaultListModel<Participante> modelP;

    private DefaultTableModel modelTable;

    private ArrayList<Participante> associadosModelList;
    private DefaultListModel<Participante> modelA;
    
    private ArrayList<Participante> associados;
    private ArrayList<Participante> editores;
    private Viagem viagem;

    /**
     * Creates new form ReservarAlojamento
     */
    public AssociarViagens() {
        initComponents();
        this.confirmarAssociacaoViagensListener = new ArrayList<>();

        participantesModelList = new ArrayList<>();
        modelP = new DefaultListModel<>();

        associadosModelList = new ArrayList<>();
        modelA = new DefaultListModel<>();

        modelTable = (DefaultTableModel) jTable1.getModel();

        setModel();

        lblAviso.setVisible(false);

        jTable1.setFocusable(false);
        jTable1.setRowSelectionAllowed(false);
        
        associados = new ArrayList<>();
        editores = new ArrayList<>();

    }

    /*
    
     private ArrayList<Etapa> etapasModelListS;
     private DefaultListModel<Etapa> modelES;
    
     adicionar
    
     etapasModelListS = (ArrayList<Etapa>) lstEtapasP.getSelectedValuesList();
     modelES.clear();
     for (Etapa e : etapasModelListS) {
     modelES.addElement(e);
     }
     lstEtapas.setModel(modelES);

     pEtapas.setVisible(false);
    
     remover
    
     DefaultListModel m = (DefaultListModel) lstEtapas.getModel();
     int i = lstEtapas.getSelectedIndex();
     if ((i + 1) != -1) {
     m.remove(i);
     }
    
     */
    public synchronized void addConfirmarAssociacaoViagensListener(ConfirmarAssociacaoViagensListener listener) {
        this.confirmarAssociacaoViagensListener.add(listener);
    }

    public synchronized void removeConfirmarAssociacaoViagensListener(ConfirmarAssociacaoViagensListener listener) {
        this.confirmarAssociacaoViagensListener.remove(listener);
    }

    protected synchronized void fireConfirmarAssociacaoViagensEvent() {
        for (ConfirmarAssociacaoViagensListener listener : this.confirmarAssociacaoViagensListener) {
            ConfirmarAssociacaoViagensEvent evento = new ConfirmarAssociacaoViagensEvent(this, associados, editores);
            listener.confirmarAssociacaoViagens(evento);
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

        btnOk = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblAviso = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(640, 480));
        setMinimumSize(new java.awt.Dimension(640, 480));

        btnOk.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnOk.setText("Ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel1.setText("Associar Participante a Viagem");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Participante", "BI", "Associar?", "Editor?"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        lblAviso.setText("jLabel2");

        jLabel2.setText("Viagem:");

        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(154, 154, 154))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnOk)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAviso)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)))))
                        .addGap(82, 82, 82))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAviso)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnOk))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        associados = getLstAssociados();
        editores = getLstEditor();
        ArrayList<Participante> participantes = new ArrayList<>();
        participantes.addAll(associados);
        
        
        ArrayList<Participante> aux = new ArrayList<>(editores);
        aux.removeAll(editores);
        participantes.addAll(aux);
        DadosAplicacao.getInstance().getViagem(viagem).setParticipantes(participantes);
        this.fireConfirmarAssociacaoViagensEvent();
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void setModel() {
        participantesModelList = DadosAplicacao.getInstance().getParticipantes();

        for (Participante p : participantesModelList) {
            modelTable.addRow(new Object[]{p.getNome(), p.getBI(), false, false});
        }
    }

    public ArrayList<Participante> getLstAssociados() {
        ArrayList<Participante> p = new ArrayList<>();
        for (int i = 0; i < modelTable.getRowCount(); i++) {
            if (modelTable.getValueAt(i, 2).equals(true)) {
                for (Participante pt : DadosAplicacao.getInstance().getParticipantes()) {
                    if (pt.getBI() == (int) modelTable.getValueAt(i, 1)) {
                        p.add(pt);
                    }
                }
            }
        }
        return p;
    }

    public ArrayList<Participante> getLstEditor() {
        ArrayList<Participante> p = new ArrayList<>();
        for (int i = 0; i < modelTable.getRowCount(); i++) {
            if (modelTable.getValueAt(i, 3).equals(true)) {
                for (Participante pt : DadosAplicacao.getInstance().getParticipantes()) {
                    if (pt.getBI() == (int) modelTable.getValueAt(i, 1)) {
                        p.add(pt);
                    }
                }
            }
        }
        return p;
    }

    public void setDados(Viagem viagem) {
//        DadosAplicacao.getInstance().getViagem(viagem).setParticipantes(getLstAssociados());
//        DadosAplicacao.getInstance().getViagem(viagem).setParticipantesAutor(getLstEditor());
        this.viagem = viagem;
        DadosAplicacao.getInstance().getViagem(viagem).setParticipantes(associados);
        DadosAplicacao.getInstance().getViagem(viagem).setEditores(editores);
        
       /* for (Participante a : associados){
            System.out.println(a.getBI());
        }*/
    }
    
    public void setLabel(Viagem viagem) {
        jLabel3.setText(viagem.getDesignacao());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAviso;
    // End of variables declaration//GEN-END:variables

}
