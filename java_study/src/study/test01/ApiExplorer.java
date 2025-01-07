package study.test01;

import java.io.IOException;

public class ApiExplorer {

	public static void main(String[] args) {
		
		String arplList = null;
		try {
			arplList = ArplApiService.kisang("20250106");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		ArplInfo arp = new ArplInfo();
		System.out.println(arp.toString());
		
		
		

	}

}
