package entregafinal;
//Nome: Luis Felipe Pizzi Lopes - RA: 2503522

import javax.swing.JOptionPane;

public class FrameCachorros extends javax.swing.JFrame {
    
    private static FrameCachorros frameCachorros; 
    
    private FrameCachorros() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public static FrameCachorros getFrameCachorros(){
        if(frameCachorros == null){
            frameCachorros = new FrameCachorros();
            return frameCachorros; 
        }
        return frameCachorros; 
    }
    
    private BDAnimais cadastroAnimais = BDAnimais.getCadastroAnimais(); 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtField_DataCadastro = new javax.swing.JTextField();
        lblIdade = new javax.swing.JLabel();
        txtField_NomeDono = new javax.swing.JTextField();
        lblRaca = new javax.swing.JLabel();
        txtField_Idade = new javax.swing.JTextField();
        lblDataCadastro = new javax.swing.JLabel();
        txtField_Porte = new javax.swing.JTextField();
        txtField_Raca = new javax.swing.JTextField();
        lblPorte = new javax.swing.JLabel();
        lblNomeDono = new javax.swing.JLabel();
        txtField_Cpf = new javax.swing.JTextField();
        txtField_Nome = new javax.swing.JTextField();
        txtField_Rua = new javax.swing.JTextField();
        txtField_Bairro = new javax.swing.JTextField();
        txtField_NumeroCasa = new javax.swing.JTextField();
        lblCpf = new javax.swing.JLabel();
        lblRua = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        btnAdicionar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        lblBusca = new javax.swing.JLabel();
        txtField_Busca = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnRelatorio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitulo.setText("Cadastro de Cachorros");

        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNome.setText("Nome do cachorro:");

