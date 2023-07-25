package code;

public class MergeSort {
	public static void main(String[] args) {
	    int[] a = { 4,5,1,2,3,6,7};
	    sort(a);
	    for (int n : a) {
	      System.out.print(n + " ");
	    }
	  }

	  static void sort(int[] a) {
	    if (a.length == 1)
	      return;
	    int[] left = new int[a.length / 2];
	    int[] right = new int[a.length - left.length];
	    for (int i = 0; i < left.length; i++) {
	      left[i] = a[i];
	    }
	    for (int j = 0; j < right.length; j++) {
	      right[j] = a[left.length+j];
	    }
	    sort(left);
	    sort(right);
	    merge(left,right,a);
	  }

	  static void merge(int[] a, int[] b, int[] c) {
	    int i = 0, j = 0, k = 0;
	    while (i < a.length && j < b.length) {
	      if (a[i] < b[j])
	        c[k++] = a[i++];
	      else
	        c[k++] = b[j++];
	    }
	    while (i < a.length)
	      c[k++] = a[i++];
	    while (j < b.length)
	      c[k++] = b[j++];
	  }
	}

//	       a--->{5,9,1,3,7,2,8,6}
//	      [5,9,1,3]      [7,2,8,6]    dividing into two arrays.
//	    [5,9][1,3]      [7,2][8,6]     array one and array two .
//	    [5][9] [1][3]    [7][2] [8][6]   dividing into one more time with an single arrays.
//	    [5,9] [1,3]      [2,7][6,8]     sorting  done by ascending order. and replacing the elements with an order
//	    [1,3,5,9]      [2,6,7,8]     Merging done into two different arrays with ascending order.
//	    [1,2,3,5,6,7,8]             ----->finally merge the array with an ascending order.

