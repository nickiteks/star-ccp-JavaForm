package Assistant;

import star.common.StarMacro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test extends StarMacro {

    public void execute() {
         
        JFrame frame = new JFrame();
        JLabel lbGeometr = new JLabel("Файл геометрии:");
        JButton btnGeometry = new JButton("Выбрать геометрию");
        btnGeometry.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("aaaa");
            }
        });

        JPanel jpForm = new JPanel();
        jpForm.setLayout(new GridLayout(2,2));
        jpForm.add(lbGeometr);
        jpForm.add(btnGeometry);

        JPanel jpMainPannel = new JPanel();
        jpMainPannel.setLayout(new BorderLayout(10,10));
        jpMainPannel.add(jpForm,BorderLayout.NORTH);

        frame.add(jpMainPannel);


        frame.setMinimumSize(new Dimension(500,500));
        frame.setVisible(true);

    }

}

