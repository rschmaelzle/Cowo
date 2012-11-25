/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import cowo.Main;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

/**
 *
 * @author C. Levallois
 */
public class Screen1 extends javax.swing.JFrame {

    private String workingDirectory;
    private boolean fileSelected;
    private String fileSelectedPathANdName;
    private String fileSelectedName;
    public static Screen1 screen1;
    public static Screen2 screen2;
    public static Screen3 screen3;
    public String binary;
    public String minChars;
    public String nGram;
    public String nbWords;

    /**
     * Creates new form Screen1
     */
    public Screen1() {
        initComponents();

        Screen1.youTube.setVisible(false);
        Screen1.exitButton.setVisible(false);
        createMapButton.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        selectTextFileButton = new javax.swing.JButton();
        createMapButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        logArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        underTheHood = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        youTube = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cowo by www.clementlevallois.net");
        setBackground(new java.awt.Color(153, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        selectTextFileButton.setText("select text file");
        selectTextFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectTextFileButtonActionPerformed(evt);
            }
        });

        createMapButton.setText("create map");
        createMapButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createMapButtonActionPerformed(evt);
            }
        });

        logArea.setColumns(20);
        logArea.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        logArea.setLineWrap(true);
        logArea.setRows(5);
        logArea.setWrapStyleWord(true);
        logArea.setBorder(null);
        logArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        logArea.setHighlighter(null);
        jScrollPane2.setViewportView(logArea);

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        jLabel2.setText("create a map from a text");

        underTheHood.setText("under the hood");
        underTheHood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                underTheHoodActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Script MT Bold", 0, 48)); // NOI18N
        jLabel3.setText("Cowo");

        youTube.setText("<html><b>To visualize the network you created, watch this Youtube video:</b><br><html>");

        exitButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(selectTextFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(createMapButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(youTube, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(underTheHood)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectTextFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createMapButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(youTube, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(underTheHood)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitButton)
                        .addGap(22, 22, 22))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectTextFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectTextFileButtonActionPerformed
        if (evt.getSource() == selectTextFileButton) {
            System.out.println("selectTextFile clicked");


        }
        JFileChooser chooser = new JFileChooser();
        //chooser.setCurrentDirectory(new java.io.File("D:\\Docs Pro Clement\\E-humanities\\TextMining\\Exported Items\\"));
        chooser.setDialogTitle("Select a text file");
        //chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            System.out.println("Current directory: " + chooser.getCurrentDirectory().getAbsolutePath());
            createMapButton.setEnabled(true);
            workingDirectory = chooser.getCurrentDirectory().getAbsolutePath().toString();
            fileSelected = true;
            fileSelectedPathANdName = chooser.getSelectedFile().toString();
            fileSelectedName = chooser.getSelectedFile().getName();
            System.out.println("Selected File: " + fileSelectedPathANdName);
        } else {
            System.out.println("No Selection");
        }
    }//GEN-LAST:event_selectTextFileButtonActionPerformed

    private void createMapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createMapButtonActionPerformed
        if (evt.getSource() == createMapButton) {


            if (fileSelected) {

                //System.out.println(String.valueOf(countHTML));
                String[] args;
                args = new String[14];
                args[0] = workingDirectory;
                args[1] = fileSelectedPathANdName;
                args[2] = fileSelectedName;
                args[3] = new Boolean(Screen2.binaryBox.isSelected()).toString();
                System.out.println(args[3]);
                try {args[4] = Screen2.maxWordsField.getText();          
                args[5] = Screen2.minCharsField.getText();
                args[6] = Screen2.nGramsField.getText();
                args[7] = Screen2.minOccurrences.getText();
                args[8] = Screen2.fileSelectedPathANdName;
                args[9] = new Boolean(Screen2.deleteChars.isSelected()).toString();
                args[10] = new Boolean(Screen2.useScientificStopWords.isSelected()).toString();
                args[11] = Screen1.screen3.AlchemyAPIKey.getText();
                args[12] = Screen2.wordSeparator.getText();
                args[13] = new Boolean(Screen2.useTDIDF.isSelected()).toString();
                //logArea.append(workingDirectory);
                //                    args[1] = String.valueOf(countPDF);
            } catch (NullPointerException e){System.out.println("this value should not be null");}
      

                Runnable r = new Main(args[0], args[1], args[2],args[3],args[4],args[5],args[6],args[7],args[8],args[9],args[10],args[11],args[12],args[13]);
                new Thread(r).start();


            }

        }
    }//GEN-LAST:event_createMapButtonActionPerformed

    private void underTheHoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_underTheHoodActionPerformed
        screen2.setVisible(true);
        screen1.setVisible(false);
    }//GEN-LAST:event_underTheHoodActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    //ImageIcon icon = CreateIcon.createImageIcon("img/logo Fallet.png","description");
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Screen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Screen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Screen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Screen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                screen1 = new Screen1();
                screen2 = new Screen2();
                screen3 = new Screen3();
                screen1.setVisible(true);
                screen2.setVisible(false);
                screen3.setVisible(false);
                
               
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createMapButton;
    public static javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTextArea logArea;
    private javax.swing.JButton selectTextFileButton;
    private javax.swing.JButton underTheHood;
    public static javax.swing.JLabel youTube;
    // End of variables declaration//GEN-END:variables
}
