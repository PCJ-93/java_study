package exp;

public class Exp02 {

	public static void main(String[] args) {

		int[] arr = new int[3];

		try {
			// arr = null;  nullpointerexception 에서 걸린다
			arr[5] = 10;
		} catch (NullPointerException e) {
			System.out.println("NullpointerException catch block");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException catch block");
		} catch (Exception e) { // 얘가 맨위에있으면 다른애들 다 잡아먹는다.
			System.out.println("Exception catch block");
		}

	}

}
