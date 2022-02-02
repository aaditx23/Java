package learning;
import javax.swing.JOptionPane;
public class game {
	
	score score = new score();
	difficulty difficulty = new difficulty();
	int game_count = 0, move, turn_comp, user_score, comp_score;
	int score_array[];
	String user_move, comp_move, total_move, turn_result, final_result, total_result;
	char play;
	public void game_start(int mode_mode, int turn_loop) {
		int mode_select_in = mode_mode;
		
		while (game_count<turn_loop) {
			input in = new input();
			play = in.input_return();
			
			if (play == 'r' || play == 'R') {
				user_move = "User: ROCK";
				move = 0;
				
			}
			else if (play == 'p' || play == 'P') {
				user_move = "User: PAPER";
				move = 1;
				
			}
			else if(play == 's' || play == 'S') {
				user_move = "User: SCISSORS";
				move = 2;
			}
			turn_comp = difficulty.mode_difficulty(move, mode_select_in-1);
			if (turn_comp == 0) {
				comp_move = "Computer: ROCK";
			}
			else if (turn_comp == 1) {
				comp_move = "Computer: PAPER";
			}
			else if (turn_comp == 2) {
				comp_move = "Computer: SCISSORS";
			}
			score_array = score.score_count(turn_comp, move);
			user_score+=score_array[0];
			comp_score+=score_array[1];
			turn_result = String.format("%s\n%s\n\nUser: %d    Computer %d\n", 
					user_move, comp_move,user_score, comp_score);
			JOptionPane.showMessageDialog(null, turn_result, "Turn Score", JOptionPane.PLAIN_MESSAGE);
			game_count++;
		}
		final_result = String.format("Final Score - User: %d Computer %d\n", 
				user_score, comp_score);
		if(user_score>comp_score) {
			total_result = String.format("%s\nCONGRATULATIONS! You won!\n", final_result);
		}
		else if (user_score == comp_score) {
			total_result = String.format("%s\nIt's a DRAW!\n",final_result);
		}
		else {
			total_result = String.format("%s\nOops! Better Luck Next time!\n",final_result);
		}
		JOptionPane.showMessageDialog(null, total_result, "Final Score", JOptionPane.PLAIN_MESSAGE);
	}
}
