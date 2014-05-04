package zx;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

public class Liner {
	public static final String IMAGE_PATH = "C:/Users/Ryan/Videos/Webdriver/tmpvrSSZm (5-4-2014 11-34-56 AM)/PNG/tmpvrSSZm 2.png";
	public static List<Coord> corners = new ArrayList<Coord>();

	// 69, 0
	// 69, 320
	public static void main(String[] args) throws IOException {
		File file = new File(IMAGE_PATH);
		BufferedImage image = ImageIO.read(file);
		for (int x = 0; x < 69; x++) {
			for (int y = 0; y < 320; y++) {
				int colour = image.getRGB(x, y);
				int r = (colour >> 16) & 0xff;
				int g = (colour >> 8) & 0xff;
				int b = colour & 0xff;
				getColour(new OperaColor(r, g, b).getHex(), x, y);
			}
		}
		for (Coord coo : corners) {
			System.out.println(coo);
		}
	}

	public static void getColour(String s, int x, int y) {
		String col = s.substring(1);
		if (col.equalsIgnoreCase("2e358f")) corners.add(new Coord(x, y, true));
		if (col.equalsIgnoreCase("241fdb")) corners.add(new Coord(x, y, true));
		if (col.equalsIgnoreCase("0b02c1")) corners.add(new Coord(x, y, true));
		if (col.equalsIgnoreCase("4f48ba")) corners.add(new Coord(x, y, true));
	}
}
