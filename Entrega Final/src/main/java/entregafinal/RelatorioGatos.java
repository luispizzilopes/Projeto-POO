package entregafinal;
//Nome: Luis Felipe Pizzi Lopes - RA: 2503522

import javax.swing.table.DefaultTableModel;


public class RelatorioGatos extends javax.swing.JFrame {

    private BDAnimais cadastroAnimais = BDAnimais.getCadastroAnimais();
    private static RelatorioGatos relatorioGatos; 
    
    private RelatorioGatos() {
        initComponents();
        this.setLocationRelativeTo(null);
        listarTabela(); 
    }
    
    public static RelatorioGatos getRelatorioGatos(){
        if(relatorioGatos == null){
            relatorioGatos = new RelatorioGatos(); 
            return relatorioGatos; 
        }
        return relatorioGatos; 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaGatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("Relatório Gatos"); // NOI18N

        TabelaGatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Idade", "Data de Cadastro", "Pelagem", "Raça", "Nome Dono", "CPF", "Endereço", "Bairro", "Número da Casa"
            }
        ));
        jScrollPane1.setViewportView(TabelaGatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 899, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void listarTabela(){
        DefaultTableModel tabModel = (DefaultTableModel)TabelaGatos.getModel();
        int posLin = 0;
        tabModel.setRowCount(posLin);
        
        for(Gato gato : cadastroAnimais.getListaGatos()){
            tabModel.insertRow(posLin, new Object[]{gato.getNome(), gato.getIdade(), gato.getDataCadastro(),
                gato.getPelagem(), gato.getRacaGato(), gato.getDonoDoAnimal().getNome(), 
                gato.getDonoDoAnimal().getCpf(), gato.getDonoDoAnimal().getEndereco().getRua(),
                gato.getDonoDoAnimal().getEndereco().getBairro(), gato.getDonoDoAnimal().getEndereco().getNumero()} );
            posLin++;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaGatos;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
