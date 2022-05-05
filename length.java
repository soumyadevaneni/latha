package String;

public class length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s="worldfamous";
    String s1="testengineer";
   // int i=s.trim().length();
    //System.out.println("string lenght is "+i);
   System.out.println("String lenght is"+s.trim().length());
   System.out.println(s.trim().toUpperCase());
   System.out.println(s.trim().toLowerCase());
   System.out.println(s.charAt(3));
  // System.out.println(s.charAt(23));
   System.out.println(s.replace("Test", "TEST"));
   System.out.println(s.replace("Testing World","SOUMYA"));
   System.out.println(s.length() -s.replace("a","" ).length());
  // System.out.println(s +""+ s1);
   System.out.println(s.concat(" ").concat(s1));
   System.out.println(s.substring(3));
   if(s1.contains("test")) {
	   System.out.println("found");
   }
   else {
	   System.out.println("Not found");
   }
}}
   