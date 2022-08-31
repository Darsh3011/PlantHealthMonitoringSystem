package paneles;

import java.awt.Cursor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import phms.Connect;
import phms.Home;

public class Login extends javax.swing.JPanel {

    public Statement st;
    public Connect c=new Connect();
    public String uname=null;
    public String pass=null;

    public Login() {
        st=c.connection("userdatabase");       
        initComponents();        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        unm = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        upass = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(54, 98, 43));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(249, 248, 235));
        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(198, 227, 119));
        jLabel2.setText("Username");

        jLabel3.setBackground(new java.awt.Color(249, 248, 235));
        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(198, 227, 119));
        jLabel3.setText("Password");

        unm.setBackground(new java.awt.Color(54, 98, 43));
        unm.setFont(new java.awt.Font("Berlin Sans FB", 0, 17)); // NOI18N
        unm.setForeground(new java.awt.Color(114, 157, 57));
        unm.setText("Enter Username");
        unm.setBorder(null);
        unm.setCaretColor(new java.awt.Color(114, 157, 57));
        unm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                unmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                unmFocusLost(evt);
            }
        });
        unm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unmActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(114, 157, 57));
        jSeparator1.setForeground(new java.awt.Color(114, 157, 57));

        upass.setBackground(new java.awt.Color(54, 98, 43));
        upass.setFont(new java.awt.Font("Comic Sans MS", 0, 17)); // NOI18N
        upass.setForeground(new java.awt.Color(114, 157, 57));
        upass.setText("12345678910");
        upass.setBorder(null);
        upass.setCaretColor(new java.awt.Color(114, 157, 57));
        upass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                upassFocusGained(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(114, 157, 57));
        jSeparator2.setForeground(new java.awt.Color(114, 157, 57));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SignInBtn.png"))); // NOI18N
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel1MouseMoved(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(unm)
                        .addComponent(jSeparator1)
                        .addComponent(jSeparator2)
                        .addComponent(upass, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(unm, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel3)
                .addGap(27, 27, 27)
                .addComponent(upass, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(62, 62, 62))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void unmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unmActionPerformed
    }//GEN-LAST:event_unmActionPerformed

    private void unmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_unmFocusGained
       unm.setText("");
    }//GEN-LAST:event_unmFocusGained

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        
    }//GEN-LAST:event_formFocusGained

    private void upassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_upassFocusGained
        upass.setText("");
    }//GEN-LAST:event_upassFocusGained

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

    uname=unm.getText();
    pass=upass.getText();
    int f=0;
    String tmp="";        
    
    if(unm.getText().isEmpty() || upass.getText().isEmpty() || unm.getText().equals("Enter Username") || upass.getText().equals("12345678910"))
        JOptionPane.showMessageDialog(null,"Please fill all the details","Login Error",JOptionPane.ERROR_MESSAGE);
    else
    {
        try
        {
            ResultSet rs=st.executeQuery("select password from users where name='"+uname+"'");
            while(rs.next())
            {      
                f=1;
                tmp=rs.getString("password");
            }
            if(f==0)
            {
                JOptionPane.showMessageDialog(null,"User not exists","Login Error",JOptionPane.ERROR_MESSAGE);
                upass.setText(null);
                unm.setText(null);
            }
            else if(!(pass.equals(tmp)))
            {
                JOptionPane.showMessageDialog(null,"Wrong password","Login Error",JOptionPane.ERROR_MESSAGE);            
                upass.setText(null);
            }
            else
            {
                Home hm=new Home(uname);
                hm.setVisible(true);
            }
        }
        catch(SQLException e2){System.out.println("Exception aayi h "+e2.getMessage());}                    
    }
    
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseMoved
       jLabel1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel1MouseMoved

    private void unmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_unmFocusLost
       upass.setText(uname);
    }//GEN-LAST:event_unmFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField unm;
    private javax.swing.JPasswordField upass;
    // End of variables declaration//GEN-END:variables
}
