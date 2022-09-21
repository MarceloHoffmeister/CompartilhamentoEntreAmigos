package interfaces;

import controle.ControladorCadastroAmigo;
import controle.ControladorCadastroPrograma;
import persistência.BD;

public class JanelaCompartilhamentoEntreAmigos extends javax.swing.JFrame {

    public JanelaCompartilhamentoEntreAmigos() {
        BD.criaConexão();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        movieManagerMenuBar = new javax.swing.JMenuBar();
        registroFilme = new javax.swing.JMenu();
        cadastrarFilme = new javax.swing.JMenuItem();
        registroAmigo = new javax.swing.JMenu();
        buscaMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Compartilhamento entre amigos");
        setLocation(new java.awt.Point(50, 300));
        setMinimumSize(new java.awt.Dimension(300, 200));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                terminarSistema(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        registroFilme.setText("Programa");

        cadastrarFilme.setText("Cadastrar");
        cadastrarFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarFilme(evt);
            }
        });
        registroFilme.add(cadastrarFilme);

        movieManagerMenuBar.add(registroFilme);

        registroAmigo.setText("Amigo");

        buscaMenuItem.setText("Cadastrar");
        buscaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarAmigo(evt);
            }
        });
        registroAmigo.add(buscaMenuItem);

        movieManagerMenuBar.add(registroAmigo);

        setJMenuBar(movieManagerMenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarFilme(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarFilme
        new ControladorCadastroPrograma();
    }//GEN-LAST:event_registrarFilme

    private void terminarSistema(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_terminarSistema
        BD.fechaConexão();
        System.exit(0);
    }//GEN-LAST:event_terminarSistema

    private void registrarAmigo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarAmigo
        new ControladorCadastroAmigo();
    }//GEN-LAST:event_registrarAmigo
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaCompartilhamentoEntreAmigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaCompartilhamentoEntreAmigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaCompartilhamentoEntreAmigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaCompartilhamentoEntreAmigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaCompartilhamentoEntreAmigos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem buscaMenuItem;
    private javax.swing.JMenuItem cadastrarFilme;
    private javax.swing.JMenuBar movieManagerMenuBar;
    private javax.swing.JMenu registroAmigo;
    private javax.swing.JMenu registroFilme;
    // End of variables declaration//GEN-END:variables
}
