package array;

import com.tea.Apple;

public class ArraryDemo1 {
	synchronized int j;
	final String name="AA";
	
	public static void  main(String args[]) {
			float g[] = new float[]{23.5f, 44.5f };
			System.out.println(g instanceof float[]);
			
			/*Number num[] = new Integer[1];
			if(false){
				System.out.println("Hello abab");
			}
			else
			{
				System.out.println("Hello Pranita");
			}*/
			/*SourceDemo d = new SourceDemo();*/
			Apple a = new Apple();
			System.out.println(a.testIt());
			
			int num=3;
			switch (num) {
			default:
				System.out.println("Pranita is mad");
				break;
			case 100:
				System.out.println("Nikunj is intelligent");
				break;
			case 3:
				System.out.println("Nikita is very very rude");
				break;
			
			}
		
	}

}
