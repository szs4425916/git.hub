package work;

import java.util.Random;

public class PetShop {
	private String name;
	private Pet[] pets = new Pet[10];
	private int shu = 0;

	public PetShop(String name) {
		this.name = name;
		addPet(new Dog("AA", "��", 2, "��ʿ��"));
		addPet(new Cat("BB", "��", 4, "�ӷ�è"));
		addPet(new Bird("CC", "ĸ", 1, "��ȸ"));
		addPet(new Dog("DD", "ĸ", 6, "̩��"));
		addPet(new Cat("EE", "��", 1, "�۶�è"));
		addPet(new Cat("FF", "ĸ", 2, "��żè"));
		addPet(new Bird("GG", "��", 2, "����"));
		addPet(new Dog("HH", "��", 2, "��������"));
		addPet(new Dog("II", "��", 2, "�л���԰Ȯ"));

	}

	// �ж��Ƿ����û������Ʒ��
	public boolean shuruDogKind(String kind) {
		for (Pet pet : pets) 
		   {
			if (pet instanceof Dog) {
				Dog d = (Dog) pet;
				boolean equals = d.getKind().equals(kind);
				if (equals) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean shuruCatKind(String kind) {
		for (Pet pet : pets) 
		   {
			if (pet instanceof Cat) {
				Cat c = (Cat) pet;
				boolean equals = c.getKind().equals(kind);
				if (equals) {
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean shuruBirdKind(String kind) {
		for (Pet pet : pets) 
		   {
			if (pet instanceof Bird) {
				Bird b = (Bird) pet;
				boolean equals = b.getKind().equals(kind);
				if (equals) {
					return true;
				}
			}
		}
		return false;
	}
	public String getName() {
		return name;
	}

	public int size() {
		return shu;
	}

	private boolean addPet(Pet pet) {
		if (shu >= pets.length) {
			return false;
		}
		pets[shu] = pet;
		shu++;
		return true;
	}

	public boolean purchasePet(Pet pet) {
		return this.addPet(pet);
	}

 
	public Pet buyDog(String kind) {
				int kindshu = 0;
				for (int m = 0; m < pets.length; m++) {
					Pet pet = pets[m];
					if (pet instanceof Dog) {
						Dog d = (Dog) pet;
						boolean equals = d.getKind().equals(kind);
						if (equals) {
							kindshu++;
						}
					}
				}

		int[] kindIndex = new int[kindshu];
		int h = 0;
		for (int i = 0; i < pets.length; i++) {
			Pet pet = pets[i];
			if (pet instanceof Dog) {
				Dog a = (Dog) pet;
				boolean equals = a.getKind().equals(kind);
				if (equals) {
					kindIndex[h++] = i;
				}
			}
		}
		Random o = new Random();
		int nextInt = o.nextInt(kindIndex.length);
		int i = kindIndex[nextInt];
 
		Pet sell = pets[i];
		capaticyConfirm(i);
		return sell;
	}

	private void capaticyConfirm(int index) {
		int tag = index;
		while (tag < shu - 1) {
			pets[tag] = pets[tag + 1];
			tag++;
		}
		pets[shu--] = null;
	}


	public void showPets() {
		for (int i = 0; i < shu; i++) {
			pets[i].show();
		}
	}
	
		public Pet buyCat(String kind) {
			int kindshu = 0;
			for (int m = 0; m < pets.length; m++) {
				Pet pet = pets[m];
				if (pet instanceof Dog) {
					Cat c = (Cat) pet;
					boolean equals = c.getKind().equals(kind);
					if (equals) {
						kindshu++;
					}
				}
			}

			int[] kindIndex = new int[kindshu];
			int h = 0;
			for (int i = 0; i < pets.length; i++) {
				Pet pet = pets[i];
				if (pet instanceof Cat) {
					Cat c = (Cat) pet;
					boolean equals = c.getKind().equals(kind);
					if (equals) {
						kindIndex[h++] = i;
					}
				}
			}
			Random o = new Random();
			int nextInt = o.nextInt(kindIndex.length);
			int i = kindIndex[nextInt];
	 
			Pet sell = pets[i];
			capaticyConfirm(i);
			return sell;
	}
		
		public Pet buyBird(String kind) {
			int kindshu = 0;
			for (int m = 0; m < pets.length; m++) {
				Pet pet = pets[m];
				if (pet instanceof Bird) {
					Bird b = (Bird) pet;
					boolean equals = b.getKind().equals(kind);
					if (equals) {
						kindshu++;
					}
				}
			}

			int[] kindIndex = new int[kindshu];
			int h = 0;
			for (int i = 0; i < pets.length; i++) {
				Pet pet = pets[i];
				if (pet instanceof Bird) {
					Bird b = (Bird) pet;
					boolean equals = b.getKind().equals(kind);
					if (equals) {
						kindIndex[h++] = i;
					}
				}
			}
			Random o = new Random();
			int nextInt = o.nextInt(kindIndex.length);
			int i = kindIndex[nextInt];
	 
			Pet sell = pets[i];
			capaticyConfirm(i);
			return sell;
	}

}

