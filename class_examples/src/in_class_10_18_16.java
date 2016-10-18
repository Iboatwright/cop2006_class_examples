
public class in_class_10_18_16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,25,0,10,5,2,1,3,6};
		System.out.println(arr[2]);
		arr[0] = 6;
		int sum =0;
		for (int i =0;i != arr.length; i++){
				System.out.println(arr[i]);
		}
		for (int i =0;i != arr.length; i++){
			sum += arr[i];
		}
		System.out.println("Sum: " + sum + "\nAverage: " + (double)(sum/arr.length));
	}

}
