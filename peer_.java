import java.io.*;
import java.util.Scanner;
class peer_
{

    public static void main(String[] args)throws FileNotFoundException, IOException
    {
	BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
	String data[]=new String[100];
	String desig[]=new String[100];
	String name[]=new String[100];
	String subject[]=new String[100];
	String choice[]=new String[100];
	String weekday[]=new String[100];
	String usrname;
	System.out.println("Please Enter your name");
	usrname=br.readLine();
	int i=0,j=0,k=0;	
        Scanner scanner = new Scanner(new File("File.csv"));
	scanner.nextLine();
	while(scanner.hasNext())
	{
            data[i++]=scanner.nextLine();
        }
	for(int l=0;l<i;l++)
	{
	Scanner s = new Scanner(data[l]);
	s.useDelimiter(",");
	desig[l]=s.next();
	name[l]=s.next();
	subject[l]=s.next();
	choice[l]=s.next();
	weekday[l]=s.next();
	}

	for(j=0;j<i;j++)
	{
	if(usrname.equalsIgnoreCase(name[j]))
	{
		break;
	}
	}
	if(i==j)
	{
		System.out.println("Sorry..... No Information Found");
	}
	else
	{
		for(k=0;k<i;k++)
		{
		if(k!=j)
		{
			if((subject[k]).equalsIgnoreCase(subject[j]) && (choice[k]).equalsIgnoreCase("t") && (weekday[k]).equalsIgnoreCase(weekday[j]))
			{
			break;
			}
		}
		}
		if(k!=i)
		{
		System.out.println("Your Peer Found: "+name[k]+" "+desig[k]);
		}
		else
			System.out.println("No Peer Found");
	}
        scanner.close();
    }

}
