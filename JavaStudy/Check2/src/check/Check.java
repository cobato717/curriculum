package check;


public class Check {

	
	private static  String firstName = "小山";
	private static  String lastName = "由美子";
	

	public static void main(String[]args) {
		printName();
		
		constants.Constants cs = new constants.Constants();
		
		Pet pt = new Pet(cs.CHECK_CLASS_JAVA,cs.CHECK_CLASS_HOGE);	
		pt.introduce();
		
		RobotPet rp = new RobotPet(cs.CHECK_CLASS_R2D2,cs.CHECK_CLASS_LUKE); 
		rp.introduce();	
	}
	
	private static void printName() {
		System.out.println("PrintNameメソッド→"+firstName+lastName);
	}	
	
}

