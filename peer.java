import java.io.*;
class peer
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
String a,name,ch,subject;
char t_s;
PrintWriter pw = new PrintWriter(new File("File.csv"));
StringBuilder sb = new StringBuilder();
sb.append("Teacher/Student");
sb.append(',');
sb.append("Name");
sb.append(',');
sb.append("Subject");
sb.append(',');
sb.append("Teach/Study");
sb.append('\n');
System.out.println("Are you a Teacher or Student");
System.out.println("T-- for teacher,,, S for student.");
t_s = (char) System.in.read();
System.out.println("Enter Your Name");
br.readLine();
name=br.readLine();
System.out.println("Enter Your Subject");
subject=br.readLine();
if(t_s=='T')
{
	
	sb.append("Teacher");
	sb.append(',');
        sb.append(name);
        sb.append(',');
        sb.append(subject);
        sb.append(',');
	sb.append("---");
	sb.append('\n');
        pw.write(sb.toString());
        pw.close();
        System.out.println("done!");
}
else if(t_s=='S')
{
	System.out.println("T.Teach___ H.Help in studies");
	ch=br.readLine();
	sb.append("Student");
	sb.append(',');
        sb.append(name);
        sb.append(',');
        sb.append(subject);
        sb.append(',');
	sb.append(ch);
	sb.append('\n');
        pw.write(sb.toString());
        pw.close();
        System.out.println("done!");
}
else
	System.out.println("Invalid Choice");
System.out.println("We will Get back to You");
}
}
