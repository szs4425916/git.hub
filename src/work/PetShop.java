package work;

import java.util.Random;

public class PetShop {
	private String name;
	private Pet[] pets = new Pet[10];
	private int shu = 0;

	public PetShop(String name) {
		this.name = name;
		addPet(new Dog("AA", "公", 2, "哈士奇"));
		addPet(new Cat("BB", "公", 4, "加菲猫"));
		addPet(new Bird("CC", "母", 1, "麻雀"));
		addPet(new Dog("DD", "母", 6, "泰迪"));
		addPet(new Cat("EE", "公", 1, "折耳猫"));
		addPet(new Cat("FF", "母", 2, "布偶猫"));
		addPet(new Bird("GG", "公", 2, "鹦鹉"));
		addPet(new Dog("HH", "公", 2, "拉布拉多"));
		addPet(new Dog("II", "公", 2, "中华田园犬"));

	}

	// 判断是否有用户输入的品种
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

