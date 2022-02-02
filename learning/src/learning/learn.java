package learning;
import javax.swing.JOptionPane;
public class learn {
	public static void main(String[] args) {
		String turn_in = JOptionPane.showInputDialog("Enter the number of turns:\n\n\n");
		int turn_int = Integer.parseInt(turn_in);
		score score_obj =new score();
		int arg = score_obj.mode();
		game obj = new game();
		obj.game_start(arg, turn_int);
	}
		
	}
	
