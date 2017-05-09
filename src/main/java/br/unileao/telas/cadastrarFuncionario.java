/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unileao.telas;

/**
 *
 * @author Lab1
 */
public class cadastrarFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarFuncionario
     */
    public cadastrarFuncionario() {
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

        Grupo_Botoes = new javax.swing.ButtonGroup();
        funcionario = new javax.swing.JLabel();
        separador_Funcionario = new javax.swing.JSeparator();
        nome = new javax.swing.JLabel();
        campo_Nome = new javax.swing.JTextField();
        setor = new javax.swing.JLabel();
        campo_Setor = new javax.swing.JTextField();
        funcao = new javax.swing.JLabel();
        campo_Funcao = new javax.swing.JTextField();
        turno = new javax.swing.JLabel();
        sexo = new javax.swing.JLabel();
        caixaDeCombinacaoDoSexo = new javax.swing.JComboBox<>();
        dataDeNascimento = new javax.swing.JLabel();
        campo_DataDeNascimento = new javax.swing.JTextField();
        cadastrar = new javax.swing.JButton();
        fechar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        funcionario.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        funcionario.setText("Cadastro de Funcionários");
        getContentPane().add(funcionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 250, 30));
        getContentPane().add(separador_Funcionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 62, 670, 20));

        nome.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        nome.setText("Nome*");
        getContentPane().add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 60, 30));
        getContentPane().add(campo_Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 370, 30));

        setor.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        setor.setText("Setor*");
        getContentPane().add(setor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 30));
        getContentPane().add(campo_Setor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 240, 30));

        funcao.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        funcao.setText("Função*");
        getContentPane().add(funcao, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, 30));
        getContentPane().add(campo_Funcao, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 290, 30));

        turno.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        turno.setText("Turno*");
        getContentPane().add(turno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 30));

        sexo.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        sexo.setText("Sexo*");
        getContentPane().add(sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, 30));

        caixaDeCombinacaoDoSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Masculino", "Feminino" }));
        getContentPane().add(caixaDeCombinacaoDoSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 110, 30));

        dataDeNascimento.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        dataDeNascimento.setText("Data de Nascimento*");
        getContentPane().add(dataDeNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, -1, 50));

        campo_DataDeNascimento.setText("      dd/mm/aa");
        campo_DataDeNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_DataDeNascimentoActionPerformed(evt);
            }
        });
        getContentPane().add(campo_DataDeNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 90, 30));

        cadastrar.setText("Cadastrar");
        getContentPane().add(cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, -1, 30));

        fechar.setText("Fechar");
        getContentPane().add(fechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, -1, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Manhã", "Tarde", "Noite" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 90, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campo_DataDeNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_DataDeNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_DataDeNascimentoActionPerformed

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
            java.util.logging.Logger.getLogger(cadastrarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastrarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastrarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastrarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastrarFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Grupo_Botoes;
    private javax.swing.JButton cadastrar;
    private javax.swing.JComboBox<String> caixaDeCombinacaoDoSexo;
    private javax.swing.JTextField campo_DataDeNascimento;
    private javax.swing.JTextField campo_Funcao;
    private javax.swing.JTextField campo_Nome;
    private javax.swing.JTextField campo_Setor;
    private javax.swing.JLabel dataDeNascimento;
    private javax.swing.JButton fechar;
    private javax.swing.JLabel funcao;
    private javax.swing.JLabel funcionario;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel nome;
    private javax.swing.JSeparator separador_Funcionario;
    private javax.swing.JLabel setor;
    private javax.swing.JLabel sexo;
    private javax.swing.JLabel turno;
    // End of variables declaration//GEN-END:variables
}