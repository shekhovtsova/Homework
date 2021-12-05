import test.ship.StarShip;

public class Clazz {
	public static void main(String[] args) {

		System.out.println("Hello World!");
		System.out.println("**********************************************************");

		System.out.println(8 + 2);
		System.out.println(8 - 2);
		System.out.println(8 * 2);
		System.out.println(8 / 3);

		System.out.println(8.0 / 3);

		int side = 7;
		System.out.println("Площадь квадрата со стороной "+side+" = "+side*side);

		double sideSecond = 7.45;
		String str = "Площадь квадрата со стороной ";
		System.out.println(str+sideSecond+" = "+sideSecond*sideSecond);
		System.out.println("**********************************************************");

		helloTest();

		helloTest("Кошак");

		System.out.println(helloTest("Кот", "Кошка"));
		System.out.println("**********************************************************");

		/*Экземпляр класса с использованием пустого констуктора*/
		StarShip ship1 = new StarShip();
		/*Свойство экземляра*/
		ship1.shipHeight = 5.55;
		/*Показываем высоту корабля*/
		displayHeight(ship1);

		/*Экземпляр класса с использованием конструктора*/
		StarShip ship2 = new StarShip(231.002);
		/*Показываем высоту корабля*/
		displayHeight(ship2);

		/*Экземпляр класса с использованием геттеров и сеттеров*/
		StarShip ship3 = new StarShip();
		ship3.setShipHeight(314.215);
		/*Показываем высоту корабля*/
		displayHeight1(ship3);

	}
	/*Метод*/
	public static void helloTest() {
		System.out.println("Hello!");

	}

	/*Метод с 1 параметром*/
	public static void helloTest(String s) {
		System.out.println("Hello, "+s+"!");

	}

	/*Метод с возвратом значения*/
	public static String helloTest(String s1, String s2) {
		return ("Hello, " + s1+" и "+s2+"!");
	}

	/*Отображение высоты корабля через метод getHeight*/
	public static void displayHeight(StarShip outShip) {
		System.out.println("Высота корабля: "+getHeight(outShip));
	}

	public static double getHeight(StarShip outShip) {
		return outShip.shipHeight;
	}

	/*Отображение высоты корабля через геттер*/
	public static void displayHeight1(StarShip outShip) {
		System.out.println("Высота корабля: "+outShip.getShipHeight());
	}
}