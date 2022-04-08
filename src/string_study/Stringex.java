package string_study;

public class Stringex {

	public static void main(String[] args)
	{
String A1= "Akash";
String A2 ="bhosale";
String A3="Akash";


String S1= new String (" pimpri chinchwad");
String S2 =new String ("PIMPRICHINCHWAD");
String S3= new String(" morgoan");
String S5= new String("morgoan");
String S4= new String("Akash");

System.out.println(A1==A3);
System.out.println(A2.equals(A3));
System.out.println(A3.equals(S4));
System.out.println(A3==S4);
System.out.println(A2.toUpperCase());
System.out.println(S2.toLowerCase());
System.out.println(A1.equalsIgnoreCase(S4));
System.out.println(A1.equalsIgnoreCase(A3));
System.out.println(S3.equalsIgnoreCase(S5));//duplicate values are not allowed in non constant pool  area
System.out.println(S2.contains("PIM"));
System.out.println(A3.isEmpty());
System.out.println(A3.charAt(3));
System.out.println(S4.endsWith("h"));
System.out.println(S4.startsWith("A"));
System.out.println(S2.substring(8));
System.out.println(A1.concat(A2));
System.out.println(S5.indexOf('m'));
System.out.println(A3.lastIndexOf('s'));
System.out.println(S4.replace("Akash", "software tester"));
System.out.println(S2.split(", ")); 
	}
}