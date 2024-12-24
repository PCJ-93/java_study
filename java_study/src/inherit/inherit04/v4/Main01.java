package inherit.inherit04.v4;

import java.util.ArrayList;
import java.util.List;

public class Main01 {

	public static void main(String[] args) { // 타입변환과 다형성
		
//		Cleaner c1 = new Cleaner();
//		Cleaner c2 = new DustCleaner();
//		Cleaner c3 = new WindowCleaner();
//		Cleaner c4 = new FloorCleaner();
		
//		c1.removeDust();
//		DustCleaner dc = new DustCleaner();
//		dc.removeDust();
		
		List<Cleaner> list = new ArrayList<Cleaner>();    // Cleaner 클래스에 상속시켜서 한번에 관리한다
		list.add(new DustCleaner());
		list.add(new DustCleaner());
		list.add(new DustCleaner());
		list.add(new WindowCleaner());
		list.add(new WindowCleaner());
		list.add(new WindowCleaner());
		list.add(new FloorCleaner());
		list.add(new FloorCleaner());
		list.add(new FloorCleaner());
		
		for(Cleaner c : list) {
			c.doClean();
			
			if(c instanceof DustCleaner) {  // 형변환가능한지 검사 안전하게 .. 거의안씀
				DustCleaner d = (DustCleaner)c;  // 가능하면 형변환
				d.arrangeItem(); 				//형변환 한다음 물건정리호출
			}
		}
		
//		Cleaner c1 = new DustCleaner();
//		c1.doClean();
//		DustCleaner d1 = (DustCleaner)c1;
//		d1.doClean();
//		d1.arrangeItem();
		
		
		
		
		
//		DustCleaner[] dustArr = new DustCleaner[3];
//		dustArr[0] = new DustCleaner();
//		dustArr[1] = new DustCleaner();
//		dustArr[2] = new DustCleaner();
//
//		List<WindowCleaner> windowList = new ArrayList<WindowCleaner>();
//		windowList.add(new WindowCleaner());
//		windowList.add(new WindowCleaner());
//		windowList.add(new WindowCleaner());
//		
//		List<FloorCleaner> floorList = new ArrayList<FloorCleaner>();
//		floorList.add(new FloorCleaner());
//		floorList.add(new FloorCleaner());
//		floorList.add(new FloorCleaner());
				
//		for(int i=0; i<dustArr.length; i++) {
//			dustArr[i].removeDust();
//		}
//		for(int i=0; i<windowList.size(); i++) {
//			windowList.get(i).washWindow();
//		}
//		for(FloorCleaner fc : floorList) {
//			fc.cleanFloor();
//		}
		
		
		
		
		
	}
}
