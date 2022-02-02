package learning;
import javax.swing.JOptionPane;

public class input {
	public String user_input_gui;
	public input() {
		user_input_gui = JOptionPane.showInputDialog("Rock = r\nPaper = p\nScissor = s\nYour Turn!!!\n\n\n");
	}
	public char input_return() {
		return user_input_gui.charAt(0);
	}
}
