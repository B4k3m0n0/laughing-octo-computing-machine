package pt.ipleiria.tripPlanner.gui.GestaoEtapas;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListCellRenderer;
import pt.ipleiria.tripPlanner.gui.GestaoLocalidades.*;
import pt.ipleiria.tripPlanner.gui.Models.Alojamento;
import pt.ipleiria.tripPlanner.gui.Models.DadosAplicacao;
import pt.ipleiria.tripPlanner.gui.Models.Etapa;
import pt.ipleiria.tripPlanner.gui.Models.Participante;
import pt.ipleiria.tripPlanner.gui.TripPlanner.TripPlanner;
import pt.ipleiria.tripPlanner.gui.Utils.CellRendererEtapa;
import pt.ipleiria.tripPlanner.gui.Utils.CellRendererParticipante;
import pt.ipleiria.tripPlanner.gui.cenario.*;
import pt.ipleiria.tripPlanner.gui.events.AssociarEtapasClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.AssociarEtapasClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.EditarEtapasClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.EditarEtapasClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.EtapasClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.EtapasClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.InserirEtapasClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.InserirEtapasClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.LoginEfetuadoListener;
import pt.ipleiria.tripPlanner.gui.events.VisualizarEtapasClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.VisualizarEtapasClicadoListener;
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
public class GestaodeEtapas extends javax.swing.JPanel {

    private List<InserirEtapasClicadoListener> inserirEtapasClicadoListener;
    private List<EditarEtapasClicadoListener> editarEtapasClicadoListener;
    private List<VisualizarEtapasClicadoListener> visualizarEtapasClicadoListener;
    private List<AssociarEtapasClicadoListener> associarEtapasClicadoListener;
    private List<VoltarMenuPrincipalListener> voltarMenuPrincipalListener;

    /**
     * Creates new form GestãodeCenáriodeAlojamento
     */
    public GestaodeEtapas() {
        initComponents();
        this.inserirEtapasClicadoListener = new ArrayList<>();
        this.editarEtapasClicadoListener = new ArrayList<>();
        this.visualizarEtapasClicadoListener = new ArrayList<>();
        this.associarEtapasClicadoListener = new ArrayList<>();
        this.voltarMenuPrincipalListener = new ArrayList<>();
        lstEtapas.setCellRenderer((ListCellRenderer) new CellRendererEtapa());
        actualizarListaEtapas();
    }

    public synchronized void addInserirEtapasClicadoListener(InserirEtapasClicadoListener listener) {
        this.inserirEtapasClicadoListener.add(listener);
    }

    public synchronized void removeInserirEtapasClicadoListener(InserirEtapasClicadoListener listener) {
        this.inserirEtapasClicadoListener.remove(listener);
    }

    protected synchronized void fireInserirEtapasClicadoEvent() {
        for (InserirEtapasClicadoListener listener : this.inserirEtapasClicadoListener) {
            InserirEtapasClicadoEvent evento = new InserirEtapasClicadoEvent(this);
            listener.inserirEtapasClicado(evento);
        }
    }

    public synchronized void addEditarEtapasClicadoListener(EditarEtapasClicadoListener listener) {
        this.editarEtapasClicadoListener.add(listener);
    }

    public synchronized void removeEditarEtapasClicadoListener(EditarEtapasClicadoListener listener) {
        this.editarEtapasClicadoListener.remove(listener);
    }

    protected synchronized void fireEditarEtapasClicadoEvent(Etapa etapa) {
        for (EditarEtapasClicadoListener listener : this.editarEtapasClicadoListener) {
            EditarEtapasClicadoEvent evento = new EditarEtapasClicadoEvent(this, etapa);
            listener.editarEtapasClicado(evento);
        }
    }

    public synchronized void addVisualizarEtapasClicadoListener(VisualizarEtapasClicadoListener listener) {
        this.visualizarEtapasClicadoListener.add(listener);
    }

    public synchronized void removeVisualizarEtapasClicadoListener(VisualizarEtapasClicadoListener listener) {
        this.visualizarEtapasClicadoListener.remove(listener);
    }

    protected synchronized void fireVisualizarEtapasClicadoEvent(Etapa etapaSelecionada) {
        for (VisualizarEtapasClicadoListener listener : this.visualizarEtapasClicadoListener) {
            VisualizarEtapasClicadoEvent evento = new VisualizarEtapasClicadoEvent(this, etapaSelecionada);
            listener.visualizarEtapasClicado(evento);
        }
    }

