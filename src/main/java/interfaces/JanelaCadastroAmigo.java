/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import controle.ControladorCadastroAmigo;
import entidades.Amigo;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author hoffmeister
 */
public class JanelaCadastroAmigo extends javax.swing.JFrame {

    private ControladorCadastroAmigo controlador;
    Amigo[] amigos_cadastrados;
    
    /**
     * Creates new form JanelaCadastroAmigo
     */
    public JanelaCadastroAmigo(ControladorCadastroAmigo controlador) {
        this.controlador = controlador;
        amigos_cadastrados = Amigo.getVisões();
        initComponents();
        this.limparCampos();
    }
    
    public void limparCampos() {
        cpfTextField.setText("");
        nomeTextField.setText("");
        sobrenomeTextField.setText("");
    }
            

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        amigosCadastradosLabel = new javax.swing.JLabel();
        nomeLabel = new javax.swing.JLabel();
        sobrenomeLabel = new javax.swing.JLabel();
        amigosCadastradosComboBox = new javax.swing.JComboBox<>();
        nomeTextField = new javax.swing.JTextField();
        sobrenomeTextField = new javax.swing.JTextField();
        comandosPanel = new javax.swing.JPanel();
        inserirButton = new javax.swing.JButton();
        consultarButton = new javax.swing.JButton();
        alterarButton = new javax.swing.JButton();
        removerButton = new javax.swing.JButton();
        limparButton = new javax.swing.JButton();
        cpfLabel = new javax.swing.JLabel();
        cpfTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        amigosCadastradosLabel.setText("Amigos cadastrados");

        nomeLabel.setText("Nome");

        sobrenomeLabel.setText("Sobrenome");

        amigosCadastradosComboBox.setModel(new DefaultComboBoxModel(amigos_cadastrados));

