package entregafinal;
//Versão: Apache NetBeans IDE 17
//Nome: Luis Felipe Pizzi Lopes - RA: 2503522

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCachorros = new javax.swing.JButton();
        btnGatos = new javax.swing.JButton();
        btnCavalos = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblTitulo1 = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        cadastroCachorros = new javax.swing.JMenuItem();
        cadastroGatos = new javax.swing.JMenuItem();
        cadastroCavalos = new javax.swing.JMenuItem();
        opcaoSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCachorros.setText("Cachorros");
        btnCachorros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCachorrosActionPerformed(evt);
            }
        });

        btnGatos.setText("Gatos");
        btnGatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGatosActionPerformed(evt);
            }
        });

        btnCavalos.setText("Cavalos");
        btnCavalos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCavalosActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        lblTitulo.setText("SISTEMA DE CLÍNICA VETERINÁRIA");

        lblTitulo1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTitulo1.setText("Selecione a opção que deseja gerenciar");

        jMenu1.setText("Opções");

        cadastroCachorros.setText("Cadastro Cachorros");
        cadastroCachorros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroCachorrosActionPerformed(evt);
            }
        });
        jMenu1.add(cadastroCachorros);

        cadastroGatos.setText("Cadastro Gatos");
        cadastroGatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroGatosActionPerformed(evt);
            }
        });
        jMenu1.add(cadastroGatos);

        cadastroCavalos.setText("Cadastro Cavalos");
        cadastroCavalos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroCavalosActionPerformed(evt);
            }
        });
        jMenu1.add(cadastroCavalos);

        opcaoSair.setText("Sair");
        opcaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoSairActionPerformed(evt);
            }
        });
        jMenu1.add(opcaoSair);

        MenuBar.add(jMenu1);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCachorros)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGatos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCavalos)
                                .addGap(6, 6, 6))
                            .addComponent(lblTitulo1))))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitulo1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCachorros)
                    .addComponent(btnGatos)
                    .addComponent(btnCavalos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCachorrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCachorrosActionPerformed
        FrameCachorros fCachorros = FrameCachorros.getFrameCachorros(); 
        fCachorros.show(); 
    }//GEN-LAST:event_btnCachorrosActionPerformed

    private void btnGatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGatosActionPerformed
        FrameGatos fGatos = FrameGatos.getFrameGatos(); 
        fGatos.show(); 
    }//GEN-LAST:event_btnGatosActionPerformed

    private void btnCavalosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCavalosActionPerformed
        FrameCavalos fCavalos = FrameCavalos.getFrameCavalos(); 
        fCavalos.show(); 
    }//GEN-LAST:event_btnCavalosActionPerformed

    private void cadastroCavalosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroCavalosActionPerformed
        FrameCavalos fCavalos = FrameCavalos.getFrameCavalos();
        fCavalos.show();
    }//GEN-LAST:event_cadastroCavalosActionPerformed

    private void cadastroGatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroGatosActionPerformed
        FrameGatos fGatos = FrameGatos.getFrameGatos();
        fGatos.show();
    }//GEN-LAST:event_cadastroGatosActionPerformed

    private void cadastroCachorrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroCachorrosActionPerformed
        FrameCachorros fCachorros = FrameCachorros.getFrameCachorros();
        fCachorros.show();
    }//GEN-LAST:event_cadastroCachorrosActionPerformed

    private void opcaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoSairActionPerformed
        dispose();
    }//GEN-LAST:event_opcaoSairActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JButton btnCachorros;
    private javax.swing.JButton btnCavalos;
    private javax.swing.JButton btnGatos;
    private javax.swing.JMenuItem cadastroCachorros;
    private javax.swing.JMenuItem cadastroCavalos;
    private javax.swing.JMenuItem cadastroGatos;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JMenuItem opcaoSair;
    // End of variables declaration//GEN-END:variables
}
