import java.io.*;
import java.util.Scanner;
class peer_
{

    public static void main(String[] args)throws FileNotFoundException
    {
	BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
	String desig[]=new String[100];
	String name[]=new String[100];
	String subject[]=new String[100];
	String choice[]=new String[100];
	String weekday[]=new String[100];
	String usrname;
	System.out.println("Please Enter your name");
	usrname=br.readLine();
	int i=0;	
        Scanner scanner = new Scanner(new File("File.csv"));
        scanner.useDelimiter(",");
	scanner.nextLine();
	while(scanner.hasNext())
	{
            desig[i]=scanner.next();
            name[i]=scanner.next();
            subject[i]=scanner.next();
            choice[i]=scanner.next();
            weekday[i++]=scanner.next();
        }
	for(int j=0;j<i;j++)
	{
	if(usrname.equalsIgnoreCase(desig[j]))
		break;
	}
	if(i==j)
		System.out.println("Sorry..... No Information Found");
	else
	{
		for(int k=0;k<i;k++)
		{
		if(k!=j)
		{
			if((subject[k]).equalsIgnoreCase(subject[j]) && (choice[k]).equalsIgnoreCase("t") && (weekday[k]).equalsIgnoreCase(weekday[j]))
			{
			break;
			}
		}
		}
		if(k!=j)
		{
		System.out.println("Your Peer Found"+name[k]+" "+desig[k]);
		}
		else
			System.out.println("No Peer Found");
	}
	
        scanner.close();
    }

}

