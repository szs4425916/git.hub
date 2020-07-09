package work;

public class Bird extends Pet {

		private String kind;

		public Bird(String name, String sex, int age, String kind) {
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
			return "Bird (����=" + kind + ", ����=" + name + ", �Ա�=" + sex + ", ����=" + age + ")";
		}


	}

