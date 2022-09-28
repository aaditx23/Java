package learning;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class input extends JFrame {
	static int us_sc=0, cmp_sc=0;
	difficulty d = new difficulty();
	score s = new score();
	int move_count[] = {};
	Icon rps_icon[] = {new ImageIcon(getClass().getResource("r.png")), 
						new ImageIcon(getClass().getResource("p.png")), 
						new ImageIcon(getClass().getResource("s.png")) };
	Icon rps_icon_rev[] = {new ImageIcon(getClass().getResource("r_rev.png")), 
							new ImageIcon(getClass().getResource("p_rev.png")), 
							new ImageIcon(getClass().getResource("s_rev.png")) };
	JButton rps[] = {new JButton(rps_icon[0]), new JButton(rps_icon[1]), new JButton(rps_icon[2])};
	JButton move_button[] =  {new JButton("User"), new JButton("Comp")};
	JRadioButton options[] =  {new JRadioButton("Easy", true), new JRadioButton("Medium"), new JRadioButton("Pro")};
	ButtonGroup group = new ButtonGroup();
	JLabel difficulty = new JLabel("Select Difficulty");
	JTextField score[] = {new JTextField("User score"), new JTextField("Comp score")};
	JButton reset = new JButton("RESET");
	int mode, user_move, comp_move, input;
	public input() {
		super("Choose item!");
		setLayout(new FlowLayout());
		add(difficulty);
		for (JRadioButton x : options) {
			add(x);
			x.addItemListener(
					new ItemListener() {
						public void itemStateChanged(ItemEvent event) {
							if (options[0].isSelected()){
								mode = 0;
							}
							else if (options[1].isSelected()) {
								mode = 1;
							}
							else {
								mode = 2;
							}
						}
					}
					);
			group.add(x);
		}
		
		for (JButton x: rps) {
			add(x);
			x.addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent event) {
							if (x == rps[0]) {
								input = 0;	
							}
							else if (x == rps[1]) {
								input = 1;
							}
							else {
								input = 2;
							}
							//System.out.println(input+"      "+mode);
							comp_move = d.mode_difficulty(input, mode);
							move_count = s.score_count(comp_move, input);
							if (input ==0){
								move_button[0].setIcon(rps_icon[0]);
							}
							else if (input ==1){
								move_button[0].setIcon(rps_icon[1]);
							}
							else {
								move_button[0].setIcon(rps_icon[2]);
							}
							if (comp_move ==0){
								move_button[1].setIcon(rps_icon[0]);
							}
							else if (comp_move ==1){
								move_button[1].setIcon(rps_icon[1]);
							}
							else {
								move_button[1].setIcon(rps_icon[2]);
							}
							 us_sc += move_count[0];
							 cmp_sc += move_count[1];
							score[0].setText(String.format("User Score: "+us_sc));
							score[1].setText(String.format("Comp Score: "+cmp_sc));
						}
					}
					);
			
			
		}
		for (JButton x : move_button) {
			add(x);
			x.setEnabled(false);
		}
		for(JTextField text : score) {
			add(text);
			text.setEditable(false);
		}
		add(reset);
		reset.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						
							us_sc = 0;
							cmp_sc = 0;
							score[0].setText(String.format("User Score: "+us_sc));
							score[1].setText(String.format("Comp Score: "+cmp_sc));
						
					}
				}
				);
		
	}
}

