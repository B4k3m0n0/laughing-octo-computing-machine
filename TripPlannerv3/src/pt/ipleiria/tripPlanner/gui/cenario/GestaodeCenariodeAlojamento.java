package pt.ipleiria.tripPlanner.gui.cenario;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListCellRenderer;
import pt.ipleiria.tripPlanner.gui.Models.CenarioAlojamento;
import pt.ipleiria.tripPlanner.gui.Models.DadosAplicacao;
import pt.ipleiria.tripPlanner.gui.Models.Viagem;
import pt.ipleiria.tripPlanner.gui.Utils.CellRendererCenarioAlojamento;
import pt.ipleiria.tripPlanner.gui.Utils.CenariosTableModel;
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
    private Viagem viagem;

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
        setModel();
        //jList1.setCellRenderer((ListCellRenderer) new CellRendererCenarioAlojamento());
    }

    public synchronized void addVisualizarCenarioAlojamentoClicadoListener(VisualizarCenarioAlojamentoClicadoListener listener) {
        this.visualizarCenarioAlojamentoClicadoListener.add(listener);
    }

    public synchronized void removeVisualizarCenarioAlojamentoClicadoListener(VisualizarCenarioAlojamentoClicadoListener listener) {
        this.visualizarCenarioAlojamentoClicadoListener.remove(listener);
    }

    protected synchronized void fireVisualizarCenarioAlojamentoClicadoEvent(CenarioAlojamento cenarioAlojamento) {
        for (VisualizarCenarioAlojamentoClicadoListener listener : this.visualizarCenarioAlojamentoClicadoListener) {
            VisualizarCenarioAlojamentoClicadoEvent evento = new VisualizarCenarioAlojamentoClicadoEvent(this, cenarioAlojamento);
            listener.visualizarCenarioAlojamentoClicado(evento);
        }
    }

    public synchronized void addCompararCenarioAlojamentoClicadoListener(CompararCenarioAlojamentoClicadoListener listener) {
        this.compararCenarioAlojamentoClicadoListener.add(listener);
    }

    public synchronized void removeCompararCenarioAlojamentoClicadoListener(CompararCenarioAlojamentoClicadoListener listener) {
        this.compararCenarioAlojamentoClicadoListener.remove(listener);
    }

    protected synchronized void fireCompararCenarioAlojamentoClicadoEvent(ArrayList<CenarioAlojamento> cenarioAlojamentosSelected) {
        for (CompararCenarioAlojamentoClicadoListener listener : this.compararCenarioAlojamentoClicadoListener) {
            CompararCenarioAlojamentoClicadoEvent evento = new CompararCenarioAlojamentoClicadoEvent(this, cenarioAlojamentosSelected);
            listener.compararCenarioAlojamentoClicado(evento);
        }
    }

    public synchronized void addInserirCenarioAlojamentoClicadoListener(InserirCenarioAlojamentoClicadoListener listener) {
        this.inserirCenarioAlojamentoClicadoListener.add(listener);
    }

    public synchronized void removeInserirCenarioAlojamentoClicadoListener(InserirCenarioAlojamentoClicadoListener listener) {
        this.inserirCenarioAlojamentoClicadoListener.remove(listener);
    }

    protected synchronized void fireInserirCenarioAlojamentoClicadoEvent(Viagem viagem) {
        for (InserirCenarioAlojamentoClicadoListener listener : this.inserirCenarioAlojamentoClicadoListener) {
            InserirCenarioAlojamentoClicadoEvent evento = new InserirCenarioAlojamentoClicadoEvent(this, viagem);
            listener.inserirCenarioAlojamentoClicado(evento);
        }
    }

    public synchronized void addEditarCenarioAlojamentoClicadoListener(EditarCenarioAlojamentoClicadoListener listener) {
        this.editarCenarioAlojamentoClicadoListener.add(listener);
    }

    public synchronized void removeEditarCenarioAlojamentoClicadoListener(EditarCenarioAlojamentoClicadoListener listener) {
        this.editarCenarioAlojamentoClicadoListener.remove(listener);
    }

    protected synchronized void fireEditarCenarioAlojamentoClicadoEvent(CenarioAlojamento cenarioAlojamento) {
        for (EditarCenarioAlojamentoClicadoListener listener : this.editarCenarioAlojamentoClicadoListener) {
            EditarCenarioAlojamentoClicadoEvent evento = new EditarCenarioAlojamentoClicadoEvent(this, cenarioAlojamento);
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

        jbCriar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbPesquisar = new javax.swing.JButton();
        jbComparar = new javax.swing.JButton();
        jbVoltar = new javax.swing.JButton();
        tfPesquisar = new javax.swing.JTextField();
        lblLista = new javax.swing.JLabel();
        lblParticipantes = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblErro = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableCenario = new javax.swing.JTable();
        AtivarCenarioViagem = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jbCriar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/ipleiria/tripPlanner/gui/Imagens/Inserir1.png"))); // NOI18N
        jbCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCriarActionPerformed(evt);
            }
        });

        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/ipleiria/tripPlanner/gui/Imagens/eliminar1.png"))); // NOI18N
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

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

        tfPesquisar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfPesquisar.setForeground(new java.awt.Color(153, 153, 153));
        tfPesquisar.setText("Pesquise...");
        tfPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPesquisarActionPerformed(evt);
            }
        });
        tfPesquisar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfPesquisarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfPesquisarFocusLost(evt);
            }
        });
        tfPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPesquisarKeyPressed(evt);
            }
        });

        lblLista.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblLista.setText("Lista de Cenários de Alojamento:");

        lblParticipantes.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        lblParticipantes.setText("Cenário de Alojamento");

        lblErro.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblErro.setForeground(new java.awt.Color(255, 0, 0));

        tableCenario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tableCenario.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tableCenario);

        AtivarCenarioViagem.setText("jButton1");
        AtivarCenarioViagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtivarCenarioViagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblParticipantes)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jbPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jbComparar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(AtivarCenarioViagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(lblErro, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLista))
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbCriar)
                        .addGap(18, 18, 18)
                        .addComponent(jbEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(jbEditar)
                        .addGap(18, 18, 18)
                        .addComponent(jbVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblParticipantes)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblLista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbComparar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AtivarCenarioViagem, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErro, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbEliminar)
                    .addComponent(jbEditar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCriar))
                .addContainerGap(390, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
        lblErro.setText("");

        if (tableCenario.getSelectedRowCount() != 1) {
            CenariosTableModel model = (CenariosTableModel) tableCenario.getModel();
            CenarioAlojamento cenario = model.getSelectedRow(tableCenario.getSelectedRow());
            this.fireVisualizarCenarioAlojamentoClicadoEvent(cenario);
        } else {
            lblErro.setText("Tem de selecionar um cenario!");
        }
    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void jbCompararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCompararActionPerformed
        lblErro.setText("");

        if (tableCenario.getSelectedRowCount() != 2) {
            CenariosTableModel model = (CenariosTableModel) tableCenario.getModel();
            ArrayList<CenarioAlojamento> cenariosComparaveis = (ArrayList<CenarioAlojamento>) model.getSelectedRows(tableCenario.getSelectedRows());
            this.fireCompararCenarioAlojamentoClicadoEvent(cenariosComparaveis);
        } else {
            lblErro.setText("Tem de selecionar um cenario!");
        }
    }//GEN-LAST:event_jbCompararActionPerformed

    private void jbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarActionPerformed
        this.fireVoltarMenuCenariosClicadoEvent();
    }//GEN-LAST:event_jbVoltarActionPerformed

    private void jbCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCriarActionPerformed
        lblErro.setText("");
        this.fireInserirCenarioAlojamentoClicadoEvent(viagem);
    }//GEN-LAST:event_jbCriarActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        lblErro.setText("");

        if (tableCenario.getSelectedRow() != -1) {

            CenariosTableModel model = (CenariosTableModel) tableCenario.getModel();

            CenarioAlojamento cenario = model.getSelectedRow(tableCenario.getSelectedRow());

            this.fireEditarCenarioAlojamentoClicadoEvent(cenario);
        } else {
            lblErro.setText("Tem de selecionar um cenario de alojamento!");
        }

    }//GEN-LAST:event_jbEditarActionPerformed

    private void tfPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPesquisarActionPerformed

    private void tfPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisarKeyPressed
        ArrayList<CenarioAlojamento> parts = new ArrayList<>();
        String filtro = tfPesquisar.getText();

        for (CenarioAlojamento cenario : viagem.getCenariosDeAlojamento()) {

            if (cenario.getDesignacao().toLowerCase().contains(filtro)) {
                parts.add(cenario);
            }
        }
        tableCenario.setModel(new CenariosTableModel(parts));
    }//GEN-LAST:event_tfPesquisarKeyPressed

    private void tfPesquisarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPesquisarFocusGained
        tfPesquisar.setText("");
        tfPesquisar.setForeground(Color.black);
    }//GEN-LAST:event_tfPesquisarFocusGained

    private void tfPesquisarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPesquisarFocusLost
        tfPesquisar.setText("Pesquise...");
        tfPesquisar.setForeground(Color.GRAY);
    }//GEN-LAST:event_tfPesquisarFocusLost

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed

        lblErro.setText("");

        if (tableCenario.getSelectedRow() != 1) {
            int i = JOptionPane.showConfirmDialog(this, "Tem a certeza que quer eliminar o cenario selecionado?");

            if (i != JOptionPane.YES_OPTION) {
                return;
            }
        } else {
            lblErro.setText("Tem de selecionar um, e apenas um, cenario de alojamento!");
        }

        CenariosTableModel model = (CenariosTableModel) tableCenario.getModel();

        CenarioAlojamento cenario = model.getSelectedRow(tableCenario.getSelectedRow());

        model.removeElement(cenario);

        tableCenario.setModel(model);




    }//GEN-LAST:event_jbEliminarActionPerformed

    private void AtivarCenarioViagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtivarCenarioViagemActionPerformed
        lblErro.setText("");

        if (tableCenario.getSelectedRow() != 1) {
            int i = JOptionPane.showConfirmDialog(this, "Tem a certeza que quer ativar/reservar o cenario de alojamento selecionado para esta viagem?");

            if (i != JOptionPane.YES_OPTION) {
                return;
            }
        } else {
            lblErro.setText("Tem de selecionar um, e apenas um, cenario de alojamento!");
        }


        CenariosTableModel model = (CenariosTableModel) tableCenario.getModel();

        for (CenarioAlojamento cenario : viagem.getCenariosDeAlojamento()) {
            if (cenario.equals(model.getSelectedRow(tableCenario.getSelectedRow()))) {
                cenario.setAtivo(true);
            } else {
                cenario.setAtivo(false);
            }

        }

        tableCenario.setModel(model);

    }//GEN-LAST:event_AtivarCenarioViagemActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtivarCenarioViagem;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbComparar;
    private javax.swing.JButton jbCriar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbVoltar;
    private javax.swing.JLabel lblErro;
    private javax.swing.JLabel lblLista;
    private javax.swing.JLabel lblParticipantes;
    private javax.swing.JTable tableCenario;
    private javax.swing.JTextField tfPesquisar;
    // End of variables declaration//GEN-END:variables

    public void viagemPassada(Viagem viagem) {

        this.viagem = viagem;
        lblLista.setText("Lista de Cenários de Alojamento da viagem " + viagem.getDesignacao() + ":");

    }

    private void setModel() {
        if (!viagem.getCenariosDeAlojamento().isEmpty()) {
            ArrayList<CenarioAlojamento> cenarioModelList = viagem.getCenariosDeAlojamento();
            CenariosTableModel model = new CenariosTableModel(cenarioModelList);
            tableCenario.setModel(model);
        }
    }
}
