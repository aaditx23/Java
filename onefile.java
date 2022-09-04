package onefilelearn;
import java.util.ArrayList;
import java.util.Scanner;
public class onefile{
    public static void main(String[] args){
    	System.out.println("Enter Sentence:");
    	Scanner scan = new Scanner(System.in);
    	ArrayList sliced = new ArrayList();
    	String any_string = scan.nextLine(), word = "";
    	for (int i = 0; i < any_string.length() ; i++) {
    		char c = any_string.charAt(i);
    		if(c ==' ' ) {
    			sliced.add(word);
    			word = "";
    		}
    		else {
    			
    			word+=Character.toString(c);
    			if (i == any_string.length()-1) {
    				sliced.add(word);
    			}			
    		}  		
    	}
    	for(int i = 0; i < sliced.size(); i++) {
    		System.out.println(sliced.get(i));
    	}
    }
}