        txtField_DataCadastro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtField_DataCadastroKeyTyped(evt);
            }
        });

        lblIdade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblIdade.setText("Idade do cachorro:");

        lblRaca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRaca.setText("Raça do cachorro:");

        txtField_Idade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtField_IdadeKeyTyped(evt);
            }
        });

        lblDataCadastro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDataCadastro.setText("Data de cadastro: ");

        lblPorte.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPorte.setText("Porte do cachorro:");

        lblNomeDono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNomeDono.setText("Nome do dono:");

        txtField_NumeroCasa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtField_NumeroCasaKeyTyped(evt);
            }
        });

        lblCpf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCpf.setText("CPF: ");

        lblRua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRua.setText("Nome da Rua: ");

        lblBairro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblBairro.setText("Nome do bairro:");

        lblNumero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNumero.setText("Número da casa: ");

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblBusca.setText("Buscar por nome: ");

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnRelatorio.setText("Relatório completo de cadastros");
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBusca)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtField_Busca, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtField_Raca, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblPorte, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtField_DataCadastro, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblDataCadastro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblRaca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblIdade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtField_Idade, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtField_Porte, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtField_Nome, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRua, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBairro)
                            .addComponent(lblNumero)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnAdicionar)
                                .addComponent(btnRelatorio)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtField_NomeDono)
                                        .addComponent(lblNomeDono, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtField_Cpf)
                                        .addComponent(txtField_Rua)
                                        .addComponent(txtField_Bairro)
                                        .addComponent(txtField_NumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNomeDono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtField_NomeDono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCpf)
                        .addGap(8, 8, 8)
                        .addComponent(txtField_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtField_Rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblBairro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtField_Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNumero)
                        .addGap(7, 7, 7)
                        .addComponent(txtField_NumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblNome)
                                .addGap(34, 34, 34)
                                .addComponent(lblIdade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtField_Idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(txtField_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRaca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtField_Raca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDataCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtField_DataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPorte)
                        .addGap(7, 7, 7)
                        .addComponent(txtField_Porte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdicionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBusca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtField_Busca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir)
                    .addComponent(btnRelatorio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        adicionar(); 
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        editar(); 
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        excluir();  
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        RelatorioCachorros relatorio = RelatorioCachorros.getRelatorioCachorros();
        relatorio.listarTabela();
        relatorio.show();
    }//GEN-LAST:event_btnRelatorioActionPerformed

    private void txtField_IdadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtField_IdadeKeyTyped
        apenasNumeros(evt); 
    }//GEN-LAST:event_txtField_IdadeKeyTyped

    private void txtField_DataCadastroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtField_DataCadastroKeyTyped
        String charValidos = "0123456789/"; 
        if(!charValidos.contains(evt.getKeyChar() + "")){
            evt.consume();
        }
    }//GEN-LAST:event_txtField_DataCadastroKeyTyped

    private void txtField_NumeroCasaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtField_NumeroCasaKeyTyped
        apenasNumeros(evt); 
    }//GEN-LAST:event_txtField_NumeroCasaKeyTyped
    
    public void adicionar(){
        try{
            Cachorro cachorro = new Cachorro();
            receberValores(cachorro); 
            if(cadastroAnimais.buscarCachorro(cachorro.getNome()) == null){
                if(validarCampos() == true){
                    cadastroAnimais.adicionarCachorro(cachorro);
                    apagarCampos(); 
                    JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!", "Atenção", 1);
                }else{
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos e tente novamente!", "Atenção", 1);
                }
            } else{
                JOptionPane.showMessageDialog(null, "Já existe um cadastro com esse nome na base de dados, tente novamente!", "Atenção", 1);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Verifique todos os campos e tente novamente!", "Atenção", 1); 
        }
    }
    
    public void editar(){
        try{
            Cachorro cachorro = cadastroAnimais.buscarCachorro(txtField_Busca.getText()); 
            if(cachorro != null){
                if(validarCampos() == true){
                    receberValores(cachorro); 
                    apagarCampos(); 
                    txtField_Busca.setText(""); 
                    JOptionPane.showMessageDialog(null, "Edição feita com sucesso!", "Atenção", 1);
                }else{
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos e tente novamente!", "Atenção", 1);
                }
            }else{
                 JOptionPane.showMessageDialog(null, "Não foi possível localizar um cadastro com o nome informado!", "Atenção!", 1); 
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Não foi possível realizar a edição!", "Atenção!", 1); 
        }
    }
    
    public void buscar(){
        Cachorro cachorro = cadastroAnimais.buscarCachorro(txtField_Busca.getText());
        if(cachorro != null){
            atribuirValores(cachorro);
            JOptionPane.showMessageDialog(null, "Busca realizada com sucesso!", "Atenção", 1);
        } else{
            JOptionPane.showMessageDialog(null, "Não foi possível localizar um cadastro com o nome informado!", "Atenção!", 1); 
        }
    }
    
    public void excluir(){
        Cachorro cachorro = cadastroAnimais.buscarCachorro(txtField_Busca.getText()); 
        if(cachorro != null){
            cadastroAnimais.excluirCachorro(cachorro);
            JOptionPane.showMessageDialog(null, "Cadastro excluido com sucesso!", "Atenção", 1);
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possível localizar um cadastro com o nome informado!", "Atenção", 1); 
        }
    }
    
    public void receberValores(Cachorro cachorro){
        cachorro.setNome(txtField_Nome.getText());
        cachorro.setIdade(Integer.parseInt(txtField_Idade.getText()));
        cachorro.setPorte(txtField_Porte.getText());
        cachorro.setRacaCachorro(txtField_Raca.getText()); 
        cachorro.setEspecie("Canina");
        cachorro.setDataCadastro(txtField_DataCadastro.getText());
        cachorro.getDonoDoAnimal().setNome(txtField_NomeDono.getText());
        cachorro.getDonoDoAnimal().getEndereco().setRua(txtField_Rua.getText());
        cachorro.getDonoDoAnimal().getEndereco().setBairro(txtField_Bairro.getText());
        try{
            cachorro.getDonoDoAnimal().setCpf(txtField_Cpf.getText());
        }catch(CpfException ce){
            ce.messErro();
            ce.corrigirCpf(cachorro.getDonoDoAnimal()); 
        }
        try{
            cachorro.getDonoDoAnimal().getEndereco().setNumero(Integer.parseInt(txtField_NumeroCasa.getText()));
        }catch(NumeroException ne){
            ne.messErro();
            ne.corrigirNumCasa(cachorro.getDonoDoAnimal().getEndereco());
        }
    }
    
    public void atribuirValores(Cachorro cachorro){
        txtField_Nome.setText(cachorro.getNome()); 
        txtField_Idade.setText(Integer.toString(cachorro.getIdade())); 
        txtField_Porte.setText(cachorro.getPorte()); 
        txtField_Raca.setText(cachorro.getRacaCachorro()); 
        txtField_DataCadastro.setText(cachorro.getDataCadastro()); 
        txtField_NomeDono.setText(cachorro.getDonoDoAnimal().getNome());
        txtField_Cpf.setText(cachorro.getDonoDoAnimal().getCpf());
        txtField_Rua.setText(cachorro.getDonoDoAnimal().getEndereco().getRua()); 
        txtField_Bairro.setText(cachorro.getDonoDoAnimal().getEndereco().getBairro()); 
        txtField_NumeroCasa.setText(Integer.toString(cachorro.getDonoDoAnimal().getEndereco().getNumero())); 
    }
    
    public void apagarCampos(){
        txtField_Nome.setText(""); 
        txtField_Idade.setText(""); 
        txtField_Porte.setText(""); 
        txtField_Raca.setText(""); 
        txtField_DataCadastro.setText(""); 
        txtField_NomeDono.setText("");
        txtField_Cpf.setText("");
        txtField_Rua.setText(""); 
        txtField_Bairro.setText(""); 
        txtField_NumeroCasa.setText(""); 
    }
    
    public boolean validarCampos(){
        if(txtField_Nome.getText().equals("") || txtField_Idade.getText().equals("") ||
                        txtField_DataCadastro.getText().equals("") || txtField_Porte.getText().equals("") ||
                        txtField_Raca.getText().equals("") || txtField_NomeDono.getText().equals("") || 
                        txtField_Cpf.getText().equals("") || txtField_Bairro.getText().equals("") ||
                        txtField_NumeroCasa.getText().equals("") || txtField_Rua.getText().equals(""))
        {
            return false; 
        }else{
            return true; 
        }
    }
    
    public void apenasNumeros(java.awt.event.KeyEvent evt){
        String charValidos = "0123456789"; 
        if(!charValidos.contains(evt.getKeyChar() + "")){
            evt.consume(); 
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblBusca;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblDataCadastro;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeDono;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblPorte;
    private javax.swing.JLabel lblRaca;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtField_Bairro;
    private javax.swing.JTextField txtField_Busca;
    private javax.swing.JTextField txtField_Cpf;
    private javax.swing.JTextField txtField_DataCadastro;
    private javax.swing.JTextField txtField_Idade;
    private javax.swing.JTextField txtField_Nome;
    private javax.swing.JTextField txtField_NomeDono;
    private javax.swing.JTextField txtField_NumeroCasa;
    private javax.swing.JTextField txtField_Porte;
    private javax.swing.JTextField txtField_Raca;
    private javax.swing.JTextField txtField_Rua;
    // End of variables declaration//GEN-END:variables
}
