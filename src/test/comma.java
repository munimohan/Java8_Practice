package test;

public class comma {
	
	public static void main(String[] args) {
		String csvStr="test,,gravy,too,foo,tytt";
		System.out.println(csvStr.split(",")[1]);
		if(csvStr.split(",")[1]==null || csvStr.split(",")[1]=="") {
			System.out.println("success");
		}
	}

}
