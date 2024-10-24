package refer;

public class Arr05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,20,30,40,50};
		
		for (int i=0; i<5; i++) {
			System.out.print("arr["+i+"]"+arr[i]+" ");
		}
		System.out.println();
		
		for(int value : arr) {
			System.out.print(value+" ");
		}
		
		System.out.println();
		
		int[] scores = {90,95,100,80,75};
		int sum = 0;
		
		for(int i=0; i<scores.length; i++) {
			sum = sum + scores[i];
		}
		System.out.println(sum);
		
		sum=0;
		for(int score : scores) {
			sum = sum + score;
		}
		System.out.println(sum);
		
		//점수 채점 잘못되서 모든점수를 -5점씩 감점
		for(int i=0; i<scores.length; i++) {
			scores[i] = scores[i]-5;
			System.out.print(scores[i]+" ");
		}
		
		System.out.println();
		
		//향상된 for문은 감점시키기 어려움
		for(int score : scores) {
			System.out.print(score+" ");
		}
		System.out.println();
	
		
		
		
		
		
	}

}
