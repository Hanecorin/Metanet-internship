package kosa.data;

public class Person implements Comparable<Person>{

	private String name;
	private int age;
	
	public Person() {}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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

	@Override
	public String toString() {
		return "Person [이름=" + name + ", 나이=" + age + "]";
	}

	@Override
	public int compareTo(Person o) {
		//나이로 오름차순 기준
		if (age < o.age) {
			return -1;
		}else if (age > o.age) {
			return 1;
		}
		return 0;
	}
	
	
	
}
