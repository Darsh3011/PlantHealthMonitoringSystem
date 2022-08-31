package paneles;

import java.util.Random;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.awt.Cursor;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Statement;
import java.util.Properties;
import javax.swing.JOptionPane;
import phms.Connect;

public class SignUp extends javax.swing.JPanel {

    public Statement st;
    public Connect c=new Connect();
    public String email=null,db=null;
    public int otp;
    Random rand=new Random();
    
    public SignUp() {
        otp=rand.nextInt(999999);
        st=c.connection("userdatabase");       
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        upass = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        umail = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        uotp = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(54, 98, 43));

        jLabel2.setBackground(new java.awt.Color(249, 248, 235));
        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(198, 227, 119));
        jLabel2.setText("Username");

        jLabel3.setBackground(new java.awt.Color(249, 248, 235));
        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(198, 227, 119));
        jLabel3.setText("Password");

        uname.setBackground(new java.awt.Color(54, 98, 43));
        uname.setFont(new java.awt.Font("Berlin Sans FB", 0, 17)); // NOI18N
        uname.setForeground(new java.awt.Color(114, 157, 57));
        uname.setText("Enter Username");
        uname.setBorder(null);
        uname.setCaretColor(new java.awt.Color(114, 157, 57));
        uname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                unameFocusGained(evt);
            }
        });
        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SignUpBtn.png"))); // NOI18N
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

        jLabel4.setBackground(new java.awt.Color(249, 248, 235));
        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(198, 227, 119));
        jLabel4.setText("Email id");

        umail.setBackground(new java.awt.Color(54, 98, 43));
        umail.setFont(new java.awt.Font("Berlin Sans FB", 0, 17)); // NOI18N
        umail.setForeground(new java.awt.Color(114, 157, 57));
        umail.setText("Enter Email id");
        umail.setBorder(null);
        umail.setCaretColor(new java.awt.Color(114, 157, 57));
        umail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                umailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                umailFocusLost(evt);
            }
        });
        umail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                umailActionPerformed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(114, 157, 57));
        jSeparator3.setForeground(new java.awt.Color(114, 157, 57));

        jLabel5.setBackground(new java.awt.Color(249, 248, 235));
        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(198, 227, 119));
        jLabel5.setText("OTP");

        uotp.setBackground(new java.awt.Color(54, 98, 43));
        uotp.setFont(new java.awt.Font("Berlin Sans FB", 0, 17)); // NOI18N
        uotp.setForeground(new java.awt.Color(114, 157, 57));
        uotp.setText("Enter OTP");
        uotp.setBorder(null);
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
        jSeparator4.setForeground(new java.awt.Color(114, 157, 57));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/initial.png"))); // NOI18N
        jLabel6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel6MouseMoved(evt);
            }
        });
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(upass, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                            .addComponent(jSeparator4)
                            .addComponent(uotp)
                            .addComponent(jSeparator3)
                            .addComponent(umail)
                            .addComponent(jSeparator1)
                            .addComponent(uname)
                            .addComponent(jSeparator2))
                        .addGap(32, 32, 32)
                        .addComponent(jLabel6)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(umail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(uotp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(upass, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(17, 17, 17))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void unameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_unameFocusGained
        uname.setText("");
    }//GEN-LAST:event_unameFocusGained

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameActionPerformed

    }//GEN-LAST:event_unameActionPerformed

    private void upassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_upassFocusGained
        upass.setText("");
    }//GEN-LAST:event_upassFocusGained

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
            
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SignUpBtnReleased.png")));
        
        if(uname.getText().isEmpty() || umail.getText().isEmpty() || uotp.getText().isEmpty() || upass.getText().isEmpty() || uname.getText().equals("Enter Username") || umail.getText().equals("Enter Email id") || uotp.getText().equals("Enter OTP") || upass.getText().equals("12345678910"))
            JOptionPane.showMessageDialog(null,"Please fill all the details","Login Error",JOptionPane.ERROR_MESSAGE);
        else
        {
            if(Integer.parseInt(uotp.getText())==otp)
            {
                try
                {
                    db=uname.getText().replaceAll(" ","");
                    String qry="insert into users values('"+uname.getText()+"','"+umail.getText()+"','"+upass.getText()+"')";
                    int count=st.executeUpdate(qry);
                    createDB(db);
                    JOptionPane.showMessageDialog(null,"User Registered successfully","Congratulations",JOptionPane.INFORMATION_MESSAGE);                            
                }
                catch(Exception e2){System.out.println("Exception aayi h connect class me "+e2.getMessage());}               
            }
            else
            {
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/unavailable.png")));
                JOptionPane.showMessageDialog(null, "OTP or Email id is Incorrect, Please check again...");
            }                                                         
        }
         
    }//GEN-LAST:event_jLabel1MouseClicked

    private void umailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_umailFocusGained
        umail.setText("");
    }//GEN-LAST:event_umailFocusGained

    private void umailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_umailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_umailActionPerformed

    private void uotpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_uotpFocusGained
        uotp.setText("");
    }//GEN-LAST:event_uotpFocusGained

    private void uotpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uotpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uotpActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        try
        {
            email=umail.getText();
            sendMail(email);
            umail.setText(email);
        }
        catch(Exception e){ System.out.println("sendMail Exception: "+e.getMessage());}
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseMoved
        jLabel6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel6MouseMoved

    private void umailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_umailFocusLost
        umail.setText(email);
    }//GEN-LAST:event_umailFocusLost

    private void jLabel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseMoved
        jLabel1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel1MouseMoved

