package kadai_021;
import java.util.HashMap;
public class Dictionary_Chapter21 {
	private final HashMap<String,String> map;

	public Dictionary_Chapter21() {
		map = new HashMap<>();
		
		//辞書に単語を登録
		map.put("apple", "りんご");
	    map.put("peach", "桃");
	    map.put("banana", "バナナ");
	    map.put("lemon", "レモン");
	    map.put("pear", "梨");
	    map.put("kiwi", "キウィ");
	    map.put("strawberry", "いちご");
	    map.put("grape", "ぶどう");
	    map.put("muscat", "マスカット");
	    map.put("cherry", "さくらんぼ");
		
	}

	//単語が存在するか判定
	public String search(String word) {
		if(map.containsKey(word)) {
			return map.get(word);
		}else {
			return "辞書に存在しません";
		}
	}
}
	


