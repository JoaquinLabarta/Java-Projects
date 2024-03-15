package igu;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import java.applet.Applet;
import java.awt.TextArea;

public class Pantalla extends javax.swing.JFrame {

    public Pantalla() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        newFileItem = new javax.swing.JMenuItem();
        openFileItem = new javax.swing.JMenuItem();
        saveFileItem = new javax.swing.JMenuItem();
        saveAsFileItem = new javax.swing.JMenuItem();
        menuEdit = new javax.swing.JMenu();
        cutItem = new javax.swing.JMenuItem();
        copyItem = new javax.swing.JMenuItem();
        pasteItem = new javax.swing.JMenuItem();
        menuSelection = new javax.swing.JMenu();
        selectAllItem = new javax.swing.JMenuItem();
        appareanceItem = new javax.swing.JMenu();
        lightItem = new javax.swing.JMenuItem();
        darkItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuFile.setText("File");

        newFileItem.setText("New File");
        newFileItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFileItemActionPerformed(evt);
            }
        });
        menuFile.add(newFileItem);

        openFileItem.setText("Open File");
        menuFile.add(openFileItem);

        saveFileItem.setText("Save ");
        menuFile.add(saveFileItem);

        saveAsFileItem.setText("Save As");
        menuFile.add(saveAsFileItem);

        menuBar.add(menuFile);

        menuEdit.setText("Edit");

        cutItem.setText("Cut");
        menuEdit.add(cutItem);

        copyItem.setText("Copy");
        menuEdit.add(copyItem);

        pasteItem.setText("Paste");
        menuEdit.add(pasteItem);

        menuBar.add(menuEdit);

        menuSelection.setText("Selection");

        selectAllItem.setText("Select All");
        menuSelection.add(selectAllItem);

        appareanceItem.setText("Appareance");

        lightItem.setText("Light mode");
        appareanceItem.add(lightItem);

        darkItem.setText("Dark mode");
        appareanceItem.add(darkItem);

        menuSelection.add(appareanceItem);

        menuBar.add(menuSelection);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 559, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newFileItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFileItemActionPerformed
          TextArea t = new TextArea();
          add(t);
    }//GEN-LAST:event_newFileItemActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu appareanceItem;
    private javax.swing.JMenuItem copyItem;
    private javax.swing.JMenuItem cutItem;
    private javax.swing.JMenuItem darkItem;
    private javax.swing.JMenuItem lightItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuEdit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuSelection;
    private javax.swing.JMenuItem newFileItem;
    private javax.swing.JMenuItem openFileItem;
    private javax.swing.JMenuItem pasteItem;
    private javax.swing.JMenuItem saveAsFileItem;
    private javax.swing.JMenuItem saveFileItem;
    private javax.swing.JMenuItem selectAllItem;
    // End of variables declaration//GEN-END:variables
}