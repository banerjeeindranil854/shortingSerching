package project;

public class normalShorting {
public static void main(String args[]) {
	int[] ar = {1,5,3,6,10};
	for(int i =0;i<ar.length;i++) {
		for (int j=1;j<ar.length;j++) {
			if(ar[j-1]>ar[j]) {
				int temp=ar[j-1];
				ar[j-1]=ar[j];
				ar[j]=temp;
			}
		}
	}
	for(int i =0;i<ar.length;i++) {
	System.out.print(ar[i]);
	}
}
}
