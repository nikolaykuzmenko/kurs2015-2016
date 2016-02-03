import sun.audio.*;
import java.io.*;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")                        
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24));
        jButton3.setText("C");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 24));
        jButton4.setText("D");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 24));
        jButton5.setText("E");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 24));
        jButton6.setText("F");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 24));
        jButton7.setText("G");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 24));
        jButton8.setText("A");
        jButton8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 24));
        jButton9.setText("B");
        jButton9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 24));
        jButton10.setText("C1");
        jButton10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 24));
        jButton11.setText("E1");
        jButton11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 24));
        jButton12.setText("F1");
        jButton12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton12.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setBackground(java.awt.Color.black);
        jButton13.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("C#");
        jButton13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton13.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(java.awt.Color.black);
        jButton14.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("D#");
        jButton14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton14.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setBackground(java.awt.Color.black);
        jButton15.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("F#");
        jButton15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton15.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setBackground(java.awt.Color.black);
        jButton16.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText("G#");
        jButton16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton16.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setBackground(java.awt.Color.black);
        jButton17.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("Bb");
        jButton17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton17.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setBackground(java.awt.Color.black);
        jButton18.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText("C#1");
        jButton18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton18.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setBackground(java.awt.Color.black);
        jButton19.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setText("D#1");
        jButton19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton19.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(45, 45, 45)
                                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(69, 69, 69)
                                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(61, 61, 61)
                                                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        pack();
    }                    

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
        InputStream iAudio;

        try{
            iAudio = new FileInputStream(new File ("G:\\JavaProjects\\Piano\\Music\\A.wav") );
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic );
        }

        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        InputStream iAudio;

        try{
            iAudio = new FileInputStream(new File ("G:\\JavaProjects\\Piano\\Music\\C.wav") );
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic );
        }

        catch (IOException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        InputStream iAudio;

        try{
            iAudio = new FileInputStream(new File ("G:\\JavaProjects\\Piano\\Music\\D.wav") );
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic );
        }

        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        InputStream iAudio;

        try{
            iAudio = new FileInputStream(new File ("G:\\JavaProjects\\Piano\\Music\\E.wav") );
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic );
        }

        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        InputStream iAudio;

        try{
            iAudio = new FileInputStream(new File ("G:\\JavaProjects\\Piano\\Music\\F.wav") );
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic );
        }

        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        InputStream iAudio;

        try{
            iAudio = new FileInputStream(new File ("G:\\JavaProjects\\Piano\\Music\\G.wav") );
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic );
        }

        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
        InputStream iAudio;

        try{
            iAudio = new FileInputStream(new File ("G:\\JavaProjects\\Piano\\Music\\B.wav") );
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic );
        }

        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
        InputStream iAudio;

        try{
            iAudio = new FileInputStream(new File ("G:\\JavaProjects\\Piano\\Music\\C1.wav") );
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic );
        }

        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {
        InputStream iAudio;

        try{
            iAudio = new FileInputStream(new File ("G:\\JavaProjects\\Piano\\Music\\E1.wav") );
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic );
        }

        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {
        InputStream iAudio;

        try{
            iAudio = new FileInputStream(new File ("G:\\JavaProjects\\Piano\\Music\\F1.wav") );
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic );
        }

        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {
        InputStream iAudio;

        try{
            iAudio = new FileInputStream(new File ("G:\\JavaProjects\\Piano\\Music\\C_s.wav") );
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic );
        }

        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {
        InputStream iAudio;

        try{
            iAudio = new FileInputStream(new File ("G:\\JavaProjects\\Piano\\Music\\D_s.wav") );
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic );
        }

        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {
        InputStream iAudio;

        try{
            iAudio = new FileInputStream(new File ("G:\\JavaProjects\\Piano\\Music\\F_s.wav") );
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic );
        }

        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {
        InputStream iAudio;

        try{
            iAudio = new FileInputStream(new File ("G:\\JavaProjects\\Piano\\Music\\G_s.wav") );
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic );
        }

        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {
        InputStream iAudio;

        try{
            iAudio = new FileInputStream(new File ("G:\\JavaProjects\\Piano\\Music\\Bb.wav") );
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic );
        }

        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {
        InputStream iAudio;

        try{
            iAudio = new FileInputStream(new File ("G:\\JavaProjects\\Piano\\Music\\C_s1.wav") );
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic );
        }

        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {
        InputStream iAudio;

        try{
            iAudio = new FileInputStream(new File ("G:\\JavaProjects\\Piano\\Music\\D_s1.wav") );
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic );
        }

        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

  
    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
                
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;                
}
