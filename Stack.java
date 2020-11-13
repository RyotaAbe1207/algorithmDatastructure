package dataStructure;
import java.util.ArrayList;
public class Stack {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>();
		String c = null;
		colors.add(0,"Blue");
		colors.add(1,"Green");
		colors.add(2,"Red");

		for(int i = 0; i < colors.size(); i++) {
			c = colors.get(i);
			System.out.println(c);
		}

	}

}
