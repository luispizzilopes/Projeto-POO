package entregafinal;
//Nome: Luis Felipe Pizzi Lopes - RA: 2503522

import javax.swing.table.DefaultTableModel;


public class RelatorioCachorros extends javax.swing.JFrame {

    private BDAnimais cadastroAnimais = BDAnimais.getCadastroAnimais();
    private static RelatorioCachorros relatorioCachorros; 
    
    private RelatorioCachorros() {
        initComponents();
        this.setLocationRelativeTo(null);
        listarTabela(); 
    }
    
    public static RelatorioCachorros getRelatorioCachorros(){
        if(relatorioCachorros == null){
            relatorioCachorros = new RelatorioCachorros(); 
            return relatorioCachorros; 
        }
        return relatorioCachorros; 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaCachorros = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("Relatório Cachorros"); // NOI18N

        TabelaCachorros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Idade", "Data de Cadastro", "Porte", "Raça", "Nome Dono", "CPF", "Endereço", "Bairro", "Número da Casa"
            }
        ));
        jScrollPane1.setViewportView(TabelaCachorros);

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
        DefaultTableModel tabModel = (DefaultTableModel)TabelaCachorros.getModel();
        int posLin = 0;
        tabModel.setRowCount(posLin);
        
        for(Cachorro cachorro : cadastroAnimais.getListaCachorros()){
            tabModel.insertRow(posLin, new Object[]{cachorro.getNome(), cachorro.getIdade(), cachorro.getDataCadastro(),
                cachorro.getPorte(), cachorro.getRacaCachorro(), cachorro.getDonoDoAnimal().getNome(), 
                cachorro.getDonoDoAnimal().getCpf(), cachorro.getDonoDoAnimal().getEndereco().getRua(),
                cachorro.getDonoDoAnimal().getEndereco().getBairro(), cachorro.getDonoDoAnimal().getEndereco().getNumero()} );
            posLin++;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaCachorros;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
