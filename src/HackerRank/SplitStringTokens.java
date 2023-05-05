package HackerRank;

import java.util.*;

public class SplitStringTokens {

	public static void main(String[] args) {
		
		//He is a very very good boy, isn't he?
		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        
        if(s.isEmpty()){
            System.out.println(0);
        }else{
            String[] splitString = s.split("[ !,?._'@]+");
            
            System.out.println(splitString.length);
            for(String data : splitString){
                System.out.println(data);
            }
        }
        scan.close();
	}

}
