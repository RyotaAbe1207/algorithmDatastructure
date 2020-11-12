package dataStructure;
import java.util.ArrayList;
public class List2 {
	public static void main(String[] args) {
	ArrayList<String> colors = new ArrayList<String>();
	colors.add(0,"Brue");
	colors.add(1,"Yellow");
	colors.add(2,"Red");
	colors.add(1,"Green"); //ここで第1要素(2番目)にGreenが入る
	colors.remove(2); //Yellowを削除

	for(String c : colors) {

	System.out.println(c);

		}

	}

}
