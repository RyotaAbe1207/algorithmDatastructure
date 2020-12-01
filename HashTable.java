//ハッシュテーブル
package dataStructure;
import java.util.LinkedHashMap;
import java.util.Map;
public class HashTable {

	public static void main(String[] args) {
		Map<String,String> names = new LinkedHashMap<String, String>();
		int result = 0;
		names.put("Joe","M");
		result = names.get("Joe").hashCode(); //ハッシュ値取得
		System.out.println(result);
		names.put("Sue","F");
		names.put("Dan","M");
		names.put("Nell","F");
		names.put(new String("Ally"),"F");
		names.put("Bob","M");
		//Allyを探す
		int i = 0;
		String s = null;
		//HashMapは順番が保証されない．LinkedHashMapを使うべき
		for(String key : names.keySet()) {
			i++;
			//key == "Ally"でtrueと返るのはコンスタントプールの恩恵
			//13行目names.put(new String("Ally"),"F");とするとnullが返る．
			//equalsをオーバーライドしてないけど，なぜか正しい結果が出てくるのはなぜ？
			if(key.equals("Ally")){
				s = names.get("Ally");
				break;
			}
		}
		System.out.println("Allyの性別は"+s);
		System.out.println("Allyは"+i+"番目");
//		System.out.println(names.get("Joe").hashCode());
	}

}
