import javax.swing.JOptionPane;
public class MadLib 
{
    public static void main(String[] args)
    {
        String noun1, noun2, adjective, pastverb;
        noun1 = JOptionPane.showInputDialog("Enter a noun");
        noun2 = JOptionPane.showInputDialog("Enter another noun");
        adjective = JOptionPane.showInputDialog("Enter an adjective");
        pastverb = JOptionPane.showInputDialog("Enter a past tense verb");
        JOptionPane.showMessageDialog(null, "Mary had a little " + noun1 + 
        "\nIts " + noun2 + " was " + adjective + " as snow" + "\nAnd everywhere that Mary " + pastverb +
        "\nThe " + noun1 + " was sure to go");
    }
}
