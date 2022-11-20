import java.awt.Color;
import java.awt.Point;

import javax.swing.*;
public class VectorDrawingMachine extends JFrame implements Node{

    public VectorDrawingMachine() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle(" Drawing app ");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LINEBUTTON = new javax.swing.JButton();
        RectangleButton = new javax.swing.JButton();
        SquareButton = new javax.swing.JButton();
        circleButton = new javax.swing.JButton();
        myPanel1 = new MyPanel();
        compobox = new javax.swing.JComboBox<>();
        DeleteButton = new javax.swing.JButton();
        ColorizeButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LINEBUTTON.setText("Line Segment");
        LINEBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LINEBUTTONActionPerformed(evt);
            }
        });

        RectangleButton.setText("Rectangle");
        RectangleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RectangleButtonActionPerformed(evt);
            }
        });

        SquareButton.setText("Square");
        SquareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SquareButtonActionPerformed(evt);
            }
        });

        circleButton.setText("Circle");
        circleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circleButtonActionPerformed(evt);
            }
        });

        myPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout myPanel1Layout = new javax.swing.GroupLayout(myPanel1);
        myPanel1.setLayout(myPanel1Layout);
        myPanel1Layout.setHorizontalGroup(
            myPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 865, Short.MAX_VALUE)
        );
        myPanel1Layout.setVerticalGroup(
            myPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 338, Short.MAX_VALUE)
        );

        compobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "choose a shape" }));
        compobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compoboxActionPerformed(evt);
            }
        });

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        ColorizeButton.setText("Colorize");
        ColorizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorizeButtonActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Select a Sape");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ColorizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(compobox, 0, 130, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(circleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146)
                        .addComponent(LINEBUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160)
                        .addComponent(SquareButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(RectangleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(myPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SquareButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RectangleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(circleButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LINEBUTTON, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(myPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(compobox, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ColorizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(120, 120, 120))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LINEBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LINEBUTTONActionPerformed
        // TODO add your handling code here:      
        LineSegment lineSegment = new LineSegment();
        lineSegment.setPosition(new Point(0,0),new Point(0,0)); //givving them an inital value to draw nothing incase the user exits without adding value
        lineSegment.setColor(Color.BLACK);
        LineSegmentInput lineSegmentInput = new LineSegmentInput(lineSegment,this);  
        lineSegmentInput.setParentNode(this);
        lineSegmentInput.setResizable(false);
        lineSegmentInput.setLocationRelativeTo(null);
        lineSegmentInput.setTitle("Line Segment Data");
        this.setVisible(false);
        lineSegmentInput.setVisible(true);
        
       // System.err.println("i told u3");
        //System.err.println(lineSegmentInput.Iscrested());
    //    if(lineSegment.getPosition().x != 0 && lineSegment.getPosition().y != 0 && lineSegment.getPosition2().x != 0 && lineSegment.getPosition2().y != 0){
       // if( !(lineSegmentInput.isVisible()) ){
            
           //myPanel1.addShape(lineSegment);
           // compobox.addItem("Line" + myPanel1.getShapes().length);   

            //myPanel1.refresh(null);
       // System.err.println("i told u22");

    }//GEN-LAST:event_LINEBUTTONActionPerformed

    public void addShape(Shape shape){
            myPanel1.addShape(shape);
            if(shape instanceof LineSegment)
                compobox.addItem("Line" + myPanel1.getShapes().length);   
            else  if(shape instanceof Circle)
                compobox.addItem("Circle" + myPanel1.getShapes().length);   
            else  if(shape instanceof Square)
                compobox.addItem("Square" + myPanel1.getShapes().length);   
            else  if(shape instanceof Rectangle)
                compobox.addItem("Rectangle" + myPanel1.getShapes().length);   
            myPanel1.refresh(null);
    }
    
    
    private void RectangleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RectangleButtonActionPerformed
        // TODO add your handling code here:
        Rectangle rectangle =  new Rectangle(0,0);
        RectangleInput rectangleInput = new RectangleInput(rectangle,this);
        rectangle.setColor(Color.BLACK);
        rectangle.setFillColor(Color.BLACK);
        rectangle.setPosition(new  Point(0,0));
        rectangleInput.setParentNode(this);
        rectangleInput.setVisible(true);
        this.setVisible(false);
        
      //  myPanel1.addShape(rectangle);
       // compobox.addItem("rectangle" + (myPanel1.getShapes()).length);
      //  myPanel1.refresh(null);
    }//GEN-LAST:event_RectangleButtonActionPerformed

    private void SquareButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SquareButtonActionPerformed
        // TODO add your handling code here:
        Square square = new Square();
        SquareInput squareInput = new SquareInput(square,this);
        square.setLength(0);
        square.setColor(Color.BLACK);
        square.setFillColor(Color.BLACK);
        square.setPosition(new  Point(0,0));
        squareInput.setParentNode(this);
        squareInput.setVisible(true);
        this.setVisible(false);
        
      //  myPanel1.addShape(square);
      //  compobox.addItem("square" + (myPanel1.getShapes()).length);
      //  myPanel1.refresh(null);
    }//GEN-LAST:event_SquareButtonActionPerformed

    private void circleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circleButtonActionPerformed
        // TODO add your handling code here:
        Circle circle = new Circle();
        CircleInput circleInput = new CircleInput(circle,this);
        circle.setRaduis(0);
        circle.setColor(Color.BLACK);
        circle.setFillColor(Color.BLACK);
        circle.setPosition(new  Point(0,0));
        circleInput.setParentNode(this);
        circleInput.setVisible(true);
        this.setVisible(false);
        
    //    myPanel1.addShape(circle);
      //  compobox.addItem("circle" + (myPanel1.getShapes()).length);
     //   myPanel1.refresh(null);
        
    }//GEN-LAST:event_circleButtonActionPerformed

    private void ColorizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorizeButtonActionPerformed
        // TODO add your handling code here:
        if(compobox.getSelectedIndex() == 0){
        JOptionPane.showMessageDialog(null, "choose a shape");
        }
        else{
        Shape x = (myPanel1.getShapes())[compobox.getSelectedIndex() - 1];
        Color boarderColor = JColorChooser.showDialog(null, "enter border  color", Color.BLACK);
        if(x instanceof LineSegment){}
        else{
            Color fillColor = JColorChooser.showDialog(null, "enter fill  color", Color.BLACK);
            x.setFillColor(fillColor); 
        }  
        x.setColor(boarderColor);
        myPanel1.refresh(null);
        }
    }//GEN-LAST:event_ColorizeButtonActionPerformed

    private void compoboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compoboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_compoboxActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
        if(compobox.getSelectedIndex() == 0){
        JOptionPane.showMessageDialog(null, "choose a shape");
        }
        else{
            int index = compobox.getSelectedIndex() ;
            Shape x = (myPanel1.getShapes())[index-1];
            myPanel1.removeShape(x);
            compobox.removeItemAt(index);
            myPanel1.refresh(null);
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VectorDrawingMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VectorDrawingMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VectorDrawingMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VectorDrawingMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VectorDrawingMachine().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ColorizeButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton LINEBUTTON;
    private javax.swing.JButton RectangleButton;
    private javax.swing.JButton SquareButton;
    private javax.swing.JButton circleButton;
    private javax.swing.JComboBox<String> compobox;
    private javax.swing.JLabel jLabel1;
    private MyPanel myPanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setParentNode(Node parentNode) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Node getParentNode() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
