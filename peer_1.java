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
	int arr[]=new int[100];
	String usrname;
	System.out.println("Please Enter your name");
	usrname=br.readLine();
	int i=0,j=0,k=0,c=1,p=0,ch,n;	
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
		if ((desig[j]).equalsIgnoreCase("Teacher"))
		{
			System.out.println("Incorrect Username");
			c=0;
		}
		if(c!=0)
		{
		for(k=0;k<i;k++)
		{
		if(k!=j)
		{
			if((subject[k]).equalsIgnoreCase(subject[j]) && (choice[k]).equalsIgnoreCase("t") && (weekday[k]).equalsIgnoreCase(weekday[j]))
			{
			arr[p++]=k;
			}
		}
		}
		if(p!=0)
		{
		System.out.println("Your Peer(s) Found: "+"Designation "+"Name");
		for(n=0;n<p;n++)
		{
			System.out.println((n+1)+"                     "+desig[arr[n]]+" "+name[arr[n]]);
		}
		System.out.println("Type the corrosponding number to select the Peer");
		ch=Integer.parseInt(br.readLine());
		do
		{
		System.out.println("Please Try Again");
		ch=Integer.parseInt(br.readLine());
		}while(ch>n || ch<0);
		{
		System.out.println("You Are Scheduled to Meet "+name[arr[ch-1]]+" on "+weekday[arr[ch-1]]);
		}
		}
		else
			System.out.println("No Peer Found");
		}
	}
        scanner.close();
    }

}