    public synchronized void addAssociarEtapasClicadoListener(AssociarEtapasClicadoListener listener) {
        this.associarEtapasClicadoListener.add(listener);
    }

    public synchronized void removeAssociarEtapasClicadoListener(AssociarEtapasClicadoListener listener) {
        this.associarEtapasClicadoListener.remove(listener);
    }

    protected synchronized void fireAssociarEtapasClicadoEvent(Etapa etapaSelecionada) {
        for (AssociarEtapasClicadoListener listener : this.associarEtapasClicadoListener) {
            AssociarEtapasClicadoEvent evento = new AssociarEtapasClicadoEvent(this, etapaSelecionada);
            listener.associarEtapasClicado(evento);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        lstEtapas = new javax.swing.JList();
        jbCriar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbPesquisar = new javax.swing.JButton();
        jbVoltar = new javax.swing.JButton();
        tfPesquisar = new javax.swing.JTextField();
        lblLocalidades = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblErro = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(640, 480));
        setMinimumSize(new java.awt.Dimension(640, 480));

        lstEtapas.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstEtapas);

        jbCriar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/ipleiria/tripPlanner/gui/Imagens/Inserir1.png"))); // NOI18N
        jbCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCriarActionPerformed(evt);
            }
        });

        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/ipleiria/tripPlanner/gui/Imagens/eliminar1.png"))); // NOI18N
        jbEliminar.setBorder(null);
        jbEliminar.setEnabled(false);

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

        jbVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/ipleiria/tripPlanner/gui/Imagens/back-trans.png"))); // NOI18N
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
            }
        });

        tfPesquisar.setText("Pesquisar");

        lblLocalidades.setText("Etapas");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/ipleiria/tripPlanner/gui/Imagens/synchronize_256.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Etapas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblLocalidades)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                                    .addComponent(tfPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                                    .addComponent(lblErro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addComponent(jbPesquisar)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbCriar)
                                .addGap(28, 28, 28)
                                .addComponent(jbEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbVoltar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel1)))
                .addContainerGap(198, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLocalidades)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                        .addGap(8, 8, 8)
                        .addComponent(lblErro)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(101, 101, 101)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCriar)
                    .addComponent(jbEliminar)
                    .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbVoltar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCriarActionPerformed
        this.fireInserirEtapasClicadoEvent();
    }//GEN-LAST:event_jbCriarActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        if (lstEtapas.getSelectedIndex() != -1) {
            Etapa etapaSelecionada = (Etapa) lstEtapas.getSelectedValue();
            this.fireEditarEtapasClicadoEvent(etapaSelecionada);
        } else {
            lblErro.setForeground(Color.red);
            lblErro.setText("Têm de selecionar uma etapa da lista de etapas!");
        }
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed

        if (lstEtapas.getSelectedIndex() != -1) {
            Etapa etapaSelecionada = (Etapa) lstEtapas.getSelectedValue();
            this.fireVisualizarEtapasClicadoEvent(etapaSelecionada);
        } else {
            lblErro.setForeground(Color.red);
            lblErro.setText("Têm de selecionar uma etapa da lista de etapas!");
        }
    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (lstEtapas.getSelectedIndex() != -1) {
            Etapa etapaSelecionado = (Etapa) lstEtapas.getSelectedValue();
            this.fireAssociarEtapasClicadoEvent(etapaSelecionado);
        } else {
            lblErro.setForeground(Color.red);
            lblErro.setText("Têm de selecionar uma etapa da lista de etapas!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarActionPerformed
        this.fireVoltarMenuPrincipalEvent();
    }//GEN-LAST:event_jbVoltarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCriar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbVoltar;
    private javax.swing.JLabel lblErro;
    private javax.swing.JLabel lblLocalidades;
    private javax.swing.JList lstEtapas;
    private javax.swing.JTextField tfPesquisar;
    // End of variables declaration//GEN-END:variables

    public void actualizarListaEtapas() {
        DefaultListModel<Etapa> model = new DefaultListModel<>();
        for (Etapa etapa : DadosAplicacao.getInstance().getEtapas()) {
            model.addElement(etapa);
        }
        lstEtapas.setModel(model);
    }

    public void limparCampos() {
        lblErro.setText("");
        lstEtapas.clearSelection();
    }

}
