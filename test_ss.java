import java.util.*;
public class test_ss {
	/* MY PRINT STYLE :3 */
	static void log(String x) {
		System.out.print(x);
	}
	/* MY PROCESS :3 */
	public static void main(String[] test_ss) {
		Scanner log_in = new Scanner(System.in);
 
		log("[Enter Number Of Student]=> ");
		int rd = log_in.nextInt();
		Student[] data_stu = new Student[rd];		
		
		for(int index = 0 ; index < rd ; index++) {
			log("Enter Data EXAMPLE:[1234 Somchai 3.12 885100 Logic] => ");
			String id = log_in.next();  String name = log_in.next();
			double gpa = log_in.nextDouble();
			String sub_id = log_in.next();  String sub_name = log_in.next();
			Subject index_sub = new Subject(sub_id, sub_name);
			
			data_stu[index] = new Student(id , name , gpa, index_sub );
		}
	
		int maxGPAIndex = data_stu[0].GetMVP(data_stu);
		data_stu[maxGPAIndex].toStr();
	}	
		
}

