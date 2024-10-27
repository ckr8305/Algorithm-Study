package BOJ1027;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BOJ7785 {
	 public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        Map<String,String> employee = new HashMap<>();
	        String state;
	        String name;
	        for(int i=0; i<n; i++){
	            name = sc.next();
	            state = sc.next();
	            employee.put(name,state);
	        }
	        List<String> nameList = new ArrayList(employee.keySet());
	        Collections.sort(nameList,Collections.reverseOrder());
	        for(String i:nameList){
	            state = employee.get(i);
	            if(state.equals("enter")){
	                System.out.println(i);
	            }
	        }
	        sc.close();
	    }
}
