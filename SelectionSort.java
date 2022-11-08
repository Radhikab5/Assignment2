
public class SelectionSort {

	public static void main(String[] args) {
		
		int[] arr = {70,40,10,30,20,50,80,60};
		 for (int i = 0; i < arr.length - 1; i++)  
	        {  
	            int index = i;  
	            for (int j = i + 1; j < arr.length; j++){  
	                if (arr[j] < arr[index]){  
	                    index = j;  
	                }  
	            }  
	            int lowestNumber = arr[index];   
	            arr[index] = arr[i];  
	            arr[i] = lowestNumber;  
	        } 
		 System.out.println("Sorted array is");
		   for(int el:arr)
			{
				System.out.print(el+" ");
			}


	}

}
