
// Tuesday
// The Lazy Wolves
// 3.20.2019
import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class SimplePicture extends GraphicsProgram {
	public static int SIZE = 700;
	
	public void init() {
		setSize(SIZE, SIZE);
	}
	
	public void run() {
		GImage robot = new GImage("robot.jpg", 200, 100);
		add(robot);
<<<<<<< HEAD
		GLabel label = new GLabel("How I feel when using github hackslash", 150, 400);
=======
		GLabel label = new GLabel("How I feel when using github hackslash", 4638292, 400);
>>>>>>> branch 'master' of https://github.com/comp55-spr19/git-team-lab-the-lazy-wolves.git
		add(label);
	}
}