public void createDB(String dbname)throws MalformedURLException
{
    try
    {
        String urlLink="http://localhost/createdatabase.php?dbname="+dbname;
        URL url=new URL(urlLink);
        HttpURLConnection conn=(HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
            
        BufferedReader in=new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuffer sb=new StringBuffer();
        String line;
            
        while((line=in.readLine())!=null)
        {
            sb.append(line);
        }
        in.close();
        System.out.println(sb.toString());
        }
    catch(Exception e2){System.out.println("Exception aayi h connect class me "+e2.getMessage());}                   
}

    public void sendMail(String mail)
    {
        try
        {     
            String host="smtp.gmail.com";
            String user="meet01636@gmail.com";
            String pass="meet0029";
            String to=mail;
            String subject="OTP Request";
            String message="EMAIL VERIFICATION!"
                + "\n\nHi there!"
                + "\nYou have requested to add "+mail+" to your PHMS account."
                + "\n\nConfirmation OTP code: "+otp
                + "\n\nThanks for choosing Plant Health Monitoring System."
                + "\nSee you soon on PHMSystem."
                + "\n\nSincerely,"
                + "\nThe PHMS Team";
        
            boolean sessionDebug=false;
            Properties pros=System.getProperties();
            pros.setProperty("mail.trasport.protocol","smtp");
            pros.setProperty("mail.host","smtp.gmail.com");
            pros.put("mail.smtp.port","465");
            pros.put("mail.smtp.auth","true");
            pros.put("mail.debug","true");
            pros.put("mail.smtp.socketFactory.port","465");
            pros.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
            pros.put("mail.smtp.socketFactory.fallback","false");
            
            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            Session mailSession=Session.getDefaultInstance(pros,null);
            mailSession.setDebug(sessionDebug);
            Message msg=new MimeMessage(mailSession);
            msg.setFrom(new InternetAddress(user));
            InternetAddress []address={new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO,address);
            msg.setSubject(subject);
            msg.setText(message);
            Transport transport=mailSession.getTransport("smtp");
            transport.connect(host,user,pass);
            transport.sendMessage(msg,msg.getAllRecipients());
            transport.close();
            jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/verified.png")));
            JOptionPane.showMessageDialog(null,"OTP is sent to "+mail);
        }
        catch(Exception e2){
            System.out.println("Exception aayi h sendMail() me"+e2.getMessage());
            jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/unavailable.png")));
            if(e2.getMessage().contains("java.net.UnknownHostException: smtp.gmail.com"))
                JOptionPane.showMessageDialog(null,"Oops !   Network Error","Network Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField umail;
    private javax.swing.JTextField uname;
    private javax.swing.JTextField uotp;
    private javax.swing.JPasswordField upass;
    // End of variables declaration//GEN-END:variables
}
