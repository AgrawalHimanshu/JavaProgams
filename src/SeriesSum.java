
public class SeriesSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum();

	}

	public static int sum() {
		int n = 5;
		int i = 1;
		int sum = 0;
		int j = 2;

		while (i <= n) {

			if (i % 2 != 0) {
				System.out.println(i);
				int value = i;
				for(int k=2; k<=j ; k++){
					value = value*i;
				}
				sum = sum +value;
				//sum = (int) (sum + Math.pow(i, j));
				j++;
			}
			i++;

		}

		System.out.println(sum);

		return 0;
	}
	
	public static int sum2() {
		int n = 5;
		int i = 1;
		int sum = 0;
		int j = 2;

		while (i <= n) {

			if (i % 2 != 0) {
				System.out.println(i);
				int value = i;
				
				sum = sum +value;
				//sum = (int) (sum + Math.pow(i, j));
				j++;
			}
			i++;

		}

		System.out.println(sum);

		return 0;
	}
}
