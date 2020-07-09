package work;

public class Dog extends Pet {

	private String kind;

	public Dog(String name, String sex, int age, String kind) {
		super(name, sex, age);
		this.kind = kind;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public void eat() {

	}


	public void jiao() {
		
	}


	public void show() {
		System.out.println(this.toString());
	}

	public void run() {

	}

	public String toString() {
		return "Dog (种类=" + kind + ", 名字=" + name + ", 性别=" + sex + ", 年龄=" + age + ")";
	}


}

