package kadai_021;
import java.util.Scanner;

public class DictionaryExec_Chapter21 {
	
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	Dictionary_Chapter21 dic = new Dictionary_Chapter21();
	
	System.out.print("調べる英単語の数を入力してください");
	int num =sc.nextInt();
	sc.nextLine(); //改行を読み飛ばす
	
	//入力した数だけ繰り返す
	for(int i= 0; i < num; i++) {
		while(true) {
			
			System.out.print((i + 1) + "詰めの英単語を入力してください");
			String word = sc.nextLine();
			
			//辞書に登録されているか判定
			if(dic.exists(word)) {
				
				System.out.println("意味　:" + dic.search(word));
				break;//次の単語へ
			}else {
				System.out.println("その単語は辞書に登録されていません");
				System.out.println("もう一度入力してください。");
			}
		}
	}
	System.out.println("検索終了");
	
	sc.close();
}
}
