/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.login;
import edu.poly.Helper.SharedData;
import edu.poly.Helper.notificationError;
import edu.poly.objectDAO.loginDao;
import edu.poly.object.modeLogin;
import edu.poly.ui.menuMainForm;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.WindowConstants;

/**
 *
 * @author QUANGC
 */
public class loginDialog extends javax.swing.JDialog {

    /**
     * Creates new form loginDialog
     */
    int x,y;
    
    public loginDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        
        ImageIcon myimage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/edu/poly/icon/icon/background-login.jpg")));
        Image img1 = myimage.getImage();
        Image img2 = img1.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(img2);
        label.setIcon(i);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        txtUse = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        chkRemember = new javax.swing.JCheckBox();
        btnExit = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jPanelOnseen = new javax.swing.JPanel();
        txtExit = new javax.swing.JLabel();
        label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/poly/icon/icon/login-180.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Đăng nhập vào hệ thống");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        txtPass.setBackground(new java.awt.Color(210, 210, 210));
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 220, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tài khoảng :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 119, -1, 30));

        txtUse.setBackground(new java.awt.Color(210, 210, 210));
        getContentPane().add(txtUse, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 220, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mật khẩu :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 169, -1, 30));

        chkRemember.setForeground(new java.awt.Color(255, 255, 255));
        chkRemember.setText("Nhớ tài khoảng tôi");
        getContentPane().add(chkRemember, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, -1));

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/poly/icon/icon/thoat-20.png"))); // NOI18N
        btnExit.setText("  Thoát");
        btnExit.setMaximumSize(new java.awt.Dimension(115, 36));
        btnExit.setMinimumSize(new java.awt.Dimension(115, 36));
        btnExit.setPreferredSize(new java.awt.Dimension(115, 36));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, -1, 40));

        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/poly/icon/icon/vao-20.png"))); // NOI18N
        btnLogin.setText("Đăng nhập");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 120, 40));

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/poly/icon/icon/reset-20.png"))); // NOI18N
        btnReset.setText("Đặt lại");
        btnReset.setMaximumSize(new java.awt.Dimension(115, 36));
        btnReset.setMinimumSize(new java.awt.Dimension(115, 36));
        btnReset.setPreferredSize(new java.awt.Dimension(115, 36));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 110, 40));

        jPanelOnseen.setBackground(new java.awt.Color(21, 21, 32));
        jPanelOnseen.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanelOnseenMouseDragged(evt);
            }
        });
        jPanelOnseen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelOnseenMousePressed(evt);
            }
        });

        txtExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/poly/icon/icon/close_white-20.png"))); // NOI18N
        txtExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelOnseenLayout = new javax.swing.GroupLayout(jPanelOnseen);
        jPanelOnseen.setLayout(jPanelOnseenLayout);
        jPanelOnseenLayout.setHorizontalGroup(
            jPanelOnseenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOnseenLayout.createSequentialGroup()
                .addContainerGap(644, Short.MAX_VALUE)
                .addComponent(txtExit)
                .addContainerGap())
        );
        jPanelOnseenLayout.setVerticalGroup(
            jPanelOnseenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtExit, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelOnseen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, -1));

        label.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        StringBuilder sb = new StringBuilder();
        notificationError.DataAvailable(txtUse, sb, "Tài khoảng rỗng !");
        notificationError.DataAvailable(txtPass, sb, "Mật khẩu rỗng rỗng !");
        
        try {
            loginDao dao = new loginDao();
            modeLogin mdLG = dao.checkLogin(txtUse.getText(), new String(txtPass.getPassword()));
            if (mdLG == null) {
                JOptionPane.showMessageDialog(this, "Tài khoảng hoặc mật khẩu sai. Vui lòng kiểm tra lại !");
            }else{
                SharedData.tenDangNhap = mdLG;
                this.dispose();
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtUse.setText("");
        txtUse.setBackground(Color.white);
        txtPass.setText("");
        txtPass.setBackground(Color.white);

        chkRemember.setSelected(true);
    }//GEN-LAST:event_btnResetActionPerformed

    private void txtExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_txtExitMouseClicked

    private void jPanelOnseenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelOnseenMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanelOnseenMousePressed

    private void jPanelOnseenMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelOnseenMouseDragged
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        this.setLocation(xx-x, yy-y);
    }//GEN-LAST:event_jPanelOnseenMouseDragged

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
            java.util.logging.Logger.getLogger(loginDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                loginDialog dialog = new loginDialog(new javax.swing.JFrame(), true);
                JDialog.setDefaultLookAndFeelDecorated (false);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnReset;
    private javax.swing.JCheckBox chkRemember;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanelOnseen;
    private javax.swing.JLabel label;
    private javax.swing.JLabel txtExit;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUse;
    // End of variables declaration//GEN-END:variables
}
