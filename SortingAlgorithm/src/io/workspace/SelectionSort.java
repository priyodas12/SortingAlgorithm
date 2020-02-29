package io.workspace;

import java.util.Arrays;

public class SelectionSort {
	
	public static void sortBySelection(int [] b) {
		
		int minIndex,temp,i,j,n=b.length;
		
		for(i=0;i<n-1;i++) {
			minIndex=i;
			for(j=i+1;j<n;j++) {
			if(b[j]<b[minIndex]) {
					minIndex=j;
				}
			}
			if(i!=minIndex) {
				temp=b[i];
				b[i]=b[minIndex];
				b[minIndex]=temp;
			}
		}	
	}
	public static void main(String[] args) {
		int [] a=new int[] {3,4,5,6,7,0,1};
		sortBySelection(a);
		System.out.println(Arrays.toString(a));
	}

}
