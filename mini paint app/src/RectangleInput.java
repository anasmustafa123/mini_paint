

import java.awt.Color;
import java.awt.Point;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class RectangleInput extends javax.swing.JFrame implements Node{
    private Color fillColor;
    private Color borderColor;
    private Node parentNode;
    private Rectangle rectangle;
    private VectorDrawingMachine machine;

    public RectangleInput(Rectangle rectangle,VectorDrawingMachine machine) {
        initComponents();
        this.parentNode = null;
        this.rectangle = rectangle;
        this.machine = machine;
        this.fillColor = Color.BLACK;
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

        jLabel5 = new javax.swing.JLabel();
        width_input = new javax.swing.JTextField();
        y1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        FillcolorButton = new javax.swing.JButton();
        x1 = new javax.swing.JTextField();
        ADDBUTTON = new javax.swing.JButton();
        CHOOSEDFILLCOLOR = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        CHOOSEDBORDERCOLOR = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BrodercolorButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        heigth_input = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

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

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.setOpaque(true);

        BrodercolorButton1.setBackground(new java.awt.Color(204, 255, 255));
        BrodercolorButton1.setText("Change Border Color");
        BrodercolorButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrodercolorButton1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("starting point");
        jLabel2.setOpaque(true);

        jLabel7.setBackground(new java.awt.Color(255, 204, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("width");
        jLabel7.setOpaque(true);

        jLabel8.setBackground(new java.awt.Color(255, 204, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("heigth");
        jLabel8.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CHOOSEDFILLCOLOR, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ADDBUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(FillcolorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(41, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CHOOSEDBORDERCOLOR, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BrodercolorButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(width_input))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(y1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(x1, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(heigth_input)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(x1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 39, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(width_input, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heigth_input, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BrodercolorButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CHOOSEDBORDERCOLOR, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FillcolorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CHOOSEDFILLCOLOR, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(ADDBUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FillcolorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FillcolorButtonActionPerformed
        // taking color input
        Color thisColorr = JColorChooser.showDialog(null, "enter fill rectangle color", Color.black);
        this.fillColor = thisColorr;
        CHOOSEDFILLCOLOR.setBackground(this.fillColor);
    }//GEN-LAST:event_FillcolorButtonActionPerformed

    private void ADDBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDBUTTONActionPerformed
        // TODO add your handling code here:
        if(x1.getText().isEmpty() ||width_input.getText().isEmpty() || y1.getText().isEmpty() )
        JOptionPane.showMessageDialog(null, "some fields are empty");
        else if( !isNumeric(x1.getText() ) || !isNumeric(y1.getText()) || !isNumeric(width_input.getText()) || !isNumeric(heigth_input.getText()) ){
            JOptionPane.showMessageDialog(null, "some fields are are not number");
        }
        else {
            rectangle.setWidth((Integer.parseInt((this.width_input).getText())));
            rectangle.setHeigth((Integer.parseInt((this.heigth_input).getText())));
            rectangle.setColor(this.borderColor);
            rectangle.setFillColor(this.fillColor);
            rectangle.setPosition(new Point(Integer.parseInt(x1.getText()),Integer.parseInt(y1.getText())));
            machine.addShape(rectangle);
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
        Color thisColorr = JColorChooser.showDialog(null, "enter square border color", Color.black);
        this.borderColor = thisColorr;
        CHOOSEDBORDERCOLOR.setBackground(this.borderColor);
        this.isVisible();
    }//GEN-LAST:event_BrodercolorButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.setVisible(false);
       ((JFrame)getParentNode()).setVisible(true);
    }//GEN-LAST:event_formWindowClosing



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDBUTTON;
    private javax.swing.JButton BrodercolorButton1;
    private javax.swing.JButton CHOOSEDBORDERCOLOR;
    private javax.swing.JButton CHOOSEDFILLCOLOR;
    private javax.swing.JButton FillcolorButton;
    private javax.swing.JTextField heigth_input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField width_input;
    private javax.swing.JTextField x1;
    private javax.swing.JTextField y1;
    // End of variables declaration//GEN-END:variables


    @Override
    public void setParentNode(Node parentNode) {
        this.parentNode = parentNode;
    }

    @Override
    public Node getParentNode() {
        return this.parentNode;
    }
}
