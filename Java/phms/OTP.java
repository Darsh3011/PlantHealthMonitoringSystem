package phms;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import paneles.UserHome;

public class OTP extends javax.swing.JFrame {

    static int otp;
    static String unm="",otp_mail=null;
    
    public OTP(String unm,int otp,String otp_mail) {
        this.unm=unm; this.otp_mail=otp_mail;
        this.otp=otp;
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/img/logo.png")).getImage());        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        uotp = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        Btnveriy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(233, 239, 186));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(233, 239, 186));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otp.png"))); // NOI18N

        jLabel5.setBackground(new java.awt.Color(249, 248, 235));
        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(64, 81, 94));
        jLabel5.setText("Confirmation Code:");

        uotp.setBackground(new java.awt.Color(231, 240, 195));
        uotp.setFont(new java.awt.Font("Berlin Sans FB", 0, 17)); // NOI18N
        uotp.setForeground(new java.awt.Color(105, 132, 116));
        uotp.setText(" Enter OTP");
        uotp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 199, 167)));
        uotp.setCaretColor(new java.awt.Color(114, 157, 57));
        uotp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                uotpFocusGained(evt);
            }
        });
        uotp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uotpActionPerformed(evt);
            }
        });

        jSeparator4.setBackground(new java.awt.Color(114, 157, 57));
        jSeparator4.setForeground(new java.awt.Color(186, 199, 167));

        Btnveriy.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        Btnveriy.setText("Verify");
        Btnveriy.setOpaque(false);
        Btnveriy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnveriyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(uotp)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Btnveriy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(uotp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Btnveriy)
                        .addGap(37, 37, 37))))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void uotpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_uotpFocusGained
        uotp.setText("");
    }//GEN-LAST:event_uotpFocusGained

    private void uotpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uotpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uotpActionPerformed

    private void BtnveriyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnveriyActionPerformed
        if(uotp.getText().isEmpty() || uotp.getText().equals(" Enter OTP"))
            JOptionPane.showMessageDialog(null,"Please Enter OTP","Confirmation Code Error",JOptionPane.ERROR_MESSAGE);
        else
        {
            try{
            if(Integer.parseInt(uotp.getText())==otp)
            {
                UserHome uh=new UserHome(unm,"true",otp_mail);                               
                this.setVisible(false);
            }
            else
                JOptionPane.showMessageDialog(null,"OTP is Incorrect, Please check again.","Confirmation Code Error",JOptionPane.ERROR_MESSAGE);

            }catch(Exception e){ System.out.println("Excp : "+e.getMessage());}
        }
    }//GEN-LAST:event_BtnveriyActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OTP(unm,otp,otp_mail).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btnveriy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField uotp;
    // End of variables declaration//GEN-END:variables
}
