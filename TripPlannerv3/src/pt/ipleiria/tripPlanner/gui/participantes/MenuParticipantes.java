package pt.ipleiria.tripPlanner.gui.participantes;

import java.awt.Color;
import pt.ipleiria.tripPlanner.gui.Utils.CellRendererParticipante;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ListCellRenderer;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import pt.ipleiria.tripPlanner.gui.Models.DadosAplicacao;
import pt.ipleiria.tripPlanner.gui.Models.Participante;
import pt.ipleiria.tripPlanner.gui.Utils.ParticipanteTableModel;
import pt.ipleiria.tripPlanner.gui.events.EditarParticipantesClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.EditarParticipantesClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.InserirParticipantesClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.InserirParticipantesClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.VisualizarParticipantesClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.VisualizarParticipantesClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.VoltarMenuPrincipalEvent;
import pt.ipleiria.tripPlanner.gui.events.VoltarMenuPrincipalListener;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ricardo
 */
public class MenuParticipantes extends javax.swing.JPanel {

    private List<InserirParticipantesClicadoListener> inserirParticipantesClicadoListener;
    private List<EditarParticipantesClicadoListener> editarParticipantesClicadoListener;
    private List<VisualizarParticipantesClicadoListener> visualizarParticipantesClicadoListener;
    private List<VoltarMenuPrincipalListener> voltarMenuPrincipalListener;

    /**
     * Creates new form MenuParticipantes
     */
    public MenuParticipantes() {
        initComponents();
        lblErro.setForeground(Color.red);
        this.inserirParticipantesClicadoListener = new ArrayList<>();
        this.editarParticipantesClicadoListener = new ArrayList<>();
        this.visualizarParticipantesClicadoListener = new ArrayList<>();
        this.voltarMenuPrincipalListener = new ArrayList<>();
        ListSelectionModel model = tableParticipantes.getSelectionModel();
        model.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tableParticipantes.setRowSelectionAllowed(true);
        tableParticipantes.setSelectionModel(model);
        setModel();

    }

    public synchronized void addInserirParticipantesClicadoListener(InserirParticipantesClicadoListener listener) {
        this.inserirParticipantesClicadoListener.add(listener);
    }

    public synchronized void removeInserirParticipantesClicadoListener(InserirParticipantesClicadoListener listener) {
        this.inserirParticipantesClicadoListener.remove(listener);
    }

    protected synchronized void fireInserirParticipantesClicadoEvent() {
        for (InserirParticipantesClicadoListener listener : this.inserirParticipantesClicadoListener) {
            InserirParticipantesClicadoEvent evento = new InserirParticipantesClicadoEvent(this);
            listener.InserirParticipantesClicado(evento);
        }
    }

    public synchronized void addEditarParticipantesClicadoListener(EditarParticipantesClicadoListener listener) {
        this.editarParticipantesClicadoListener.add(listener);
    }

    public synchronized void removeEditarParticipantesClicadoListener(EditarParticipantesClicadoListener listener) {
        this.editarParticipantesClicadoListener.remove(listener);
    }

    protected synchronized void fireEditarParticipantesClicadoEvent(Participante participante) {
        for (EditarParticipantesClicadoListener listener : this.editarParticipantesClicadoListener) {
            EditarParticipantesClicadoEvent evento = new EditarParticipantesClicadoEvent(this, participante);
            listener.EditarParticipantesClicado(evento);
        }
    }

    public synchronized void addVisualizarParticipantesClicadoListener(VisualizarParticipantesClicadoListener listener) {
        this.visualizarParticipantesClicadoListener.add(listener);
    }

    public synchronized void removeVisualizarParticipantesClicadoListener(VisualizarParticipantesClicadoListener listener) {
        this.visualizarParticipantesClicadoListener.remove(listener);
    }

