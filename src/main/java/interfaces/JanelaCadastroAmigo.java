package interfaces;

import controle.ControladorCadastroAmigo;
import entidades.Amigo;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class JanelaCadastroAmigo extends javax.swing.JFrame {

    private ControladorCadastroAmigo controlador;
    Amigo[] amigos_cadastrados;
    
    /**
     * Creates new form JanelaCadastroAmigo
     */
    public JanelaCadastroAmigo(ControladorCadastroAmigo controlador) {
        this.controlador = controlador;
        amigos_cadastrados = Amigo.getVisoes();
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
        java.awt.GridBagConstraints gridBagConstraints;

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
        getContentPane().setLayout(new java.awt.GridBagLayout());

        amigosCadastradosLabel.setText("Amigos cadastrados");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(amigosCadastradosLabel, gridBagConstraints);

        nomeLabel.setText("Nome");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(nomeLabel, gridBagConstraints);

        sobrenomeLabel.setText("Sobrenome");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(sobrenomeLabel, gridBagConstraints);

        amigosCadastradosComboBox.setModel(new DefaultComboBoxModel(amigos_cadastrados));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(amigosCadastradosComboBox, gridBagConstraints);

        nomeTextField.setColumns(20);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(nomeTextField, gridBagConstraints);

        sobrenomeTextField.setColumns(20);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(sobrenomeTextField, gridBagConstraints);

        inserirButton.setText("Inserir");
        inserirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirAmigo(evt);
            }
        });
        comandosPanel.add(inserirButton);

        consultarButton.setText("Consultar");
        consultarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarAmigo(evt);
            }
        });
        comandosPanel.add(consultarButton);

        alterarButton.setText("Alterar");
        alterarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarAmigo(evt);
            }
        });
        comandosPanel.add(alterarButton);

        removerButton.setText("Remover");
        removerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerAmigo(evt);
            }
        });
        comandosPanel.add(removerButton);

        limparButton.setText("Limpar");
        limparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparCampos(evt);
            }
        });
        comandosPanel.add(limparButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(comandosPanel, gridBagConstraints);

        cpfLabel.setText("CPF");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(cpfLabel, gridBagConstraints);

        cpfTextField.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(cpfTextField, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inserirAmigo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirAmigo
        Amigo amigo = obterAmigoInformado();
        String mensagem_erro = null;
        
        if (amigo != null) mensagem_erro = controlador.inserirAmigo(amigo);
        else mensagem_erro = "Algum atributo do amigo não foi informado";
        
        if (mensagem_erro == null) {
            Amigo[] visões = Amigo.getVisoes();
            amigosCadastradosComboBox.setModel(new DefaultComboBoxModel(visões));
            amigosCadastradosComboBox.setSelectedItem(amigo);
        } else informarErro(mensagem_erro);
    }//GEN-LAST:event_inserirAmigo

    private void consultarAmigo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarAmigo
        Amigo visão = (Amigo) amigosCadastradosComboBox.getSelectedItem();
        
        String mensagem_erro = null;
        
        Amigo amigo = null;
        
        if (visão != null) {
            amigo = Amigo.buscarAmigo(visão.getCpf());
            if(amigo == null) mensagem_erro = "Amigo não cadastrado";
        } else mensagem_erro = "Nenhum amigo selecionado";
        
        if (mensagem_erro == null) {
            cpfTextField.setText(amigo.getCpf());
            nomeTextField.setText(amigo.getNome());
            sobrenomeTextField.setText(amigo.getSobrenome());
        } else informarErro(mensagem_erro);
    }//GEN-LAST:event_consultarAmigo

    private void alterarAmigo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarAmigo
        Amigo amigo = obterAmigoInformado();
        
        String mensagem_erro = null;
        
        if (amigo != null) mensagem_erro = controlador.alterarAmigo(amigo);
        else mensagem_erro = "Algum atributo do amigo não foi informado";
        
        if (mensagem_erro == null) {
            Amigo visão = getVisãoAlterada(amigo.getCpf());
            
            if (visão != null) {
                visão.setNome(amigo.getNome());
                visão.setSobrenome(amigo.getSobrenome());
                visão.setCpf(amigo.getCpf());
                amigosCadastradosComboBox.updateUI();
                amigosCadastradosComboBox.setSelectedItem(visão);
            }
        } else informarErro(mensagem_erro);
    }//GEN-LAST:event_alterarAmigo

    private void removerAmigo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerAmigo
        Amigo visão = (Amigo) amigosCadastradosComboBox.getSelectedItem();
        
        String mensagem_erro = null;
        
        if (visão != null) mensagem_erro = controlador.removerAmigo(visão.getCpf());
        else mensagem_erro="Nenhum amigo selecionado";
        
        if (mensagem_erro == null) {
            amigosCadastradosComboBox.removeItem(visão);
            
            if (amigos_cadastrados.length >= 1) amigosCadastradosComboBox.setSelectedIndex(0);
            else amigosCadastradosComboBox.setSelectedIndex(-1);
        } else informarErro(mensagem_erro);
    }//GEN-LAST:event_removerAmigo

    private void limparCampos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparCampos
        this.limparCampos();
    }//GEN-LAST:event_limparCampos
                                  
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
