
public class DuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = {10,20,10,30,20,40,50,40};
		boolean flag = false;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++){
				if(arr[i] == arr[j]) {
					System.out.println("Duplicate element found: " +arr[i]);
					flag=true;
				}
				
			}
		}
		
		if(flag == false) {
			System.out.println("No duplicate element found");
		}
	}
}
	


