package array;

public class find_string {
	public static int finding(String name[], String find) {
		
		for(int i=0; i<name.length; i++) {
			if(name[i].equals(find)) {
				return i;
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {


		String name[]= {"karan", "ranveer", "om", "akshay", "jaydeep"};
		
		String find = "om";
		
		int result = finding(name, find);
		
		if(result==-1) {
			System.out.println("not found");
		}else {
			System.out.println("string found at index "+result);
		}
		
		System.out.println(finding(name, find));


	}

}
