package ch.ffhs.dua.kollaborativeAufgabePVA2;

import javafx.util.Pair;

public class MinMax {
	
	public static void main(String[] args){
		int[] intArray = {9,4,6,4,3,9,32,5993,2};
		System.out.println(getMinMax(intArray));
	}
	
	
	public static Pair getMinMax(int[] array)
	{
		int x, y;
		x = array[0];
		y = array[0];
		
		for(int i = 0; i < array.length; i++) {
			if(x > array[i]) {
				x = array[i];
			}
			
			if(y < array[i]) {
				y = array[i];
			}
			System.out.println(x + " " + y);
		}
		
		return new Pair(x , y);
	}

}
