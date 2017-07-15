package tictactoegame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


/**
 *
 * @author mario
 */
public class TicTacToe extends javax.swing.JFrame {

    /**
     * Creates new form TicTacToe
     * 
     */
    
    String turno = "X";
    int jugador1 = 0;
    int jugador2 = 0;
    
    public TicTacToe() {
        initComponents();
             
        puntaje();
    }
    
    public void imagen(){     
        
        
    }
    
    
    public void puntaje(){
        lblPuntos.setText("El jugador 1 empieza con X y el jugador 2 con O");
        
        txtTurno.setText(turno);
    }
    
    
     public void QuienSigue(){
     
           if (turno.equalsIgnoreCase("X")){
               turno = "O";
           }
           else{
               turno = "X";
           }
           
           
           txtTurno.setText(turno);
           
    }
     
     public void gananLasX(){
         
         JOptionPane.showMessageDialog(this, "FELICIDADES EL JUGADOR 1 HA GANADO");
         jugador1++;
         txtJugador1.setText(String.valueOf(jugador1));
         btn1.setEnabled(false);
         btn2.setEnabled(false);
         btn3.setEnabled(false);
         btn4.setEnabled(false);
         btn5.setEnabled(false);
         btn6.setEnabled(false);
         btn7.setEnabled(false);
         btn8.setEnabled(false);
         btn9.setEnabled(false);
     }
     
     public void gananLasO(){
         
         JOptionPane.showMessageDialog(this, "FELICIDADES EL JUGADOR 2 HA GANADO");
         jugador2++;
         txtJugador2.setText(String.valueOf(jugador2));
         btn1.setEnabled(false);
         btn2.setEnabled(false);
         btn3.setEnabled(false);
         btn4.setEnabled(false);
         btn5.setEnabled(false);
         btn6.setEnabled(false);
         btn7.setEnabled(false);
         btn8.setEnabled(false);
         btn9.setEnabled(false);
     }
     
     public void hayEmpate(){
         
     }
     
     
     
