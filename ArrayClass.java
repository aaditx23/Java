package trial;

public class ArrayClass {
    public int[] createArray(int size){
        int[] new_array = new int[size];
        return new_array;
    }
    public int[] copyArray(int[] oldarray){
      int[] copy = new int[oldarray.length];
      for(int i = 0; i < oldarray.length; i++){
        copy[i]=oldarray[i];
      }
      return copy;
    }
    public int[] reverseCopyArray(int[] oldarray){
      int[] copy = new int[oldarray.length];
      int count = 0;
      for(int i = oldarray.length-1; i > -1; i--){
        copy[count]=oldarray[i];
        count++;
      }
      return copy;
    }
    public int[] compactArray(int[] array) {
    	int size = 0;
    	for (int i =0; i< array.length; i++) {
    		if(array[i]!=0) {
    			size++;
    		}
    	}
    	int[] newarray = new int[size];
    	for(int j = 0; j<size; j++) {
    		newarray[j]=array[j];
    	}
    	return newarray;
    }
    public int[] resizeArray(int[] oldarray, int size){
      int[] newarray = new int[size];
      for(int i = 0; i<oldarray.length; i++){
        newarray[i]= oldarray[i];
      }
      return newarray;
    }
    public int[] leftShiftArray(int[] oldarray){
        for(int i = 0; i<oldarray.length-1;i++){
        oldarray[i]=oldarray[i+1];
        }
        oldarray[oldarray.length-1]=0;
      return oldarray;
    }
    public int[] leftShiftArray(int[] oldarray, int times){
        for(int j=0; j<times; j++){
          for(int i = 0; i<oldarray.length-1;i++){
          oldarray[i]=oldarray[i+1];
          }
        oldarray[oldarray.length-1-j]=0;
        }
      return oldarray;
    }
    
    public int[] leftShiftArray(int[] oldarray, int times, int index){
        for(int j=0; j<times; j++){
          for(int i = index; i<oldarray.length-1;i++){
          oldarray[i]=oldarray[i+1];
          System.out.println(i);
          }
          oldarray[oldarray.length-1-j]= 0;
        }
      return oldarray;
    }
    public int[] rightShiftArray(int[] oldarray){
      for (int i=oldarray.length-1; i>0;i--){
        oldarray[i]=oldarray[i-1];
      }
      oldarray[0]=0;
      return oldarray;
    }
    public int[] rightShiftArray(int[] oldarray, int times){
      for (int j = 0; j<times; j++){
        for(int i = oldarray.length-1; i>0; i--){
          oldarray[i]=oldarray[i-1];
        }
        oldarray[j] = 0;
      }
      return oldarray;
    }
    public int[] rightShiftArray(int[] oldarray, int times, int index){
      for (int j = 0; j<times; j++){
        for(int i = oldarray.length-1; i>=index; i--){
          oldarray[i]=oldarray[i-1];
        }
        oldarray[index+j]= 0;
        oldarray[index] = 0;
      }
      return oldarray;
    }
    public int[] insertElement(int[] array, int value, int index) {
    	int size = 0;
    	for(int i = 0; i < array.length; i++) {
    		if(array[i]!=0) {
    			size++;
    		}
    	}
    	
    	if (size == array.length) {
    		System.out.println("No space left");
    	}
    	else if(index > size) {
    		System.out.println("Index out of range");
    	}
    	else {
    		array = rightShiftArray(array, 1, index);
    		array[index] = value;
    	}
    	return array;
    }
    public int[] removeElement(int[] array,int index) {
    	//array[index]= 0;
    	//array[array.length-1]=0;
    	if( index > array.length-1) {
    		System.out.println("Index out of bounds, removal incomplete.");
    	}
    	else {
    		array = leftShiftArray(array, 1, index);
        	array = compactArray(array);
    	}
    	
    	return array;
    }
}