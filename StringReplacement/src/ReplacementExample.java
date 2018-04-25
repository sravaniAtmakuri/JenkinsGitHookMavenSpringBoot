
public class ReplacementExample {

	public static void main(String[] args) {
		String s="fhyfkabdgayabcabcfdabc";
		String req="abc";
		String res="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' && s.substring(i, i+3).equals(req)) {
				res=res+"***";
			    i=i+2;
				
			}else {
				res=res+s.charAt(i);
			}
	
		}
			System.out.println(res);
		
	}

}
