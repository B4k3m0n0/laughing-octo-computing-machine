package pt.ipleiria.tripPlanner.gui.TripPlanner;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JPanel;
import pt.ipleiria.tripPlanner.gui.GestaoAlojamento.AdicionarQuarto;
import pt.ipleiria.tripPlanner.gui.GestaoAlojamento.CriarEditarAlojamento;
import pt.ipleiria.tripPlanner.gui.GestaoAlojamento.GestaodeAlojamentos;
import pt.ipleiria.tripPlanner.gui.GestaoAlojamento.MostrarAlojamento;
import pt.ipleiria.tripPlanner.gui.GestaoEtapas.GestaodeEtapas;
import pt.ipleiria.tripPlanner.gui.GestaoEtapas.InserirEditarEtapa;
import pt.ipleiria.tripPlanner.gui.GestaoEtapas.VisualizarEtapa;
import pt.ipleiria.tripPlanner.gui.GestaoViagens.AssociarViagens;
import pt.ipleiria.tripPlanner.gui.GestaoViagens.GestaodeViagens;
import pt.ipleiria.tripPlanner.gui.GestaoViagens.InserirEditarViagens;
import pt.ipleiria.tripPlanner.gui.GestaoViagens.VisualizarViagens;
import pt.ipleiria.tripPlanner.gui.events.AdicionarQuartoClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.AdicionarQuartoClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.AlojamentoClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.AlojamentoClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.AssociarEtapasClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.AssociarEtapasClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.AssociarViagensClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.AssociarViagensClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.CancelarAdicionarQuartoClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.CancelarAdicionarQuartoClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.CancelarInserirEditarViagensClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.CancelarInserirEditarViagensClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.CompararCenarioAlojamentoClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.CompararCenarioAlojamentoClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.ConfirmarAdicionarQuartoClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.ConfirmarAdicionarQuartoClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.ConfirmarAssociacaoViagensEvent;
import pt.ipleiria.tripPlanner.gui.events.ConfirmarAssociacaoViagensListener;
import pt.ipleiria.tripPlanner.gui.events.ConfirmarClicadoAlojamentoEvent;
import pt.ipleiria.tripPlanner.gui.events.ConfirmarClicadoAlojamentoListener;
import pt.ipleiria.tripPlanner.gui.events.ConfirmarClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.ConfirmarClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.ConfirmarInsercaoViagensEvent;
import pt.ipleiria.tripPlanner.gui.events.ConfirmarInsercaoViagensListener;
import pt.ipleiria.tripPlanner.gui.events.CriarEditarAlojamentoClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.CriarEditarAlojamentoClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.EditarCenarioAlojamentoClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.EditarCenarioAlojamentoClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.EditarEtapasClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.EditarEtapasClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.EditarParticipantesClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.EditarParticipantesClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.EtapasClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.EtapasClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.GestaoCenarioAlojamentoClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.GestaoCenarioAlojamentoClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.InserirCenarioAlojamentoClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.InserirCenarioAlojamentoClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.InserirEtapasClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.InserirEtapasClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.InserirParticipantesClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.InserirParticipantesClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.InserirViagemClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.InserirViagemClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.LoginEfetuadoEvent;
import pt.ipleiria.tripPlanner.gui.events.LoginEfetuadoListener;
import pt.ipleiria.tripPlanner.gui.events.MenuCenariosClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.MenuCenariosClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.OkAssociarEtapasClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.OkAssociarEtapasClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.OkEditarCenarioAlojamentoClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.OkEditarCenarioAlojamentoClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.OkInserirCenarioAlojamentoClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.OkInserirCenarioAlojamentoClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.OkInserirEtapasClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.OkInserirEtapasClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.OkVisualizarEtapasClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.OkVisualizarEtapasClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.OkVisualizarViagensClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.OkVisualizarViagensClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.ParticipantesClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.ParticipantesClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.PrimeiroLoginEfetuadoEvent;
import pt.ipleiria.tripPlanner.gui.events.PrimeiroLoginEfetuadoListener;
import pt.ipleiria.tripPlanner.gui.events.TerminarSessaoClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.TerminarSessaoClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.ViagensClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.ViagensClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.VisualizarAlojamentoClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.VisualizarAlojamentoClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.VisualizarCenarioAlojamentoClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.VisualizarCenarioAlojamentoClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.VisualizarEtapasClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.VisualizarEtapasClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.VisualizarParticipantesClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.VisualizarParticipantesClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.VisualizarViagensClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.VisualizarViagensClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.VoltarGestaoCenarioAlojamentoClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.VoltarGestaoCenarioAlojamentoClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.VoltarMenuCenariosClicadoEvent;
import pt.ipleiria.tripPlanner.gui.events.VoltarMenuCenariosClicadoListener;
import pt.ipleiria.tripPlanner.gui.events.VoltarMenuPrincipalEvent;
import pt.ipleiria.tripPlanner.gui.events.VoltarMenuPrincipalListener;
import pt.ipleiria.tripPlanner.gui.participantes.InserirEditarParticipante;
import pt.ipleiria.tripPlanner.gui.participantes.MenuParticipantes;
import pt.ipleiria.tripPlanner.gui.participantes.MostrarParticipante;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ricardo
 */
