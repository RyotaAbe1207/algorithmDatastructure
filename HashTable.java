//ハッシュテーブル
package dataStructure;
import java.util.HashMap;
import java.util.Map;
public class HashTable {

	public static void main(String[] args) {
		Map<String,String> names = new HashMap<String, String>();
		names.put("Joe","M");
		names.put("Sue","F");
		names.put("Dan","M");
		names.put("Nell","F");
		names.put("Ally","F");
		names.put("Bob","M");
		//Allyを探す
		int i = 0;
		String s = null;
		for(; i < names.size(); i++) {
			//if文で==を使うと，String型は参照型なので，等値じゃないとfalseが返る．
			//そのため，このコードではAllyは何番目か探せない．
			if(names.get("Ally") == "Ally") {
				s = names.get("Ally");
				break;
			}
		}
		System.out.println("Allyの性別は"+s);
		System.out.println("Allyは"+i+"番目");
	}

}
