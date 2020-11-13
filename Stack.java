//コレクションを利用した簡単なスタック
package dataStructure;
import java.util.ArrayList;
import java.util.List;
public class Stack {

	public static void main(String[] args) {
		List<String> colors = new ArrayList<String>();
		String c = null;
		colors.add(0,"Blue");
		colors.add(1,"Green");
		colors.add(2,"Red");

		for(int i = 0; i < colors.size(); i++) {
			c = colors.get(colors.size()-1-i);
			System.out.println(c);
		}

	}

}
