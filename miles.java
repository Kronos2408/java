import java.util.Scanner;
public class miles
{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		double timeseconds;
		double mph,kph ,mps;
		System.out.println("Input distance in metres:");
		double distance = scanner.nextDouble();

		System.out.println("Input hour:");
		double hr = scanner.nextDouble();

		System.out.println("Input minutes:");
		double min = scanner.nextDouble();

		System.out.println("Input seconds:");
		double sec = scanner.nextDouble();

		timeseconds = (hr*3600)+(min*60)+sec;
		mps = distance/timeseconds;
		kph = (distance/1000.0)/(timeseconds/3600.0);
		mph = (distance/1600.0)/(timeseconds/3600.0);

		System.out.println("Your speed in metres per second" + mps);
		System.out.println("Your speed in kilometer per hour" + kph);
		System.out.println("Your speed in miles per hour" + mph);


		scanner.close();


	}
}
