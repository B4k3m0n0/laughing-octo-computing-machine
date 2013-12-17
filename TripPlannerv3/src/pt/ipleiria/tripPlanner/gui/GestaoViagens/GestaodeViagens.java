package pt.ipleiria.tripPlanner.gui.GestaoViagens;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ListCellRenderer;
import pt.ipleiria.tripPlanner.gui.Models.Alojamento;
import pt.ipleiria.tripPlanner.gui.Models.DadosAplicacao;
import pt.ipleiria.tripPlanner.gui.Models.Viagem;
import pt.ipleiria.tripPlanner.gui.Utils.CellRendererViagem;
import pt.ipleiria.tripPlanner.gui.events.AssociarViagensClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.AssociarViagensClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.InserirViagemClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.InserirViagemClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.VisualizarViagensClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.VisualizarViagensClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.VoltarMenuPrincipalListener;
import pt.ipleiria.tripPlanner.gui.events.VoltarMenuPrincipalEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DELL
 */
public class GestaodeViagens extends javax.swing.JPanel {

    private List<InserirViagemClicadoListener> inserirViagemClicadoListener;
    private List<VoltarMenuPrincipalListener> voltarMenuPrincipalListener;
    private List<AssociarViagensClicadoListener> associarViagensClicadoListener;
    private List<VisualizarViagensClicadoListener> visualizarViagensClicadoListener;
    private ArrayList<Viagem> viagensModelList;
    private DefaultListModel<Viagem> modelV;

    private static final GestaodeViagens instance = new GestaodeViagens();

    /**
     * Creates new form GestãodeCenáriodeAlojamento
     */
    public GestaodeViagens() {
        initComponents();
        this.inserirViagemClicadoListener = new ArrayList<>();
        this.voltarMenuPrincipalListener = new ArrayList<>();
        this.associarViagensClicadoListener = new ArrayList<>();
        this.visualizarViagensClicadoListener = new ArrayList<>();

        viagensModelList = new ArrayList<>();
        modelV = new DefaultListModel<>();

        lstViagens.setCellRenderer((ListCellRenderer) new CellRendererViagem());

        Lista();

        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);

    }

    public synchronized void addInserirViagemClicadoListener(InserirViagemClicadoListener listener) {
        this.inserirViagemClicadoListener.add(listener);
    }

    public synchronized void removeInserirViagemClicadoListener(InserirViagemClicadoListener listener) {
        this.inserirViagemClicadoListener.remove(listener);
    }

    protected synchronized void fireInserirViagemClicadoListener() {
        for (InserirViagemClicadoListener listener : this.inserirViagemClicadoListener) {
            InserirViagemClicadoEvent evento = new InserirViagemClicadoEvent(this);
            listener.inserirViagemClicado(evento);
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

    public synchronized void addAssociarViagensClicadoListener(AssociarViagensClicadoListener listener) {
        this.associarViagensClicadoListener.add(listener);
    }

    public synchronized void removeAssociarViagensClicadoListener(AssociarViagensClicadoListener listener) {
        this.associarViagensClicadoListener.remove(listener);
    }

    protected synchronized void fireAssociarViagensClicadoEvent() {
        if (lstViagens.getSelectedValue() == null) {
            
        } else {
            for (AssociarViagensClicadoListener listener : this.associarViagensClicadoListener) {
                AssociarViagensClicadoEvent evento = new AssociarViagensClicadoEvent(this, (Viagem) lstViagens.getSelectedValue());
                listener.associarViagensClicado(evento);
            }
        }
    }

    public synchronized void addVisualizarViagensClicadoListener(VisualizarViagensClicadoListener listener) {
        this.visualizarViagensClicadoListener.add(listener);
    }

    public synchronized void removeVisualizarViagensClicadoListener(VisualizarViagensClicadoListener listener) {
        this.visualizarViagensClicadoListener.remove(listener);
    }

    protected synchronized void fireVisualizarViagensClicadoEvent() {
        if (lstViagens.getSelectedValue() == null) {

        } else {
            for (VisualizarViagensClicadoListener listener : this.visualizarViagensClicadoListener) {
                VisualizarViagensClicadoEvent evento = new VisualizarViagensClicadoEvent(this, (Viagem) lstViagens.getSelectedValue());
                listener.visualizarViagensClicado(evento);
            }
        }
    }

    private void Lista() {
        viagensModelList = DadosAplicacao.getInstance().getViagens();
        modelV.clear();
        for (Viagem v : viagensModelList) {
            modelV.addElement(v);
        }
        lstViagens.setModel(modelV);

        /*
         etapasModelList = DadosAplicacao.getInstance().getEtapas();
         modelE.clear();
         for (Etapa e : etapasModelList) {
         modelE.addElement(e);
         }
         lstEtapasP.setModel(modelE);
         */
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
        lstViagens = new javax.swing.JList();
        btnCriar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnVisualizar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        tfPesquisar = new javax.swing.JTextField();
        lblLocalidades = new javax.swing.JLabel();
        btnAssociar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(640, 480));
        setMinimumSize(new java.awt.Dimension(640, 480));

        lstViagens.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstViagens);

        btnCriar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/ipleiria/tripPlanner/gui/Imagens/Inserir1.png"))); // NOI18N
        btnCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/ipleiria/tripPlanner/gui/Imagens/eliminar1.png"))); // NOI18N
        btnEliminar.setEnabled(false);

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/ipleiria/tripPlanner/gui/Imagens/editar.png"))); // NOI18N
        btnEditar.setEnabled(false);

        btnVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/ipleiria/tripPlanner/gui/Imagens/lupa.png"))); // NOI18N
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/ipleiria/tripPlanner/gui/Imagens/back-trans.png"))); // NOI18N
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        tfPesquisar.setText("Pesquisar");

        lblLocalidades.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblLocalidades.setText("Viagens");

        btnAssociar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/ipleiria/tripPlanner/gui/Imagens/synchronize_256.png"))); // NOI18N
        btnAssociar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssociarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel1.setText("Viagens");

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblLocalidades)
                        .addComponent(jScrollPane1)
                        .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCriar)
                        .addGap(28, 28, 28)
                        .addComponent(btnEliminar)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(btnEditar))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVisualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAssociar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addComponent(btnVoltar))
                .addGap(0, 123, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addGap(251, 251, 251))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(lblLocalidades)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnEditar)
                                .addComponent(btnVoltar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnCriar)
                                .addComponent(btnEliminar))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVisualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAssociar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(78, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarActionPerformed
        this.fireInserirViagemClicadoListener();
    }//GEN-LAST:event_btnCriarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.fireVoltarMenuPrincipalEvent();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
        this.fireVisualizarViagensClicadoEvent();
    }//GEN-LAST:event_btnVisualizarActionPerformed

    private void btnAssociarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssociarActionPerformed
        this.fireAssociarViagensClicadoEvent();
    }//GEN-LAST:event_btnAssociarActionPerformed

    public Viagem getSelectedViagem() {
        Viagem v = (Viagem) lstViagens.getSelectedValue();
        return v;
    }

    public static GestaodeViagens getInstance() {
        return instance;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssociar;
    private javax.swing.JButton btnCriar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblLocalidades;
    private javax.swing.JList lstViagens;
    private javax.swing.JTextField tfPesquisar;
    // End of variables declaration//GEN-END:variables
 public void actualizarListaViagens() {
        DefaultListModel<Viagem> model = new DefaultListModel<>();
        for (Viagem viagens : DadosAplicacao.getInstance().getViagens()) {
            model.addElement(viagens);
        }
        lstViagens.setModel(model);
    }
}
