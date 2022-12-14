package View;

public class Tela_GUI extends javax.swing.JFrame {

    public double preco = 0;
    public double valortotal = 0;
    public double quantia = 0;
    
    public Tela_GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Painel_PCG = new javax.swing.JTabbedPane();
        Inicio_PNL = new javax.swing.JPanel();
        Logo_LBL = new javax.swing.JLabel();
        Text_Under_Logo_LBL = new javax.swing.JLabel();
        Msg_LBL = new javax.swing.JLabel();
        CrDoces_PNL = new javax.swing.JPanel();
        CrepesDoces_LBL = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Imagem_CDL = new javax.swing.JLabel();
        Imagem_CDC = new javax.swing.JLabel();
        Pedir_DoceLeite_BTN = new javax.swing.JButton();
        Pedir_Chocolate_BTN = new javax.swing.JButton();
        CeapLoguinho_2_LBL = new javax.swing.JLabel();
        CrSalgados_PNL = new javax.swing.JPanel();
        CrepesSalgados_LBL = new javax.swing.JLabel();
        CrepeFrango_LBL = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CrepeCarne_LBL = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Pedir_Frango_BTN = new javax.swing.JButton();
        Pedir_Carne_BTN = new javax.swing.JButton();
        CeapLoguinho_1_LBL = new javax.swing.JLabel();
        Pagamento_PNL = new javax.swing.JPanel();
        Sair_BTN = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        ValorTotal_LBL = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Dinheiro_JTF = new javax.swing.JTextField();
        RealizarCompra_BTN = new javax.swing.JButton();
        Limpar_BTN = new javax.swing.JButton();
        CeapLoguinho_LBL = new javax.swing.JLabel();
        ResultadoDaCompra_LBL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName(""); // NOI18N
        setUndecorated(true);
        setResizable(false);

        Logo_LBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ceap_logo.png"))); // NOI18N

        Text_Under_Logo_LBL.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Text_Under_Logo_LBL.setText("Creperia S??o Jos??");

        Msg_LBL.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Msg_LBL.setText("Bem-vindo(a), a :");

