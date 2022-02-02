package learning;
import java.util.Random;
public class difficulty {
	Random random = new Random();
	int rock = 0, paper = 1, scissor = 2;
	int[] rock_array[] = {{0,1,2},{0,0,1,1,1,2},{0,0,1,1,1,1,2}};
	int[] paper_array[] = {{0,1,2},{0,1,1,2,2,2},{0,1,1,2,2,2,2}};
	int[] scissor_array[] = {{0,1,2},{0,0,0,1,2},{0,0,0,0,1,1,2}};
	int[][] game_array[] = {rock_array, paper_array, scissor_array};
	public int mode_difficulty(int user, int game_mode) {
		int computer;
		int[] user_move[] = game_array[user];
		int tmp =random.nextInt(user_move[game_mode].length);
		computer = user_move[game_mode][tmp];
		return computer;
	}
	
}

