package boot;

import java.util.ArrayList;
import java.util.Scanner;

import workers.CommonWorker;
import workers.Desingner;
import workers.Manager;
import workers.Programmer;

public class Run {

	public static Scanner reader;
	public static void main(String[] args) {
		
		ArrayList<CommonWorker> workers= new ArrayList<CommonWorker>();
		System.out.println("how many workers?");
		reader= new Scanner(System.in);
		int numOfWorkers= reader.nextInt();
		
		for(int i=0; i<numOfWorkers; i++)
		{
			System.out.println("Please enter 1 for Programmer,"
					+ " 2 for Designer, 3 for Manager");
			int choice= reader.nextInt();
			switch (choice) {
			case 1:
				workers.add(new Programmer());
				break;
			case 2:
				workers.add(new Desingner());
				break;
			case 3:
				workers.add(new Manager());
				break;

			default:
				break;
			}
		}
		
		for(CommonWorker w : workers)
		{
			w.work();
		}

	}

}