    protected synchronized void fireVisualizarParticipantesClicadoEvent(Participante participanteSelecionado) {
        for (VisualizarParticipantesClicadoListener listener : this.visualizarParticipantesClicadoListener) {
            VisualizarParticipantesClicadoEvent evento = new VisualizarParticipantesClicadoEvent(this, participanteSelecionado);
            listener.visualizarParticipantesClicado(evento);
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

    private void setModel() {
        ArrayList<Participante> participantesModelList = DadosAplicacao.getInstance().getParticipantes();
        ParticipanteTableModel model = new ParticipanteTableModel(participantesModelList);
        tableParticipantes.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfPesquisar = new javax.swing.JTextField();
        btnVisualizar = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        lblParticipantes = new javax.swing.JLabel();
        lblLocalidades = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblErro = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableParticipantes = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        tfPesquisar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
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
                filtro(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filtro(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                filtro(evt);
            }
        });

        btnVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/ipleiria/tripPlanner/gui/Imagens/lupa.png"))); // NOI18N
        btnVisualizar.setToolTipText("Visualizar Participante");
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });

        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/ipleiria/tripPlanner/gui/Imagens/Inserir1.png"))); // NOI18N
        btnAdicionar.setToolTipText("Inserir Participante");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/ipleiria/tripPlanner/gui/Imagens/eliminar1.png"))); // NOI18N
        btnRemover.setToolTipText("Remover Participante");
        btnRemover.setEnabled(false);
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/ipleiria/tripPlanner/gui/Imagens/editar.png"))); // NOI18N
        btnEditar.setToolTipText("Editar Participante");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/ipleiria/tripPlanner/gui/Imagens/back-trans.png"))); // NOI18N
        btnVoltar.setToolTipText("Voltar Menu Principal");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        lblParticipantes.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        lblParticipantes.setText("Gestão de Participantes");

        lblLocalidades.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblLocalidades.setText("Lista de Participantes:");

        lblErro.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblErro.setForeground(new java.awt.Color(255, 0, 0));

        tableParticipantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "BI"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableParticipantes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnVisualizar))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(76, 76, 76)
                                            .addComponent(lblLocalidades))
                                        .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(101, 101, 101)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(lblParticipantes))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblErro, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdicionar)
                                .addGap(18, 18, 18)
                                .addComponent(btnRemover)
                                .addGap(18, 18, 18)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblParticipantes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLocalidades)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVisualizar)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdicionar)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        lblErro.setText("");
        this.fireInserirParticipantesClicadoEvent();
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        lblErro.setText("");

        if (tableParticipantes.getSelectedRow() != -1) {

            ParticipanteTableModel model = (ParticipanteTableModel) tableParticipantes.getModel();

            Participante p = model.getSelectedRow(tableParticipantes.getSelectedRow());

            this.fireEditarParticipantesClicadoEvent(p);
        } else {
            lblErro.setText("Tem de selecionar um participante!");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed

        lblErro.setText("");

        if (tableParticipantes.getSelectedRow() != -1) {
            ParticipanteTableModel model = (ParticipanteTableModel) tableParticipantes.getModel();
            Participante p = model.getSelectedRow(tableParticipantes.getSelectedRow());
            this.fireVisualizarParticipantesClicadoEvent(p);
        } else {
            lblErro.setText("Tem de selecionar um participante!");
        }

    }//GEN-LAST:event_btnVisualizarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.fireVoltarMenuPrincipalEvent();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void tfPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPesquisarActionPerformed
    }//GEN-LAST:event_tfPesquisarActionPerformed

    private void filtro(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtro
        System.err.println("AQUI");
        ArrayList<Participante> parts = new ArrayList<>();
        String filtro = tfPesquisar.getText();

        for (Participante participante : DadosAplicacao.getInstance().getParticipantes()) {

            if (participante.getNome().toLowerCase().contains(filtro)) {
                parts.add(participante);
            
            }
        }
        tableParticipantes.setModel(new ParticipanteTableModel(parts));
//        model.addAll(participantes);
//        tableParticipantes.setModel(model);
    }//GEN-LAST:event_filtro

    private void tfPesquisarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPesquisarFocusGained
        tfPesquisar.setText("");
        tfPesquisar.setForeground(Color.black);
    }//GEN-LAST:event_tfPesquisarFocusGained

    private void tfPesquisarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPesquisarFocusLost
        tfPesquisar.setText("Pesquise...");
        tfPesquisar.setForeground(Color.GRAY);
    }//GEN-LAST:event_tfPesquisarFocusLost

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
    }//GEN-LAST:event_btnRemoverActionPerformed

    public void actualizarListaParticipantes() {
        if (DadosAplicacao.getInstance().getLogado().isAutor()) {
            btnEditar.setEnabled(true);
            btnAdicionar.setEnabled(true);
        } else {
            btnEditar.setEnabled(false);
            btnEditar.setEnabled(false);
        }
        setModel();
    }
     public void limparCampos(){
        lblErro.setText("");
        tableParticipantes.clearSelection();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblErro;
    private javax.swing.JLabel lblLocalidades;
    private javax.swing.JLabel lblParticipantes;
    private javax.swing.JTable tableParticipantes;
    private javax.swing.JTextField tfPesquisar;
    // End of variables declaration//GEN-END:variables
}



