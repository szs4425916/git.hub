package work;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	PetShop petShop = new PetShop("С��");
	public static void main(String[] args) throws IOException {
		Main main = new Main();
		main.start();
	}

	// ��ʼ����
	private void start() throws IOException {
				while (true) {
			System.out.println(petShop.getName() + "�����������1��������������2���ۿ��������г���������3����㿴��������0");
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
				System.out.println("�ټ�...");
				return;
	                       }
			 }
		}
	// �չ�����
	private void purchasePetView() throws IOException {
		int xuanze = inputInt("��ĳ����ǣ�����1����è��2������3��");
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
		String kind = inputStr("���è��ʲô����");
		String sex = inputStr("��ʲô�Ա��è��");
		int age = inputInt("è������");
		String name = inputStr("èȡʲô���֣�");
		Cat cat = new Cat(name, sex, age, kind);
		boolean purchasePet = petShop.purchasePet(cat);
		System.out.println(purchasePet ? "�չ��ɹ���" : "�չ�ʧ�ܣ�");

	}


	private void purchaseDogView() throws IOException {
		String kind = inputStr("��ʲôƷ�ֵĹ���");
		String sex = inputStr("��ʲô�Ա�Ĺ���");
		String name = inputStr("��ȡʲô���֣�");
		int age = inputInt("����������");
		Dog dog = new Dog(name, sex, age, kind);
		boolean purchasePet = petShop.purchasePet(dog);
		System.out.println(purchasePet ? "�չ��ɹ���" : "�չ�ʧ�ܣ�");
	}

	private void purchaseBirdView  () {
		String kind = inputStr("��ʲôƷ�ֵ���");
		String sex = inputStr("��ʲô�Ա����");
		String name = inputStr("��ȡʲô���֣�");
		int age = inputInt("���������");
		Bird bird = new Bird(name, sex, age, kind);
		boolean purchasePet = petShop.purchasePet(bird);
		System.out.println(purchasePet ? "�չ��ɹ���" : "�չ�ʧ�ܣ�");
	}

	private void buyPetView() throws IOException {
		switch (inputInt("��Ҫ��ʲô�������1����è��2������3��")) {
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
			String kind = inputStr("ҪʲôƷ�ֵ�è��");
			boolean shuruCatKind = petShop.shuruCatKind(kind);
			if (!shuruCatKind) {
				System.out.println("��ѡ���Ʒ�ֱ���û�У����������룡");
				continue;
			}
			Pet buyCat = petShop.buyCat(kind);
			buyCat.show();
			return;
		}

}
	
	private void buyDogView() throws IOException {
		while (true) {
			String kind = inputStr("ҪʲôƷ�ֵĹ���");
			boolean shuruDogKind = petShop.shuruDogKind(kind);
			if (!shuruDogKind) {
				System.out.println("��ѡ���Ʒ�ֱ���û�У����������룡");
				continue;
			}
			Pet buyDog = petShop.buyDog(kind);
			buyDog.show();
			return;
		}

}
		
		private void buyBirdView() throws IOException {
			while (true) {
				String kind = inputStr("ҪʲôƷ�ֵ���");
				boolean shuruBirdKind = petShop.shuruBirdKind(kind);
				if (!shuruBirdKind) {
					System.out.println("��ѡ���Ʒ�ֱ���û�У����������룡");
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
