package refer;

public class Arr02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[]
		//int[][]
		//int[][][]
		//int[][][][]...
		int[][] nArr1 = new int[3][5];		
		
		// nArr1.length : 3
		// nArr1[3].length : 5
		
		/*    ㅁㅁㅁㅁㅁ
		 *    ㅁㅁㅁㅁㅁ
		 *    ㅁㅁㅁㅁㅁ
		 */
		
		int[][] nArr2 = new int [2][3];
		/*     0  1  2
		 *   0 ㅁ ㅁ ㅁ
		 *   1 ㅁ ㅁ ㅁ
		 * 
		 */
		int[] na = {1,2,3,4,5};
		int [][] nArr3 = {{1,2,3}, {4,5,6}};
		/*   012
		 * 0 123
		 * 1 456 
		 */
		System.out.println(nArr3[1][1]);
		                 //2
		for(int i=0; i<nArr3.length; i++) {
			                //3
			for(int j=0; j<nArr3[i].length; j++) { // j<nArr3[0]
				System.out.print(nArr3[i][j]+" ");
				
			}
			System.out.println();
		}
		
		int[][] nArr4 = new int[5][3];
		
		
		

	}

}
