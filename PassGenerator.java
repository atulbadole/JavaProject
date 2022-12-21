package Project;

import java.util.Scanner;

public class PassGenerator {
	public static char randomCharacter() {
		int rand= (int) (Math.random()*62);
		//Break up rand into intervals to represent numbers , uppaercase and lowercase letters
		if(rand<=9) {
			//number 0-9 =>48-57 in ascii
			int ascii=rand + 48;
			return (char)(ascii);
			
			
		}
		else if(rand<=35) {
			//uppercase letter is between 10-35 =>65-90
			int ascii=rand+55;  //65-10
			return (char)(ascii);
			
		}
		else {
			//lowercase letter rand is between 36-41 =>97-122
			int ascii=rand+61;  //97-36=61
			return (char)(ascii);
			
		}
//		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("How many random password do you want generated");
		int total=sc.nextInt();
		System.out.println("How many chacters long do you want");
		int length=sc.nextInt();
		String[] randomPasswords = new String[total];
		for(int i=0;i<total;i++) {
			//Generate one  randeom password
			String randompassword="";
			for(int i1=0;i1<length;i1++) {
				randompassword+=randomCharacter();
			}
			randomPasswords[i]=randompassword;
		}
		print1(randomPasswords);
		
	}
	public static void print1(String [] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
