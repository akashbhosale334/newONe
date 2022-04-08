package string_study;

public class String_example {

	public static void main(String[] args)
	{
//String s1="Velocity";
//String s2="Pune";
//String s3="Pune";
////
String m1= new String("katraj");
String m2= new String("Katraj");
String m3= new String("KATRAJ");
//
//
//System.out.println(s2==s3);//bcoz of == is memory location place with same memoryis true
//System.out.println(s2.equals(s3));
//System.out.println(s1==s2);
//System.out.println(s1.endsWith(s2));
System.out.println(m2==m1);//separate memory allocation
System.out.println(m2.equals(m1));//bcoz of single = (content)
//System.out.println(m1.equals(m2));
//System.out.println(m2==m3);
//System.out.println("length of s2 is"+s2.length());
//System.out.println("length of s1 is"+s1.length());
//System.out.println("converting uppercase " +s2.toUpperCase());
//System.out.println("converting into lowercase "+m3.toLowerCase());
//System.out.println(s1==s2);

//String ab=" ";
//String cd=" ";
String ef="velocity";
String fe="Velocity";
//System.out.println(ab.isEmpty());
//System.out.println(cd.isEmpty());

//System.out.println(ab.isBlank());
//System.out.println(ef.contains("velo"));
//System.out.println(ef.contains("i"));

//System.out.println(fe.equals(ef));
//System.out.println(ef.equalsIgnoreCase(fe));
////System.out.println(s2.isBlank());
//System.out.println(ef.charAt(3));
//char output=fe.charAt(5);

@SuppressWarnings("unused")
String mn=new String ("Peuneat");

System.out.println(mn.startsWith("e"));
System.out.println(mn.endsWith("P"));

System.out.println(mn.substring(0));
System.out.println(mn.substring(2));
System.out.println(mn.toString());
System.out.println(mn.substring(0,3));
System.out.println(mn.charAt(3));
System.out.println(mn.concat(ef));
System.out.println(mn.indexOf("e"));
System.out.println(mn.lastIndexOf("t"));
System.out.println(mn.replace("hail","pune" ));
//	System.out.println(mn.length());
//System.out.println(ef.substring(5));
//String ab=" ";
//System.out.println("e");
//System.out.println(ab.indexOf(ab));
}}
