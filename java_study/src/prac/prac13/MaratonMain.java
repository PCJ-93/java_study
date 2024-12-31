package prac.prac13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MaratonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		List<String> participant = new ArrayList<String>();
//		
//		participant.add(new String("marina"));
//		participant.add(new String("josipa"));
//		participant.add(new String("nikola"));
//		participant.add(new String("vinko"));
//		participant.add(new String("filipa"));
//		participant.add(new String("vinko"));
//		
//		List<String> completion = new ArrayList<String>();
//		completion.add(new String("marina"));
//		completion.add(new String("josipa"));
//		completion.add(new String("nikola"));
//		completion.add(new String("vinko"));
//		completion.add(new String("filipa"));
//		
//		
//		participant.removeAll(completion);
//		
//		
//		System.out.println(participant);
//		System.out.println(completion);

		// SOL

		String[] participant1 = { "leo", "kiki", "eden" };
		String[] completion1 = { "eden", "kiki" };

		String[] participant2 = { "marina", "josipa", "nikola", "vinko", "filipa" };
		String[] completion2 = { "marina", "josipa", "nikola", "filipa" };

		String[] participant3 = { "mislav", "stanko", "ana", "mislav" };
		String[] completion3 = { "mislav", "stanko", "ana" };

		String result1 = solution(participant1, completion1); // leo
		String result2 = solution(participant2, completion2); // vinko
		String result3 = solution(participant3, completion3); // mislav

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
//		
//		if(!result1.equals("leo")) {
//			
//		}

	}

	public static String solution(String[] participant, String[] completion) {

		/*
		 * //어레이리스트활용 List<String> partList = new
		 * ArrayList<String>(List.of(participant)); List<String> compList = new
		 * ArrayList<String>(List.of(completion)); //System.out.println(partList);
		 * 
		 * for(String s : compList) { partList.remove(s); }
		 * //System.out.println(partList); // 출력아니고 리턴해야해서 주석처리
		 * 
		 * return partList.get(0); //탈락 이름 리턴
		 */

		/*
		 * //HashSet 활용 //2.완주자 목록 추가 - > 참가자에서 한개씩 지우기 Set<String> compSet = new
		 * HashSet<String>(); for(String s : completion) { compSet.add(s); }
		 * //참가자값을compset에서 확인해서 있는지 확인 //있으면 삭제 //없으면 완주못한거 for(String s: participant)
		 * { if(compSet.contains(s)) {//있으면삭제 compSet.remove(s); }else {//없으면 리턴 return
		 * s; // 조건문안에있는 return 은 실행이안될수도있다로 인식해서 컴파일러가 오류띄움 .. 106줄로 } }
		 * 
		 * return null; //리턴명시필수
		 */

		// HashMap활용
		Map<String, Integer> pMap = new HashMap<String, Integer>();
		for (String s : participant) {
			
			pMap.put(s, pMap.getOrDefault(s, 0)+1);  // 오라클DB에 NVL 같은 기능
			
//			if (pMap.containsKey(s)) {
//				pMap.put(s, pMap.get(s) + 1);
//			} else {
//				pMap.put(s, 1);
//			}
		}
		for (String s : completion) {
			pMap.put(s, pMap.get(s) - 1);
			
		}
		for(String key : pMap.keySet()) {
			if(pMap.get(key)==1) { //미완주자  완주자들은 밸류가0
				return key;
			}
		}
		return null;
		
		
	}
}