     public void QuienGana(){
         
         String uno = btn1.getText();
         String dos = btn2.getText();
         String tres = btn3.getText();
         String cuatro = btn4.getText();
         String cinco = btn5.getText();
         String seis = btn6.getText();
         String siete = btn7.getText();
         String ocho = btn8.getText();
         String nueve = btn9.getText();
        
         if (uno == "X" && dos == "X" && tres == "X"){
             gananLasX();
         }
         
         if(uno == "X" && cuatro == "X" && siete == "X"){
             gananLasX();
         }
            
         if (uno == "X" && cinco == "X" && nueve == "X"){
             gananLasX();
         }
                 
          if (cuatro == "X" && cinco == "X" && seis == "X"){
             gananLasX();
         }
                     
          if (siete == "X" && ocho == "X" && nueve == "X"){
             gananLasX();
         }
                         
           if (dos == "X" && cinco == "X" && ocho == "X"){
             gananLasX();
         }
                             
           if (tres == "X" && seis == "X" && nueve == "X"){
             gananLasX();
         }
                                 
          if (tres == "X" && cinco == "X" && siete == "X"){
             gananLasX();
         }
                                    
                                         
                                 
                             
                         
                     
                 
             
         
         ////////////////////////////////////
         
                                     
         if (uno == "O" && dos == "O" && tres == "O"){
             gananLasO();
         }
                                         
         if (uno == "O" && cuatro == "O" && siete == "O"){
             gananLasO();
         }
                                             
         if (uno == "O" && cinco == "O" && nueve == "O"){
             gananLasO();
         }
                                                 
         if (cuatro == "O" && cinco == "O" && seis == "O"){
             gananLasO();
         }
                                                    
         if (siete == "O" && ocho == "O" && nueve == "O"){
             gananLasO();
         }
                                                         
         if (dos == "O" && cinco == "O" && ocho == "O"){
             gananLasO();
         }
                                                             
         if (tres == "O" && seis == "O" && nueve == "O"){
             gananLasO();
         }
                                                                
         if (tres == "O" && cinco == "O" && siete == "O"){
             gananLasO();
         }
                                                                     
         
         ///////////////////////////////
         
		                                                        
                                                             
                                                         
        if (uno == "X" | uno == "O" && dos == "X" | dos == "O" && tres == "X" | tres == "O" && cuatro == "X" | cuatro == "O" && cinco == "X" | cinco == "O" && seis == "X" | seis == "O" && siete == "X" | siete == "O" && ocho == "X" | ocho == "O" && nueve == "X" | nueve == "O")   {
            JOptionPane.showMessageDialog(this, "HAY UN EMPATE, PUDES VOLVER A JUGAR");
        }                                          
                                                 
                                                                          
                             
    }
    
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        txtTurno = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        txtJugador1 = new javax.swing.JTextField();
        txtJugador2 = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        lblPuntos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 21, 85, 85));

        btn2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 21, 85, 85));

        btn3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 21, 85, 85));

        btn4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 112, 85, 85));

        btn5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 112, 85, 85));

        btn6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 112, 85, 85));

        btn7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 203, 85, 85));

        btn8.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 203, 85, 85));

        btn9.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 203, 85, 85));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(102, 153, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Turno");
        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 21, 168, 31));

        txtTurno.setEditable(false);
        txtTurno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 58, 168, 37));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(255, 0, 0));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("Jugador 1");
        jTextField3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 113, 82, 30));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(0, 102, 204));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("Jugador 2");
        jTextField4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 113, 80, 30));

        txtJugador1.setEditable(false);
        txtJugador1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtJugador1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtJugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJugador1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 149, 82, 58));

        txtJugador2.setEditable(false);
        txtJugador2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtJugador2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 149, 80, 58));

        btnReset.setBackground(new java.awt.Color(153, 153, 153));
        btnReset.setText("Reiniciar");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 168, 27));

        btnNuevo.setBackground(new java.awt.Color(153, 153, 153));
        btnNuevo.setText("Jugar de nuevo");
        btnNuevo.setPreferredSize(new java.awt.Dimension(107, 27));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 168, -1));

        lblPuntos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPuntos.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 306, 480, 27));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoegame/imagenes/negro5.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        btn1.setText(turno);
        if (turno.equalsIgnoreCase("X")){
            btn1.setForeground(Color.RED);
        }else{
            btn1.setForeground(Color.BLUE);
        }
        QuienSigue();
        QuienGana();
        btn1.setEnabled(false);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        btn2.setText(turno);
        if (turno.equalsIgnoreCase("X")){
            btn2.setForeground(Color.RED);
        }else{
            btn2.setForeground(Color.BLUE);
        }
        QuienSigue();
        QuienGana();
        btn2.setEnabled(false);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        btn3.setText(turno);
        if (turno.equalsIgnoreCase("X")){
            btn3.setForeground(Color.RED);
        }else{
            btn3.setForeground(Color.BLUE);
        }
        QuienSigue();
        QuienGana();
        btn3.setEnabled(false);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        btn4.setText(turno);
        if (turno.equalsIgnoreCase("X")){
            btn4.setForeground(Color.RED);
        }else{
            btn4.setForeground(Color.BLUE);
        }
        QuienSigue();
        QuienGana();
        btn4.setEnabled(false);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        btn5.setText(turno);
        if (turno.equalsIgnoreCase("X")){
            btn5.setForeground(Color.RED);
        }else{
            btn5.setForeground(Color.BLUE);
        }
        QuienSigue();
        QuienGana();
        btn5.setEnabled(false);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        btn6.setText(turno);
        if (turno.equalsIgnoreCase("X")){
            btn6.setForeground(Color.RED);
        }else{
            btn6.setForeground(Color.BLUE);
        }
        QuienSigue();
        QuienGana();
        btn6.setEnabled(false);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        btn7.setText(turno);
        if (turno.equalsIgnoreCase("X")){
            btn7.setForeground(Color.RED);
        }else{
            btn7.setForeground(Color.BLUE);
        }
        QuienSigue();
        QuienGana();
        btn7.setEnabled(false);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        btn8.setText(turno);
        if (turno.equalsIgnoreCase("X")){
            btn8.setForeground(Color.RED);
        }else{
            btn8.setForeground(Color.BLUE);
        }
        QuienSigue();
        QuienGana();
        btn8.setEnabled(false);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        
        btn9.setText(turno);
        
        if (turno.equalsIgnoreCase("X")){
            btn9.setForeground(Color.RED);
        }else{
            btn9.setForeground(Color.BLUE);
        }
        QuienSigue();
        QuienGana();
        btn9.setEnabled(false);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        
        btn1.setText("");
        btn1.setEnabled(true);
        btn2.setText("");
        btn2.setEnabled(true);
        btn3.setText("");
        btn3.setEnabled(true);
        btn4.setText("");
        btn4.setEnabled(true);
        btn5.setText("");
        btn5.setEnabled(true);
        btn6.setText("");
        btn6.setEnabled(true);
        btn7.setText("");
        btn7.setEnabled(true);
        btn8.setText("");
        btn8.setEnabled(true);
        btn9.setText("");
        btn9.setEnabled(true);
        
        txtTurno.setText("X");
        
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        turno = "X";
        
        btn1.setText("");
        btn1.setEnabled(true);
        btn2.setText("");
        btn2.setEnabled(true);
        btn3.setText("");
        btn3.setEnabled(true);
        btn4.setText("");
        btn4.setEnabled(true);
        btn5.setText("");
        btn5.setEnabled(true);
        btn6.setText("");
        btn6.setEnabled(true);
        btn7.setText("");
        btn7.setEnabled(true);
        btn8.setText("");
        btn8.setEnabled(true);
        btn9.setText("");
        btn9.setEnabled(true);
        
        txtJugador1.setText("");
        jugador1 = 0;
        txtJugador2.setText("");
        jugador2 = 0;
        txtTurno.setText("X");
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtJugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJugador1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJugador1ActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblPuntos;
    private javax.swing.JTextField txtJugador1;
    private javax.swing.JTextField txtJugador2;
    private javax.swing.JTextField txtTurno;
    // End of variables declaration//GEN-END:variables
}