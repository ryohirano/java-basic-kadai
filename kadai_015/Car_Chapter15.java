package text.kadai_015;

public class Car_Chapter15 {
	
	//フィールド内部データ
	private int gear = 1;//ギア
	private int speed = 10;//スピード

	//ギアチェンジすると速度も変わる
	public void changeGear(int afterGear) {
		this.gear = afterGear;
		this.speed =this.gear * 10;//ギアに応じて速度変化
		
		System.out.println("ギアを" + gear + "に変更しました");
		System.out.println("現在の速度は" + speed + "km/hです");
	}
	//走行メソッド
	public void run() {
		System.out.println("走行中... 速度は" + speed + "km/h");
	}
	}
