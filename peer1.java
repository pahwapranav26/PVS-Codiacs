import java.io.*;
class peer
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
String a,name,ch,subject,weekday;
char t_s;
int c;
PrintWriter pw = new PrintWriter(new File("File.csv"));
StringBuilder sb = new StringBuilder();
sb.append("Teacher/Student");
sb.append(',');
sb.append("Name");
sb.append(',');
sb.append("Subject");
sb.append(',');
sb.append("Teach/Study");
sb.append(',');
sb.append("Weekday");
sb.append('\n');
while(true)
{
System.out.print("Are you a Teacher or Student!!!!  ");
System.out.println("Press T for Teacher S for Student");
t_s = (char) System.in.read();
br.readLine();
if(t_s=='T')
{
	System.out.println("Enter Your Name");
	name=br.readLine();
	System.out.println("Enter Your Subject");
	subject=br.readLine();
	System.out.println("Please Enter the Weekday you would Prefer!!!");
	weekday=br.readLine();
	sb.append("Teacher");
	sb.append(',');
        sb.append(name);
        sb.append(',');
        sb.append(subject);
        sb.append(',');
	sb.append("---");
	sb.append(',');
	sb.append(weekday);
	sb.append('\n');
        System.out.println("done!");
}
else if(t_s=='S')
{
	System.out.println("Enter Your Name");
	name=br.readLine();
	System.out.println("Enter Your Subject");
	subject=br.readLine();
	System.out.println("Please Enter the Weekday you would Prefer!!!");
	weekday=br.readLine();
	System.out.println("T.Teach___ H.Help in studies");
	ch=br.readLine();
	sb.append("Student");
	sb.append(',');
        sb.append(name);
        sb.append(',');
        sb.append(subject);
        sb.append(',');
	sb.append(ch);
	sb.append(',');
	sb.append(weekday);
	sb.append('\n');
        System.out.println("done!");
}
else
	System.out.println("Invalid Choice");
System.out.println("To exit out press 0.... 1 to continue!!!!!!!!");
c=Integer.parseInt(br.readLine());
if (c==0)
break;
}
pw.write(sb.toString());
pw.close();
}
}
