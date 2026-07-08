package kadai_021;
import java.util.HashMap;
public class Dictionary_Chapter21 {
 HashMap<String,String> map = new HashMap<>();

	public Dictionary_Chapter21() {
		
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
    //英単語を検索するメソッド
	public void search(String[]words) {
		for(String word : words) {
			boolean found =false;
			for(String key : map.keySet()) {
				if(key.equals(word)) {
					System.out.println(word + "の意味は" + map.get(word));
					found = true;
					break;
				}
			}
			if(!found) {
				System.out.println(word + "は辞書に存在しません");
			}
		}
	
	}
}

	