        javax.swing.GroupLayout Inicio_PNLLayout = new javax.swing.GroupLayout(Inicio_PNL);
        Inicio_PNL.setLayout(Inicio_PNLLayout);
        Inicio_PNLLayout.setHorizontalGroup(
            Inicio_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Inicio_PNLLayout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addGroup(Inicio_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Inicio_PNLLayout.createSequentialGroup()
                        .addComponent(Logo_LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135))
                    .addGroup(Inicio_PNLLayout.createSequentialGroup()
                        .addComponent(Msg_LBL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Text_Under_Logo_LBL)
                        .addGap(76, 76, 76))))
        );
        Inicio_PNLLayout.setVerticalGroup(
            Inicio_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Inicio_PNLLayout.createSequentialGroup()
                .addComponent(Logo_LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Inicio_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Msg_LBL)
                    .addComponent(Text_Under_Logo_LBL))
                .addContainerGap(208, Short.MAX_VALUE))
        );

        Painel_PCG.addTab("Inicio", Inicio_PNL);

        CrepesDoces_LBL.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        CrepesDoces_LBL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CrepesDoces_LBL.setText("Crepes Doces :");
        CrepesDoces_LBL.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel2.setText("Crepe de Doce de Leite e Sorvete R$ 4,50");

        jLabel3.setText("Crepe de Chocolate -  R$ 5,50");

        Imagem_CDL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DOCEDELEITE.png"))); // NOI18N

        Imagem_CDC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CrepeChocolate.png"))); // NOI18N

        Pedir_DoceLeite_BTN.setText("Pedir");
        Pedir_DoceLeite_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pedir_DoceLeite_BTNActionPerformed(evt);
            }
        });

        Pedir_Chocolate_BTN.setText("Pedir");
        Pedir_Chocolate_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pedir_Chocolate_BTNActionPerformed(evt);
            }
        });

        CeapLoguinho_2_LBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ceap_Loguinho.png"))); // NOI18N

        javax.swing.GroupLayout CrDoces_PNLLayout = new javax.swing.GroupLayout(CrDoces_PNL);
        CrDoces_PNL.setLayout(CrDoces_PNLLayout);
        CrDoces_PNLLayout.setHorizontalGroup(
            CrDoces_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CrDoces_PNLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Imagem_CDL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(Imagem_CDC)
                .addContainerGap())
            .addGroup(CrDoces_PNLLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(Pedir_DoceLeite_BTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Pedir_Chocolate_BTN)
                .addGap(91, 91, 91))
            .addGroup(CrDoces_PNLLayout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(CrepesDoces_LBL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(CrDoces_PNLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(30, 30, 30))
            .addGroup(CrDoces_PNLLayout.createSequentialGroup()
                .addComponent(CeapLoguinho_2_LBL)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        CrDoces_PNLLayout.setVerticalGroup(
            CrDoces_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrDoces_PNLLayout.createSequentialGroup()
                .addComponent(CrepesDoces_LBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CrDoces_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Imagem_CDL)
                    .addComponent(Imagem_CDC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CrDoces_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CrDoces_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pedir_DoceLeite_BTN)
                    .addComponent(Pedir_Chocolate_BTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(CeapLoguinho_2_LBL))
        );

        Painel_PCG.addTab("Sabores Doces", CrDoces_PNL);

        CrepesSalgados_LBL.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        CrepesSalgados_LBL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CrepesSalgados_LBL.setText("Crepes Salgados :");
        CrepesSalgados_LBL.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        CrepeFrango_LBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CrepeFrango.png"))); // NOI18N

        jLabel1.setText("Crepe De Frango 4,50 R$");

        CrepeCarne_LBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/crepeCarne.png"))); // NOI18N

        jLabel4.setText("Crepe De Carne 3,50 R$");

        Pedir_Frango_BTN.setText("Pedir");
        Pedir_Frango_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pedir_Frango_BTNActionPerformed(evt);
            }
        });

        Pedir_Carne_BTN.setText("Pedir");
        Pedir_Carne_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pedir_Carne_BTNActionPerformed(evt);
            }
        });

        CeapLoguinho_1_LBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ceap_Loguinho.png"))); // NOI18N

        javax.swing.GroupLayout CrSalgados_PNLLayout = new javax.swing.GroupLayout(CrSalgados_PNL);
        CrSalgados_PNL.setLayout(CrSalgados_PNLLayout);
        CrSalgados_PNLLayout.setHorizontalGroup(
            CrSalgados_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CrSalgados_PNLLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CrepesSalgados_LBL)
                .addGap(198, 198, 198))
            .addGroup(CrSalgados_PNLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CrSalgados_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CrepeFrango_LBL)
                    .addGroup(CrSalgados_PNLLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(CrSalgados_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CrepeCarne_LBL)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CrSalgados_PNLLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(49, 49, 49)))
                .addContainerGap())
            .addGroup(CrSalgados_PNLLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(Pedir_Frango_BTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Pedir_Carne_BTN)
                .addGap(90, 90, 90))
            .addGroup(CrSalgados_PNLLayout.createSequentialGroup()
                .addComponent(CeapLoguinho_1_LBL)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        CrSalgados_PNLLayout.setVerticalGroup(
            CrSalgados_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrSalgados_PNLLayout.createSequentialGroup()
                .addComponent(CrepesSalgados_LBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CrSalgados_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CrepeFrango_LBL)
                    .addComponent(CrepeCarne_LBL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CrSalgados_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CrSalgados_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pedir_Frango_BTN)
                    .addComponent(Pedir_Carne_BTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(CeapLoguinho_1_LBL))
        );

        Painel_PCG.addTab("Sabores Salgados", CrSalgados_PNL);

        Sair_BTN.setText("Sair");
        Sair_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sair_BTNActionPerformed(evt);
            }
        });

        jLabel6.setText("Valor total da Compra : ");

        ValorTotal_LBL.setText("0:00");

        jLabel7.setText("Insira a quantia em dinheiro :");

        Dinheiro_JTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dinheiro_JTFActionPerformed(evt);
            }
        });

        RealizarCompra_BTN.setText("Realizar Compra");
        RealizarCompra_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealizarCompra_BTNActionPerformed(evt);
            }
        });

        Limpar_BTN.setText("Limpar");
        Limpar_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Limpar_BTNActionPerformed(evt);
            }
        });

        CeapLoguinho_LBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ceap_Loguinho.png"))); // NOI18N

        javax.swing.GroupLayout Pagamento_PNLLayout = new javax.swing.GroupLayout(Pagamento_PNL);
        Pagamento_PNL.setLayout(Pagamento_PNLLayout);
        Pagamento_PNLLayout.setHorizontalGroup(
            Pagamento_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pagamento_PNLLayout.createSequentialGroup()
                .addGroup(Pagamento_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pagamento_PNLLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(Pagamento_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RealizarCompra_BTN, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addComponent(CeapLoguinho_LBL))
                .addGroup(Pagamento_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pagamento_PNLLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(Pagamento_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Limpar_BTN)
                            .addComponent(Dinheiro_JTF, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(166, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pagamento_PNLLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Sair_BTN)
                        .addContainerGap())))
            .addGroup(Pagamento_PNLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pagamento_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pagamento_PNLLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ValorTotal_LBL))
                    .addComponent(ResultadoDaCompra_LBL))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Pagamento_PNLLayout.setVerticalGroup(
            Pagamento_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pagamento_PNLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pagamento_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ValorTotal_LBL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Pagamento_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Dinheiro_JTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Pagamento_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RealizarCompra_BTN)
                    .addComponent(Limpar_BTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ResultadoDaCompra_LBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addGroup(Pagamento_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pagamento_PNLLayout.createSequentialGroup()
                        .addComponent(Sair_BTN)
                        .addContainerGap())
                    .addComponent(CeapLoguinho_LBL, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        Painel_PCG.addTab("Pagamento", Pagamento_PNL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Painel_PCG, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Painel_PCG, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(552, 373));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Sair_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sair_BTNActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Sair_BTNActionPerformed

    private void Pedir_Frango_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pedir_Frango_BTNActionPerformed
        valortotal += preco+4.50;
        ValorTotal_LBL.setText(String.valueOf(valortotal));
    }//GEN-LAST:event_Pedir_Frango_BTNActionPerformed

    private void Pedir_Carne_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pedir_Carne_BTNActionPerformed
        valortotal += preco+3.50;
        ValorTotal_LBL.setText(String.valueOf(valortotal));
    }//GEN-LAST:event_Pedir_Carne_BTNActionPerformed

    private void Pedir_DoceLeite_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pedir_DoceLeite_BTNActionPerformed
        valortotal += preco+4.50;
        ValorTotal_LBL.setText(String.valueOf(valortotal));
    }//GEN-LAST:event_Pedir_DoceLeite_BTNActionPerformed

    private void Pedir_Chocolate_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pedir_Chocolate_BTNActionPerformed
        valortotal += preco+5.50;
        ValorTotal_LBL.setText(String.valueOf(valortotal));
    }//GEN-LAST:event_Pedir_Chocolate_BTNActionPerformed

    private void Dinheiro_JTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dinheiro_JTFActionPerformed
        
    }//GEN-LAST:event_Dinheiro_JTFActionPerformed

    private void RealizarCompra_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RealizarCompra_BTNActionPerformed
        quantia = Double.parseDouble(Dinheiro_JTF.getText());
        
        if (quantia == valortotal) {
            ResultadoDaCompra_LBL.setText("Obrigado efetuada com sucesso!");
            Dinheiro_JTF.setText("");
            ValorTotal_LBL.setText("");
        } else if (quantia < valortotal) {
            double extra = 0;
            extra = valortotal - quantia;
            ResultadoDaCompra_LBL.setText("S??o necess??rios "+extra+" R$ para a compra ser efetuada!");
            Dinheiro_JTF.setText("");
        } else if (quantia > valortotal) {
            double troco = 0;
            troco = quantia - valortotal;
            ResultadoDaCompra_LBL.setText("Seu troco ?? de "+troco+" R$, obrigado pela sua compra!");
            Dinheiro_JTF.setText("");
            ValorTotal_LBL.setText("");
        }
    }//GEN-LAST:event_RealizarCompra_BTNActionPerformed

    private void Limpar_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Limpar_BTNActionPerformed
        preco = 0;
        valortotal = 0;
        quantia = 0;
        
        ResultadoDaCompra_LBL.setText("");
        Dinheiro_JTF.setText("");
        ValorTotal_LBL.setText("");
    }//GEN-LAST:event_Limpar_BTNActionPerformed

    
    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CeapLoguinho_1_LBL;
    private javax.swing.JLabel CeapLoguinho_2_LBL;
    private javax.swing.JLabel CeapLoguinho_LBL;
    private javax.swing.JPanel CrDoces_PNL;
    private javax.swing.JPanel CrSalgados_PNL;
    private javax.swing.JLabel CrepeCarne_LBL;
    private javax.swing.JLabel CrepeFrango_LBL;
    private javax.swing.JLabel CrepesDoces_LBL;
    private javax.swing.JLabel CrepesSalgados_LBL;
    private javax.swing.JTextField Dinheiro_JTF;
    private javax.swing.JLabel Imagem_CDC;
    private javax.swing.JLabel Imagem_CDL;
    private javax.swing.JPanel Inicio_PNL;
    private javax.swing.JButton Limpar_BTN;
    private javax.swing.JLabel Logo_LBL;
    private javax.swing.JLabel Msg_LBL;
    private javax.swing.JPanel Pagamento_PNL;
    private javax.swing.JTabbedPane Painel_PCG;
    private javax.swing.JButton Pedir_Carne_BTN;
    private javax.swing.JButton Pedir_Chocolate_BTN;
    private javax.swing.JButton Pedir_DoceLeite_BTN;
    private javax.swing.JButton Pedir_Frango_BTN;
    private javax.swing.JButton RealizarCompra_BTN;
    private javax.swing.JLabel ResultadoDaCompra_LBL;
    private javax.swing.JButton Sair_BTN;
    private javax.swing.JLabel Text_Under_Logo_LBL;
    private javax.swing.JLabel ValorTotal_LBL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
