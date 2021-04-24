import java.io.*;
import java.util.*;
import java.util.Arrays;  
public class CopyFile  
{  
public static void main(String args[])  
{  
try  
{  
File file=new File("C:\\Users\\Mohammad\\eclipse-workspace\\High Peak\\src\\filename.txt");
File file2=new File("C:\\Users\\Mohammad\\eclipse-workspace\\High Peak\\src\\output.txt");
PrintStream fw = new PrintStream(file2);//creates a new file instance  
FileReader fr=new FileReader(file);   //reads the file  
BufferedReader br=new BufferedReader(fr); 
BufferedReader sr=new BufferedReader(fr); //creates a buffering character input stream  
StringBuffer sb=new StringBuffer();    //constructs a string buffer with no characters  
Scanner sc=new Scanner(System.in);
String line;  
int a[]=new int[10];
int i=0,n=0,max=100000,b=0;
while((line=br.readLine())!=null)  
{  
	
	//System.out.println("1");
	 line = line.replaceAll("[^\\d]", " ");
	 line = line.trim();
	 line = line.replaceAll(" +", " ");
	 //System.out.println(line);
	 if(line!="") {
	 a[i]=Integer.parseInt(line);
	 i++;
	 }
	 
}
Arrays.sort(a);
System.out.println("Enter No of employees");
n=sc.nextInt();
for(i=0;i<a.length;i++) {
	//System.out.println(a[i]);
	if(i+n<10) {
	if(a[i+n-1]-a[i]<max) {
		//max=0;
		max=a[i+n-1]-a[i];
		b=i;
	}
	}
}


String str=Integer.toString(a[b]);
System.setOut(fw);
System.out.println("Number of employees: "+n);
System.out.println("Here the goodies that are selected for distribution are:");
for(i=b;i<b+n;i++) {
	//System.out.println(b);
	
	
	
	System.out.println(a[i]);
	String[] words=null; 
    String s;     
    int count=0;   //Intialize the word to zero
    while((s=br.readLine())!=null)   //Reading Content from the file
    {
       words=s.split(" ");  //Split the word using space
        for (String word : words) 
        {
               if (word.equals(str))   //Search for the given word
               {
                 System.out.println(s);   //If Present increase the count by one
               }
        }
    }
	/*
		String s;
		while((s=sr.readLine())!=null) {
			System.out.println("1");
			int intIndex = s.indexOf(str);
			System.out.println(s);
			if(intIndex != - 1) {
				System.out.println(s);
			}
		}
		*/
		
	
}
//System.out.println(max);

fr.close();
fw.close();
    //closes the ;stream and release the resources  
System.out.println("Contents of File: ");  
//System.out.println(sb.toString());   //returns a string that textually represents the object  
}  
catch(IOException e)  
{  
e.printStackTrace();  
}  
}  
}  


/*
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
  
// Class
class CopyFile {
  
    // Main driver method
    public static void main(String[] args)
    {
  
        // The file reading process may sometimes give
        // IOException
  
        // Try block to check for exceptions
        try {
  
            
            FileReader fr = new FileReader("C:\\Users\\Mohammad\\eclipse-workspace\\High Peak\\src\\filename.txt");
            FileWriter fw = new FileWriter("C:\\Users\\Mohammad\\eclipse-workspace\\High Peak\\src\\output.txt");
  
 
            String str = "";
  
            int i;
 
            while ((i = fr.read()) != -1) {
   
                str += (char)i;
            }
  
            // Print and display the string that
            // contains file data
            System.out.println(str);
  
            // Writing above string data to
            // FileWriter object
            fw.write(str);
  
            // Closing the file using close() method
            // of Reader class which closes the stream &
            // release resources that were busy in stream
            fr.close();
            fw.close();
  
            // Display message
            System.out.println(
                "File reading and writing both done");
        }
  
        // Catch block to handle the exception
        catch (IOException e) {
  
            // If there is no file in specified path or
            // any other error occured during runtime
            // then it will print IOException
  
            // Display message
            System.out.println(
                "There are some IOException");
        }
    }
}
*/