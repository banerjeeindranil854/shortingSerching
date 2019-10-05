package project;

public class ReversingUsingRecusion {
	public static void main(String[] args) {
		String all = "all for one one for all";
		char[] all1=all.toCharArray();
		char[] all2=all.toCharArray();
		reverseString(all1,all1.length,all2);
		System.out.println(all1);
	}

	public static void reverseString(char[] all1,int n,char[] all2) {
		if(n==0) {
			return;
		}else {
		all1[all1.length-n]=all2[n-1];
		reverseString(all1,n-1,all2);
		}
	}
}
