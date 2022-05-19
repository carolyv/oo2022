import java.awt.*;
import java.awt.event.*;

public class Temp extends Frame {
    Choice choice1, choice2;
    Button convert;
    TextField text1, text2;
    Label label1, label2, label3;
    Temp() {

        label3 = new Label("Celsius");
        choice2 = new Choice();
        choice2.add("Celsius");
        choice2.add("Fahrenheit");
        choice2.add("Kelvin");
        text1 = new TextField(10);
        text2 = new TextField(10);
        convert = new Button("Convert");
        label1 = new Label("to");
        label2 = new Label();

        text1.setText("0");
        //lisan frame-i
        add(label3);
        add(label1);
        add(choice2);
        add(text1);
        add(convert);
        add(label2);
        

        convert.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String calcTo = choice2.getSelectedItem();
                int userInput = Integer.parseInt(text1.getText());   
                if(calcTo == "Celsius") {
                    label2.setText(String.valueOf(userInput));
                } else if (calcTo == "Fahrenheit") {
                    label2.setText(String.valueOf((userInput * 1.8) + 32));
                } else {
                    label2.setText(String.valueOf(userInput + 273.15));
                }
            }
        });
        

        // framei asjad
        setSize(500, 300);
        setTitle("Temperature converter");
        setLayout(new GridLayout(2, 3)); // class used to arrange components in a line one after another
        setVisible(true);
    }
    public static void main(String[] args) {
        Temp frame = new Temp();
    }
}