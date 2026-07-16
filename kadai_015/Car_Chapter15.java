package kadai_015;

public class Car_Chapter15 {
	//フィールド内部データ
	private int gear = 1;//ギア
	private int speed = 10;//スピード

	//ギアチェンジすると速度も変わる
	public void changeGear(int afterGear) {
		int beforeGear = this.gear; // 変更前のギア
	    this.gear = afterGear;

	    // ギアに応じて速度を設定
	    switch (this.gear) {
	        case 1:
	            this.speed = 10;
	            break;
	        case 2:
	            this.speed = 20;
	            break;
	        case 3:
	            this.speed = 30;
	            break;
	        case 4:
	            this.speed = 40;
	            break;
	        case 5:
	            this.speed = 50;
	            break;
	        default:
	            this.speed = 10; // 1～5以外は10km/h
	            break;
	    }

	    System.out.println("ギアを " + beforeGear + " から " + this.gear + " に変更しました");
	}

	//走行メソッド
	public void run() {
		System.out.println("速度は時速" + this.speed + "kmです。");
	}
}
