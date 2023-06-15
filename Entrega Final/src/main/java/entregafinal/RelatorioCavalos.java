package entregafinal;
//Nome: Luis Felipe Pizzi Lopes - RA: 2503522

import javax.swing.table.DefaultTableModel;


public class RelatorioCavalos extends javax.swing.JFrame {

    private BDAnimais cadastroAnimais = BDAnimais.getCadastroAnimais();
    private static RelatorioCavalos relatorioCavalos; 
    
    private RelatorioCavalos() {
        initComponents();
        this.setLocationRelativeTo(null);
        listarTabela(); 
    }
    
    public static RelatorioCavalos getRelatorioCavalos(){
        if(relatorioCavalos == null){
            relatorioCavalos = new RelatorioCavalos(); 
            return relatorioCavalos; 
        }
        return relatorioCavalos; 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaCavalos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("Relatório Gatos"); // NOI18N

        TabelaCavalos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Idade", "Data de Cadastro", "Altura", "Peso", "Nome Dono", "CPF", "Endereço", "Bairro", "Número da Casa"
            }
        ));
        jScrollPane1.setViewportView(TabelaCavalos);

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
        DefaultTableModel tabModel = (DefaultTableModel)TabelaCavalos.getModel();
        int posLin = 0;
        tabModel.setRowCount(posLin);
        
        for(Cavalo cavalo : cadastroAnimais.getListaCavalos()){
            tabModel.insertRow(posLin, new Object[]{cavalo.getNome(), cavalo.getIdade(), cavalo.getDataCadastro(),
                cavalo.getAltura(), cavalo.getPeso(), cavalo.getDonoDoAnimal().getNome(), 
                cavalo.getDonoDoAnimal().getCpf(), cavalo.getDonoDoAnimal().getEndereco().getRua(),
                cavalo.getDonoDoAnimal().getEndereco().getBairro(), cavalo.getDonoDoAnimal().getEndereco().getNumero()} );
            posLin++;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaCavalos;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
