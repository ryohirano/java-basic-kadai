package kadai_015;

public class CarExec_Chapter15 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//carクラスをインスタンス化
		Car_Chapter15 myCar = new Car_Chapter15();

		myCar.run(); //初期速度で走行
		myCar.changeGear(3); //ギアチェンジ
		myCar.run(); //ギアチェンジ後の速度で走行
	}

}
