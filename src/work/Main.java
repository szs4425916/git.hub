package work;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	PetShop petShop = new PetShop("小张");
	public static void main(String[] args) throws IOException {
		Main main = new Main();
		main.start();
	}

	// 开始方法
	private void start() throws IOException {
				while (true) {
			System.out.println(petShop.getName() + "买宠物请输入1，卖宠物请输入2，观看本店所有宠物请输入3，随便看看请输入0");
			int xuanze = sc.nextInt();
			switch (xuanze) {
			case 1:
				this.buyPetView();
				break;
			case 2:
				this.purchasePetView();
				break;
			case 3:
				petShop.showPets();
				break;
			default:
				System.out.println("再见...");
				return;
	                       }
			 }
		}
	// 收购宠物
	private void purchasePetView() throws IOException {
		int xuanze = inputInt("你的宠物是？狗（1），猫（2），鸟（3）");
		switch (xuanze) {
		case 1:
			purchaseDogView();
			break;
		case 2:
			purchaseCatView();
			break;
		case 3:
			purchaseBirdView();
			break;
		default:
			break;
		}
	}


	private void purchaseCatView() throws IOException {
		String kind = inputStr("你的猫是什么种类");
		String sex = inputStr("是什么性别的猫？");
		int age = inputInt("猫年龄多大？");
		String name = inputStr("猫取什么名字？");
		Cat cat = new Cat(name, sex, age, kind);
		boolean purchasePet = petShop.purchasePet(cat);
		System.out.println(purchasePet ? "收购成功！" : "收购失败！");

	}


	private void purchaseDogView() throws IOException {
		String kind = inputStr("是什么品种的狗？");
		String sex = inputStr("是什么性别的狗？");
		String name = inputStr("狗取什么名字？");
		int age = inputInt("狗的年龄多大？");
		Dog dog = new Dog(name, sex, age, kind);
		boolean purchasePet = petShop.purchasePet(dog);
		System.out.println(purchasePet ? "收购成功！" : "收购失败！");
	}

	private void purchaseBirdView  () {
		String kind = inputStr("是什么品种的鸟？");
		String sex = inputStr("是什么性别的鸟？");
		String name = inputStr("鸟取什么名字？");
		int age = inputInt("鸟的年龄多大？");
		Bird bird = new Bird(name, sex, age, kind);
		boolean purchasePet = petShop.purchasePet(bird);
		System.out.println(purchasePet ? "收购成功！" : "收购失败！");
	}

	private void buyPetView() throws IOException {
		switch (inputInt("需要买什么宠物？狗（1），猫（2），鸟（3）")) {
		case 1:
			buyDogView();
			break;
		case 2:
			buyCatView();
			break;
		case 3:
			buyBirdView();
			break;
		default:
			break;
		}
	}
	
	private void buyCatView() throws IOException {
		while (true) {
			String kind = inputStr("要什么品种的猫？");
			boolean shuruCatKind = petShop.shuruCatKind(kind);
			if (!shuruCatKind) {
				System.out.println("你选择的品种本店没有，请重新输入！");
				continue;
			}
			Pet buyCat = petShop.buyCat(kind);
			buyCat.show();
			return;
		}

}
	
	private void buyDogView() throws IOException {
		while (true) {
			String kind = inputStr("要什么品种的狗？");
			boolean shuruDogKind = petShop.shuruDogKind(kind);
			if (!shuruDogKind) {
				System.out.println("你选择的品种本店没有，请重新输入！");
				continue;
			}
			Pet buyDog = petShop.buyDog(kind);
			buyDog.show();
			return;
		}

}
		
		private void buyBirdView() throws IOException {
			while (true) {
				String kind = inputStr("要什么品种的鸟？");
				boolean shuruBirdKind = petShop.shuruBirdKind(kind);
				if (!shuruBirdKind) {
					System.out.println("你选择的品种本店没有，请重新输入！");
					continue;
				}
				Pet buyBird = petShop.buyBird(kind);
				buyBird.show();
				return;
			}

	}


	public int inputInt(String tip) {
		System.out.println(tip);
		return sc.nextInt();
	}

	public String inputStr(String tip) {
		System.out.println(tip);
		return sc.next();
	}

}
