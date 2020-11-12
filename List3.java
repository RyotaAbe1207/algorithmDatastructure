//1-3配列
package dataStructure;
import java.util.ArrayList;
public class List3 {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>();
		colors.add(0,"Brue");
		colors.add(1,"Yellow");
		colors.add(2,"Red");
		colors.add(1,"Green");

		for(String c : colors) {
			System.out.println(c);
		}
		System.out.println(""); //1行空白
		colors.remove(1);
		for(String c : colors) {
			System.out.println(c);
		}
	}

}
