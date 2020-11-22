package E;
import java.io.*;
import java.util.Scanner;
public class Test {
	public static void main(String args[]) {
		
		Scanner A = new Scanner(System.in); 
		System.out.println("姓名：");
		String a = A.nextLine(); 
		System.out.println("学号：");
		int b = A.nextInt(); 
		System.out.println("年龄：");
		int c = A.nextInt();
		System.out.println("性别：");
		Scanner B = new Scanner(System.in);
		String d = B.nextLine();
		
		Student S1=new Student(a,b,c,d);
		
		File readFile = new File("C:\\Users\\86158\\Desktop\\B.txt");
        File writeFile = new File("A.txt");
        
		char[] poety=new char[7];
		String w;
		w=S1.information();
		try {
			Writer o= new FileWriter(writeFile,true);
			Reader i= new FileReader(readFile);
			int n=-1;
			int m=0;
			o.write(w);
			while((n=i.read(poety))!=-1) {
				m++;
				o.write(poety);
				if(m%2==0) {
					o.write("。\n");
					}
				else {
					o.write('，');
					}
				}
			o.flush();
			o.close();
			}
		catch(IOException e){
			System.out.println("出错:"+e);
			}
		}
	}
