package check;
import constants.Constants;

public class Main{
	private String firstName;
	private String lastName;
	
	
	public Main(String firstName,String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	private void printName() {
		System.out.println("printNameメソッド　→　"+ firstName + lastName );
	}

	public static void main(String[] args) { 
		Main main = new Main("Niina","Kurita");
		main.printName();
		Pet pet1 = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		pet1.introduce();
		RobotPet robotpet = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		robotpet.introduce();
			
	}
}