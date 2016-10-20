
public class in_class_10_20_16 {

	static int sum(int[] array){
		int sum = 0;
		for (int i=0;i<array.length;i++){
			sum += array[i];
		}
		return sum;
	}
	static double average(int[] array){
		int sum = 0;
		for (int i=0;i<array.length;i++){
			sum += array[i];
		}
		return (double)(sum/array.length);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,25,0,10,5,2,1,3,6};
		System.out.println("Array values sum: " + sum(arr));
		System.out.println("Array values average: " + average(arr));
		
	}

}
