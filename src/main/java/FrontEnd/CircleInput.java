package FrontEnd;


import java.awt.Color;
import java.awt.Point;
import javax.swing.InputMap;
import javax.swing.JColorChooser;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import shapes.Oval;


public class CircleInput extends JFrame implements Node{
    
    private final Oval circle;
    private Color fillColor;
    private Color borderColor;
    private Node parentNode;
    private final PaintFrame machine;
    
    public CircleInput(Oval circle, PaintFrame machine) {
        initComponents();
        this.circle = circle;
        InputMap imap = OvalPanel.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
      //  imap.
        imap.put(KeyStroke.getKeyStroke("tap"), "some.action");
        parentNode  = null;
        this.machine  =  machine;
        this.fillColor = Color.BLACK;  //default color
        this.borderColor = Color.BLACK;
    }

      public static boolean isNumeric(String stringNum){
        try{
            int x = Integer.parseInt(stringNum);
            return true;
        }
        catch(NumberFormatException e){
            return false;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OvalPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        y1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        FillcolorButton = new javax.swing.JButton();
        x1 = new javax.swing.JTextField();
        ADDBUTTON = new javax.swing.JButton();
        CHOOSEDFILLCOLOR = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        CHOOSEDBORDERCOLOR = new javax.swing.JButton();
        BrodercolorButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        width_ = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Height_ = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(255, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("starting point");
        jLabel2.setOpaque(true);

        jLabel5.setBackground(new java.awt.Color(255, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Y");
        jLabel5.setOpaque(true);

        jLabel9.setBackground(new java.awt.Color(255, 204, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("fill color");
        jLabel9.setOpaque(true);

        FillcolorButton.setBackground(new java.awt.Color(204, 255, 255));
        FillcolorButton.setText("Change Fill Color");
        FillcolorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FillcolorButtonActionPerformed(evt);
            }
        });

        ADDBUTTON.setBackground(new java.awt.Color(204, 255, 204));
        ADDBUTTON.setText("ADD");
        ADDBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDBUTTONActionPerformed(evt);
            }
        });

        CHOOSEDFILLCOLOR.setBackground(new java.awt.Color(0, 0, 0));
        CHOOSEDFILLCOLOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHOOSEDFILLCOLORActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 204, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("border color");
        jLabel10.setOpaque(true);

        CHOOSEDBORDERCOLOR.setBackground(new java.awt.Color(0, 0, 0));
        CHOOSEDBORDERCOLOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHOOSEDBORDERCOLORActionPerformed(evt);
            }
        });

        BrodercolorButton1.setBackground(new java.awt.Color(204, 255, 255));
        BrodercolorButton1.setText("Change Border Color");
        BrodercolorButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrodercolorButton1ActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 204, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Width");
        jLabel7.setOpaque(true);

        width_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                width_ActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 204, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("height");
        jLabel8.setOpaque(true);

        Height_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Height_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OvalPanelLayout = new javax.swing.GroupLayout(OvalPanel);
        OvalPanel.setLayout(OvalPanelLayout);
        OvalPanelLayout.setHorizontalGroup(
            OvalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OvalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OvalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OvalPanelLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(OvalPanelLayout.createSequentialGroup()
                        .addGroup(OvalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(OvalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Height_, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, OvalPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(OvalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(width_)
                                        .addGroup(OvalPanelLayout.createSequentialGroup()
                                            .addGroup(OvalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGap(18, 18, 18)
                                            .addGroup(OvalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(x1, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                                .addComponent(y1)))))))
                        .addContainerGap(10, Short.MAX_VALUE))))
            .addGroup(OvalPanelLayout.createSequentialGroup()
                .addGroup(OvalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OvalPanelLayout.createSequentialGroup()
                        .addGroup(OvalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(OvalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CHOOSEDBORDERCOLOR, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CHOOSEDFILLCOLOR, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(OvalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FillcolorButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BrodercolorButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)))
                    .addGroup(OvalPanelLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(ADDBUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 6, Short.MAX_VALUE))
        );
        OvalPanelLayout.setVerticalGroup(
            OvalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OvalPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(OvalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OvalPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(OvalPanelLayout.createSequentialGroup()
                        .addGroup(OvalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x1))
                        .addGap(33, 33, 33)
                        .addGroup(OvalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y1))
                        .addGap(38, 38, 38)))
                .addGroup(OvalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(width_, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(OvalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Height_, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(OvalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OvalPanelLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(OvalPanelLayout.createSequentialGroup()
                        .addGroup(OvalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BrodercolorButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(CHOOSEDBORDERCOLOR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(OvalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(OvalPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(FillcolorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(OvalPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(CHOOSEDFILLCOLOR, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)))
                .addComponent(ADDBUTTON)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OvalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OvalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FillcolorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FillcolorButtonActionPerformed
        // taking color input
        Color thisColorr = JColorChooser.showDialog(null, "enter fill circle color", Color.black);
        this.fillColor = thisColorr;
        CHOOSEDFILLCOLOR.setBackground(this.fillColor);
    }//GEN-LAST:event_FillcolorButtonActionPerformed

    private void ADDBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDBUTTONActionPerformed
        // TODO add your handling code here:
        if(x1.getText().isEmpty() ||width_.getText().isEmpty() || y1.getText().isEmpty() || Height_.getText().isEmpty())
        JOptionPane.showMessageDialog(null, "some fields are empty");
        else if( !isNumeric(x1.getText() ) || !isNumeric(y1.getText()) || !isNumeric(width_.getText()) || !isNumeric(Height_.getText())){
            JOptionPane.showMessageDialog(null, "some fields are are not number");
        }
        else {
            circle.setWidth((Integer.parseInt((this.width_).getText())));
            circle.setheight((Integer.parseInt((this.Height_).getText())));
            circle.setColor(this.borderColor);
            circle.setFillColor(this.fillColor);
            circle.setPosition(new Point(Integer.parseInt(x1.getText()),Integer.parseInt(y1.getText())));
            this.machine.addShape(circle);
            this.setVisible(false);
            ((JFrame)getParentNode()).setVisible(true);
        }
    }//GEN-LAST:event_ADDBUTTONActionPerformed

    private void CHOOSEDFILLCOLORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHOOSEDFILLCOLORActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CHOOSEDFILLCOLORActionPerformed

    private void CHOOSEDBORDERCOLORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHOOSEDBORDERCOLORActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CHOOSEDBORDERCOLORActionPerformed

    private void BrodercolorButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrodercolorButton1ActionPerformed
        // TODO add your handling code here:
        Color thisColorr = JColorChooser.showDialog(null, "enter circle border color", Color.black);
        this.borderColor = thisColorr;
        CHOOSEDBORDERCOLOR.setBackground(this.borderColor);
        this.isVisible();
    }//GEN-LAST:event_BrodercolorButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.setVisible(false);
       ((JFrame)getParentNode()).setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void width_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_width_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_width_ActionPerformed

    private void Height_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Height_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Height_ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDBUTTON;
    private javax.swing.JButton BrodercolorButton1;
    private javax.swing.JButton CHOOSEDBORDERCOLOR;
    private javax.swing.JButton CHOOSEDFILLCOLOR;
    private javax.swing.JButton FillcolorButton;
    private javax.swing.JTextField Height_;
    private javax.swing.JPanel OvalPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField width_;
    private javax.swing.JTextField x1;
    private javax.swing.JTextField y1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setParentNode(Node parentNode) {
        this.parentNode = parentNode;

    }

    @Override
    public Node getParentNode() {
        return parentNode;
    }
    
}
