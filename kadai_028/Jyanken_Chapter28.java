package kadai_028;
import java.util.HashMap;
import java.util.Scanner;
public class Jyanken_Chapter28 {
	Scanner scanner = new Scanner(System.in);
	
	//従分の手を入力
	public String getMyChoice() {
		
		while(true) {
			System.out.print("自分の手を入力してください(r:グー、　s:チョキ、　p:パー) :");
			String myChoice = scanner.nextLine();
			
			//正しいか入力判定
			if(myChoice.equals("r")|| myChoice.equals("s")|| myChoice.equals("p")) {
				return myChoice;
			}
			System.out.println("入力が正しくありません。もう一度入力してください");
		}
	}
//対戦相手の手を乱数で決定する
public String getRandom() {
	//0以上３未満の乱数を生成し、小数点以下を切り捨てる
	int num = (int)Math.floor(Math.random()*3);
	switch(num) {
	case 0:
		return "r";
	case 1:
		return "s";
	default:
		return "p";
	}
}

//じゃんけんを行う
public void playGame() {
	String myChoice = getMyChoice();
	String enemyChoice = getRandom();
	
	System.out.println("自分の手:" + convertHand(myChoice));
	System.out.println("相手の手:" + convertHand(enemyChoice));
	
	//勝敗表
	HashMap<String, String> resultMap =new HashMap<>();
	
	resultMap.put("rr", "あいこです");
	resultMap.put("rs", "自分の勝ちです");
	resultMap.put("rp", "自分の負けです");
	
	resultMap.put("sr", "自分の負けです");
	resultMap.put("ss", "あいこです");
	resultMap.put("sp", "自分の勝ちです");
	
	resultMap.put("pr", "自分の勝ちです");
	resultMap.put("ps", "自分の負けです");
	resultMap.put("pp", "あいこです");
	
	String key = myChoice + enemyChoice;
	System.out.println(resultMap.get(key));
	scanner.close();
}
//r,s,pを日本語に変換
private String convertHand(String hand) {
	switch(hand) {
	case"r":
		return "グー";
	case"s":
		return "チョキ";
	default:
		return "パー";
	}
}
}
