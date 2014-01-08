package pt.ipleiria.tripPlanner.gui.participantes;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import pt.ipleiria.tripPlanner.gui.Models.DadosAplicacao;
import pt.ipleiria.tripPlanner.gui.Models.Participante;
import pt.ipleiria.tripPlanner.gui.Models.Viagem;
import pt.ipleiria.tripPlanner.gui.Utils.CellRendererParticipante;
import pt.ipleiria.tripPlanner.gui.Utils.CellRendererViagem;
import pt.ipleiria.tripPlanner.gui.events.ConfirmarClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.ConfirmarClicadoListener;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ricardo
 */
public class MostrarParticipante extends javax.swing.JPanel {

    private List<ConfirmarClicadoListener> confirmarClicadoListener;

    /**
     * Creates new form InserirParticipante
     */
    public MostrarParticipante() {
        initComponents();
        this.confirmarClicadoListener = new ArrayList<>();
        
        lstViagem.setCellRenderer(new CellRendererViagem());
    }

    public synchronized void addConfirmarClicadoListener(ConfirmarClicadoListener listener) {
        this.confirmarClicadoListener.add(listener);
    }

    public synchronized void removeConfirmarClicadoListener(ConfirmarClicadoListener listener) {
        this.confirmarClicadoListener.remove(listener);
    }

    protected synchronized void fireConfirmarClicadoEvent() {
        for (ConfirmarClicadoListener listener : this.confirmarClicadoListener) {
            ConfirmarClicadoEvent evento = new ConfirmarClicadoEvent(this);
            listener.confirmarClicado(evento);
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
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblDataNascimento = new javax.swing.JLabel();
        lblBI = new javax.swing.JLabel();
        lblLocalidade = new javax.swing.JLabel();
        lblCondicaoFisica = new javax.swing.JLabel();
        lblMostrarNome = new javax.swing.JLabel();
        lblMostrarDtaNascimento = new javax.swing.JLabel();
        lblMostrarBI = new javax.swing.JLabel();
        lblMostrarLocalidade = new javax.swing.JLabel();
        lblMostarICF = new javax.swing.JLabel();
        lblAdministrador = new javax.swing.JLabel();
        lblMostrarAdmin = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstViagem = new javax.swing.JList();
        jPanel2 = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblMostrarUsername = new javax.swing.JLabel();
        lblMostrarPassword = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        btnOk.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnOk.setText("Ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel1.setText("Visualizar Participante");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados Pessoais"));

        lblNome.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblNome.setText("Nome:");

        lblDataNascimento.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblDataNascimento.setText("Data de Nascimento:");

        lblBI.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblBI.setText("Bilhete Identidade:");

        lblLocalidade.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblLocalidade.setText("Localidade:");

        lblCondicaoFisica.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblCondicaoFisica.setText("Indice Condicao Fisica:");

        lblMostrarNome.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblMostrarDtaNascimento.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblMostrarBI.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblMostrarLocalidade.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblMostarICF.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblAdministrador.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblAdministrador.setText("Autor:");

        lblMostrarAdmin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lstViagem.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstViagem);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblNome)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblMostrarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblBI)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblMostrarBI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblLocalidade)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblMostrarLocalidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblDataNascimento)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblMostrarDtaNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblCondicaoFisica)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblMostarICF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblAdministrador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblMostrarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 15, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNome)
                    .addComponent(lblMostrarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMostrarDtaNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDataNascimento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMostrarBI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblBI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblLocalidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMostrarLocalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCondicaoFisica)
                    .addComponent(lblMostarICF, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAdministrador)
                    .addComponent(lblMostrarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados de sistema"));
        jPanel2.setEnabled(false);

        lblUsername.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblUsername.setText("Username:");
        lblUsername.setEnabled(false);

        lblPassword.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblPassword.setText("Password:");
        lblPassword.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblUsername)
                        .addGap(10, 10, 10)
                        .addComponent(lblMostrarUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblPassword)
                        .addGap(12, 12, 12)
                        .addComponent(lblMostrarPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsername)
                    .addComponent(lblMostrarUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMostrarPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(113, 113, 113)
                            .addComponent(btnOk)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOk)
                .addGap(177, 177, 177))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        this.fireConfirmarClicadoEvent();
    }//GEN-LAST:event_btnOkActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAdministrador;
    private javax.swing.JLabel lblBI;
    private javax.swing.JLabel lblCondicaoFisica;
    private javax.swing.JLabel lblDataNascimento;
    private javax.swing.JLabel lblLocalidade;
    private javax.swing.JLabel lblMostarICF;
    private javax.swing.JLabel lblMostrarAdmin;
    private javax.swing.JLabel lblMostrarBI;
    private javax.swing.JLabel lblMostrarDtaNascimento;
    private javax.swing.JLabel lblMostrarLocalidade;
    private javax.swing.JLabel lblMostrarNome;
    private javax.swing.JLabel lblMostrarPassword;
    private javax.swing.JLabel lblMostrarUsername;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JList lstViagem;
    // End of variables declaration//GEN-END:variables

    public void preencherCampos(Participante participante) {
        lblMostrarNome.setText(participante.getNome());
        lblMostarICF.setText(participante.getICF() + "");
        lblMostrarBI.setText(participante.getBI() + "");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String dataNasc = formatter.format(participante.getDataNasc().getTime());
        lblMostrarDtaNascimento.setText(dataNasc);
        lblMostrarLocalidade.setText(participante.getLocalidade());

        if (DadosAplicacao.getInstance().getSystemAdmin().equals(DadosAplicacao.getInstance().getLogado().getNome())) {
            jPanel2.setEnabled(true);
            lblUsername.setEnabled(true);
            lblPassword.setEnabled(true);
            lblMostrarUsername.setText(participante.getUsername());
            lblMostrarPassword.setText(new String(participante.getPassword()));
            lblMostrarAdmin.setEnabled(true);
            // lblMostrarEditor.setEnabled(true);
            //lblEditor.setEnabled(true);

            if (participante.isAutor()) {
                lblMostrarAdmin.setText("Sim");
            } else {
                lblMostrarAdmin.setText("Não");
            }
            DefaultListModel<Viagem> model = new DefaultListModel<>();
            for (Viagem v : DadosAplicacao.getInstance().getViagens()) {
                for (Participante participante1 : v.getParticipantes()) {
                    if (participante1.getBI() == participante.getBI()) {
                        model.addElement(v);
                    }
                }

            }
            lstViagem.setModel(model);
//            if (participante.isEditor()) {
//                lblMostrarEditor.setText("Sim");
//            } else {
//                lblMostrarEditor.setText("Não");
//            }
        }
    }
}
