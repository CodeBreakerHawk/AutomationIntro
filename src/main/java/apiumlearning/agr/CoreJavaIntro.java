package apiumlearning.agr;

import java.util.ArrayList;

public class CoreJavaIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int mYnum = 5;
				int yourNum = 9;
				int ourNum = mYnum + yourNum;
				System.out.println(ourNum);
				
				int[] arr1 = new int[5];
				ArrayList<Integer> al = new ArrayList<Integer>();
				al.add(1);
				al.add(12);
				al.add(12);
				al.add(13);
				al.add(41);
				al.add(15);
				al.add(156);
				
				System.out.println(al);
				String ls = "Abhishek Revankar";
				String[] sls = ls.split(" ");
				System.out.println(sls[0]);
				System.out.println(sls[1]);
				//System.out.println(sls[2]);

		

	}

}
