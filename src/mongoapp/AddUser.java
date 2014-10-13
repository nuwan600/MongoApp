/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mongoapp;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;

/**
 *
 * @author nuwan600
 */
public class AddUser extends javax.swing.JFrame {

    /**
     * Creates new form AddUser
     */
    public AddUser() {
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

        jLable_add_id = new javax.swing.JLabel();
        jTextField_add_ID = new javax.swing.JTextField();
        jLabel_add_fname = new javax.swing.JLabel();
        jLabel_add_lname = new javax.swing.JLabel();
        jTextField_add_fName = new javax.swing.JTextField();
        jTextField_add_lName = new javax.swing.JTextField();
        jLabel_add_email = new javax.swing.JLabel();
        jTextField_add_email = new javax.swing.JTextField();
        jButton1_add = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLable_add_id.setText("ID");

        jTextField_add_ID.setToolTipText("");

        jLabel_add_fname.setText("FirstName");

        jLabel_add_lname.setText("LastName");
        jLabel_add_lname.setToolTipText("");

        jLabel_add_email.setText("Email");

        jButton1_add.setText("Add");
        jButton1_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel_add_fname)
                                .addComponent(jLable_add_id))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField_add_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField_add_fName)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel_add_lname)
                                .addComponent(jLabel_add_email))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField_add_lName)
                                .addComponent(jTextField_add_email))))
                    .addComponent(jButton1_add, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLable_add_id)
                    .addComponent(jTextField_add_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_add_fname)
                    .addComponent(jTextField_add_fName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_add_lname)
                    .addComponent(jTextField_add_lName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_add_email)
                    .addComponent(jTextField_add_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1_add)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jLable_add_id.getAccessibleContext().setAccessibleName("jLable_add_id");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_addActionPerformed
        // TODO add your handling code here:
        User newUser =new User();
        
        newUser.setId(Integer.parseInt(jTextField_add_ID.getText().toString()));
        newUser.setFirstName(jTextField_add_fName.getText().toString());
        newUser.setLastName(jTextField_add_lName.getText().toString());
        newUser.setEmail(jTextField_add_email.getText());
        
        DBObject doc = createDBObject(newUser);
        DB userDB = DBManager.getDatabase();
        DBCollection col = userDB.getCollection("user");
	WriteResult result = col.insert(doc);

        
    }//GEN-LAST:event_jButton1_addActionPerformed

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
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUser().setVisible(true);
            }
        });
    }
    
    
     private static DBObject createDBObject(User user) {
	        BasicDBObjectBuilder docBuilder = BasicDBObjectBuilder.start();
	                                 
	        docBuilder.append("id", user.getId());
	        docBuilder.append("firstName", user.getFirstName());
	        docBuilder.append("lastName", user.getLastName());
	        docBuilder.append("email", user.getEmail());
	        return docBuilder.get();
	    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_add;
    private javax.swing.JLabel jLabel_add_email;
    private javax.swing.JLabel jLabel_add_fname;
    private javax.swing.JLabel jLabel_add_lname;
    private javax.swing.JLabel jLable_add_id;
    private javax.swing.JTextField jTextField_add_ID;
    private javax.swing.JTextField jTextField_add_email;
    private javax.swing.JTextField jTextField_add_fName;
    private javax.swing.JTextField jTextField_add_lName;
    // End of variables declaration//GEN-END:variables
}