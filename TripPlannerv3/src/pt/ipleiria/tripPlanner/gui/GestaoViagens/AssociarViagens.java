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
    
    private ArrayList<Participante> participantesEditor;
    
    private DefaultTableModel modelTable;

    private ArrayList<Participante> associadosModelList;
    private DefaultListModel<Participante> modelA;

    /**
     * Creates new form ReservarAlojamento
     */
    public AssociarViagens() {
        initComponents();
        this.confirmarAssociacaoViagensListener = new ArrayList<>();

        participantesModelList = new ArrayList<>();
        modelP = new DefaultListModel<>();
        lstParticipantes.setCellRenderer(new CellRendererParticipante());

        associadosModelList = new ArrayList<>();
        modelA = new DefaultListModel<>();
        lstAssociados.setCellRenderer(new CellRendererParticipante());

        associadosModelList =  new ArrayList<>();
        
        modelTable =  (DefaultTableModel) jTable1.getModel();
        
        setModel();
        
        lblAviso.setVisible(false);
        
        jTable1.setFocusable(false);
        jTable1.setRowSelectionAllowed(false);
        
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
            ConfirmarAssociacaoViagensEvent evento = new ConfirmarAssociacaoViagensEvent(this, getLstAssociados());
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
        jPanel1 = new javax.swing.JPanel();
        btnEliminarAssociacaoVarios = new javax.swing.JButton();
        btnAssociarVarios = new javax.swing.JButton();
        spViagens = new javax.swing.JScrollPane();
        lstAssociados = new javax.swing.JList();
        spParticipantes = new javax.swing.JScrollPane();
        lstParticipantes = new javax.swing.JList();
        lblViagens = new javax.swing.JLabel();
        lblParticipantes = new javax.swing.JLabel();
        btnAssociarUm = new javax.swing.JButton();
        btnEliminarAssociacaoUm = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblAviso = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnEliminarAssociacaoVarios.setText("<<");
        btnEliminarAssociacaoVarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAssociacaoVariosActionPerformed(evt);
            }
        });

        btnAssociarVarios.setText(">>");
        btnAssociarVarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssociarVariosActionPerformed(evt);
            }
        });

        lstAssociados.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        spViagens.setViewportView(lstAssociados);

        lstParticipantes.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        spParticipantes.setViewportView(lstParticipantes);

        lblViagens.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblViagens.setText("Associados:");

        lblParticipantes.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblParticipantes.setText("Participantes:");

        btnAssociarUm.setText(">");
        btnAssociarUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssociarUmActionPerformed(evt);
            }
        });

        btnEliminarAssociacaoUm.setText("<");
        btnEliminarAssociacaoUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAssociacaoUmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(spParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnAssociarVarios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminarAssociacaoVarios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAssociarUm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminarAssociacaoUm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblParticipantes)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblViagens)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(spViagens, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(btnAssociarUm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAssociarVarios)
                                .addGap(27, 27, 27)
                                .addComponent(btnEliminarAssociacaoUm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminarAssociacaoVarios))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblParticipantes)
                                    .addComponent(lblViagens))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(spViagens)))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel1.setText("Associar Participante a Viagem");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblAviso.setText("jLabel2");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Participante", "Associado?", "Editor?"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblAviso)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblAviso)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1)
                        .addGap(82, 82, 82))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOk)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnOk))
                .addGap(42, 42, 42))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        //GestaodeViagens.getInstance().getSelectedViagem();  
        this.fireConfirmarAssociacaoViagensEvent();
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnAssociarUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssociarUmActionPerformed
        if (lstParticipantes.getSelectedValuesList().size() != 1) {
            lblAviso.setText("Tem que selecionar um participante");
            lblAviso.setForeground(Color.red);
            lblAviso.setVisible(true);
        } else {
            lblAviso.setVisible(false);
            Participante p = (Participante) lstParticipantes.getSelectedValue();
            modelA.addElement(p);
            modelP.removeElement(p);
            lstParticipantes.setModel(modelP);
            lstAssociados.setModel(modelA);
        }
    }//GEN-LAST:event_btnAssociarUmActionPerformed

    private void btnAssociarVariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssociarVariosActionPerformed
        //if (lstParticipantes.getSelectedValuesList().isEmpty()) {
        //    lblAvisoP.setText("Não tem nenhum participante selecionado");
        //} else {
            ArrayList<Participante> part = new ArrayList<>();
            for (int i=0; i<lstParticipantes.getModel().getSize(); i++){
                Participante p = modelP.get(i);
                modelA.addElement(p);
                part.add(p);
            }
            
            for (Participante p : part) {
                modelP.removeElement(p);
            }
            /*
            for (int index : lstParticipantes.getSelectedIndices()) {
                Participante p = modelP.get(index);
                modelA.addElement(p);
                part.add(p);
            }

            for (Participante p : part) {
                modelP.removeElement(p);
            }
*/
            lstAssociados.setModel(modelA);
            lstParticipantes.setModel(modelP);
        //}
    }//GEN-LAST:event_btnAssociarVariosActionPerformed

    private void btnEliminarAssociacaoUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAssociacaoUmActionPerformed
        if (lstAssociados.getSelectedValuesList().size() != 1) {
            lblAviso.setText("Tem que selecionar um participante");
            lblAviso.setForeground(Color.red);
            lblAviso.setVisible(true);
        } else {
            lblAviso.setVisible(false);
            Participante p = (Participante) lstAssociados.getSelectedValue();
            modelA.removeElement(p);
            modelP.addElement(p);
            lstParticipantes.setModel(modelP);
            lstAssociados.setModel(modelA);
        }
    }//GEN-LAST:event_btnEliminarAssociacaoUmActionPerformed

    private void btnEliminarAssociacaoVariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAssociacaoVariosActionPerformed
        //if (lstAssociados.getSelectedValuesList().isEmpty()) {
        //    lblAvisoP.setText("Não tem nenhum participante selecionado");
        //} else {
