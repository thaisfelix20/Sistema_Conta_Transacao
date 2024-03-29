
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thais
 */

public class Principal extends javax.swing.JFrame {
    private static Contas conta1;
    private static ContaPoupanca conta2;
    private static ContaEspecial conta3;
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bttSaque = new javax.swing.JButton();
        bttDeposito = new javax.swing.JButton();
        bttTransferencia = new javax.swing.JButton();
        bttReajustar = new javax.swing.JButton();
        bttVerSaldos = new javax.swing.JButton();
        bttSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(185, 193, 222));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 17)); // NOI18N
        jLabel1.setText("Selecione a operação desejada");

        bttSaque.setText("Saque");
        bttSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSaqueActionPerformed(evt);
            }
        });

        bttDeposito.setText("Depósito");
        bttDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttDepositoActionPerformed(evt);
            }
        });

        bttTransferencia.setText("Transferência");
        bttTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttTransferenciaActionPerformed(evt);
            }
        });

        bttReajustar.setText("Reajustar");
        bttReajustar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttReajustarActionPerformed(evt);
            }
        });

        bttVerSaldos.setText("Ver saldos");
        bttVerSaldos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttVerSaldosActionPerformed(evt);
            }
        });

        bttSair.setText("Sair");
        bttSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(bttSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(bttDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(bttSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bttReajustar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)))
                        .addGap(0, 61, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bttVerSaldos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bttTransferencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bttDeposito)
                    .addComponent(bttSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttTransferencia)
                    .addComponent(bttReajustar))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttVerSaldos)
                    .addComponent(bttSair))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_bttSairActionPerformed

    private void bttSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSaqueActionPerformed
        // TODO add your handling code here:

        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero da conta:", "SAQUE", 3));
        int saq = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do saque:", "SAQUE", 3));
        //essa parte aq nao sei como faz o acesso ao objeto da conta 
        if(numero == conta1.getNumero()){
            if(saq <= conta1.getSaldo()){
                int a = JOptionPane.showConfirmDialog(null, "Você deseja sacar "+saq+" reais da conta de "+conta1.getNome()+" ?");
                if(a == 0){
                    conta1.sacar(saq);
                    JOptionPane.showMessageDialog(null, "Saque realizado com sucesso");
                }else if(a == 1){
                    JOptionPane.showMessageDialog(null, "Você escolhou não, operação concretizada");
                }else if(a == 2){
                    JOptionPane.showMessageDialog(null, "Você escolhou cancelar, operação concretizada");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Saldo insuficiente");
            }
        }
        
        
        else if(numero == conta2.getNumero()){
            if(saq <= conta2.getSaldo()){
                int a = JOptionPane.showConfirmDialog(null, "Você deseja sacar "+saq+" reais da conta de "+conta2.getNome()+" ?");
                if(a == 0){
                    conta2.sacar(saq);
                    JOptionPane.showMessageDialog(null, "Saque realizado com sucesso");
                }else if(a == 1){
                    JOptionPane.showMessageDialog(null, "Você escolhou não, operação concretizada");
                }else if(a == 2){
                    JOptionPane.showMessageDialog(null, "Você escolhou cancelar, operação concretizada");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Saldo insuficiente");
            }
        }
        
        
        else if(numero == conta3.getNumero()){
            if(saq <= conta3.getSaldo()){
                int a = JOptionPane.showConfirmDialog(null, "Você deseja sacar "+saq+" reais da conta de "+conta3.getNome()+" ?");
                if(a == 0){
                    conta3.sacar(saq);
                    JOptionPane.showMessageDialog(null, "Saque realizado com sucesso");
                }else if(a == 1){
                    JOptionPane.showMessageDialog(null, "Você escolhou não, operação concretizada");
                }else if(a == 2){
                    JOptionPane.showMessageDialog(null, "Você escolhou cancelar, operação concretizada");
                }
            }else if(saq <= (conta3.limite + conta3.getSaldo())){
                conta3.sacar(saq);
                conta3.descontar(conta3.multa);
            }else{
                JOptionPane.showMessageDialog(null, "Saldo insuficiente");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Numero de conta invalido");
        }
    }//GEN-LAST:event_bttSaqueActionPerformed

    private void bttDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttDepositoActionPerformed
        // TODO add your handling code here:
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero da conta:", "DEPOSITO", 3));
        int dep = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do deposito:", "DEPOSITO", 3));
        //essa parte aq nao sei como faz o acesso ao objeto da conta 
        if(numero == conta1.getNumero()){
            int a = JOptionPane.showConfirmDialog(null, "Você deseja depositar "+dep+" reais na conta de "+conta1.getNome()+" ?");
            if(a == 0){
                conta1.depositar(dep);
                JOptionPane.showMessageDialog(null, "Deposito realizado com sucesso");
            }else if(a == 1){
                JOptionPane.showMessageDialog(null, "Você escolhou não, operação concretizada");
            }else if(a == 2){
                JOptionPane.showMessageDialog(null, "Você escolhou cancelar, operação concretizada");
            }
        }
        
        
        else if(numero == conta2.getNumero()){
            int a = JOptionPane.showConfirmDialog(null, "Você deseja depositar "+dep+" reais na conta de "+conta2.getNome()+" ?");
            if(a == 0){
                conta2.depositar(dep);
                JOptionPane.showMessageDialog(null, "Deposito realizado com sucesso");
            }else if(a == 1){
                JOptionPane.showMessageDialog(null, "Você escolhou não, operação concretizada");
            }else if(a == 2){
                JOptionPane.showMessageDialog(null, "Você escolhou cancelar, operação concretizada");
            }
        }
        
        
        else if(numero == conta3.getNumero()){
            int a = JOptionPane.showConfirmDialog(null, "Você deseja depositar "+dep+" reais na conta de "+conta3.getNome()+" ?");
            if(a == 0){
                conta3.depositar(dep);
                JOptionPane.showMessageDialog(null, "Deposito realizado com sucesso");
            }else if(a == 1){
                JOptionPane.showMessageDialog(null, "Você escolhou não, operação concretizada");
            }else if(a == 2){
                JOptionPane.showMessageDialog(null, "Você escolhou cancelar, operação concretizada");
            }
        }   
    }//GEN-LAST:event_bttDepositoActionPerformed

    private void bttVerSaldosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttVerSaldosActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Conta 1-\nNome: "+conta1.getNome()+"\nSaldo: "+conta1.getSaldo()+"\nConta 2-\nNome: "+conta2.getNome()+"\nSaldo: "+conta2.getSaldo()+"\nConta 3-\nNome: "+conta3.getNome()+"\nSaldo: "+conta3.getSaldo()+"\n");
    }//GEN-LAST:event_bttVerSaldosActionPerformed

    private void bttReajustarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttReajustarActionPerformed
        // TODO add your handling code here:
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero da conta:", "REAJUSTE", 3));
        if(conta2.getNumero() == numero){
            double taxa = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a taxa de reajuste(Para taxa padrão digite zero): ", "REAJUSTE", 3));
            if(taxa > 0){
                conta2.reajustar(taxa);
            }else if (taxa==0){
                conta2.reajustar();
            }
            JOptionPane.showMessageDialog(null, "Reajuste realizado com sucesso");
        }else{
            JOptionPane.showMessageDialog(null, "Numero de conta invalido");
        }
        
        
    }//GEN-LAST:event_bttReajustarActionPerformed

    private void bttTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttTransferenciaActionPerformed
        // TODO add your handling code here:        
        int numeroEnv = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero da conta do emissor:", "TRANSFERENCIA", 3));
        if(numeroEnv == conta1.getNumero()){
            int numeroRec = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero da conta do receptor:", "TRANSFERENCIA", 3));
            if(numeroRec == conta2.getNumero()){
                int trans = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de transferencia:", "TRANSFERENCIA", 3));
                int a = JOptionPane.showConfirmDialog(null, "Você deseja transferir "+trans+" reais da conta de "+conta1.getNome()+" para a conta de "+conta2.getNome()+ " ?");
                if(a == 0){
                    conta1.transferir(conta1, conta2, trans);
                }else if(a == 1){
                    JOptionPane.showMessageDialog(null, "Você escolhou não, operação concretizada");
                }else if(a == 2){
                    JOptionPane.showMessageDialog(null, "Você escolhou cancelar, operação concretizada");
                }                
            }else if(numeroRec == conta3.getNumero()){
                int trans = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de transferencia:", "TRANSFERENCIA", 3));
                int a = JOptionPane.showConfirmDialog(null, "Você deseja transferir "+trans+" reais da conta de "+conta1.getNome()+" para a conta de "+conta3.getNome()+ " ?");
                if(a == 0){
                    conta1.transferir(conta1, conta3, trans);
                }else if(a == 1){
                    JOptionPane.showMessageDialog(null, "Você escolhou não, operação concretizada");
                }else if(a == 2){
                    JOptionPane.showMessageDialog(null, "Você escolhou cancelar, operação concretizada");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Numero de conta invalida");
            }
        }else if(numeroEnv == conta2.getNumero()){
            int numeroRec = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero da conta do receptor:", "TRANSFERENCIA", 3));
            if(numeroRec == conta1.getNumero()){
                int trans = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de transferencia:", "TRANSFERENCIA", 3));
                int a = JOptionPane.showConfirmDialog(null, "Você deseja transferir "+trans+" reais da conta de "+conta2.getNome()+" para a conta de "+conta1.getNome()+ " ?");
                if(a == 0){
                    conta1.transferir(conta2, conta1, trans);
                }else if(a == 1){
                    JOptionPane.showMessageDialog(null, "Você escolhou não, operação concretizada");
                }else if(a == 2){
                    JOptionPane.showMessageDialog(null, "Você escolhou cancelar, operação concretizada");
                }
            }else if(numeroRec == conta3.getNumero()){
                int trans = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de transferencia:", "TRANSFERENCIA", 3));
                int a = JOptionPane.showConfirmDialog(null, "Você deseja transferir "+trans+" reais da conta de "+conta2.getNome()+" para a conta de "+conta3.getNome()+ " ?");
                if(a == 0){
                    conta1.transferir(conta2, conta3, trans);
                }else if(a == 1){
                    JOptionPane.showMessageDialog(null, "Você escolhou não, operação concretizada");
                }else if(a == 2){
                    JOptionPane.showMessageDialog(null, "Você escolhou cancelar, operação concretizada");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Numero de conta invalida");
            }
        }else if(numeroEnv == conta3.getNumero()){
            int numeroRec = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero da conta do receptor:", "TRANSFERENCIA", 3));
            if(numeroRec == conta2.getNumero()){
                int trans = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de transferencia:", "TRANSFERENCIA", 3));
                int a = JOptionPane.showConfirmDialog(null, "Você deseja transferir "+trans+" reais da conta de "+conta3.getNome()+" para a conta de "+conta2.getNome()+ " ?");
                if(a == 0){
                    conta1.transferir(conta3, conta2, trans);
                }else if(a == 1){
                    JOptionPane.showMessageDialog(null, "Você escolhou não, operação concretizada");
                }else if(a == 2){
                    JOptionPane.showMessageDialog(null, "Você escolhou cancelar, operação concretizada");
                }
            }else if(numeroRec == conta1.getNumero()){
                int trans = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de transferencia:", "TRANSFERENCIA", 3));
                int a = JOptionPane.showConfirmDialog(null, "Você deseja transferir "+trans+" reais da conta de "+conta3.getNome()+" para a conta de "+conta1.getNome()+ " ?");
                if(a == 0){
                    conta1.transferir(conta3, conta1, trans);
                }else if(a == 1){
                    JOptionPane.showMessageDialog(null, "Você escolhou não, operação concretizada");
                }else if(a == 2){
                    JOptionPane.showMessageDialog(null, "Você escolhou cancelar, operação concretizada");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Numero de conta invalida");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Numero de conta invalida");
        }
        
    }//GEN-LAST:event_bttTransferenciaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        conta1 = new Contas();
        conta2 = new ContaPoupanca();
        conta3 = new ContaEspecial();
        

        JOptionPane.showMessageDialog(null, "        Boas-Vindas");
        String nome = JOptionPane.showInputDialog(null, "Digite o nome do tituar: ", "CONTA-COMUM", 3);
        conta1.setNome(nome);
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero da conta: ", "CONTA-COMUM", 3));
        conta1.setNumero(numero);
        double saldo = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o saldo inicial: ", "CONTA-COMUM", 3));
        conta1.depositar(saldo);
        
        
        nome = JOptionPane.showInputDialog(null, "Digite o nome do tituar: ", "CONTA-POUPANÇA", 3);
        conta2.setNome(nome);
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero da conta: ", "CONTA-POUPANÇA", 3));
        conta2.setNumero(numero);
        saldo = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o saldo inicial: ", "CONTA-POUPANÇA", 3));
        conta2.depositar(saldo);
        //essa taxa aparentemente não sera usada!
        //double taxa = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a taxa de reajuste: ", "CONTA-POUPANÇA", 3));
        
        
        nome = JOptionPane.showInputDialog(null, "Digite o nome do tituar: ", "CONTA-ESPECIAL", 3);
        conta3.setNome(nome);
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero da conta: ", "CONTA-ESPECIAL", 3));
        conta3.setNumero(numero);
        saldo = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o saldo inicial: ", "CONTA-ESPECIAL", 3));
        conta3.depositar(saldo);
        int lim = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o limite da conta: ", "CONTA-ESPECIAL", 3));
        conta3.limite = lim;
        double multa = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a multa: ", "CONTA-ESPECIAL", 3));
        conta3.multa = multa;
                
                
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttDeposito;
    private javax.swing.JButton bttReajustar;
    private javax.swing.JButton bttSair;
    private javax.swing.JButton bttSaque;
    private javax.swing.JButton bttTransferencia;
    private javax.swing.JButton bttVerSaldos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
