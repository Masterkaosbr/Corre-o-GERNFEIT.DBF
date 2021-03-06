/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Dao.gernfeitDao;
import Modelo.gernfeitTO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Masterkaos
 */
public class Tela_EditarGernfeit extends javax.swing.JFrame {

    /**
     * Creates new form Tela_EditarGernfeit
     */
    public Tela_EditarGernfeit() {
        initComponents();
        blockearCampos();
        setLocationRelativeTo(this);
        
    }
    public Tela_EditarGernfeit(int num){
        initComponents();
        liberarCampos();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tf_num_nfe = new javax.swing.JTextField();
        tf_mod_nfece = new javax.swing.JTextField();
        tf_num_seq = new javax.swing.JTextField();
        tf_desc_prod = new javax.swing.JTextField();
        tf_qtde_prod = new javax.swing.JTextField();
        tf_val_unit = new javax.swing.JTextField();
        tf_val_desc = new javax.swing.JTextField();
        tf_val_total = new javax.swing.JTextField();
        bt_cancelar = new javax.swing.JButton();
        bt_salvar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        bt_cancelar.setText("Cancelar");
        bt_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_cancelarMouseClicked(evt);
            }
        });

        bt_salvar.setText("Salvar");
        bt_salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_salvarMouseClicked(evt);
            }
        });

        jLabel1.setText("NUMERO NFE:");

        jLabel2.setText("MODELO NFECE:");

        jLabel3.setText("NUM. SEQ. ITEM:");

        jLabel4.setText("DESC. PROD:");

        jLabel5.setText("QTDE PROD:");

        jLabel6.setText("VAL. UNIT:");

        jLabel7.setText("VAL. DESC:");

        jLabel8.setText("VAL. TOTAL:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(tf_num_nfe, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(tf_mod_nfece, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(tf_num_seq, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(tf_desc_prod))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tf_val_desc, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_val_unit, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_qtde_prod, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_val_total, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_salvar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_num_nfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(tf_mod_nfece, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(tf_num_seq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_desc_prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_qtde_prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_val_unit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_val_desc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_val_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_cancelar)
                    .addComponent(bt_salvar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_salvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_salvarMouseClicked
        gernfeitTO to = new gernfeitTO();
        
        to.setNum_nfe(tf_num_nfe.getText());
        to.setMod_nfece(tf_mod_nfece.getText());
        to.setNum_seq(tf_num_seq.getText());
        to.setDes_prod(tf_desc_prod.getText());
        to.setQtde_prod(Integer.parseInt(tf_qtde_prod.getText()));
        to.setVal_unit(Double.parseDouble(tf_val_unit.getText()));
        to.setVal_desc(Double.parseDouble(tf_val_desc.getText()));
        to.setVal_total(Double.parseDouble(tf_val_total.getText()));
        
        gernfeitDao dao = new gernfeitDao();
        
        try {
            dao.atualizar(to);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Tela_EditarGernfeit.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        this.dispose();
        
    }//GEN-LAST:event_bt_salvarMouseClicked

    private void bt_cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_bt_cancelarMouseClicked

    /**
     * @param num_nfe
     * @param mod_nfece
     * @param num_seq
     * @param des_prod
     * @param qtde_prod
     * @param val_unit
     * @param val_desc
     * @param val_total
     */
    public void camposEditar(
            String num_nfe,
            String mod_nfece,
            String num_seq,
            String des_prod,
            int qtde_prod,
            double val_unit,
            double val_desc,
            double val_total) {
        tf_num_nfe.setText(num_nfe);
        tf_mod_nfece.setText(mod_nfece);
        tf_num_seq.setText(num_seq);
        tf_desc_prod.setText(des_prod);
        tf_qtde_prod.setText(Double.toString(qtde_prod));
        tf_val_unit.setText(Double.toString(val_unit));
        tf_val_desc.setText(Double.toString(val_desc));
        tf_val_total.setText(Double.toString(val_total));
    }
    
    public void editarGernfeit(String num_nfe,String mod_nfece,String num_seq,String des_prod,String qtde_prod,String val_unit,String val_desc,String val_total){
        tf_num_nfe.setText(num_nfe);
        tf_mod_nfece.setText(mod_nfece);
        tf_num_seq.setText(num_seq);
        tf_desc_prod.setText(des_prod);
        tf_qtde_prod.setText(qtde_prod);
        tf_val_unit.setText(val_unit);
        tf_val_desc.setText(val_desc);
        tf_val_total.setText(val_total);
    }
    
    private void liberarCampos(){
        tf_num_nfe.setEnabled(true);
        tf_mod_nfece.setEnabled(true);
        tf_num_seq.setEnabled(true);
        tf_desc_prod.setEnabled(true);
        tf_qtde_prod.setEnabled(true);
        tf_val_unit.setEnabled(true);
        tf_val_desc.setEnabled(true);
        tf_val_total.setEnabled(true);
    }
    private void blockearCampos(){
        tf_num_nfe.setEnabled(false);
        tf_mod_nfece.setEnabled(false);
        tf_num_seq.setEnabled(false);
        tf_desc_prod.setEnabled(false);
        tf_qtde_prod.setEnabled(false);
        tf_val_unit.setEnabled(false);
        tf_val_desc.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cancelar;
    private javax.swing.JButton bt_salvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField tf_desc_prod;
    private javax.swing.JTextField tf_mod_nfece;
    private javax.swing.JTextField tf_num_nfe;
    private javax.swing.JTextField tf_num_seq;
    private javax.swing.JTextField tf_qtde_prod;
    private javax.swing.JTextField tf_val_desc;
    private javax.swing.JTextField tf_val_total;
    private javax.swing.JTextField tf_val_unit;
    // End of variables declaration//GEN-END:variables
}
