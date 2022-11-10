package Assistant;

import javax.swing.*;
import javax.tools.JavaFileManager;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

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
                fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                fileChooser.setDialogTitle("Select a geometry");
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
                fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                fileChooser.setDialogTitle("Select a Excel");
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

        JButton btnOK = new JButton("Ok");
        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Script_Path = "C:\\Users\\NULS\\IdeaProjects\\pythonRunTest\\src\\ggg.py";
                ProcessBuilder Process_Builder = new
                        ProcessBuilder("python",Script_Path,"1","4")
                        .inheritIO();

                Process Demo_Process = null;
                try {
                    Demo_Process = Process_Builder.start();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    Demo_Process.waitFor();
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }

                BufferedReader Buffered_Reader = new BufferedReader(
                        new InputStreamReader(
                                Demo_Process.getInputStream()
                        ));
                String Output_line = "";

                while (true) {
                    try {
                        if ((Output_line = Buffered_Reader.readLine()) == null) break;
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    System.out.println(Output_line);
                }
            }
        });

        JPanel jpOK = new JPanel();
        jpOK.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 2;
        constraints.gridy = GridBagConstraints.RELATIVE;
        jpOK.add(btnOK,constraints);

        JPanel jpMainPannel = new JPanel();
        jpMainPannel.setLayout(new BorderLayout(10,10));
        jpMainPannel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        jpMainPannel.add(jpForm,BorderLayout.NORTH);
        jpMainPannel.add(jpOK);

        frame.add(jpMainPannel);


        frame.setMinimumSize(new Dimension(500,200));
        frame.setVisible(true);


    }
}
