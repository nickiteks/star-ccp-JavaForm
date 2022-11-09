package Assistant;

import star.common.StarMacro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test extends StarMacro {

    public void execute() {

        JFrame frame = new JFrame();
        JLabel lbGeometry = new JLabel("Geometry File");
        JButton btnGeometry = new JButton("Choose Geometry");
        btnGeometry.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("aaaa");
            }
        });

        JLabel lbExcel = new JLabel("ExcelFile");
        JButton btnExcel = new JButton("Choose Excel File");

        JPanel jpForm = new JPanel();
        jpForm.setLayout(new GridLayout(2,2));
        jpForm.add(lbGeometry);
        jpForm.add(btnGeometry);
        jpForm.add(lbExcel);
        jpForm.add(btnExcel);

        JPanel jpMainPannel = new JPanel();
        jpMainPannel.setLayout(new BorderLayout(10,10));
        jpMainPannel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        jpMainPannel.add(jpForm,BorderLayout.NORTH);

        frame.add(jpMainPannel);


        frame.setMinimumSize(new Dimension(500,500));
        frame.setVisible(true);

    }

}

