package task9;

public class mmain {
	public static void main(String[] args) {
		basket basket = new basket();
		basket.addBall(new ball(5, "black"));
		basket.addBall(new ball(3.5, "blue"));
		System.out.println(basket.calculateBallsWeight());
		System.out.println(basket.getBlueBallsCount());
	}
}
