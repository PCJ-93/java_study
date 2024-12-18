package cls.cls08;

import cls.cls07.Temp;

import java.util.ArrayList;


public class ClassListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Temp t = new Temp();

		Temp[] arr = new Temp[3];
		arr[0] = new Temp();
		arr[1] = new Temp();
		arr[2] = t;
		
//		Integer 는 int 타입의 Wrapper Class
//	앞에가 대문자 Double 는 double 타입의 Wrapper Class  Double.parseDouble
		
		
		ArrayList<Temp> list = new ArrayList<Temp>();
		list.add(t);  // Temp t = new Temp();
		list.add(new Temp());
		list.add(new Temp());
		list.add(new Temp());
		list.add(new Temp());
		
		for(int i=0; i<list.size(); i++) {
			list.get(i).print();
		}
		
		for(Temp item : list) {
			item.print();
		}
		
		ArrayList<Temp> returnList = methodList(list);
		System.out.println("method 호출 후");
		for(Temp item : returnList) {
			item.print();
		}		

	}
	
	public static ArrayList<Temp> methodList(ArrayList<Temp> list){
		System.out.println("method 안에서");
		list.add(new Temp());
		list.get(1).print();
		
		return list;
	}
	

}
