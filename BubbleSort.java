
public class BubbleSort {
	
	public static void main(String[] args) {
		

		int[] arr = {70,40,10,30,20,50,80,60};
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j< arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("Sorted array is");
		for(int el:arr)
		{
			System.out.print(el+" ");
		}

		
	}

}
