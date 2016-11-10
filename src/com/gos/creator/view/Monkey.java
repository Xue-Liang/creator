/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gos.creator.view;

import java.io.File;
import java.sql.Driver;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gos.creator.domain.DataBase;
import com.gos.creator.service.MySqlCreatorService;
import com.gos.creator.service.MySqlMetaDataReader;
import com.gos.creator.service.impl.MySqlCreatorServiceImpl;
import com.gos.creator.service.impl.MySqlMetaDataReaderImpl;

/**
 *
 * @author Xue Liang
 */
public class Monkey extends javax.swing.JFrame {

	private static final long serialVersionUID = 7910072156826668382L;
	private DataBase dataBase = null;
	private static Logger logger = LoggerFactory.getLogger(Monkey.class);
    /**
     * Creates new form NewJFrame
     */
    public Monkey() {
        this.drivers = null;
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void initComponents() {

        panelDataBase = new javax.swing.JPanel();
        labUrl = new javax.swing.JLabel();
        labUser = new javax.swing.JLabel();
        labPassword = new javax.swing.JLabel();
        txtUrl = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        labDriver = new javax.swing.JLabel();
        drivers = new javax.swing.JComboBox<>();
        txtPassword = new javax.swing.JTextField();
        panelEntity = new javax.swing.JPanel();
        labEntityPackage = new javax.swing.JLabel();
        txtEntityPackage = new javax.swing.JTextField();
        panelDirectory = new javax.swing.JPanel();
        labDirectory = new javax.swing.JLabel();
        txtDirectory = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        panelDao = new javax.swing.JPanel();
        labDaoPackage = new javax.swing.JLabel();
        txtDaoPackage = new javax.swing.JTextField();
        btnQuit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("数据访问类生成工具");
        setAlwaysOnTop(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        panelDataBase.setBorder(javax.swing.BorderFactory.createTitledBorder("DataBase "));
        panelDataBase.setToolTipText("");
        panelDataBase.setName("DataBase "); // NOI18N

        labUrl.setText("Url:");

        labUser.setText("User:");

        labPassword.setText("Pwd:");

        labDriver.setText("Driver:");

        drivers.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "com.mysql.jdbc.Driver" }));
        drivers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                driversMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelDataBaseLayout = new javax.swing.GroupLayout(panelDataBase);
        panelDataBase.setLayout(panelDataBaseLayout);
        panelDataBaseLayout.setHorizontalGroup(
            panelDataBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDataBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDataBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labDriver)
                    .addComponent(labUrl)
                    .addGroup(panelDataBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labPassword)
                        .addComponent(labUser)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(panelDataBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(drivers, javax.swing.GroupLayout.Alignment.TRAILING, 0, 212, Short.MAX_VALUE)
                    .addComponent(txtUrl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtUser, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPassword))
                .addGap(19, 19, 19))
        );
        panelDataBaseLayout.setVerticalGroup(
            panelDataBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDataBaseLayout.createSequentialGroup()
                .addGroup(panelDataBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labDriver)
                    .addComponent(drivers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDataBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labUrl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDataBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDataBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labPassword))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelEntity.setBorder(javax.swing.BorderFactory.createTitledBorder("Entity"));
        panelEntity.setToolTipText("");
        panelEntity.setName("DataBase "); // NOI18N

        labEntityPackage.setText("Package:");

        javax.swing.GroupLayout panelEntityLayout = new javax.swing.GroupLayout(panelEntity);
        panelEntity.setLayout(panelEntityLayout);
        panelEntityLayout.setHorizontalGroup(
            panelEntityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEntityLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labEntityPackage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEntityPackage)
                .addContainerGap())
        );
        panelEntityLayout.setVerticalGroup(
            panelEntityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEntityLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEntityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labEntityPackage)
                    .addComponent(txtEntityPackage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDirectory.setBorder(javax.swing.BorderFactory.createTitledBorder("Directory"));
        panelDirectory.setToolTipText("");
        panelDirectory.setName("DataBase "); // NOI18N

        labDirectory.setText("Directory:");

        txtDirectory.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDirectoryFocusGained(evt);
            }
        });
        txtDirectory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDirectoryMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelDirectoryLayout = new javax.swing.GroupLayout(panelDirectory);
        panelDirectory.setLayout(panelDirectoryLayout);
        panelDirectoryLayout.setHorizontalGroup(
            panelDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDirectoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labDirectory)
                .addGap(18, 18, 18)
                .addComponent(txtDirectory)
                .addContainerGap())
        );
        panelDirectoryLayout.setVerticalGroup(
            panelDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDirectoryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labDirectory)
                    .addComponent(txtDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCreate.setText("生成");
        btnCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCreateMouseClicked(evt);
            }
        });

        panelDao.setBorder(javax.swing.BorderFactory.createTitledBorder("Dao"));
        panelDao.setToolTipText("");
        panelDao.setName("DataBase "); // NOI18N

        labDaoPackage.setText("Package:");

        javax.swing.GroupLayout panelDaoLayout = new javax.swing.GroupLayout(panelDao);
        panelDao.setLayout(panelDaoLayout);
        panelDaoLayout.setHorizontalGroup(
            panelDaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labDaoPackage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDaoPackage)
                .addContainerGap())
        );
        panelDaoLayout.setVerticalGroup(
            panelDaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labDaoPackage)
                    .addComponent(txtDaoPackage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnQuit.setText("退出");
        btnQuit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelDirectory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelDataBase, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelEntity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelDao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(panelDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelDataBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelEntity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelDao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        panelDataBase.getAccessibleContext().setAccessibleName(" DataBase ");

        pack();
    }// </editor-fold>                        

    private void btnCreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateMouseClicked
        // TODO add your handling code here:
        Driver driver;
        try {
            driver = (Driver) Class.forName((String) this.drivers.getSelectedItem()).newInstance();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "注册数据库驱动不存在.");
            return;
        }
        String dir = this.txtDirectory.getText();
        String url = this.txtUrl.getText();
        String user = this.txtUser.getText();
        String password = this.txtPassword.getText();
        if ((dir = dir.trim()).length() < 1) {
            JOptionPane.showMessageDialog(this, "请填写代码文件保存目录.");
            this.txtDirectory.requestFocus();
            return;
        } else {
            File codeDirectory = new File(dir);
            if (!codeDirectory.exists()) {
                JOptionPane.showMessageDialog(this, "您填写的代码保存目录不存在.");
                this.txtDirectory.requestFocus();
                return;
            }
        }
        if ((user = user.trim()).length() < 1) {
            JOptionPane.showMessageDialog(this, "请填写数据库用户名.");
            this.txtUser.requestFocus();
            return;
        }
        if ((url = url.trim()).length() < 1) {
            JOptionPane.showMessageDialog(this, "请填写Url.");
            this.txtUrl.requestFocus();
            return;
        }
        if ((password = password.trim()).length() < 1) {
            JOptionPane.showMessageDialog(this, "请填写数据库密码.");
            this.txtPassword.requestFocus();
            return;
        }

        MySqlMetaDataReader reader = new MySqlMetaDataReaderImpl();
        try {
            this.dataBase = reader.read(driver, url, user, password);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "读取数据库失败." + e.getMessage());
            return;
        }
        MySqlCreatorService creatorService = new MySqlCreatorServiceImpl();

        String entityPackageName = this.txtEntityPackage.getText();
        boolean success = true;
        try {
            success &= creatorService.createEntities(dataBase, dir, entityPackageName);
        } catch (Exception e) {
            StringBuilder trace = new StringBuilder(1024);
            for (StackTraceElement s : e.getStackTrace()) {
                trace.append(s.toString()).append("\r\n");
            }
            JOptionPane.showMessageDialog(this, "生成实体类失败.[" + e.getMessage() + trace.toString() + "]");
            return;
        }
        String daoPackageName = this.txtDaoPackage.getText();
        try {
            success &= creatorService.createDao(dataBase, dir, entityPackageName, daoPackageName);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "生成数据访问类失败.[" + e.getMessage() + "]");
            return;
        }
        JOptionPane.showMessageDialog(this, "生成代码" + (success ? "成功." : "失败."));
    }//GEN-LAST:event_btnCreateMouseClicked

    private void btnQuitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuitMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnQuitMouseClicked

    private void driversMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_driversMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_driversMouseClicked

    private void txtDirectoryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDirectoryFocusGained
        
    }//GEN-LAST:event_txtDirectoryFocusGained

    private void txtDirectoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDirectoryMouseClicked
        // TODO add your handling code here:
        this.initFileChooser();
    }//GEN-LAST:event_txtDirectoryMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
        	logger.error(ex.getMessage(), ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Monkey monkey = new Monkey();
                monkey.setVisible(true);
                monkey.setTitle("monkey");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnQuit;
    private javax.swing.JComboBox<String> drivers;
    private javax.swing.JLabel labDaoPackage;
    private javax.swing.JLabel labDirectory;
    private javax.swing.JLabel labDriver;
    private javax.swing.JLabel labEntityPackage;
    private javax.swing.JLabel labPassword;
    private javax.swing.JLabel labUrl;
    private javax.swing.JLabel labUser;
    private javax.swing.JPanel panelDao;
    private javax.swing.JPanel panelDataBase;
    private javax.swing.JPanel panelDirectory;
    private javax.swing.JPanel panelEntity;
    private javax.swing.JTextField txtDaoPackage;
    private javax.swing.JTextField txtDirectory;
    private javax.swing.JTextField txtEntityPackage;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUrl;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
    private JFileChooser fileChooser = null;

    private void initFileChooser() {
        if (this.fileChooser == null) {
            this.fileChooser = new javax.swing.JFileChooser(new File("."));
            this.fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        }
        int index = this.fileChooser.showDialog(this, "确定");
        if (index == JFileChooser.APPROVE_OPTION) {
            //把获取到的文件的绝对路径显示在文本编辑框中
            this.txtDirectory.setText(fileChooser.getSelectedFile().getAbsolutePath());
        }
    }
}
