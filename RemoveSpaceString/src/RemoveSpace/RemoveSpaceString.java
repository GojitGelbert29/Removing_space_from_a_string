package RemoveSpace;

public class RemoveSpaceString {

	public static void main(String[] args) {
		String str = " E    xc   e    ll   e   nt ";
		System.out.println("This is the result of the given string");
		
		String str1 = str.replaceAll("\\s", "");
		System.out.println(str1);
		}

}