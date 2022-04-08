  package string_study;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class String_use {

	public static void main(String[] args) {
//     String p="velocity";
//     String q="corporate";
//     String r="training";
//     String s="centre";
//
//     
//     System.out.println(p.concat(q).concat(p).concat(r).concat(s));
//     String FinalString =p .concat(q). concat(r).concat(s);
//     System.out.println("combination of final string is-----> " +FinalString);
//     System.out.println(FinalString.indexOf('o'));
//     System.out.println(FinalString.lastIndexOf('o'));
//     System.out.println(FinalString.indexOf('r'));
//     System.out.println(FinalString.replace('v','c'));
//     
//     String k="NITIN";
//     System.out.println(k.replace('I', 'U'));
//     
     String F= "I LOVE MY FAMILY";
     String separator=" ";
     String []sps =F.split(separator);
for (int i=0;i<=sps.length-1;i++)
{
	System.out.println(sps[i]);
}
	}	
	 
}

