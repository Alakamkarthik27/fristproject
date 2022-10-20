package fristproject;

import java.util.Scanner;

public class AgeProgramme {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("please enter u r age");
		int a=obj.nextInt();
		{
			if(a>5&&a<=15) {
				System.out.println(" you are school student.you are not eligble for vote");
				System.out.println("thank you");
			}
			else if (a>15&&a<18) {
				System.out.println(" you are college student.but you are not eligible for vote ");
				System.out.println("thank you");
			}
			else if (a>18&&a<25) {
				System.out.println("you are a graduate.   welcome    "
						+ "                                      your eligble for vote          ");
				System.out.println("thank you");
			} else {
                 System.out.println("you are eligble for job");
			}
		}
	}

}
