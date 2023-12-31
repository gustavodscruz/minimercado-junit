
package controle;

import conexao.Conexao;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class Produto extends javax.swing.JInternalFrame {
Conexao con_cliente;
    public Produto() {
        initComponents();
        con_cliente = new Conexao();// inicialização do objeto
        con_cliente.conecta();  // chama o método que conecta
        con_cliente.executaSQL("select * from produto order by Cod");
        preencherTabela();
        posicionarRegistro();
        Tabela.setAutoCreateRowSorter(true);// ativa a classificação ordenada da tabela
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Cod_Prod = new javax.swing.JLabel();
        cod_prod = new javax.swing.JTextField();
        Nome = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        Carac = new javax.swing.JLabel();
        carac = new javax.swing.JTextField();
        Fabric = new javax.swing.JLabel();
        fabric = new javax.swing.JTextField();
        Prec_Cust = new javax.swing.JLabel();
        prec_cust = new javax.swing.JTextField();
        Prec_Venda = new javax.swing.JLabel();
        prec_venda = new javax.swing.JTextField();
        Voltar = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();
        Alterar = new javax.swing.JButton();
        Gravar = new javax.swing.JButton();
        Novo = new javax.swing.JButton();
        Ultimo = new javax.swing.JButton();
        Proximo = new javax.swing.JButton();
        Anterior = new javax.swing.JButton();
        Primeiro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        Pesq = new javax.swing.JLabel();
        Pesquisar = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        Cod_Prod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Cod_Prod.setText("Código Produto:");

        cod_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cod_prodActionPerformed(evt);
            }
        });

        Nome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Nome.setText("Nome:");

        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        Carac.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Carac.setText("Características:");

        carac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caracActionPerformed(evt);
            }
        });

        Fabric.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Fabric.setText("Fabricante:");

        fabric.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fabricActionPerformed(evt);
            }
        });

        Prec_Cust.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Prec_Cust.setText("Preço de Custo:");

        prec_cust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prec_custActionPerformed(evt);
            }
        });

        Prec_Venda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Prec_Venda.setText("Preço de Venda:");

        prec_venda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prec_vendaActionPerformed(evt);
            }
        });

        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });

        Excluir.setText("Excluir");
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });

        Alterar.setText("Alterar");
        Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarActionPerformed(evt);
            }
        });

        Gravar.setText("Gravar");
        Gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GravarActionPerformed(evt);
            }
        });

        Novo.setText("Novo Registro");
        Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoActionPerformed(evt);
            }
        });

        Ultimo.setText("Ultimo");
        Ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UltimoActionPerformed(evt);
            }
        });

        Proximo.setText("Proximo");
        Proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProximoActionPerformed(evt);
            }
        });

        Anterior.setText("Anterior");
        Anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnteriorActionPerformed(evt);
            }
        });

        Primeiro.setText("Primeiro");
        Primeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrimeiroActionPerformed(evt);
            }
        });

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código Produto", "Nome", "Características", "Fabricante", "Preço de Custo", "Preço de Venda"
            }
        ));
        Tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaMouseClicked(evt);
            }
        });
        Tabela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TabelaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(Tabela);

        Pesq.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Pesq.setText("Pesquisar por nome do funcionário:");

        Pesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PesquisarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Pesq)
                        .addGap(18, 18, 18)
                        .addComponent(Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(568, 568, 568))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Primeiro)
                        .addGap(18, 18, 18)
                        .addComponent(Anterior)
                        .addGap(18, 18, 18)
                        .addComponent(Proximo)
                        .addGap(18, 18, 18)
                        .addComponent(Ultimo)
                        .addGap(18, 18, 18)
                        .addComponent(Novo)
                        .addGap(18, 18, 18)
                        .addComponent(Gravar)
                        .addGap(18, 18, 18)
                        .addComponent(Alterar)
                        .addGap(18, 18, 18)
                        .addComponent(Excluir)
                        .addGap(18, 18, 18)
                        .addComponent(Voltar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Nome)
                                            .addComponent(Cod_Prod))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(cod_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Carac)
                                            .addComponent(Fabric)
                                            .addComponent(Prec_Cust))
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(prec_cust, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fabric, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(carac, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Prec_Venda)
                                        .addGap(18, 18, 18)
                                        .addComponent(prec_venda, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cod_Prod)
                    .addComponent(cod_prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nome)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Carac))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fabric)
                    .addComponent(fabric, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Prec_Cust)
                    .addComponent(prec_cust, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Prec_Venda)
                    .addComponent(prec_venda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Primeiro)
                    .addComponent(Anterior)
                    .addComponent(Proximo)
                    .addComponent(Ultimo)
                    .addComponent(Novo)
                    .addComponent(Gravar)
                    .addComponent(Alterar)
                    .addComponent(Excluir)
                    .addComponent(Voltar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pesq, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cod_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cod_prodActionPerformed

    }//GEN-LAST:event_cod_prodActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void caracActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caracActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caracActionPerformed

    private void fabricActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fabricActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fabricActionPerformed

    private void prec_custActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prec_custActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prec_custActionPerformed

    private void prec_vendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prec_vendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prec_vendaActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        dispose();
    }//GEN-LAST:event_VoltarActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        String sql="";
        try{
            int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja Excluir o registro: ","Confirmar Exclusão", JOptionPane.YES_NO_OPTION,3);
            if (resposta==0){
                sql = "delete from produto where Cod = " + cod_prod.getText();
                int excluir = con_cliente.statement.executeUpdate(sql);
                if(excluir==1){
                    JOptionPane.showMessageDialog(null, "Exclusão relizada com sucesso!! ","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
                    con_cliente.executaSQL("select * from funcionario order by Cod_Fun");
                    con_cliente.resultset.first();
                    preencherTabela();
                    posicionarRegistro();
                }else{
                    JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário!! ","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }catch (SQLException excecao){
            JOptionPane.showMessageDialog(null,"Erro na exclusão: "+excecao,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_ExcluirActionPerformed

    private void AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarActionPerformed
        String COD_PROD = cod_prod.getText();
        String NOME = nome.getText();
        String CARAC = carac.getText();
        String FABRIC = fabric.getText();
        String PREC_CUST = prec_cust.getText();
        String PREC_VENDA = prec_venda.getText();
        String sql;
        String msg="";

        try{
            if(cod_prod.getText().equals("")){
                sql="insert into produto (Cod, Nome, Caracteristica, Fabricante, Preco_de_Custo, Preco_de_Venda) values ('" + COD_PROD + "', '" + NOME + "', '" + CARAC + "', '" + FABRIC + "', '" + PREC_CUST + "', '" + PREC_VENDA + "')";
                msg="Alteração de Registro";
            }else{
                sql="update produto set Nome='" + NOME + "',Caracteristica='" + CARAC + "', Fabricante='" + FABRIC + "', Preco_de_Custo='" + PREC_CUST + "', Preco_de_Venda='" + PREC_VENDA + "' where Cod= " + cod_prod.getText();
                msg="Alteração de Registro";
            }

            con_cliente.statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Gravação realizada com sucesso!! ","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);

            con_cliente.executaSQL("select * from produto order by Cod");
            preencherTabela();

        }catch (SQLException errosql){
            JOptionPane.showMessageDialog(null,"\n Erro na gravação:\n "+errosql,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_AlterarActionPerformed

    private void GravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GravarActionPerformed
        String COD_PROD = cod_prod.getText();
        String NOME = nome.getText();
        String CARAC = carac.getText();
        String FABRIC = fabric.getText();
        String PREC_CUST = prec_cust.getText();
        String PREC_VENDA = prec_venda.getText();

       try {
            String insert_sql="insert into produto (Cod, Nome, Caracteristica, Fabricante, Preco_de_Custo, Preco_de_Venda) values ('" + COD_PROD + "', '" + NOME + "', '" + CARAC + "', '" + FABRIC + "', '" + PREC_CUST + "', '" + PREC_VENDA + "')";
            con_cliente.statement.executeUpdate(insert_sql);
            JOptionPane.showMessageDialog(null,"Gravação realizada com sucesso!! ","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);

            con_cliente.executaSQL("select * from produto order by Cod");
            preencherTabela();

        }catch (SQLException errosql){
            JOptionPane.showMessageDialog(null,"\n Erro na gravação:\n "+errosql,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_GravarActionPerformed

    private void NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoActionPerformed
        cod_prod.setText("");
        nome.setText("");
        carac.setText("");
        fabric.setText("");
        prec_cust.setText("");
        prec_venda.setText("");
        cod_prod.requestFocus();
    }//GEN-LAST:event_NovoActionPerformed

    private void UltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UltimoActionPerformed
        try{
            con_cliente.resultset.last();
            mostrar_Dados();
        }catch (SQLException erro){
            JOptionPane.showMessageDialog(null,"Não foi possivel posicionar o ultimo registro: "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_UltimoActionPerformed

    private void ProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProximoActionPerformed
        try{
            con_cliente.resultset.next();
            mostrar_Dados();
        }catch (SQLException erro){
            JOptionPane.showMessageDialog(null,"Não foi possivel posicionar no proximo registro: "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_ProximoActionPerformed

    private void AnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnteriorActionPerformed
        try{
            con_cliente.resultset.previous();
            mostrar_Dados();
        }catch (SQLException erro){
            JOptionPane.showMessageDialog(null,"Não foi possivel posicionar no registro anterior: "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_AnteriorActionPerformed

    private void PrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrimeiroActionPerformed
        try{
            con_cliente.resultset.first();
            mostrar_Dados();
        }catch (SQLException erro){
            JOptionPane.showMessageDialog(null,"Não foi possivel posicionar no primeiro registro: "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_PrimeiroActionPerformed

    private void TabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaMouseClicked
        int linha_selecionada = Tabela.getSelectedRow();
        cod_prod.setText(Tabela.getValueAt(linha_selecionada, 0).toString());
        nome.setText(Tabela.getValueAt(linha_selecionada, 1).toString());
        carac.setText(Tabela.getValueAt(linha_selecionada, 2).toString());
        fabric.setText(Tabela.getValueAt(linha_selecionada, 3).toString());
        prec_cust.setText(Tabela.getValueAt(linha_selecionada, 4).toString());
        prec_venda.setText(Tabela.getValueAt(linha_selecionada, 5).toString());
        
    }//GEN-LAST:event_TabelaMouseClicked

    private void TabelaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabelaKeyPressed
        int linha_selecionada = Tabela.getSelectedRow();
        cod_prod.setText(Tabela.getValueAt(linha_selecionada, 0).toString());
        nome.setText(Tabela.getValueAt(linha_selecionada, 1).toString());
        carac.setText(Tabela.getValueAt(linha_selecionada, 2).toString());
        fabric.setText(Tabela.getValueAt(linha_selecionada, 3).toString());
        prec_cust.setText(Tabela.getValueAt(linha_selecionada, 4).toString());
        prec_venda.setText(Tabela.getValueAt(linha_selecionada, 5).toString());
        
    }//GEN-LAST:event_TabelaKeyPressed

    private void PesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PesquisarKeyReleased
        try{
            String pesquisa = "select * from produto where nome like '" + Pesquisar.getText() + "%'";
            con_cliente.executaSQL(pesquisa);

            if(con_cliente.resultset.first()){
                preencherTabela();
            }else{
                JOptionPane.showMessageDialog(null, "\n Não existe dados com este parametro!! ","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
            }
        }catch (SQLException errosql){
            JOptionPane.showMessageDialog(null,"\n Dados digitados não foram localizados:\n "+errosql,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_PesquisarKeyReleased

    public void posicionarRegistro(){
         try{
             con_cliente.resultset.first();
             mostrar_Dados();
         }catch (SQLException erro){
            JOptionPane.showMessageDialog(null,"Não foi possivel posicionar no primeiro registro: "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
     }
     public void  mostrar_Dados(){
             try{
                 cod_prod.setText(con_cliente.resultset.getString("cod"));
                 nome.setText(con_cliente.resultset.getString("nome"));
                 carac.setText(con_cliente.resultset.getString("caracteristica"));
                 fabric.setText(con_cliente.resultset.getString("fabricante"));
                 prec_cust.setText(con_cliente.resultset.getString("preco_de_custo"));
                 prec_venda.setText(con_cliente.resultset.getString("preco_de_venda"));
                 
                 
             }catch (SQLException erro){
            JOptionPane.showMessageDialog(null,"Não localizou dados: "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    
    
    
    public void preencherTabela(){
        Tabela.getColumnModel().getColumn(0).setPreferredWidth(4);
        Tabela.getColumnModel().getColumn(1).setPreferredWidth(150);
        Tabela.getColumnModel().getColumn(2).setPreferredWidth(11);
        Tabela.getColumnModel().getColumn(3).setPreferredWidth(7);
        Tabela.getColumnModel().getColumn(4).setPreferredWidth(11);
        Tabela.getColumnModel().getColumn(5).setPreferredWidth(150);
        
        DefaultTableModel modelo =(DefaultTableModel) Tabela.getModel();
        modelo.setNumRows(0);
        
         try{
            con_cliente.resultset.beforeFirst();
            while(con_cliente.resultset.next()){
                modelo.addRow(new Object[]{
                    con_cliente.resultset.getString("cod"),
                    con_cliente.resultset.getString("nome"),
                    con_cliente.resultset.getString("caracteristica"),
                    con_cliente.resultset.getString("fabricante"), 
                    con_cliente.resultset.getString("preco_de_custo"), 
                    con_cliente.resultset.getString("preco_de_venda"), 
                   
                });
            }
        }catch (SQLException erro){
            JOptionPane.showMessageDialog(null,"\n Erro ao listar dados da tabela!! :\n "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
                }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alterar;
    private javax.swing.JButton Anterior;
    private javax.swing.JLabel Carac;
    private javax.swing.JLabel Cod_Prod;
    private javax.swing.JButton Excluir;
    private javax.swing.JLabel Fabric;
    private javax.swing.JButton Gravar;
    private javax.swing.JLabel Nome;
    private javax.swing.JButton Novo;
    private javax.swing.JLabel Pesq;
    private javax.swing.JTextField Pesquisar;
    private javax.swing.JLabel Prec_Cust;
    private javax.swing.JLabel Prec_Venda;
    private javax.swing.JButton Primeiro;
    private javax.swing.JButton Proximo;
    private javax.swing.JTable Tabela;
    private javax.swing.JButton Ultimo;
    private javax.swing.JButton Voltar;
    private javax.swing.JTextField carac;
    private javax.swing.JTextField cod_prod;
    private javax.swing.JTextField fabric;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField prec_cust;
    private javax.swing.JTextField prec_venda;
    // End of variables declaration//GEN-END:variables
}
