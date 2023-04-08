//Title: Melhoria para fins de estudo da calculadora de IMC, usando a
// ferramenta chatGPT para criar um Jframe da calculadora.- JAVA
//By: Rafael Bispo;
//Mod: Implementar OOB

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class imcGPT extends JFrame {
    private JTextField pesoField;
    private JTextField alturaField;
    private JLabel resultadoLabel;

    public imcGPT() {
        setTitle("Cálculo do IMC");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel();
        painel.setLayout(new BorderLayout());

        JLabel pesoLabel = new JLabel("Peso (kg):");
        pesoField = new JTextField(10);
        JPanel pesoPanel = new JPanel();
        pesoPanel.add(pesoLabel);
        pesoPanel.add(pesoField);
        painel.add(pesoPanel, BorderLayout.NORTH);

        JLabel alturaLabel = new JLabel("Altura (m):");
        alturaField = new JTextField(10);
        JPanel alturaPanel = new JPanel();
        alturaPanel.add(alturaLabel);
        alturaPanel.add(alturaField);
        painel.add(alturaPanel, BorderLayout.CENTER);

        JButton calcularButton = new JButton("Calcular");
        calcularButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularIMC();
            }
        });
        JPanel botaoPanel = new JPanel();
        botaoPanel.add(calcularButton);
        painel.add(botaoPanel, BorderLayout.SOUTH);

        resultadoLabel = new JLabel("Resultado aqui");
        JPanel resultadoPanel = new JPanel();
        resultadoPanel.add(resultadoLabel);
        painel.add(resultadoPanel, BorderLayout.EAST);

        getContentPane().add(painel);
    }

    private void calcularIMC() {
        String peso = pesoField.getText();
        String altura = alturaField.getText();
        if (peso.contains(",")) {
            peso = peso.replace(",", ".");
        }
        if (altura.contains(",")) {
            altura = altura.replace(",", ".");
        }
        double peso2 = Double.parseDouble(peso);
        double altura2 = Double.parseDouble(altura);
        double imc = peso2 / (altura2 * altura2);
        String classificacao;
        if (imc < 18.5) {
            classificacao = "magreza";
        } else if (imc < 25) {
            classificacao = "normal";
        } else if (imc < 30) {
            classificacao = "sobrepeso I";
        } else if (imc < 40) {
            classificacao = "sobrepeso II";
        } else {
            classificacao = "sobrepeso III";
        }
        resultadoLabel.setText(String.format("Seu IMC é %.2f (%s)", imc, classificacao));
    }

    public static void main(String[] args) {
        imcGPT frame = new imcGPT();
        frame.setVisible(true);
    }
}