public class TripPlanner extends javax.swing.JFrame implements LoginEfetuadoListener, ParticipantesClicadoListener, InserirParticipantesClicadoListener, EditarParticipantesClicadoListener, VisualizarParticipantesClicadoListener, ConfirmarClicadoListener, CriarEditarAlojamentoClicadoListener, VisualizarAlojamentoClicadoListener, AlojamentoClicadoListener, VisualizarCenarioAlojamentoClicadoListener, CompararCenarioAlojamentoClicadoListener, ViagensClicadoListener, InserirViagemClicadoListener, ConfirmarInsercaoViagensListener, VoltarMenuPrincipalListener, AssociarViagensClicadoListener, ConfirmarAssociacaoViagensListener, EtapasClicadoListener, InserirEtapasClicadoListener, EditarEtapasClicadoListener, VisualizarEtapasClicadoListener,
        AssociarEtapasClicadoListener, OkInserirEtapasClicadoListener, OkVisualizarEtapasClicadoListener,
        OkAssociarEtapasClicadoListener, GestaoCenarioAlojamentoClicadoListener, MenuCenariosClicadoListener,
        InserirCenarioAlojamentoClicadoListener, EditarCenarioAlojamentoClicadoListener, OkInserirCenarioAlojamentoClicadoListener,
        OkEditarCenarioAlojamentoClicadoListener, VoltarGestaoCenarioAlojamentoClicadoListener, ConfirmarClicadoAlojamentoListener, VoltarMenuCenariosClicadoListener, TerminarSessaoClicadoListener, AdicionarQuartoClicadoListener, ConfirmarAdicionarQuartoClicadoListener, CancelarAdicionarQuartoClicadoListener, PrimeiroLoginEfetuadoListener, VisualizarViagensClicadoListener, CancelarInserirEditarViagensClicadoListener, OkVisualizarViagensClicadoListener{
    
    private Login login;
    private MenuCenarios menuCenarios;
    private CriarEditarAlojamento criarEditarAlojamento;
    private GestaodeAlojamentos gestaodeAlojamentos;
    private MenuPrincipal menuPrincipal;
    private AdicionarQuarto adicionarQuarto;
    private DadosAcesso dadosAcesso;
    private MenuParticipantes menuParticipante;
    private InserirEditarParticipante inserirEditarParticipante;
    private MostrarParticipante mostrarParticipante;
    private GestaodeViagens gestaodeViagens;
    private VisualizarViagens visualizarViagens;
    private InserirEditarViagens inserirEditarViagens;
    private AssociarViagens associarViagens;
    private GestaodeEtapas gestaodeEtapas;
    private InserirEditarEtapa inserirEditarEtapa;
    private VisualizarEtapa visualizarEtapa;
    private MostrarAlojamento mostrarAlojamento;

    /**
     * Creates new form TripPlanner
     */
    public TripPlanner() {
        initComponents();
        login = new Login();
        jPanel1.add(login, "login");
        menuCenarios = new MenuCenarios();
        jPanel1.add(menuCenarios, "menuCenarios");
        criarEditarAlojamento = new CriarEditarAlojamento();
        jPanel1.add(criarEditarAlojamento, "criarEditarAlojamento");
        gestaodeAlojamentos = new GestaodeAlojamentos();
        jPanel1.add(gestaodeAlojamentos, "gestaodeAlojamentos");
        menuPrincipal = new MenuPrincipal();
        jPanel1.add(menuPrincipal, "menuPrincipal");
        adicionarQuarto = new AdicionarQuarto();
        jPanel1.add(adicionarQuarto, "adicionarQuarto");
        dadosAcesso = new DadosAcesso();
        jPanel1.add(dadosAcesso, "primeiroLogin");
        menuParticipante = new MenuParticipantes();
        jPanel1.add(menuParticipante, "menuParticipantes");
        inserirEditarParticipante = new InserirEditarParticipante();
        jPanel1.add(inserirEditarParticipante, "inserirEditarParticipante");
        mostrarParticipante = new MostrarParticipante();
        jPanel1.add(mostrarParticipante, "mostrarParticipante");
        gestaodeViagens = new GestaodeViagens();
        jPanel1.add(gestaodeViagens, "gestaodeViagens");
        visualizarViagens = new VisualizarViagens();
        jPanel1.add(visualizarViagens, "visualizarViagens");
        inserirEditarViagens = new InserirEditarViagens();
        jPanel1.add(inserirEditarViagens, "inserirEditarViagens");
        associarViagens = new AssociarViagens();
        jPanel1.add(associarViagens, "associarViagens");
        gestaodeEtapas = new GestaodeEtapas();
        jPanel1.add(gestaodeEtapas, "gestaodeEtapas");
        inserirEditarEtapa = new InserirEditarEtapa();
        jPanel1.add(inserirEditarEtapa, "inserirEditarEtapa");
        visualizarEtapa = new VisualizarEtapa();
        jPanel1.add(visualizarEtapa, "visualizarEtapa");
        mostrarAlojamento = new MostrarAlojamento();
        jPanel1.add(mostrarAlojamento, "mostrarAlojamento");
        
        login.addLoginEfetuadoListener(this);
        login.addPrimeiroLoginEfetuadoListener(this);
        menuPrincipal.addParticipantesClicadoListener(this);
        menuPrincipal.addAlojamentoClicadoListener(this);
        menuParticipante.addInserirParticipantesClicadoListener(this);
        menuParticipante.addEditarParticipantesClicadoListener(this);
        menuParticipante.addVisualizarParticipantesClicadoListener(this);
        inserirEditarParticipante.addConfirmarClicadoListener(this);
        mostrarParticipante.addConfirmarClicadoListener(this);
        gestaodeAlojamentos.addCriarEditarAlojamentoClicadoListener(this);
        gestaodeAlojamentos.addVisualizarAlojamentoClicadoListener(this);
//        this.gestaodeCenariodeAlojamento.addVisualizarCenarioAlojamentoClicadoListener(this);
//        this.gestaodeCenariodeAlojamento.addCompararCenarioAlojamentoClicadoListener(this);
        menuPrincipal.addViagensListener(this);
        gestaodeViagens.addInserirViagemClicadoListener(this);
        inserirEditarViagens.addConfirmarInsercaoViagensListener(this);
        gestaodeViagens.addVoltarMenuPrincipalListener(this);
//        this.gestaodeViagens.addAssociarViagensClicadoListener(this);
//        this.associarViagens.addConfirmarAssociacaoViagensListener(this);
        menuParticipante.addVoltarMenuPrincipalListener(this);
//        this.gestaodeCenariodeAlojamento.addVoltarMenuCenariosClicadoListener(this);
        menuPrincipal.addEtapasClicadoListener(this);
        gestaodeEtapas.addInserirEtapasClicadoListener(this);
        gestaodeEtapas.addEditarEtapasClicadoListener(this);
//        this.gestaodeEtapas.addVisualizarEtapasClicadoListener(this);
//        this.gestaodeEtapas.addAssociarEtapasClicadoListener(this);
        inserirEditarEtapa.addOkInserirEtapasClicadoListener(this);
//        visualizarEtapa.addOkVisualizarEtapasClicadoListener(this);
//        associarEtapas.addOkAssociarEtapasClicadoListener(this);
        menuPrincipal.addMenuCenariosClicadoListener(this);
        menuCenarios.addGestaoCenarioAlojamentoClicadoListener(this);
//        this.gestaodeCenariodeAlojamento.addInserirCenarioAlojamentoClicadoListener(this);
//        this.gestaodeCenariodeAlojamento.addEditarCenarioAlojamentoClicadoListener(this);
//        this.criarEditarCenarioAlojamento.addOkInserirCenarioAlojamentoClicadoListener(this);
//        this.gestaodeCenariodeAlojamento.addVoltarGestaoCenarioAlojamentoClicadoListener(this);
        gestaodeEtapas.addVoltarMenuPrincipalListener(this);
        criarEditarAlojamento.addConfirmarClicadoAlojamentoListener(this);
//        this.mostrarAlojamento.addConfirmarClicadoAlojamentoistener(this);
        gestaodeAlojamentos.addVoltarMenuPrincipalListener(this);
//        this.mostrarCenarioAlojamento.addOkInserirCenarioAlojamentoClicadoListener(this);
//        this.compararCenarioAlojamento.addOkInserirCenarioAlojamentoClicadoListener(this);
        gestaodeViagens.addVisualizarViagensClicadoListener(this);
        gestaodeViagens.addAssociarViagensClicadoListener(this);
        menuCenarios.addVoltarMenuPrincipalListener(this);
        menuPrincipal.addTerminarSessaoClicadoListener(this);
        criarEditarAlojamento.addAdicionarQuartoClicado(this);
        adicionarQuarto.addConfirmarAdicionarQuartoClicadoListener(this);
        adicionarQuarto.addCancelarAdicionarQuartoClicadoListener(this);
        visualizarViagens.addOkVisualizarViagensClicadoListener(this);
        associarViagens.addConfirmarAssociacaoViagensListener(this);
        visualizarEtapa.addOkVisualizarEtapasClicadoListener(this);
        mostrarAlojamento.addConfirmarClicadoAlojamentoistener(this);
        jPanel1.setPreferredSize(new Dimension(400, 300));
        
        menuCenarios.addVoltarMenuPrincipalListener(this);
        menuPrincipal.addTerminarSessaoClicadoListener(this);
        dadosAcesso.addTerminarSessaoClicadoListener(this);
        inserirEditarViagens.addCancelarInserirEditarViagensClicadoListener(this);
        jPanel1.setPreferredSize(new Dimension(400, 300));
        
        Component[] components = jPanel1.getComponents();
        for (Component component : components) {
            if (component instanceof JPanel) {
                ((JPanel) component).setPreferredSize(new Dimension(400, 300)); //tamanho default do panel
                ((JPanel) component).setMinimumSize(new Dimension(400, 300)); //o tamanho minimo do painel
                ((JPanel) component).setMaximumSize(new Dimension(400, 300)); //o tamanho maximo do painel
            }
        }
//        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
//        cl.show(this.jPanel1, "login");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(640, 480));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(640, 480));
        jPanel1.setMinimumSize(new java.awt.Dimension(640, 480));
        jPanel1.setName(""); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(640, 480));
        jPanel1.setLayout(new java.awt.CardLayout());
        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Windows look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TripPlanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TripPlanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TripPlanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TripPlanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TripPlanner().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void loginEfetuado(LoginEfetuadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "menuPrincipal");
        menuPrincipal.atualizar();
    }
    
    @Override
    public void participantesClicado(ParticipantesClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "menuParticipantes");
    }
    
    @Override
    public void InserirParticipantesClicado(InserirParticipantesClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "inserirEditarParticipante");
    }
    
    @Override
    public void EditarParticipantesClicado(EditarParticipantesClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "inserirEditarParticipante");
    }
    
    @Override
    public void visualizarParticipantesClicado(VisualizarParticipantesClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        mostrarParticipante.preencherCampos(evt.getParticipante());
        cl.show(this.jPanel1, "mostrarParticipante");
    }
    
    @Override
    public void confirmarClicado(ConfirmarClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        menuParticipante.actualizarListaParticipantes();
        cl.show(this.jPanel1, "menuParticipantes");
    }
    
    @Override
    public void criarEditarAlojamentoClicado(CriarEditarAlojamentoClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "criarEditarAlojamento");
    }
    
    @Override
    public void visualizarAlojamentoClicado(VisualizarAlojamentoClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        mostrarAlojamento.preencherCampos(evt.getAlojamento());
        mostrarAlojamento.actualizarListaQuartos();
        cl.show(this.jPanel1, "mostrarAlojamento");
    }
    
    @Override
    public void alojamentosClicado(AlojamentoClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "gestaodeAlojamentos");
    }
    
    @Override
    public void visualizarCenarioAlojamentoClicado(VisualizarCenarioAlojamentoClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "mostrarCenarioAlojamento");
    }
    
    @Override
    public void compararCenarioAlojamentoClicado(CompararCenarioAlojamentoClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "compararCenarioAlojamento");
    }
    
    @Override
    public void viagensClicado(ViagensClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "gestaodeViagens");
    }
    
    @Override
    public void inserirViagemClicado(InserirViagemClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        inserirEditarViagens.actualizarListaEtapas();
        inserirEditarViagens.actualizarListaAlojamentos();
        cl.show(this.jPanel1, "inserirEditarViagens");
    }
    
    @Override
    public void confirmarInsercaoViagens(ConfirmarInsercaoViagensEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        gestaodeViagens.actualizarListaViagens();
        cl.show(this.jPanel1, "gestaodeViagens");
    }
    
    @Override
    public void voltarMenuPrincipal(VoltarMenuPrincipalEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "menuPrincipal");
    }
    
    @Override
    public void associarViagensClicado(AssociarViagensClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        associarViagens.setDados(evt.getViagem());
        cl.show(this.jPanel1, "associarViagens");
    }
    
    @Override
    public void confirmarAssociacaoViagens(ConfirmarAssociacaoViagensEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "gestaodeViagens");
    }
    
    @Override
    public void etapasClicado(EtapasClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "gestaodeEtapas");
    }
    
    @Override
    public void inserirEtapasClicado(InserirEtapasClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "inserirEditarEtapa");
    }
    
    @Override
    public void editarEtapasClicado(EditarEtapasClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "inserirEditarEtapa");
    }
    
    @Override
    public void visualizarEtapasClicado(VisualizarEtapasClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        visualizarEtapa.preencherCampos(evt.getEtapa());
        visualizarEtapa.actualizarListaLocalidades();
        cl.show(this.jPanel1, "visualizarEtapa");
    }
    
    @Override
    public void associarEtapasClicado(AssociarEtapasClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "associarEtapas");
    }
    
    @Override
    public void okInserirEtapasClicado(OkInserirEtapasClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        gestaodeEtapas.actualizarListaEtapas();
        cl.show(this.jPanel1, "gestaodeEtapas");
    }
    
    @Override
    public void okVisualizarEtapasClicado(OkVisualizarEtapasClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "gestaodeEtapas");
    }
    
    @Override
    public void okAssociarEtapasClicado(OkAssociarEtapasClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "gestaodeEtapas");
    }
    
    @Override
    public void gestaoCenarioAlojamentoClicado(GestaoCenarioAlojamentoClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "gestaodeCenariodeAlojamento");
    }
    
    @Override
    public void menuCenariosClicado(MenuCenariosClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "menuCenarios");
    }
    
    @Override
    public void inserirCenarioAlojamentoClicado(InserirCenarioAlojamentoClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "criarEditarCenarioAlojamento");
    }
    
    @Override
    public void editarCenarioAlojamentoClicado(EditarCenarioAlojamentoClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "criarEditarCenarioAlojamento");
    }
    
    @Override
    public void okInserirCenarioAlojamentoClicado(OkInserirCenarioAlojamentoClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "gestaodeCenariodeAlojamento");
    }
    
    @Override
    public void okEditarCenarioAlojamentoClicado(OkEditarCenarioAlojamentoClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "gestaodeCenariodeAlojamento");
    }
    
    @Override
    public void voltarGestaoCenarioAlojamentoClicado(VoltarGestaoCenarioAlojamentoClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "menuCenarios");
    }
    
    @Override
    public void confirmarClicadoAlojamento(ConfirmarClicadoAlojamentoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        gestaodeAlojamentos.actualizarListaAlojamentos();
        cl.show(this.jPanel1, "gestaodeAlojamentos");
    }
    
    @Override
    public void voltarMenuCenariosAlojamentoClicado(VoltarMenuCenariosClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "menuCenarios");
    }
    
    @Override
    public void terminarSessaoClicado(TerminarSessaoClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "login");
    }
    
    @Override
    public void adicionarQuartoClicado(AdicionarQuartoClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "adicionarQuarto");
    }
    
    @Override
    public void confirmarAdicionarQuartoClicado(ConfirmarAdicionarQuartoClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        criarEditarAlojamento.actualizarListaQuartos();
        cl.show(this.jPanel1, "criarEditarAlojamento");
    }
    
    @Override
    public void cancelarAdicionarQuartoClicado(CancelarAdicionarQuartoClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "criarEditarAlojamento");
    }
    
    @Override
    public void primeiroLoginEfetuado(PrimeiroLoginEfetuadoEvent evento) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        dadosAcesso.receberParticipante(evento.getParticipante());
        cl.show(this.jPanel1, "primeiroLogin");
    }

    /* public void visualizarViagensClicado(VisualizarViagensClicadoEvent evt) {
     CardLayout cl = (CardLayout) this.jPanel1.getLayout();
     visualizarViagens.setDad(evt;
     cl.show(this.jPanel1, "menuPrincipal");
     }*/
    @Override
    public void visualizarViagensClicado(VisualizarViagensClicadoEvent evento) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        visualizarViagens.setDados(evento.getViagem());
        cl.show(this.jPanel1, "visualizarViagens");
    }
    
    @Override
    public void cancelarInserirEditarClicado(CancelarInserirEditarViagensClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "gestaodeViagens");
    }

    @Override
    public void okVisualizarViagensClicado(OkVisualizarViagensClicadoEvent evt) {
        CardLayout cl = (CardLayout) this.jPanel1.getLayout();
        cl.show(this.jPanel1, "gestaodeViagens");
    }
}
