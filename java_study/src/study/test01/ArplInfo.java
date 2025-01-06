package study.test01;

public class ArplInfo {
	
	/*
		CREATE TABLE ARPLINFO (
			pageNo   NUMBER PRIMARY KEY,
			baseDate NUMBER,
			baseTime NUMBER,
			fcstTime NUMBER
		);
		
		CREATE SEQUENCE arplinfo_pk_seq
		start with 1
		increment by 1
		nocycle;
	 */
	
	int baseDate;
	int baseTime;
	int fcstTime;
	
	
	
	public String toString() {
		return "ArplInfo [baseDate=" + baseDate + ", baseTime=" + baseTime + ", fcstTime=" + fcstTime + "]";
	}
	
	public ArplInfo() {
	}
	
	public ArplInfo(int baseDate, int baseTime, int fcstTime) {
		this.baseDate = baseDate;
		this.baseTime = baseTime;
		this.fcstTime = fcstTime;
	}
	
	public int getBaseDate() {
		return baseDate;
	}
	public void setBaseDate(int baseDate) {
		this.baseDate = baseDate;
	}
	public int getBaseTime() {
		return baseTime;
	}
	public void setBaseTime(int baseTime) {
		this.baseTime = baseTime;
	}
	public int getFcstTime() {
		return fcstTime;
	}
	public void setFcstTime(int fcstTime) {
		this.fcstTime = fcstTime;
	}
	
	
	
	
	
	
	
	
}
