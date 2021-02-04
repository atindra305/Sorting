
public class NewSort {

	public static void insertionSort(int array[]) { 
		// Insertion Sort
		
		// Atindra Shekhar
		// E19CSE187
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  
	
	public static void main(String[] args) {
		// Insertion Sort
		
		// Atindra Shekhar
		// E19CSE187
		
		int[] arr1 = {19,114,13,12,143,111,158,122};    
        System.out.println("Before Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
        System.out.println();    
            
        insertionSort(arr1);  
           
        System.out.println("After Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }   
		

	}

}
