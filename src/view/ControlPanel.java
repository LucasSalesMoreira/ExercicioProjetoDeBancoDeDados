package view;

import controller.Recorder;
import controller.Search;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Client;

/**
 *
 * @author lucas
 */
public class ControlPanel extends javax.swing.JFrame {

    public ControlPanel() {
        initComponents();
        loadJtable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btInsert = new javax.swing.JButton();
        btSelect = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btUpdate = new javax.swing.JButton();
        btClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        myJTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btShowAddress = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Painel de controle");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(68, 71, 73));

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("E-mail:");

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Nome:");

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("ID:");

        txtID.setForeground(new java.awt.Color(0, 0, 0));

        txtName.setForeground(new java.awt.Color(0, 0, 0));
        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameFocusLost(evt);
            }
        });

        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });

        btInsert.setBackground(new java.awt.Color(68, 71, 73));
        btInsert.setForeground(new java.awt.Color(204, 204, 204));
        btInsert.setText("Inserir");
        btInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInsertActionPerformed(evt);
            }
        });

        btSelect.setBackground(new java.awt.Color(68, 71, 73));
        btSelect.setForeground(new java.awt.Color(204, 204, 204));
        btSelect.setText("Selecionar");
        btSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelectActionPerformed(evt);
            }
        });

        btDelete.setBackground(new java.awt.Color(68, 71, 73));
        btDelete.setForeground(new java.awt.Color(204, 204, 204));
        btDelete.setText("Excluir");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        btUpdate.setBackground(new java.awt.Color(68, 71, 73));
        btUpdate.setForeground(new java.awt.Color(204, 204, 204));
        btUpdate.setText("Alterar");
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });

        btClear.setBackground(new java.awt.Color(68, 71, 73));
        btClear.setForeground(new java.awt.Color(204, 204, 204));
        btClear.setText("Limpar");
        btClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClearActionPerformed(evt);
            }
        });

        myJTable.setForeground(new java.awt.Color(0, 0, 0));
        myJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "E-mail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        myJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(myJTable);
        if (myJTable.getColumnModel().getColumnCount() > 0) {
            myJTable.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/database.png"))); // NOI18N

        btShowAddress.setBackground(new java.awt.Color(68, 71, 73));
        btShowAddress.setForeground(new java.awt.Color(204, 204, 204));
        btShowAddress.setText("Ver endereços");
        btShowAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btShowAddressActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(btInsert)
                        .addGap(18, 18, 18)
                        .addComponent(btSelect)
                        .addGap(18, 18, 18)
                        .addComponent(btDelete)
                        .addGap(18, 18, 18)
                        .addComponent(btUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btClear))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtName))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btShowAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btShowAddress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInsert)
                    .addComponent(btSelect)
                    .addComponent(btDelete)
                    .addComponent(btUpdate)
                    .addComponent(btClear))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clear() {
        txtID.setText(null);
        txtName.setText(null);
        txtEmail.setText(null);
    }
    
    private void loadJtable() {
        Search.searchAllClients();
    }
    
    private void btClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearActionPerformed
        clear();
    }//GEN-LAST:event_btClearActionPerformed

    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
        String name = txtName.getText();
        if (!name.equals("") || !name.isEmpty()) {
            if (!name.equals(name.toUpperCase())) {
                //JOptionPane.showMessageDialog(null, "O nome precisa estar em maiúsculo!");
                txtName.setText(name.toUpperCase());
            }
        }
    }//GEN-LAST:event_txtNameFocusLost

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        String email = txtEmail.getText();
        if (!email.equals("") || !email.isEmpty()) {
            if (!email.equals(email.toLowerCase())) {
                //JOptionPane.showMessageDialog(null, "O e-mail precisa estar em minúsculo!");
                txtEmail.setText(email.toLowerCase());
            }
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void btSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelectActionPerformed
        loadJtable();
    }//GEN-LAST:event_btSelectActionPerformed

    private void btInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInsertActionPerformed
        String name = txtName.getText();
        String email = txtEmail.getText();
        if (!email.equals("") && !email.isEmpty() && !name.equals("") && !name.isEmpty()) {
            if (new Recorder(new Client(txtName.getText(), txtEmail.getText())).createClientRegister()) {
                //JOptionPane.showMessageDialog(null, "Novo cliente cadastrado!");
                clear();
                loadJtable();
            } else {
                JOptionPane.showMessageDialog(null, "Problema ao tentar cadastrar!");
                clear();
            }
        } else {
           JOptionPane.showMessageDialog(null, "Dados inadequados!");
        }
    }//GEN-LAST:event_btInsertActionPerformed

    private void myJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myJTableMouseClicked
        int row = myJTable.rowAtPoint(evt.getPoint());
        
        DefaultTableModel tableModel = (DefaultTableModel) myJTable.getModel();
        
        Vector dataRow = (Vector) tableModel.getDataVector().get(row);
        System.out.println(dataRow.toString());
        
        String id = dataRow.get(0).toString();
        String name = dataRow.get(1).toString();
        String email = dataRow.get(2).toString();
        
        txtID.setText(id);
        txtName.setText(name);
        txtEmail.setText(email);
    }//GEN-LAST:event_myJTableMouseClicked

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        String id = txtID.getText();
        String name = txtName.getText();
        String email = txtEmail.getText();
        if (!email.equals("") && !email.isEmpty() && !name.equals("") && 
                !name.isEmpty() && !id.equals("") && !id.isEmpty()) {
            
            if (new Recorder(new Client(Integer.parseInt(txtID.getText()), 
                    txtName.getText(), txtEmail.getText())).deleteClientRegister()) {
            
                //JOptionPane.showMessageDialog(null, "Cliente deletado!");
                clear();
                loadJtable();
            
            } else {
                JOptionPane.showMessageDialog(null, "Problema ao tentar deletar!");
                clear();
            }
        
        } else {
           JOptionPane.showMessageDialog(null, "Dados inadequados!");
        }
    }//GEN-LAST:event_btDeleteActionPerformed

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        String id = txtID.getText();
        String name = txtName.getText();
        String email = txtEmail.getText();
        if (!email.equals("") && !email.isEmpty() && !name.equals("") && 
                !name.isEmpty() && !id.equals("") && !id.isEmpty()) {
            
            if (new Recorder(new Client(Integer.parseInt(txtID.getText()), 
                    txtName.getText(), txtEmail.getText())).updateClientRegister()) {
            
                //JOptionPane.showMessageDialog(null, "Cliente atualizado!");
                clear();
                loadJtable();
            
            } else {
                JOptionPane.showMessageDialog(null, "Problema ao tentar atualizar!");
                clear();
            }
        
        } else {
           JOptionPane.showMessageDialog(null, "Dados inadequados!");
        }
    }//GEN-LAST:event_btUpdateActionPerformed

    private void btShowAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btShowAddressActionPerformed
        new AddressView().setVisible(true);
    }//GEN-LAST:event_btShowAddressActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btClear;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btInsert;
    private javax.swing.JButton btSelect;
    private javax.swing.JButton btShowAddress;
    private javax.swing.JButton btUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable myJTable;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
