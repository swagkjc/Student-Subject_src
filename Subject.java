
public class Subject {
	void log(String x) {
		System.out.print("\n"+x);
	}
	
	private String sub_id,sub_name;
	
	public Subject(String id , String name) {
		sub_id=id;sub_name=name;
	}
	
	public String getData(String type) {
		if (type == null) {
			log("[ ARE U FORGOT TO INSERT TYPE OR VAULE ? ]");
			return type;
		}
		if (type.equals("id")) {
			return sub_id;
		}else if (type.equals("name")) {
			return sub_name;
		}
		
		return "\n["+type+" Not Found This Type In Data !]";
	}
	
	public void setData(String type , String vaule) {
		if (type == null || vaule == null) {
			log("[ ARE U FORGOT TO INSERT TYPE OR VAULE ? ]");
			return;
		}
		if (type.equals("id")) {
			sub_id = vaule;
		}else if (type.equals("name")) {
			sub_name = vaule;
		}else {
			log("["+type+" Not Found This Type In Data !]");
		}
	}
	
}
