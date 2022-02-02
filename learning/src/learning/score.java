package learning;
import javax.swing.JOptionPane;
public class score {
	public String game_mode, temp_mode;
	public int mode_select;
	public int mode() {
		game_mode = String.format("Difficulty:\nEasy = 1\nHard = 2\nPro = 3\nEnter Mode:\n");
		temp_mode = JOptionPane.showInputDialog(game_mode);
		mode_select = Integer.parseInt(temp_mode);
		return mode_select;
	}
	public int[] score_count(int computer_output, int user_input) {
		int count_user=0, count_computer=0;
		if (user_input ==2 && computer_output ==1) {
			count_user+=1;
		}
		else if(user_input ==1 && computer_output ==0) {
			count_user+=1;
		}
		else if(user_input ==0 && computer_output ==2) {
			count_user+=1;
		}
		else if(user_input==computer_output) {
			count_user+=0;
			count_computer+=0;
		}
		else if(computer_output==2 && user_input==1) {
			count_computer+=1;
			}
		else if(computer_output==1 && user_input==0) {
			count_computer+=1;
		}
		else if(computer_output==0 && user_input==2) {
			count_computer+=1;
			}
		int count_array[] = {count_user, count_computer};
		return count_array;
	
}
}
