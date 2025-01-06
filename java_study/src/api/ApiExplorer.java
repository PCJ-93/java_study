package api;


import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.IOException;

public class ApiExplorer {

	public static void main(String[] args)  {

		List<ArplInfo> arplList = null;
		try {
			arplList = ArplApiService.forecastDustArplInfoList("2024-12-12");

			for(ArplInfo info : arplList) {
				System.out.println( info.toString() );
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//ArplInfo 객체 -> DB 저장
		ArplDAO arplDAO = new ArplDAO();
		int count = 0;
		for(ArplInfo ai : arplList) {
			count+=arplDAO.saveArplInfo(ai);
		}
		System.out.println(count+"개 저장성공");
		
		//api - > 데이터확보 -> 저장
		//누적해서 데이터를 계속 저장/활용
		//1) 기존데이터 delete -> 새로 insert
		//2) MERGE 처리
		
		//ArplDAO
//		arplDAO.saveArplInfo(arplList.get(0));
		
	}

}
