package task9;

import java.util.ArrayList;

public class basket {
	private ArrayList<ball> balls = new ArrayList<ball>();

	public void addBall(ball ball) {
		balls.add(ball);
	}

	public double calculateBallsWeight() {
		double sum = 0;
		for (ball ball : balls) {
			sum += ball.getWeight();
		}
		return sum;
	}

	public int getBlueBallsCount() {
		int countOfBlue = 0;
		for (ball ball : balls) {
			if (ball.getColor() == "blue")
            countOfBlue++;
		}
		return countOfBlue;
	}
}