        inserirButton.setText("Inserir");
        inserirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirAmigo(evt);
            }
        });

        consultarButton.setText("Consultar");
        consultarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarAmigo(evt);
            }
        });

        alterarButton.setText("Alterar");
        alterarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarAmigo(evt);
            }
        });

        removerButton.setText("Remover");
        removerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerAmigo(evt);
            }
        });

        limparButton.setText("Limpar");
        limparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparCampos(evt);
            }
        });

        javax.swing.GroupLayout comandosPanelLayout = new javax.swing.GroupLayout(comandosPanel);
        comandosPanel.setLayout(comandosPanelLayout);
        comandosPanelLayout.setHorizontalGroup(
            comandosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, comandosPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(inserirButton)
                .addGap(18, 18, 18)
                .addComponent(consultarButton)
                .addGap(18, 18, 18)
                .addComponent(alterarButton)
                .addGap(18, 18, 18)
                .addComponent(removerButton)
                .addGap(18, 18, 18)
                .addComponent(limparButton)
                .addContainerGap())
        );
        comandosPanelLayout.setVerticalGroup(
            comandosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comandosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(comandosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inserirButton)
                    .addComponent(consultarButton)
                    .addComponent(alterarButton)
                    .addComponent(removerButton)
                    .addComponent(limparButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cpfLabel.setText("CPF");

        cpfTextField.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amigosCadastradosLabel)
                    .addComponent(cpfLabel)
                    .addComponent(nomeLabel)
                    .addComponent(sobrenomeLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(nomeTextField)
                        .addComponent(sobrenomeTextField))
                    .addComponent(amigosCadastradosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(219, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(comandosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amigosCadastradosLabel)
                    .addComponent(amigosCadastradosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfLabel)
                    .addComponent(cpfTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nomeLabel)
                        .addGap(18, 18, 18)
                        .addComponent(sobrenomeLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sobrenomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(comandosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inserirAmigo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirAmigo
        Amigo amigo = obterAmigoInformado();
        String mensagem_erro = null;
        
        if (amigo != null) mensagem_erro = controlador.inserirAmigo(amigo);
        else mensagem_erro = "Algum atributo do amigo não foi informado";
        
        if(mensagem_erro == null) {
            Amigo[] visões = Amigo.getVisões();
            amigosCadastradosComboBox.setModel(new DefaultComboBoxModel(visões));
            amigosCadastradosComboBox.setSelectedItem(amigo);
        } else informarErro(mensagem_erro);
    }//GEN-LAST:event_inserirAmigo

    private void consultarAmigo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarAmigo
        Amigo visão = (Amigo) amigosCadastradosComboBox.getSelectedItem();
        String mensagem_erro = null;
        Amigo amigo = null;
        if(visão != null) {
            amigo = Amigo.buscarAmigo(visão.getCpf());
            if(amigo == null) mensagem_erro = "Amigo não cadastrado";
        } else mensagem_erro = "Nenhum amigo selecionado";
        if(mensagem_erro == null) {
            cpfTextField.setText(amigo.getCpf());
            nomeTextField.setText(amigo.getNome());
            sobrenomeTextField.setText(amigo.getSobrenome());
        } else informarErro(mensagem_erro);
    }//GEN-LAST:event_consultarAmigo

    private void alterarAmigo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarAmigo
        Amigo amigo = obterAmigoInformado();
        String mensagem_erro = null;
        if(amigo != null) mensagem_erro = controlador.alterarAmigo(amigo);
        else mensagem_erro = "Algum atributo do amigo não foi informado";
        if(mensagem_erro == null) {
            Amigo visão = getVisãoAlterada(amigo.getCpf());
            if (visão != null) {
                visão.setNome(amigo.getNome());
                visão.setSobrenome(amigo.getSobrenome());
                visão.setCpf(amigo.getCpf());
                amigosCadastradosComboBox.updateUI();
                amigosCadastradosComboBox.setSelectedItem(visão);
            }
        }
        else informarErro(mensagem_erro);
    }//GEN-LAST:event_alterarAmigo

    private void removerAmigo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerAmigo
        Amigo visão = (Amigo) amigosCadastradosComboBox.getSelectedItem();
        String mensagem_erro = null;
        if(visão != null) mensagem_erro = controlador.removerAmigo(visão.getCpf());
        else mensagem_erro="Nenhum amigo selecionado";
        if(mensagem_erro == null) {
            amigosCadastradosComboBox.removeItem(visão);
            if (amigos_cadastrados.length >= 1) amigosCadastradosComboBox.setSelectedIndex(0);
            else amigosCadastradosComboBox.setSelectedIndex(-1);
        }
        else informarErro(mensagem_erro);
    }//GEN-LAST:event_removerAmigo

    private void limparCampos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparCampos
        this.limparCampos();
    }//GEN-LAST:event_limparCampos

    private void informarSucesso(String mensagem){
        JOptionPane.showMessageDialog(this, mensagem, "Informação", JOptionPane.INFORMATION_MESSAGE);
    }
                                  
    private void informarErro(String mensagem){
        JOptionPane.showMessageDialog(this, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    }
    
    private Amigo obterAmigoInformado() {
        String nome = nomeTextField.getText();
        if(nome.isEmpty()) return null;
        String sobrenome = sobrenomeTextField.getText();
        if(sobrenome.isEmpty()) sobrenome = null;
        String cpf = cpfTextField.getText();
        if(cpf.isEmpty()) return null;
        return new Amigo(cpf, nome, sobrenome);
    }
    
    private Amigo getVisãoAlterada(String cpf) {
        for (Amigo visão : amigos_cadastrados) {
            if (visão.getCpf().equals(cpf)) return visão;
        }
        return null;
    }
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(JanelaCadastroAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(JanelaCadastroAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(JanelaCadastroAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(JanelaCadastroAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new JanelaCadastroAmigo().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarButton;
    private javax.swing.JComboBox<String> amigosCadastradosComboBox;
    private javax.swing.JLabel amigosCadastradosLabel;
    private javax.swing.JPanel comandosPanel;
    private javax.swing.JButton consultarButton;
    private javax.swing.JLabel cpfLabel;
    private javax.swing.JTextField cpfTextField;
    private javax.swing.JButton inserirButton;
    private javax.swing.JButton limparButton;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JButton removerButton;
    private javax.swing.JLabel sobrenomeLabel;
    private javax.swing.JTextField sobrenomeTextField;
    // End of variables declaration//GEN-END:variables
}
