package io.workspace;

import java.util.Arrays;

public class Bubblesort {

	public static void bubblesort(int [] a) {
		boolean isSorted=false;
		while(!isSorted) {
			isSorted=true;
			for(int i=0;i<a.length-1;i++) {
				if(a[i]>a[i+1]) {
					swap(a,i,i+1);
					isSorted=false;
				}
			}
		}
	}
	
	public static void swap(int [] a,int i,int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
	public static void main(String[] args) {
		int [] arr= {20,2,41,62,0,8,-12};
		bubblesort(arr);
		System.out.println(Arrays.toString(arr));	
	}

}
