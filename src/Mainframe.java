import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mainframe extends JFrame{
    private JButton [][] jbtns = new JButton[4][4];
    private JButton clr = new JButton("Clear");
    private JLabel jlb = new JLabel("0");
    private Container cp ;
    private JPanel jpnN = new JPanel();
    private JPanel jpnC =new JPanel(new GridLayout(4,4,2,2));
    private JPanel jpnS = new JPanel(new GridLayout(1,1,2,2));
    private String str = new String();

    public Mainframe () {
        this.init();
    }

    private void init () {
        setBounds(200,100,400,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp = this.getContentPane();
        cp.add(jpnN , BorderLayout.NORTH);
        cp.add(jpnC , BorderLayout.CENTER);
        cp.add(jpnS , BorderLayout.SOUTH);

        jpnN.setLayout(new FlowLayout(FlowLayout.RIGHT));
        jpnN.add(jlb);
        jlb.setFont(new Font(null,Font.BOLD,50));
        jlb.setSize(400,200);
        jpnS.add(clr);
        clr.setFont(new Font(null,Font.BOLD,50));
        clr.setSize(400,200);

        for (int i = 0 ; i < 4 ; i ++){
            jbtns[0][i] = new JButton();
            jbtns[0][i].setFont(new Font(null,Font.BOLD,50));
            jpnC.add(jbtns[0][i]);
            if (i % 4 == 3){
                jbtns[0][i].setText("/");
            }else {
                jbtns[0][i].setText(Integer.toString(i + 7));
            }
            jbtns[0][i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton tmpBtn = (JButton) e.getSource() ;
                    str = str + tmpBtn.getText();
                    jlb.setText(str);
                }
            });
        }

        for (int i = 0 ; i < 4 ; i ++){
            jbtns[1][i] = new JButton();
            jbtns[1][i].setFont(new Font(null,Font.BOLD,50));
            jpnC.add(jbtns[1][i]);
            if (i % 4 == 3){
                jbtns[1][i].setText("*");
            }else {
                jbtns[1][i].setText(Integer.toString(i + 4));
            }
            jbtns[1][i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton tmpBtn = (JButton) e.getSource() ;
                    str = str + tmpBtn.getText();
                    jlb.setText(str);
                }
            });
        }

        for (int i = 0 ; i < 4 ; i ++){
            jbtns[2][i] = new JButton();
            jbtns[2][i].setFont(new Font(null,Font.BOLD,50));
            jpnC.add(jbtns[2][i]);
            if (i % 4 == 3){
                jbtns[2][i].setText("-");
            }else {
                jbtns[2][i].setText(Integer.toString(i + 1));
            }
            jbtns[2][i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton tmpBtn = (JButton) e.getSource() ;
                    str = str + tmpBtn.getText();
                    jlb.setText(str);
                }
            });
        }

        for (int i = 0 ; i < 4 ; i ++){
            jbtns[3][i] = new JButton();
            jbtns[3][i].setFont(new Font(null,Font.BOLD,50));
            jpnC.add(jbtns[3][i]);
            switch (i){
                case 0 :
                    jbtns[3][i].setText("0");
                    break;
                case 1 :
                    jbtns[3][i].setText(".");
                    break;
                case 2 :
                    jbtns[3][i].setText("=");
                    break;
                case 3 :
                    jbtns[3][i].setText("+");
                    break;
            }
            jbtns[3][i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton tmpBtn = (JButton) e.getSource() ;
                    str = str + tmpBtn.getText();
                    jlb.setText(str);
                }
            });
        }

        clr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlb.setText("0");
                str = "";
            }
        });
    }
}

