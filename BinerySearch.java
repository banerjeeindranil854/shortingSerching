package project;

public class BinerySearch {
public static void main(String[] arr) {
	int[] ar = {1,3,5,6,10};
		System.out.print(bianarySearch(3,ar));
	
}
public static int bianarySearch(int in,int[] all) {
	int low=0;
	int high=all.length-1;
	int mid=(all.length-1)/2-1;
	for(int i=0;i<all.length;i++) {
		if(in>all[mid]) {
			low=mid+1;
			mid=(high+low)/2;
		}else if(in<all[mid]){
			high=mid;
			mid=(high+low)/2;
		}else {
			return mid;
		}
	}
	return 0;
}
}
