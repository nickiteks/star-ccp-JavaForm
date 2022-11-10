package Assistant;

import javax.swing.*;
import javax.tools.JavaFileManager;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class main {
    public static void main(String[] args){

        JFrame frame = new JFrame();

        //Geometry File
        JLabel lbGeometry = new JLabel("Geometry File");
        JButton btnGeometry = new JButton("Choose Geometry");
        btnGeometry.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Geometry Choose");
                int response = fileChooser.showOpenDialog(null);

                if(response == JFileChooser.APPROVE_OPTION){
                    File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                    lbGeometry.setText(file.toString());
                }
            }
        });

        // Excel File
        JLabel lbExcel = new JLabel("ExcelFile");
        JButton btnExcel = new JButton("Choose Excel File");
        btnExcel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Excel Choose");
                int response = fileChooser.showOpenDialog(null);

                if(response == JFileChooser.APPROVE_OPTION){
                    File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                    lbExcel.setText(file.toString());
                }
            }
        });

        // Save Directory
        JLabel lblSaveDirectory = new JLabel(" Save Directory Choose");
        JButton btnSaveDirectory = new JButton("Save Directory");
        btnSaveDirectory.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser directoryChooser = new JFileChooser();
                directoryChooser.setCurrentDirectory(new java.io.File("."));
                directoryChooser.setDialogTitle("Save Directory Choose");
                directoryChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                directoryChooser.setAcceptAllFileFilterUsed(false);
                int response = directoryChooser.showOpenDialog(null);

                if(response == JFileChooser.APPROVE_OPTION){
                    var directory = directoryChooser.getSelectedFile();
                    lblSaveDirectory.setText(directory.toString());
                }
            }
        });



        JPanel jpForm = new JPanel();
        jpForm.setLayout(new GridLayout(3,2));
        jpForm.add(lbGeometry);
        jpForm.add(btnGeometry);
        jpForm.add(lbExcel);
        jpForm.add(btnExcel);
        jpForm.add(lblSaveDirectory);
        jpForm.add(btnSaveDirectory);

        JPanel jpMainPannel = new JPanel();
        jpMainPannel.setLayout(new BorderLayout(10,10));
        jpMainPannel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        jpMainPannel.add(jpForm,BorderLayout.NORTH);

        frame.add(jpMainPannel);


        frame.setMinimumSize(new Dimension(500,200));
        frame.setVisible(true);


    }
}
