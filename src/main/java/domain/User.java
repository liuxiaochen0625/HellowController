package domain;

public class User {
	private Integer user_id;
	private String name;
	private Integer age;



	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public User(Integer user_id,String name, Integer age) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.age = age;
	}

	public User() {
		super();
	}
}
