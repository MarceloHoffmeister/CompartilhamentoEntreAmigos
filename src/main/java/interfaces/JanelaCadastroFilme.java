package interfaces;

import controle.ControladorCadastroFilme;
import entidades.Filme;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class JanelaCadastroFilme extends javax.swing.JFrame {

    private ControladorCadastroFilme controlador;
    Filme[] filmes_cadastrados;
    
    public JanelaCadastroFilme(ControladorCadastroFilme controlador) {
        this.controlador = controlador;
        filmes_cadastrados = Filme.getVisões();
        initComponents();
        this.limparCampos();
    }
    
    private void limparCampos() {
        identificadorTextField.setText("");
        títuloTextField.setText("");        
        gêneroTextField.setText("");
        nomeDoDiretorTextField.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        identificadorLabel1 = new javax.swing.JLabel();
        identificadorTextField = new javax.swing.JTextField();
        títuloLabel = new javax.swing.JLabel();
        títuloTextField = new javax.swing.JTextField();
        gêneroLabel = new javax.swing.JLabel();
        gêneroTextField = new javax.swing.JTextField();
        nomeDoDiretorLabel = new javax.swing.JLabel();
        nomeDoDiretorTextField = new javax.swing.JTextField();
        comandosPanel = new javax.swing.JPanel();
        inserirButton = new javax.swing.JButton();
        consultarButton = new javax.swing.JButton();
        alterarButton = new javax.swing.JButton();
        removerButton = new javax.swing.JButton();
        limparButton = new javax.swing.JButton();
        filmesCadastradosComboBox = new javax.swing.JComboBox<>();
        filmesCadastradosLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Filmes");
        setResizable(false);

        identificadorLabel1.setText("Identificador");

        identificadorTextField.setEditable(false);
        identificadorTextField.setColumns(5);

        títuloLabel.setText("Título");

        títuloTextField.setColumns(30);

        gêneroLabel.setText("Gênero");

        gêneroTextField.setColumns(10);

        nomeDoDiretorLabel.setText("Nome do diretor");

        nomeDoDiretorTextField.setColumns(30);

        inserirButton.setText("Inserir");
        inserirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirFilme(evt);
            }
        });

        consultarButton.setText("Consultar");
        consultarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarFilme(evt);
            }
        });

        alterarButton.setText("Alterar");
        alterarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarFilme(evt);
            }
        });

        removerButton.setText("Remover");
        removerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerFilme(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consultarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alterarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removerButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(limparButton)
                .addContainerGap())
        );
        comandosPanelLayout.setVerticalGroup(
            comandosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, comandosPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(comandosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inserirButton)
                    .addComponent(consultarButton)
                    .addComponent(alterarButton)
                    .addComponent(removerButton)
                    .addComponent(limparButton))
                .addContainerGap())
        );

        filmesCadastradosComboBox.setModel(new DefaultComboBoxModel(filmes_cadastrados));

        filmesCadastradosLabel.setText("Filmes cadastrados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(títuloLabel)
                .addGap(5, 5, 5)
                .addComponent(títuloTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(gêneroLabel)
                .addGap(5, 5, 5)
                .addComponent(gêneroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(identificadorLabel1)
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(filmesCadastradosLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(identificadorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filmesCadastradosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(nomeDoDiretorLabel)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comandosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeDoDiretorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filmesCadastradosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filmesCadastradosLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(identificadorLabel1))
                    .addComponent(identificadorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(títuloLabel))
                    .addComponent(títuloTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(gêneroLabel))
                    .addComponent(gêneroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(nomeDoDiretorLabel))
                    .addComponent(nomeDoDiretorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(comandosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inserirFilme(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirFilme
        Filme filme = obterFilmeInformado();
        String mensagem_erro = null;
        
        if (filme != null) mensagem_erro = controlador.inserirFilme(filme);
        else mensagem_erro = "Algum atributo do filme não foi informado";
        
        if(mensagem_erro == null) {
            Filme[] visões = Filme.getVisões();
            filmesCadastradosComboBox.setModel(new DefaultComboBoxModel(visões));
            filmesCadastradosComboBox.setSelectedItem(filme);
        } else informarErro(mensagem_erro);
    }//GEN-LAST:event_inserirFilme

    private void consultarFilme(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarFilme
        Filme visão = (Filme) filmesCadastradosComboBox.getSelectedItem();
        String mensagem_erro = null;
        Filme filme = null;
        if(visão != null) {
            filme = Filme.buscarFilme(visão.getIdentificador());
            if(filme == null) mensagem_erro = "Filme não cadastrado";
        } else mensagem_erro = "Nenhum filme selecionado";
        
        if (mensagem_erro == null) {
            identificadorTextField.setText(Integer.toString(filme.getIdentificador()));
            títuloTextField.setText(filme.getTitulo());
            gêneroTextField.setText(filme.getGenero());
            nomeDoDiretorTextField.setText(filme.getNomeDiretor());            
        } else informarErro(mensagem_erro);
    }//GEN-LAST:event_consultarFilme

    private void alterarFilme(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarFilme
        Filme filme = obterFilmeInformado();
        String mensagem_erro = null;
        
        if (filme != null) mensagem_erro = controlador.alterarFilme(filme);
        else mensagem_erro = "Algum atributo do amigo não foi informado";
        
        if (mensagem_erro == null) informarSucesso("Alteração bem sucedida");
        else informarErro(mensagem_erro);
    }//GEN-LAST:event_alterarFilme

    private void removerFilme(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerFilme
        Filme visão = (Filme) filmesCadastradosComboBox.getSelectedItem();
        String mensagem_erro = null;
        
        if(visão != null) mensagem_erro = controlador.removerFilme(visão.getIdentificador());
        else mensagem_erro = "Identificador de filme não informado";
        
        if (mensagem_erro == null) informarSucesso("Remoção bem sucedida");
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
        
        String gênero = gêneroTextField.getText();
        if (gênero.isEmpty()) return null;
        
        String nomeDoDiretor = nomeDoDiretorTextField.getText();
        if (nomeDoDiretor.isEmpty()) return null;
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyy", Locale.ENGLISH);
        
        return new Filme(identificador, título, gênero, nomeDoDiretor);
    }
    
    private void informarSucesso(String mensagem){
        JOptionPane.showMessageDialog(this, mensagem, "Informação", JOptionPane.INFORMATION_MESSAGE);
    }
                                  
    private void informarErro(String mensagem){
        JOptionPane.showMessageDialog(this, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    }
    
    private Filme getVisãoAlterada(int identificador) {
        for (Filme visão : filmes_cadastrados) {
            if (visão.getIdentificador() == identificador) return visão;
        }
        return null;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarButton;
    private javax.swing.JPanel comandosPanel;
    private javax.swing.JButton consultarButton;
    private javax.swing.JComboBox<String> filmesCadastradosComboBox;
    private javax.swing.JLabel filmesCadastradosLabel;
    private javax.swing.JLabel gêneroLabel;
    private javax.swing.JTextField gêneroTextField;
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
