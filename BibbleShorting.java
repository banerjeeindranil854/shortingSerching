package project;

public class BibbleShorting {
public static void main (String arg[]) {
	int[] ar = {1,5,3,6,10};
	int count=0;
	for(int i =0;i<ar.length;i++) {
		for (int j=0;j<ar.length-i;j++) {
			count=0;
			if(j+1<ar.length-i && ar[j]>ar[j+1]) {
				int temp=ar[j];
				ar[j]=ar[j+1];
				ar[j+1]=temp;
				count=count+1;
			}
		}
		if(count==0) {
			break;
		}
	}
	for(int i =0;i<ar.length;i++) {
	System.out.print(ar[i]);
	}
}
}
