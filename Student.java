/*CODE BY ZIN 62160246*/

public class Student {
	/* MY PRINT STYLE :3 */
	void log(String x) {
		System.out.print("\n"+x);
	}
	
	private String stu_id,stu_name;
	private double stu_gpa;
	Subject stu_s;
	
	/* SET DATA :D */
	public Student(String id , String name , double gpa , Subject s) {
		stu_id=id;stu_name=name;stu_s=s;stu_gpa=gpa;
	}
	
	/* PROCESSING :D */
	public String getData(String type) {
		if (type == null) {
			log("[ ARE U FORGOT TO INSERT TYPE OR VAULE ? ]");
			return type;
		}
		if (type.equals("id")) {
			return stu_id;
		}else if (type.equals("name")) {
			return stu_name;
		}else if (type.equals("subject_id")) {
			returnSubject("id");
		}else if (type.equals("subject_name")) {
			returnSubject("name");
		}
		return"";
	}

	public void setData(String type , String vaule) {
		if (type == null || vaule == null) {
			log("[ ARE U FORGOT TO INSERT TYPE OR VAULE ? ]");
			return;
		}
		if (type.equals("id")) {
			stu_id = vaule;
		}else if (type.equals("name")) {
			stu_name = vaule;
		}else if (type.equals("subject")) {
			log("[ USE 'setSubject' FOR THIS TYPE :D ]");
			return;
		}else {
			log("["+type+" Not Found This Type In Data !]");
		}
	}
	
	public void setSubject(Subject subject) {
		stu_s = subject;
	}
	
	public double getGPA() {
		return stu_gpa;
	}
	
	public static int GetMVP(Student[] data) {
		double maxGPA = data[0].getGPA();
		int returnIndex = 0;
		for(int index = 0; index < data.length; index++) {
			if(data[index].getGPA() > maxGPA){ 
				maxGPA = data[index].getGPA(); 
				returnIndex = index;
			} 
		}
		return returnIndex;
	}
	/* LOGIC :D */
	private String returnSubject(String type) {
		if (type == null) {
			log("[ ARE U FORGOT TO INSERT TYPE ? ]");
			return null;
		}
		if (type.equals("id")) {
			return stu_s.getData("id");
		}else if (type.equals("name")) {
			return stu_s.getData("name");
		}
		return"";
	}
	
	 /* SHOW RESULT */
	public void toStr() {
		System.out.printf("\n[ THE MOST VARIABLE STUDENT ]=> %s %s %.2f %s %s :D",stu_id ,stu_name ,stu_gpa , returnSubject("id") , returnSubject("name"));
	}
}
