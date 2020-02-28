import java.util.Scanner;
public class miles
{
	public static void main(String[]args){
		Scannerscanner = new Scanner(System.in);
		float timeseconds;
		float mph,kph ,mps;
		System.out.println("Input distance in metres:");
		float distance = scanner.nextFloat();

		System.out.println("Input hour:");
		float hr = scanner.nextFloat();

		System.out.println("Input minutes:");
		float min = scanner.nextFloat();

		System.out.println("Input seconds:");
		float sec = scanner.nextFloat();

		timeSeconds = (hr*3600)+(min*60)+sec;
		mps = distance/timeSeconds;
		kph = (distance/1000.0)/(timeSeconds/3600.0);
		mph = (distance/1600.0)/(timeSeconds/3600.0);

		System.out.println("Your speed in metres per second" + mps);
		System.out.println("Your speed in kilometer per hour" + kph);
		System.out.println("Your speed in miles per hour" + mph);


		scanner.close();


	}
}