package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class test_score {
public static void main(String[] args) {
	String testScore=JOptionPane.showInputDialog("What your test score?");
	int testCount=Integer.parseInt(testScore);
	double total=testCount;
	if(testCount>=90) {
		JOptionPane.showMessageDialog(null, "you done a great job!");
	}else if(testCount<=80&&testCount>=65) {
		JOptionPane.showMessageDialog(null, "Nice try, aim for higher next time!");
	}else {
		JOptionPane.showMessageDialog(null, "come on I know you can do better.");
	}
}
}
