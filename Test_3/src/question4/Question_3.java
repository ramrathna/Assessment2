package question4;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Question_3 {
	public static void main(String[] args)
			throws IOException, InterruptedException
	{
		Color color[];		
		File fin = new File("D:\\naveen\\nature.jpg");		
		BufferedImage input = ImageIO.read(fin);

		
		BufferedImage output = new BufferedImage(
			input.getWidth(), input.getHeight(),
			BufferedImage.TYPE_INT_RGB);
		
		int i = 0;
		int max = 400, rad = 10;
		int a1 = 0, r1 = 0, g1 = 0, b1 = 0;
		color = new Color[max];		

		int x = 1, y = 1, x1, y1, ex = 5, d = 0;

		
		for (x = rad; x < input.getHeight() - rad; x++) {
			for (y = rad; y < input.getWidth() - rad; y++) {
				for (x1 = x - rad; x1 < x + rad; x1++) {
					for (y1 = y - rad; y1 < y + rad; y1++) {
						color[i++] = new Color(
							input.getRGB(y1, x1));
					}
				}

				
				i = 0;
				for (d = 0; d < max; d++) {
					a1 = a1 + color[d].getAlpha();
				}

				a1 = a1 / (max);
				for (d = 0; d < max; d++) {
					r1 = r1 + color[d].getRed();
				}

				r1 = r1 / (max);
				for (d = 0; d < max; d++) {
					g1 = g1 + color[d].getGreen();
				}

				g1 = g1 / (max);
				for (d = 0; d < max; d++) {
					b1 = b1 + color[d].getBlue();
				}

				b1 = b1 / (max);
				int sum1 = (a1 << 24) + (r1 << 16)
						+ (g1 << 8) + b1;
				output.setRGB(y, x, (int)(sum1));
			}
		}

		
		boolean outputFinal = ImageIO.write(
			output, "jpeg",
			new File("D:\\\\naveen\\\\nature.jpg"));
		
		System.out.println(outputFinal);

		
		System.out.println("Image blurred successfully !");
	}
}
