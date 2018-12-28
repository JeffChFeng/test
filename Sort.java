package sort;

import java.util.Arrays;

public class Sort {
	public static void insertSort(int []a) {
		int value;
		for(int i=1;i<a.length;i++) {
			value=a[i];
			int j=i-1;
			for(;j>=0&&value<a[j];j--) {
				a[j+1] = a[j];
			}
			a[j+1]=value;
		}
	}
	public static void main(String[] args) {
		int []a= {5,2,3,6,1};
		insertSort(a);
		System.out.println(Arrays.toString(a));
	}
}
