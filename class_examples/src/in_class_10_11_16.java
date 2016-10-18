
public class in_class_10_11_16 {

	/**
	 * @param args
	 */
	public static int factorial(int n, int x){
		return ((n == 0)?x:((x == 0)?factorial(n-1,1):factorial(n-1, x+n)));
//		public static int factorial(int n, int x){
//			if(n == 0) return x;
//			else if (x == 0) return factorial(n-1,1);
//			else return factorial(n-1, x+n);
	}
	
	public static void main(String[] args) {
		int practice = 5; 
		int x= 4;
		int i,j;

		
		switch (practice){
		case 1: //practice 1 - box
			i = 0;
			while (i < x){ 
				j=1;
				while (j <= x){
					System.out.print(" "+j);
					++j;
				}
				System.out.print("\n");
				++i;
			}	
			break;
		case 2://practice 2 - triangle
			i = 0;
			while (i <= x){ //practice 2
				j=1;
				while (j <= i){
					System.out.print(" " + j);
					++j;
				}
				System.out.print("\n");
				++i;
			}
		case 3: //practice 3 - product
			i = 1;
			j = 1; //product
			while (i < x){ //practice 3
				j *= i++;
				System.out.print(j);
				System.out.print("\n");
			}
		case 4: //practice 4 - factorial
			i = 0;
			j = 1;
			int sum = 0;
			while (i < x){ //practice 3
				sum += (j *= ++i);
			}
			System.out.println(sum);
		case 5: //factorial
			System.out.println(factorial(19999,0));
		}	
//		int a = 4;
//		int b = 20;
//		int y;
		
//		y = a > b? a:b;
//		System.out.print(y);
		

		
		

		
	}

}
