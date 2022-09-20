package interfaces;

import controle.ControladorCadastroFilme;
import entidades.Filme;
import entidades.Filme.Genero;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class JanelaCadastroFilme extends javax.swing.JFrame {

    private ControladorCadastroFilme controlador;
    DefaultListModel modeloListaFilmes;
    
    public JanelaCadastroFilme(ControladorCadastroFilme controlador) {
        this.controlador = controlador;
        initComponents();
        inicializarListaFilmes();
        this.limparCampos();
    }
    
    private void inicializarListaFilmes() {
        modeloListaFilmes = (DefaultListModel) filmesCadastradosList.getModel();
        Filme[] visoes = Filme.getVisoes();
        for (Filme visao : visoes) modeloListaFilmes.addElement(visao);
    }
    
    private void limparCampos() {
        identificadorTextField.setText("");
        títuloTextField.setText("");        
        generoComboBox.setSelectedIndex(-1);
        nomeDoDiretorTextField.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        identificadorLabel1 = new javax.swing.JLabel();
        identificadorTextField = new javax.swing.JTextField();
        títuloLabel = new javax.swing.JLabel();
        títuloTextField = new javax.swing.JTextField();
        gêneroLabel = new javax.swing.JLabel();
        nomeDoDiretorLabel = new javax.swing.JLabel();
        nomeDoDiretorTextField = new javax.swing.JTextField();
        comandosPanel = new javax.swing.JPanel();
        inserirButton = new javax.swing.JButton();
        consultarButton = new javax.swing.JButton();
        alterarButton = new javax.swing.JButton();
        removerButton = new javax.swing.JButton();
        limparButton = new javax.swing.JButton();
        filmesCadastradosLabel = new javax.swing.JLabel();
        filmesCadastradosScroll = new javax.swing.JScrollPane();
        filmesCadastradosList = new javax.swing.JList();
        generoComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Filmes");
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        identificadorLabel1.setText("Identificador");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(identificadorLabel1, gridBagConstraints);

        identificadorTextField.setEditable(false);
        identificadorTextField.setMinimumSize(new java.awt.Dimension(100, 25));
        identificadorTextField.setPreferredSize(new java.awt.Dimension(100, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(identificadorTextField, gridBagConstraints);

        títuloLabel.setText("Título");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(títuloLabel, gridBagConstraints);

        títuloTextField.setMinimumSize(new java.awt.Dimension(250, 25));
        títuloTextField.setPreferredSize(new java.awt.Dimension(250, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(títuloTextField, gridBagConstraints);

        gêneroLabel.setText("Gênero");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(gêneroLabel, gridBagConstraints);

        nomeDoDiretorLabel.setText("Nome do diretor");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(nomeDoDiretorLabel, gridBagConstraints);

        nomeDoDiretorTextField.setMinimumSize(new java.awt.Dimension(250, 25));
        nomeDoDiretorTextField.setPreferredSize(new java.awt.Dimension(250, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(nomeDoDiretorTextField, gridBagConstraints);

        inserirButton.setText("Inserir");
        inserirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirFilme(evt);
            }
        });
        comandosPanel.add(inserirButton);

        consultarButton.setText("Consultar");
        consultarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarFilme(evt);
            }
        });
        comandosPanel.add(consultarButton);

        alterarButton.setText("Alterar");
        alterarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarFilme(evt);
            }
        });
        comandosPanel.add(alterarButton);

        removerButton.setText("Remover");
        removerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerFilme(evt);
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
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(comandosPanel, gridBagConstraints);

        filmesCadastradosLabel.setText("Filmes cadastrados");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(filmesCadastradosLabel, gridBagConstraints);

        filmesCadastradosScroll.setMinimumSize(new java.awt.Dimension(350, 50));
        filmesCadastradosScroll.setPreferredSize(new java.awt.Dimension(350, 50));

        filmesCadastradosList.setModel(new DefaultListModel());
        filmesCadastradosList.setMaximumSize(new java.awt.Dimension(350, 50));
        filmesCadastradosList.setMinimumSize(new java.awt.Dimension(350, 50));
        filmesCadastradosList.setPreferredSize(new java.awt.Dimension(300, 50));
        filmesCadastradosScroll.setViewportView(filmesCadastradosList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(filmesCadastradosScroll, gridBagConstraints);

        generoComboBox.setModel(new DefaultComboBoxModel(Genero.values()));
        generoComboBox.setMinimumSize(new java.awt.Dimension(100, 25));
        generoComboBox.setPreferredSize(new java.awt.Dimension(100, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(generoComboBox, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inserirFilme(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirFilme
        Filme filme = obterFilmeInformado();
        String mensagem_erro = null;
        
        if (filme != null) mensagem_erro = controlador.inserirFilme(filme);
        else mensagem_erro = "Algum atributo do filme não foi informado";
        
        if (mensagem_erro == null) {
            int identificador = Filme.ultimoIdentificador();
            filme.setIdentificador(identificador);
            modeloListaFilmes.addElement(filme);
            filmesCadastradosList.setSelectedIndex(modeloListaFilmes.size()-1);
            identificadorTextField.setText("" + identificador);
        } else informarErro(mensagem_erro);
    }//GEN-LAST:event_inserirFilme
    
    private void consultarFilme(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarFilme
        Filme visão = (Filme) filmesCadastradosList.getSelectedValue();
       
        String mensagem_erro = null;
        
        Filme filme = null;
        
        if (visão != null) {
            filme = Filme.buscarFilme(visão.getIdentificador());
            if(filme == null) mensagem_erro = "Filme não cadastrado";
        } else mensagem_erro = "Nenhum filme selecionado";
        
        if (mensagem_erro == null) {
            identificadorTextField.setText(Integer.toString(filme.getIdentificador()));
            títuloTextField.setText(filme.getTitulo());
            generoComboBox.setSelectedItem(filme.getGenero());
            nomeDoDiretorTextField.setText(filme.getNomeDiretor());            
        } else informarErro(mensagem_erro);
    }//GEN-LAST:event_consultarFilme

    private void alterarFilme(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarFilme
        Filme filme = obterFilmeInformado();
        String mensagem_erro = null;
        
        if (filme != null) mensagem_erro = controlador.alterarFilme(filme);
        else mensagem_erro = "Algum atributo do amigo não foi informado";
        
        if (mensagem_erro == null) {
          Filme visao = (Filme) filmesCadastradosList.getSelectedValue();
          if (visao != null) {
              visao.setIdentificador(filme.getIdentificador());
              visao.setTitulo(filme.getTitulo());
              visao.setGenero(filme.getGenero());
              visao.setNomeDiretor(filme.getNomeDiretor());
              filmesCadastradosList.updateUI();
          }
        } else informarErro(mensagem_erro);
    }//GEN-LAST:event_alterarFilme

    private void removerFilme(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerFilme
        Filme visao = (Filme) filmesCadastradosList.getSelectedValue();
        String mensagem_erro = null;
        
        if (visao != null) mensagem_erro = controlador.removerFilme(visao.getIdentificador());
        else mensagem_erro = "Identificador de filme não informado";
        
        if (mensagem_erro == null) modeloListaFilmes.removeElement(visao);
        else informarErro(mensagem_erro);
        
        limparCampos();
    }//GEN-LAST:event_removerFilme

    private void limparCampos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparCampos
        limparCampos();
    }//GEN-LAST:event_limparCampos
    
    private Filme obterFilmeInformado() {
        int identificador = 0;
        
        if (!"".equals(identificadorTextField.getText())) {
            identificador = Integer.parseInt(identificadorTextField.getText());
        }
        
        String título = títuloTextField.getText();
        if (título.isEmpty()) return null;
        
        Genero genero = null;
        if (generoComboBox.getSelectedItem() != null) genero = (Genero) generoComboBox.getSelectedItem();
        else return null;
        
        String nomeDoDiretor = nomeDoDiretorTextField.getText();
        if (nomeDoDiretor.isEmpty()) return null;
        
        return new Filme(identificador, título, genero, nomeDoDiretor);
    }
    
    private void informarSucesso(String mensagem){
        JOptionPane.showMessageDialog(this, mensagem, "Informação", JOptionPane.INFORMATION_MESSAGE);
    }
                                  
    private void informarErro(String mensagem){
        JOptionPane.showMessageDialog(this, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarButton;
    private javax.swing.JPanel comandosPanel;
    private javax.swing.JButton consultarButton;
    private javax.swing.JLabel filmesCadastradosLabel;
    private javax.swing.JList filmesCadastradosList;
    private javax.swing.JScrollPane filmesCadastradosScroll;
    private javax.swing.JComboBox<String> generoComboBox;
    private javax.swing.JLabel gêneroLabel;
    private javax.swing.JLabel identificadorLabel1;
    private javax.swing.JTextField identificadorTextField;
    private javax.swing.JButton inserirButton;
    private javax.swing.JButton limparButton;
    private javax.swing.JLabel nomeDoDiretorLabel;
    private javax.swing.JTextField nomeDoDiretorTextField;
    private javax.swing.JButton removerButton;
    private javax.swing.JLabel títuloLabel;
    private javax.swing.JTextField títuloTextField;
    // End of variables declaration//GEN-END:variables
}
