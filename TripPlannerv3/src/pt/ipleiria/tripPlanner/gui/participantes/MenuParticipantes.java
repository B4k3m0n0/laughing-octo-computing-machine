package pt.ipleiria.tripPlanner.gui.participantes;

import java.awt.Color;
import pt.ipleiria.tripPlanner.gui.Utils.CellRendererParticipante;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ListCellRenderer;
import pt.ipleiria.tripPlanner.gui.Models.DadosAplicacao;
import pt.ipleiria.tripPlanner.gui.Models.Participante;
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
        lstPesquisa.setCellRenderer((ListCellRenderer) new CellRendererParticipante());
        actualizarListaParticipantes();
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfPesquisar = new javax.swing.JTextField();
        spListaParticipantes = new javax.swing.JScrollPane();
        lstPesquisa = new javax.swing.JList();
        btnVisualizar = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        lblParticipantes = new javax.swing.JLabel();
        lblLocalidades = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblErro = new javax.swing.JLabel();

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

        lstPesquisa.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lstPesquisa.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        spListaParticipantes.setViewportView(lstPesquisa);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnAdicionar)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnRemover)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(spListaParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnVisualizar)
                                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErro, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 30, Short.MAX_VALUE))
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
                    .addComponent(spListaParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVisualizar))
                .addGap(4, 4, 4)
                .addComponent(lblErro, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdicionar))
                .addGap(52, 52, 52))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        this.fireInserirParticipantesClicadoEvent();
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (lstPesquisa.getSelectedIndex() != -1) {
            Participante participanteSelecionado = (Participante) lstPesquisa.getSelectedValue();
            this.fireEditarParticipantesClicadoEvent(participanteSelecionado);
        } else {
            lblErro.setText("Têm de selecionar um participante!");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
        if (lstPesquisa.getSelectedIndex() != -1) {
            Participante participanteSelecionado = (Participante) lstPesquisa.getSelectedValue();
            this.fireVisualizarParticipantesClicadoEvent(participanteSelecionado);
        } else {
            lblErro.setText("Têm de selecionar um participante!");
        }

    }//GEN-LAST:event_btnVisualizarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.fireVoltarMenuPrincipalEvent();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void tfPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPesquisarActionPerformed
    }//GEN-LAST:event_tfPesquisarActionPerformed

    private void filtro(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtro


        DefaultListModel<Participante> model = new DefaultListModel<>();
        model.clear();
        String filtro = tfPesquisar.getText();
        for (Participante participante : DadosAplicacao.getInstance().getParticipantes()) {
            if (participante.getNome().toLowerCase().contains(filtro)) {
                model.addElement(participante);
            }
        }

        lstPesquisa.setModel(model);
    }//GEN-LAST:event_filtro

    private void tfPesquisarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPesquisarFocusGained
        tfPesquisar.setText("");
        tfPesquisar.setForeground(Color.black);
    }//GEN-LAST:event_tfPesquisarFocusGained

    private void tfPesquisarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPesquisarFocusLost
        tfPesquisar.setText("Pesquise...");
        tfPesquisar.setForeground(Color.GRAY);
    }//GEN-LAST:event_tfPesquisarFocusLost

    public void actualizarListaParticipantes() {

        DefaultListModel<Participante> model = new DefaultListModel<>();
        for (Participante participante : DadosAplicacao.getInstance().getParticipantes()) {
            model.addElement(participante);
        }

        lstPesquisa.setModel(model);
    }
     public void limparCampos(){
        lblErro.setText("");
        lstPesquisa.clearSelection();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblErro;
    private javax.swing.JLabel lblLocalidades;
    private javax.swing.JLabel lblParticipantes;
    private javax.swing.JList lstPesquisa;
    private javax.swing.JScrollPane spListaParticipantes;
    private javax.swing.JTextField tfPesquisar;
    // End of variables declaration//GEN-END:variables
}



