package paneles;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.time.Day;
import org.jfree.data.time.Month;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYDataset;

import phms.Connect;


public class UserHealth extends javax.swing.JPanel {

    public Statement st;
    public Connect c=new Connect();
    int currwk=0,clickwk=0,ct_wk=0;
    String midstr="",endstr="";
    public String dbname=null,unm=null;

    public UserHealth(String unm) {
        this.unm=unm; 
        dbname=unm.toLowerCase().replaceAll(" ","");        
        st=c.connection(dbname);       
        initComponents();

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbname+"?useTimezone=true&serverTimezone=IST","root","");                      
            DatabaseMetaData meta=(DatabaseMetaData) con.getMetaData();
            ResultSet rs=meta.getTables(null,null,"%", new String []{"TABLE"});            
            while(rs.next())
            {
                if(rs.getString(1).equals(dbname))
                {
                    String str=rs.getString("TABLE_NAME");
                    combopname.addItem(str);
                }
            }               
            ResultSet rs0=st.executeQuery("Select WEEK(CURRENT_DATE)+1");          
            while(rs0.next())
                ct_wk=rs0.getInt(1);
        }
        catch(ClassNotFoundException | SQLException e2){System.out.println("Exception aayi h "+e2.getMessage());}                    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        combopname = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        combodata1 = new javax.swing.JComboBox<>();
        combodata2 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        comborange = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        comboduration = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(233, 239, 186));

        jLabel12.setBackground(new java.awt.Color(249, 248, 235));
        jLabel12.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(64, 81, 94));
        jLabel12.setText("Plant:");

        combopname.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        combopname.setBorder(null);
        combopname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combopnameActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jButton1.setText("Show Graph");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(249, 248, 235));
        jLabel8.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(64, 81, 94));
        jLabel8.setText("Data 1:");

        combodata1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        combodata1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Temperature", "Moisture", "Light", "Optimum" }));
        combodata1.setBorder(null);
        combodata1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combodata1ActionPerformed(evt);
            }
        });

        combodata2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        combodata2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Temperature", "Moisture", "Light", "Optimum" }));
        combodata2.setBorder(null);
        combodata2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combodata2ActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(249, 248, 235));
        jLabel9.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(64, 81, 94));
        jLabel9.setText("Data 2:");

        jLabel10.setBackground(new java.awt.Color(249, 248, 235));
        jLabel10.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(64, 81, 94));
        jLabel10.setText("Range:");

        comborange.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        comborange.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Week", "Month", "Year" }));
        comborange.setBorder(null);
        comborange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comborangeActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(249, 248, 235));
        jLabel11.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(64, 81, 94));
        jLabel11.setText("Duration:");

        comboduration.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        comboduration.setBorder(null);
        comboduration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combodurationActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/health.png"))); // NOI18N

        jLabel5.setBackground(new java.awt.Color(249, 248, 235));
        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(64, 81, 94));
        jLabel5.setText("Health Monitoring");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(103, 103, 103))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(combodata2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(combodata1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel10))
                                    .addGap(51, 51, 51)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(comborange, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(combopname, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(30, 30, 30)
                                    .addComponent(comboduration, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(281, 281, 281))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)
                        .addGap(116, 116, 116)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combopname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comborange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboduration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combodata1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combodata2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(52, 52, 52))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void combopnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combopnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combopnameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    ResultSet rs=null;    
    try
    {
        if(comborange.getSelectedItem().toString().equals("Week"))
        {
            clickwk=Integer.parseInt(comboduration.getSelectedItem().toString().substring(5));
            ResultSet rs0=st.executeQuery("Select WEEK(CURRENT_DATE)+1");
   
            while(rs0.next())
                currwk=rs0.getInt(1);
            
            rs=st.executeQuery("Select * from "+combopname.getSelectedItem().toString()+" where WEEK(date)= WEEK(current_date)-"+(currwk-clickwk));            
            
            XYDataset dataset=createDataset(rs,combodata1.getSelectedItem().toString(),combodata2.getSelectedItem().toString());
            JFreeChart chart=ChartFactory.createXYLineChart("Health Graph",comboduration.getSelectedItem().toString(),combodata1.getSelectedItem().toString()+" & "+combodata2.getSelectedItem().toString(),dataset);

            customizeChart(chart);

        }
        
        if(comborange.getSelectedItem().toString().equals("Month"))
        {
            int d1=0,d2=0,ct=0,i;

            XYSeriesCollection dataset = new XYSeriesCollection();
            JFreeChart chart=ChartFactory.createXYLineChart("Health Graph","Weeks",combodata1.getSelectedItem().toString()+" & "+combodata2.getSelectedItem().toString(),dataset);

            XYSeries s1 = new XYSeries(combodata1.getSelectedItem().toString());
            XYSeries s2 = new XYSeries(combodata2.getSelectedItem().toString());
            
            if(comboduration.getSelectedItem().toString().equals("January")) midstr="01";
            else if(comboduration.getSelectedItem().toString().equals("February")) midstr="02";
            else if(comboduration.getSelectedItem().toString().equals("March")) midstr="03";
            else if(comboduration.getSelectedItem().toString().equals("April")) midstr="04";
            else if(comboduration.getSelectedItem().toString().equals("May")) midstr="05";
            else if(comboduration.getSelectedItem().toString().equals("June")) midstr="06";
            else if(comboduration.getSelectedItem().toString().equals("July")) midstr="07";
            else if(comboduration.getSelectedItem().toString().equals("August")) midstr="08";
            else if(comboduration.getSelectedItem().toString().equals("Sepember")) midstr="09";
            else if(comboduration.getSelectedItem().toString().equals("October")) midstr="10";
            else if(comboduration.getSelectedItem().toString().equals("November")) midstr="11";
            else if(comboduration.getSelectedItem().toString().equals("December")) midstr="12";
            else midstr="";
             
            for(i=1;i<(ct_wk+1);i++)
            {
                ResultSet rs0=st.executeQuery("Select WEEK(CURRENT_DATE)+1");          
                while(rs0.next())
                    currwk=rs0.getInt(1);
            
                rs=st.executeQuery("Select * from "+combopname.getSelectedItem().toString()+" where Date like '%-"+midstr+"-%' AND WEEK(date)=WEEK(current_date)-"+(currwk-i));            
                while(rs.next())
                {                    
                    d1+=Float.parseFloat(rs.getString(combodata1.getSelectedItem().toString()));
                    d2+=Float.parseFloat(rs.getString(combodata2.getSelectedItem().toString()));
                    ct++;
                }
                s1.add(i,((float)d1/(float)ct));
                s2.add(i,((float)d2/(float)ct));
                d1=0;   d2=0;    ct=0;
            }
            
            dataset.addSeries(s1);
            dataset.addSeries(s2); 
            customizeChart(chart);
        }

        if(comborange.getSelectedItem().toString().equals("Year"))
        {
            int m1=0,m2=0,ct=0,i;
            String mnth="";

            TimeSeriesCollection dataset=new TimeSeriesCollection();
            JFreeChart chart=ChartFactory.createXYLineChart("Health Graph","Weeks",combodata1.getSelectedItem().toString()+" & "+combodata2.getSelectedItem().toString(),dataset);

            TimeSeries s1=new TimeSeries(combodata1.getSelectedItem().toString());            
            TimeSeries s2=new TimeSeries(combodata2.getSelectedItem().toString());
            
            for(i=1;i<13;i++)
            {
                if(i<10) rs=st.executeQuery("Select * from "+combopname.getSelectedItem().toString()+" where Date like '"+comboduration.getSelectedItem().toString()+"-0"+i+"-%'");
                else rs=st.executeQuery("Select * from "+combopname.getSelectedItem().toString()+" where Date like '"+comboduration.getSelectedItem().toString()+"-"+i+"-%'");            
                
                switch(i)
                {
                    case 1:mnth="Jan"; break; case 2:mnth="Feb"; break; case 3:mnth="Mar"; break; case 4:mnth="Apr"; break;
                    case 5:mnth="May"; break; case 6:mnth="Jun"; break; case 7:mnth="Jul"; break; case 8:mnth="Aug"; break;
                    case 9:mnth="Sep"; break; case 10:mnth="Oct"; break; case 11:mnth="Nov"; break; case 12:mnth="Dec"; break;
                }

                while(rs.next())
                {                    
                    m1+=Float.parseFloat(rs.getString(combodata1.getSelectedItem().toString()));
                    m2+=Float.parseFloat(rs.getString(combodata2.getSelectedItem().toString()));
                    ct++;
                }
                s1.add(new Month(new SimpleDateFormat("MMMM").parse(mnth)),((float)m1/(float)ct));            
                s2.add(new Month(new SimpleDateFormat("MMMM").parse(mnth)),((float)m2/(float)ct));            
                m1=0;   m2=0;    ct=0;
            }
            
            dataset.addSeries(s1);
            dataset.addSeries(s2); 
            customizeChart(chart);
        }
    }    
    catch(Exception e2){System.out.println("Exception aayi h "+e2.getMessage());}            

    }//GEN-LAST:event_jButton1ActionPerformed

    private XYDataset createDataset(ResultSet rs,String data1,String data2)throws Exception
    {
        TimeSeriesCollection dataset=new TimeSeriesCollection();
        TimeSeries s1=new TimeSeries(data1);            
        TimeSeries s2=new TimeSeries(data2);
        while(rs.next())
        {
            s1.add(new Day(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("Date"))),Double.parseDouble(rs.getString(data1)));
            s2.add(new Day(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("Date"))),Double.parseDouble(rs.getString(data2)));            
        }
        dataset.addSeries(s1);
        dataset.addSeries(s2); 
        return dataset;
    }

    private void customizeChart(JFreeChart chart) 
    {   
          chart.setBackgroundPaint(new Color(0xE9EFBA));
        
        XYPlot plot = chart.getXYPlot();
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        
        if(comborange.getSelectedItem().toString().equals("Week"))
        {
            DateAxis dateaxis=new DateAxis();
            dateaxis.setDateFormatOverride(new SimpleDateFormat("dd-MM-yyyy"));
            dateaxis.setAutoTickUnitSelection(false);
            dateaxis.setLabel("Days");
            plot.setDomainAxis(dateaxis);           
        }    
        if(comborange.getSelectedItem().toString().equals("Month"))
        {
            NumberAxis dax = new NumberAxis("Weeks");
            dax.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
            dax.setAutoRangeIncludesZero(false);
            plot.setDomainAxis(dax);
        }
        if(comborange.getSelectedItem().toString().equals("Year"))
        {
            DateAxis axis=new DateAxis();
            axis.setDateFormatOverride(new SimpleDateFormat("MMMM"));
            axis.setLabel("Months");
            plot.setDomainAxis(axis);           
        }
        
        renderer.setSeriesPaint(0, new Color(0xfb7f64));
        renderer.setSeriesPaint(1, new Color(0x7fa998));
        renderer.setSeriesStroke(0, new BasicStroke(2.0f));
        renderer.setSeriesStroke(1, new BasicStroke(2.0f));
    
        plot.setRenderer(renderer);
        plot.setBackgroundPaint(new Color(255,255,255));

        plot.setRangeGridlinesVisible(true);
        plot.setRangeGridlinePaint(new Color(0xd8dfe2));   
        plot.setDomainGridlinesVisible(true);
        plot.setDomainGridlinePaint(new Color(0xd8dfe2));
        
        
        ChartFrame frame=new ChartFrame("Analysis Graph",chart);       
        Dimension screenSize,frameSize;
        int x,y;
        screenSize=Toolkit.getDefaultToolkit().getScreenSize();
        frameSize=this.getSize();
        x=(screenSize.width-frameSize.width)/2;
        y=(screenSize.height-frameSize.height)/2;
        frame.setLocation(x+230, y+130);
            
        frame.setVisible(true);
        frame.setSize(650,400);
  }

    private void combodata1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combodata1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combodata1ActionPerformed

    private void combodata2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combodata2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combodata2ActionPerformed

    private void comborangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comborangeActionPerformed

       comboduration.removeAllItems();
       if(comborange.getSelectedItem().toString().equals("Week"))
       {
            for(int i=1;i<(ct_wk+1);i++)
                comboduration.addItem("Week "+i);
       }
       if(comborange.getSelectedItem().toString().equals("Month"))
       {
           ResultSet rs=null;
        try
        {
           for(int i=1;i<13;i++)
           {
                if(i<10) 
                {
                    rs=st.executeQuery("Select * from "+combopname.getSelectedItem().toString()+" where Date like '2020-0"+i+"-%'");
                    if(rs.next())
                    {
                        switch(i)
                        {
                            case 1:comboduration.addItem("January"); break; case 2:comboduration.addItem("February"); break; case 3:comboduration.addItem("March"); break; case 4:comboduration.addItem("April"); break;
                            case 5:comboduration.addItem("May"); break; case 6:comboduration.addItem("June"); break; case 7:comboduration.addItem("July"); break; case 8:comboduration.addItem("August"); break;
                            case 9:comboduration.addItem("September"); break;
                        }
                    }
                }
                else 
                {
                    rs=st.executeQuery("Select * from "+combopname.getSelectedItem().toString()+" where Date like '2020-"+i+"-%'");
                    if(rs.next())
                    {
                        switch(i)
                        {
                            case 10:comboduration.addItem("October"); break; case 11:comboduration.addItem("November"); break; case 12:comboduration.addItem("December"); break;
                        }
                    }
                }                          
            }    
        }   
        catch(Exception e2){System.out.println("Exception aayi h "+e2.getMessage());}            
       }
       
       if(comborange.getSelectedItem().toString().equals("Year"))
       {
            comboduration.addItem("2019");comboduration.addItem("2020");
       }                                          
    }//GEN-LAST:event_comborangeActionPerformed

    private void combodurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combodurationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combodurationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combodata1;
    private javax.swing.JComboBox<String> combodata2;
    private javax.swing.JComboBox<String> comboduration;
    private javax.swing.JComboBox<String> combopname;
    private javax.swing.JComboBox<String> comborange;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
