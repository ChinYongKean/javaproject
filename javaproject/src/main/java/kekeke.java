
package project;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class kekeke extends javax.swing.JFrame {

    
    public kekeke() {
        initComponents();
        product();
    }
    
    Connection connect = null;
    Statement state = null;
    ResultSet rset = null;

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title10 = new javax.swing.JLabel();
        deletebutton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        store_name1 = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();
        title11 = new javax.swing.JLabel();
        title6 = new javax.swing.JLabel();
        title5 = new javax.swing.JLabel();
        title13 = new javax.swing.JLabel();
        title8 = new javax.swing.JLabel();
        title7 = new javax.swing.JLabel();
        title12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        product_table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        action_exit = new java.awt.Button();
        jButton4 = new javax.swing.JButton();
        title14 = new javax.swing.JLabel();
        category = new javax.swing.JComboBox<>();
        product_description = new javax.swing.JTextField();
        product_description1 = new javax.swing.JTextField();
        product_description2 = new javax.swing.JTextField();
        product_description3 = new javax.swing.JTextField();
        product_description4 = new javax.swing.JTextField();
        product_description5 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        deletebutton1 = new javax.swing.JButton();
        addbutton = new javax.swing.JButton();

        title10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        title10.setText("Product ID     :");

        deletebutton.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        deletebutton.setText("Delete");
        deletebutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 2));
        deletebutton.setPreferredSize(new java.awt.Dimension(50, 25));
        deletebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletebuttonMouseClicked(evt);
            }
        });
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 51, 51));

        store_name1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        store_name1.setForeground(new java.awt.Color(204, 204, 255));
        store_name1.setText("YY Clothing Store");

        title1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        title1.setForeground(new java.awt.Color(255, 255, 255));
        title1.setText("INVENTORY MANAGEMENT SYSTEM");

        title2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        title2.setForeground(new java.awt.Color(255, 255, 255));
        title2.setText("Manage Product");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(store_name1)
                .addGap(95, 95, 95)
                .addComponent(title1)
                .addContainerGap(246, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(title2)
                .addGap(350, 350, 350))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(title1))
                    .addComponent(store_name1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        title11.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        title11.setText("Product ID     :");

        title6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        title6.setText("Name            :");

        title5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        title5.setText("Size                :");

        title13.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        title13.setText("Colour           :");

        title8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        title8.setText("Quantity        :");

        title7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        title7.setText("Description   :");

        title12.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        title12.setText("Category      :");

        product_table.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        product_table.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        product_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Name", "Size", "Colour", "Quantity", "Description", "Category"
            }
        ));
        product_table.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jScrollPane1.setViewportView(product_table);

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));

        action_exit.setBackground(new java.awt.Color(255, 51, 51));
        action_exit.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        action_exit.setForeground(new java.awt.Color(255, 255, 255));
        action_exit.setLabel("Close");
        action_exit.setName(""); // NOI18N
        action_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                action_exitActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 51, 51));
        jButton4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 691, Short.MAX_VALUE)
                .addComponent(action_exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4)
                    .addComponent(action_exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        title14.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        title14.setText("Product List");

        category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        category.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        category.setPreferredSize(new java.awt.Dimension(121, 23));
        category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryActionPerformed(evt);
            }
        });

        product_description.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        product_description.setPreferredSize(new java.awt.Dimension(121, 23));

        product_description1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        product_description1.setPreferredSize(new java.awt.Dimension(121, 23));

        product_description2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        product_description2.setPreferredSize(new java.awt.Dimension(121, 23));

        product_description3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        product_description3.setPreferredSize(new java.awt.Dimension(121, 23));

        product_description4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        product_description4.setPreferredSize(new java.awt.Dimension(121, 23));

        product_description5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        product_description5.setPreferredSize(new java.awt.Dimension(121, 23));

        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton2.setText("Edit");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 2));
        jButton2.setPreferredSize(new java.awt.Dimension(50, 25));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        deletebutton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        deletebutton1.setText("Delete");
        deletebutton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 2));
        deletebutton1.setPreferredSize(new java.awt.Dimension(50, 25));
        deletebutton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletebutton1MouseClicked(evt);
            }
        });
        deletebutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebutton1ActionPerformed(evt);
            }
        });

        addbutton.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        addbutton.setText("Add");
        addbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 2));
        addbutton.setPreferredSize(new java.awt.Dimension(50, 25));
        addbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbuttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(title12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(category, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(title8, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(title7)
                                    .addComponent(title13, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(title5)
                                    .addComponent(title6)
                                    .addComponent(title11))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(product_description, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(product_description1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(product_description2, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(product_description4, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                            .addComponent(product_description3, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(product_description5, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)))))
                        .addGap(47, 47, 47))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(addbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(deletebutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title14)
                .addGap(227, 227, 227))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(title11)
                            .addComponent(product_description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(title6)
                            .addComponent(product_description1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(title5)
                            .addComponent(product_description2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(title13)
                            .addComponent(product_description3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(title8)
                            .addComponent(product_description4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(title7)
                            .addComponent(product_description5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(title12)
                            .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deletebutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(title14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void action_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_action_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_action_exitActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        if(product_id.getText().isEmpty()||product_name.getText().isEmpty()||product_size.getText().isEmpty()||product_colour.getText().isEmpty()||product_quantity.getText().isEmpty()||product_description.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please take a look again if there is any missing information."); //dialog message when the text field is empty
        }
        else
        {
            try{
                connect = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDB","yc","1412");
                String edit = "update yc.product_db set PRODUCT_NAME='"+ product_name.getText()+"'"+",SIZE='"+product_size.getText()+"'"+",COLOUR='"+product_colour.getText()+"'"+",QUANTITY="+product_quantity.getText()+",DESCRIPTION='"+product_description.getText()+"'"+",CATEGORY='"+category.getSelectedItem().toString()+"'"+"where PRODUCT_ID="+product_id.getText();
                Statement Add= connect.createStatement();
                Add.executeUpdate(edit);
                JOptionPane.showMessageDialog(this, "The selected product is updated successfully.");  //dialog message after the edit/update is successful
                product();
            }catch (Exception e)
            {
                e.printStackTrace();

            }
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void deletebuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebuttonMouseClicked
        if(product_id.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please key-in the product ID to be deleted.");  //dialog message when product id is empty
        }
        else
        {
            try{
                connect = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDB","yc","1412");
                String id = product_id.getText();
                String Query = "Delete from yc.product_db where product_id="+ id;
                Statement Add = connect.createStatement();
                Add.executeUpdate(Query);
                product();
                JOptionPane.showMessageDialog(this, "The product entered is deleted successfully."); //dialog message when the product is deleted successfully
            }catch(SQLException e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_deletebuttonMouseClicked

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deletebuttonActionPerformed

    private void deletebutton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebutton1MouseClicked
        if(product_id.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please key-in the product ID to be deleted.");  //dialog message when product id is empty
        }
        else
        {
            try{
                connect = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDB","yc","1412");
                String id = product_id.getText();
                String Query = "Delete from yc.product_db where product_id="+ id;
                Statement Add = connect.createStatement();
                Add.executeUpdate(Query);
                product();
                JOptionPane.showMessageDialog(this, "The product entered is deleted successfully."); //dialog message when the product is deleted successfully
            }catch(SQLException e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_deletebutton1MouseClicked

    private void deletebutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebutton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deletebutton1ActionPerformed

    private void addbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbuttonMouseClicked

        try{
            connect = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDB","yc","1412"); //established connection to java db with user login
            PreparedStatement add = connect.prepareStatement("insert into product_db VALUES(?,?,?,?,?,?,?)"); //insert the input data into the table (product_db)
            add.setInt(1, Integer.valueOf(product_id.getText())); //
            add.setString(2, product_name.getText());
            add.setString(3, product_size.getText());
            add.setString(4, product_colour.getText());
            add.setInt(5, Integer.valueOf(product_quantity.getText()));
            add.setString(6, product_description.getText());
            add.setString(7, category.getSelectedItem().toString());
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this,"Product information is added succesfully, thank you.");  //dialog message when the product is added successfully
            connect.close();
            product();

        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_addbuttonMouseClicked
    public void product()
    {
        try{
            connect = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDB","yc","1412"); //established connection to java db with user login
            state = connect.createStatement();
            rset = state.executeQuery("Select * from product_db");
            product_table.setModel(DbUtils.resultSetToTableModel(rset));
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    private void product_nameActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void product_idActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void action_exitActionPerformed(java.awt.event.ActionEvent evt) {                                            
        System.exit(0);
    }                                           

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void categoryActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    //add function
    private void addbuttonMouseClicked(java.awt.event.MouseEvent evt) {                                       
        
        try{
            connect = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDB","yc","1412"); //established connection to java db with user login
            PreparedStatement add = connect.prepareStatement("insert into product_db VALUES(?,?,?,?,?,?,?)"); //insert the input data into the table (product_db)
            add.setInt(1, Integer.valueOf(product_id.getText())); //
            add.setString(2, product_name.getText());
            add.setString(3, product_size.getText());
            add.setString(4, product_colour.getText());
            add.setInt(5, Integer.valueOf(product_quantity.getText()));
            add.setString(6, product_description.getText());
            add.setString(7, category.getSelectedItem().toString());
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this,"Product information is added succesfully, thank you.");  //dialog message when the product is added successfully
            connect.close();
            product();
            
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }                                      

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    //delete function 
    private void deletebuttonMouseClicked(java.awt.event.MouseEvent evt) {                                          
        if(product_id.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please key-in the product ID to be deleted.");  //dialog message when product id is empty
        }
        else
        {
            try{
                connect = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDB","yc","1412");
                String id = product_id.getText();
                String Query = "Delete from yc.product_db where product_id="+ id;
                Statement Add = connect.createStatement();
                Add.executeUpdate(Query);
                product();
                JOptionPane.showMessageDialog(this, "The product entered is deleted successfully."); //dialog message when the product is deleted successfully
            }catch(SQLException e)
            {
                e.printStackTrace();
            }
        }
    }                                         
    
    //show the data by selecting from the list 
    private void product_tableMouseClicked(java.awt.event.MouseEvent evt) {                                           
        DefaultTableModel table = (DefaultTableModel)product_table.getModel(); //call data the from the table
        int x = product_table.getSelectedRow();
        product_id.setText(table.getValueAt(x, 0).toString());
        product_name.setText(table.getValueAt(x, 1).toString());
        product_size.setText(table.getValueAt(x, 2).toString());
        product_colour.setText(table.getValueAt(x, 3).toString());
        product_quantity.setText(table.getValueAt(x, 4).toString());
        product_description.setText(table.getValueAt(x, 5).toString());
        
    }                                          
    
    //edit function
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {                                      
        if(product_id.getText().isEmpty()||product_name.getText().isEmpty()||product_size.getText().isEmpty()||product_colour.getText().isEmpty()||product_quantity.getText().isEmpty()||product_description.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please take a look again if there is any missing information."); //dialog message when the text field is empty
        }
        else
        {
            try{
               connect = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDB","yc","1412");
               String edit = "update yc.product_db set PRODUCT_NAME='"+ product_name.getText()+"'"+",SIZE='"+product_size.getText()+"'"+",COLOUR='"+product_colour.getText()+"'"+",QUANTITY="+product_quantity.getText()+",DESCRIPTION='"+product_description.getText()+"'"+",CATEGORY='"+category.getSelectedItem().toString()+"'"+"where PRODUCT_ID="+product_id.getText();
               Statement Add= connect.createStatement();
               Add.executeUpdate(edit);
               JOptionPane.showMessageDialog(this, "The selected product is updated successfully.");  //dialog message after the edit/update is successful
               product();
                }catch (Exception e)
                {
                    e.printStackTrace();
                
                }
                }     
    }
    
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
            java.util.logging.Logger.getLogger(kekeke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kekeke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kekeke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kekeke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kekeke().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private java.awt.Button action_exit;
    private javax.swing.JButton addbutton;
    private javax.swing.JComboBox<String> category;
    private javax.swing.JButton deletebutton;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField product_colour;
    private javax.swing.JTextField product_description;
    private javax.swing.JTextField product_id;
    private javax.swing.JTextField product_name;
    private javax.swing.JTextField product_quantity;
    private javax.swing.JTextField product_size;
    private javax.swing.JTable product_table;
    private javax.swing.JLabel store_name;
    private javax.swing.JLabel store_name1;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title10;
    private javax.swing.JLabel title11;
    private javax.swing.JLabel title12;
    private javax.swing.JLabel title13;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel title4;
    private javax.swing.JLabel title5;
    private javax.swing.JLabel title6;
    private javax.swing.JLabel title7;
    private javax.swing.JLabel title8;
    private javax.swing.JLabel title9;
    // End of variables declaration 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button action_exit;
    private javax.swing.JButton addbutton;
    private javax.swing.JComboBox<String> category;
    private javax.swing.JButton deletebutton;
    private javax.swing.JButton deletebutton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField product_description;
    private javax.swing.JTextField product_description1;
    private javax.swing.JTextField product_description2;
    private javax.swing.JTextField product_description3;
    private javax.swing.JTextField product_description4;
    private javax.swing.JTextField product_description5;
    private javax.swing.JTable product_table;
    private javax.swing.JLabel store_name1;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title10;
    private javax.swing.JLabel title11;
    private javax.swing.JLabel title12;
    private javax.swing.JLabel title13;
    private javax.swing.JLabel title14;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel title5;
    private javax.swing.JLabel title6;
    private javax.swing.JLabel title7;
    private javax.swing.JLabel title8;
    // End of variables declaration//GEN-END:variables
}
