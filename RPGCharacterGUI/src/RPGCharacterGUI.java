import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RPGCharacterGUI {

    static JTextField nameInput;
    static JTextField strengthInput;
    static JTextField dexterityInput;
    static JTextField spiritInput;
    static JLabel strenLabel;
    static JLabel dexterLabel;
    static JLabel spiritLabel;
    static JLabel damageLabel;
    static JLabel armorLabel;
    static JLabel manCapLabel;
    static JLabel spellLabel;
    static JLabel nameOutputLabel;
    static JLabel strenOutputLabel;
    static JLabel dexterOutputLabel;
    static JLabel spiritOutputLabel;
    static JLabel damageOutputLabel;
    static JLabel armorOutputLabel;
    static JLabel manaCapOutputLabel;
    static JLabel spellOutputLabel;

    public static void main(String[] args) {

        JFrame window = new JFrame("RPG Character!");
        JPanel panel = new JPanel();
        nameInput = new JTextField(10);
        JLabel nameInputLabel = new JLabel("What is your character's name?");
        strengthInput = new JTextField(10);
        JLabel strengthInputLabel = new JLabel("What is your character's strength? (1-100)");
        dexterityInput = new JTextField(10);
        JLabel dexterInputLabel = new JLabel("What is your character's dexterity? (1-100)");
        spiritInput = new JTextField(10);
        JLabel spiritInputLabel = new JLabel("What is your character's spirit? (1-100)");

        JButton damage = new JButton("Calculate Damage");
        JButton armor = new JButton("Calculate Armor");
        JButton manaCap = new JButton("Calculate Mana Capacity");
        JButton spellStrength = new JButton("Calculate Spell Strength");



        window.setSize(400, 350);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        //ADD ACTION LISTENERS
        damage.addActionListener(new Damage());
        armor.addActionListener(new Armor());
        manaCap.addActionListener(new ManaCapacity());
        spellStrength.addActionListener(new SpellStrength());

        strenLabel = new JLabel("0.00/10000");
        dexterLabel = new JLabel("0.00/10000");
        spiritLabel = new JLabel("0.00/10000");
        damageLabel = new JLabel("0.00/10000");
        armorLabel = new JLabel("0.00/10000");
        manCapLabel = new JLabel("0.00/10000");
        spellLabel = new JLabel("0.00/1000");

        panel.setBackground(new Color(42, 155, 155));

        panel.add(nameInputLabel);
        panel.add(nameInput);
        panel.add(strengthInputLabel);
        panel.add(strengthInput);
        panel.add(dexterInputLabel);
        panel.add(dexterityInput);
        panel.add(spiritInputLabel);
        panel.add(spiritInput);


        panel.add(damage);

        panel.add(armor);
        panel.add(manaCap);
        panel.add(spellStrength);

        panel.add(strenOutputLabel = new JLabel("Strength: "));
        panel.add(strenLabel);
        panel.add(dexterOutputLabel = new JLabel("Dexterity: "));
        panel.add(dexterLabel);
        panel.add(spiritOutputLabel = new JLabel("Spirit: "));
        panel.add(spiritLabel);
        panel.add(damageOutputLabel = new JLabel("Damage: "));
        panel.add(damageLabel);
        panel.add(armorOutputLabel = new JLabel("Armor: "));
        panel.add(armorLabel);
        panel.add(manaCapOutputLabel = new JLabel("Mana Capacity: "));
        panel.add(manCapLabel);
        panel.add(spellOutputLabel = new JLabel("Spell Strength: "));
        panel.add(spellLabel);



        window.add(panel);
        window.setVisible(true);

    }

    private static class Damage implements ActionListener {

        public void actionPerformed(ActionEvent actionEvent){

            double number1 = Double.parseDouble(strengthInput.getText());
            double number2 = Double.parseDouble(dexterityInput.getText());

            damageLabel.setText(String.valueOf(number1 * number2));
        }
    }
    private static class Armor implements ActionListener {

        public void actionPerformed(ActionEvent actionEvent){

            double number1 = Double.parseDouble(strengthInput.getText());

            armorLabel.setText(String.valueOf(number1 * 100));
        }
    }
    private static class ManaCapacity implements ActionListener {

        public void actionPerformed(ActionEvent actionEvent){

            double number1 = Double.parseDouble(dexterityInput.getText());
            double number2 = Double.parseDouble(spiritInput.getText());

            manCapLabel.setText(String.valueOf(number1 * number2));
        }
    }
    private static class SpellStrength implements ActionListener {

        public void actionPerformed(ActionEvent actionEvent){

            double number1 = Double.parseDouble(dexterityInput.getText());
            double number2 = Double.parseDouble(spiritInput.getText());

            spellLabel.setText(String.valueOf(number1 * (number1 * number2) + number2));
        }
    }
}
