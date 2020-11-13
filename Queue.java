//簡単なキュー
package dataStructure;
import java.util.ArrayList;
import java.util.List;
public class Queue {

	public static void main(String[] args) {
		List<String> colors = new ArrayList<String>();
		String c = null;
		colors.add(0,"Blue");
		colors.add(1,"Yellow");
		colors.add(2,"Red");

		for(int i = 0; i < colors.size(); i++) {
			c = colors.get(i);
			System.out.println(c);
		}

	}

}