//            associadosModelList = (ArrayList<Participante>) lstAssociados.getSelectedValuesList();
//            for (Participante p : associadosModelList) {
//                modelA.removeElement(p);
//                modelP.addElement(p);
//            }
            ArrayList<Participante> part = new ArrayList<>();
            for (int i=0; i<lstAssociados.getModel().getSize(); i++){
                Participante p = modelA.get(i);
                modelP.addElement(p);
                part.add(p);
            }
            
            for (Participante p : part) {
                modelA.removeElement(p);
            }
            /*
            for (int index : lstAssociados.getSelectedIndices()) {
                Participante p = modelA.get(index);
                modelP.addElement(p);
                part.add(p);
            }

            for (Participante p : part) {
                modelA.removeElement(p);
            }
            */
            lstAssociados.setModel(modelA);
            lstParticipantes.setModel(modelP);
        //}
    }//GEN-LAST:event_btnEliminarAssociacaoVariosActionPerformed

    private void setModel() {
        participantesModelList = DadosAplicacao.getInstance().getParticipantes();
        modelP = new DefaultListModel<>();
        for (Participante p : participantesModelList) {
            modelP.addElement(p);
        }
        lstParticipantes.setModel(modelP);

        modelA = new DefaultListModel<>();
        lstAssociados.setModel(modelA);
        
        for (Participante p : participantesModelList){
            modelTable.addRow(new Object[]{p.getNome(),false,false});
        }
    }

    public ArrayList<Participante> getLstAssociados() {
        ArrayList<Participante> p = new ArrayList<>();
/*
        for (int i = 0; i < lstAssociados.getModel().getSize(); i++) {
            p.add((Participante) lstAssociados.getModel().getElementAt(i));
        }
*/        
        for (int i = 0; i < modelTable.getRowCount(); i++){
            if (modelTable.getValueAt(1, i).equals(true)){
                p.add((Participante) modelTable.getValueAt(0, i));
            }
        }
        return p;
    }
    
    public void setListaEditor(){
        ArrayList<Participante> p = new ArrayList<>();
        for (int i = 0; i < modelTable.getRowCount(); i++){
            if (modelTable.getValueAt(2, i).equals(true)){
                p.add((Participante) modelTable.getValueAt(0, i));
            }
        }
        participantesEditor = p;
    }

    public void setDados(Viagem viagem){
        DadosAplicacao.getInstance().getViagem(viagem).setParticipantes(getLstAssociados());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssociarUm;
    private javax.swing.JButton btnAssociarVarios;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminarAssociacaoUm;
    private javax.swing.JButton btnEliminarAssociacaoVarios;
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAviso;
    private javax.swing.JLabel lblParticipantes;
    private javax.swing.JLabel lblViagens;
    private javax.swing.JList lstAssociados;
    private javax.swing.JList lstParticipantes;
    private javax.swing.JScrollPane spParticipantes;
    private javax.swing.JScrollPane spViagens;
    // End of variables declaration//GEN-END:variables

}
