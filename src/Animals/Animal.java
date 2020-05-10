package Animals;

public abstract class Animal {

	protected String type;

	protected String name;
	protected int age;
	protected String disease;

	public Animal(String name, int age, String disease) {

		this.name = name;
		this.age = age;
		this.disease = disease;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String illness) {
		this.disease = illness;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "\r\n" + "Type: " + type + "\r\n" + " name: " + name + "\r\n" + " age: " + age + "\r\n" + 
	" disease: " + disease + "\r\n" + "\r\n" + " ------------------------ ";
	}

}
