package interfaces;

import controle.ControladorCadastroPrograma;
import entidades.Programa;
import entidades.Programa.Genero;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class JanelaCadastroPrograma extends javax.swing.JFrame {

    private ControladorCadastroPrograma controlador;
    DefaultListModel modeloListaProgramas;
    
    public JanelaCadastroPrograma(ControladorCadastroPrograma controlador) {
        this.controlador = controlador;
        initComponents();
        inicializarListaPrograma();
        this.limparCampos();
    }
    
    private void inicializarListaPrograma() {
        modeloListaProgramas = (DefaultListModel) programasCadastradosList.getModel();
        Programa[] visoes = Programa.getVisoes();
        for (Programa visao : visoes) modeloListaProgramas.addElement(visao);
    }
    
    private void limparCampos() {
        identificadorTextField.setText("");
        tituloTextField.setText("");        
        generoComboBox.setSelectedIndex(-1);
        diretorTextField.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        identificadorLabel1 = new javax.swing.JLabel();
        identificadorTextField = new javax.swing.JTextField();
        títuloLabel = new javax.swing.JLabel();
        tituloTextField = new javax.swing.JTextField();
        gêneroLabel = new javax.swing.JLabel();
        diretorLabel = new javax.swing.JLabel();
        diretorTextField = new javax.swing.JTextField();
        comandosPanel = new javax.swing.JPanel();
        inserirButton = new javax.swing.JButton();
        consultarButton = new javax.swing.JButton();
        alterarButton = new javax.swing.JButton();
        removerButton = new javax.swing.JButton();
        limparButton = new javax.swing.JButton();
        programasCadastradosLabel = new javax.swing.JLabel();
        filmesCadastradosScroll = new javax.swing.JScrollPane();
        programasCadastradosList = new javax.swing.JList();
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

        tituloTextField.setMinimumSize(new java.awt.Dimension(250, 25));
        tituloTextField.setPreferredSize(new java.awt.Dimension(250, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(tituloTextField, gridBagConstraints);

        gêneroLabel.setText("Gênero");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(gêneroLabel, gridBagConstraints);

        diretorLabel.setText("Diretor");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(diretorLabel, gridBagConstraints);

        diretorTextField.setMinimumSize(new java.awt.Dimension(250, 25));
        diretorTextField.setPreferredSize(new java.awt.Dimension(250, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(diretorTextField, gridBagConstraints);

        inserirButton.setText("Inserir");
        inserirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirPrograma(evt);
            }
        });
        comandosPanel.add(inserirButton);

        consultarButton.setText("Consultar");
        consultarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarPrograma(evt);
            }
        });
        comandosPanel.add(consultarButton);

        alterarButton.setText("Alterar");
        alterarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarPrograma(evt);
            }
        });
        comandosPanel.add(alterarButton);

        removerButton.setText("Remover");
        removerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerPrograma(evt);
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

        programasCadastradosLabel.setText("Programas cadastrados");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(programasCadastradosLabel, gridBagConstraints);

        filmesCadastradosScroll.setMinimumSize(new java.awt.Dimension(350, 50));
        filmesCadastradosScroll.setPreferredSize(new java.awt.Dimension(350, 50));

        programasCadastradosList.setModel(new DefaultListModel());
        programasCadastradosList.setMaximumSize(new java.awt.Dimension(350, 50));
        programasCadastradosList.setMinimumSize(new java.awt.Dimension(350, 50));
        programasCadastradosList.setPreferredSize(new java.awt.Dimension(300, 50));
        filmesCadastradosScroll.setViewportView(programasCadastradosList);

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

    private void inserirPrograma(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirPrograma
        Programa programa = obterProgramaInformado();
        String mensagem_erro = null;
        
        if (programa != null) mensagem_erro = controlador.inserirPrograma(programa);
        else mensagem_erro = "Algum atributo do programa não foi informado";
        
        if (mensagem_erro == null) {
            int identificador = Programa.ultimoIdentificador();
            programa.setIdentificador(identificador);
            modeloListaProgramas.addElement(programa);
            programasCadastradosList.setSelectedIndex(modeloListaProgramas.size()-1);
            identificadorTextField.setText("" + identificador);
        } else informarErro(mensagem_erro);
    }//GEN-LAST:event_inserirPrograma
    
    private void consultarPrograma(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarPrograma
        Programa visão = (Programa) programasCadastradosList.getSelectedValue();
       
        String mensagem_erro = null;
        
        Programa programa = null;
        
        if (visão != null) {
            programa = Programa.buscarPrograma(visão.getIdentificador());
            if(programa == null) mensagem_erro = "programa não cadastrado";
        } else mensagem_erro = "Nenhum programa selecionado";
        
        if (mensagem_erro == null) {
            identificadorTextField.setText(Integer.toString(programa.getIdentificador()));
            tituloTextField.setText(programa.getTitulo());
            generoComboBox.setSelectedItem(programa.getGenero());
            diretorTextField.setText(programa.getDiretor());            
        } else informarErro(mensagem_erro);
    }//GEN-LAST:event_consultarPrograma

    private void alterarPrograma(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarPrograma
        Programa programa = obterProgramaInformado();
        String mensagem_erro = null;
        
        if (programa != null) mensagem_erro = controlador.alterarPrograma(programa);
        else mensagem_erro = "Algum atributo do amigo não foi informado";
        
        if (mensagem_erro == null) {
          Programa visao = (Programa) programasCadastradosList.getSelectedValue();
          if (visao != null) {
              visao.setIdentificador(programa.getIdentificador());
              visao.setTitulo(programa.getTitulo());
              visao.setGenero(programa.getGenero());
              visao.setDiretor(programa.getDiretor());
              programasCadastradosList.updateUI();
          }
        } else informarErro(mensagem_erro);
    }//GEN-LAST:event_alterarPrograma

    private void removerPrograma(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerPrograma
        Programa visao = (Programa) programasCadastradosList.getSelectedValue();
        String mensagem_erro = null;
        
        if (visao != null) mensagem_erro = controlador.removerPrograma(visao.getIdentificador());
        else mensagem_erro = "Identificador de programa não informado";
        
        if (mensagem_erro == null) modeloListaProgramas.removeElement(visao);
        else informarErro(mensagem_erro);
        
        limparCampos();
    }//GEN-LAST:event_removerPrograma

    private void limparCampos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparCampos
        limparCampos();
    }//GEN-LAST:event_limparCampos
    
    private Programa obterProgramaInformado() {
        int identificador = 0;
        
        if (!"".equals(identificadorTextField.getText())) {
            identificador = Integer.parseInt(identificadorTextField.getText());
        }
        
        String título = tituloTextField.getText();
        if (título.isEmpty()) return null;
        
        Genero genero = null;
        if (generoComboBox.getSelectedItem() != null) genero = (Genero) generoComboBox.getSelectedItem();
        else return null;
        
        String diretor = diretorTextField.getText();
        if (diretor.isEmpty()) return null;
        
        return new Programa(identificador, título, genero, diretor);
    }
                                  
    private void informarErro(String mensagem){
        JOptionPane.showMessageDialog(this, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarButton;
    private javax.swing.JPanel comandosPanel;
    private javax.swing.JButton consultarButton;
    private javax.swing.JLabel diretorLabel;
    private javax.swing.JTextField diretorTextField;
    private javax.swing.JScrollPane filmesCadastradosScroll;
    private javax.swing.JComboBox<String> generoComboBox;
    private javax.swing.JLabel gêneroLabel;
    private javax.swing.JLabel identificadorLabel1;
    private javax.swing.JTextField identificadorTextField;
    private javax.swing.JButton inserirButton;
    private javax.swing.JButton limparButton;
    private javax.swing.JLabel programasCadastradosLabel;
    private javax.swing.JList programasCadastradosList;
    private javax.swing.JButton removerButton;
    private javax.swing.JTextField tituloTextField;
    private javax.swing.JLabel títuloLabel;
    // End of variables declaration//GEN-END:variables
}