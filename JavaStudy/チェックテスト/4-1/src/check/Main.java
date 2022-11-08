package check;
import constants.Constants;

public class Main{

		private static String firstName;
		private static String lastName;
		
		
		public Main(String firstName,String lastName) {
			this.firstName = "Niina";
			this.lastName = "Kurita";
		}
		
		public String getFirstName() {
			return firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
		
		private String printName() {
			return firstName+" "+lastName;
		}
		
		public String getPrintName() {
			return this.printName();
		}
		
		
		
		public void sample() {
		System.out.println("printNameメソッド　→　"+ firstName + lastName );
		}
		

			public static void main(String[] args) { 
			
			Main main = new Main("七海","真弥");
			
			Pet pet1 = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
			RobotPet robotpet = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		
			
			}
}