package game;

public class Game {

	private Display display;
	public int width, height;
	public String title;

	public Game(String title, int width, int height) {
		this.width = width;
		this.height = height;
		this.title = title;

		display = new Display(title, width, height);


	}

}
