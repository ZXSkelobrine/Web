package zx;

public class Coord {
	public int x, y;
	public boolean blue;

	public Coord(int x, int y, boolean blue) {
		this.x = x;
		this.y = y;
		this.blue = blue;
	}

	@Override
	public String toString() {
		return "X: " + x + "\tY: " + y + "\tBlue: " + blue;
	}
}
