package Assistant;

import javax.swing.*;
import javax.tools.JavaFileManager;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main {
    public static void main(String[] args){

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
