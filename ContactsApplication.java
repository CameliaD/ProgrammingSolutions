/* 
* https://www.hackerrank.com/challenges/ctci-contacts/problem 
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int find(ArrayList<String> contacts, String contact){
        int nr=0;
        for(String c:contacts) {
            if(c.startsWith(contact)) {
                nr++;
            }
        }
        return nr;
    }

    public static void main(String[] args) {
        Map<Character, ArrayList<String>> contacts = new HashMap<Character, ArrayList<String>>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            if(op.equals("add")) {
                if(!contacts.containsKey(contact.charAt(0))) {
                    contacts.put(contact.charAt(0), new ArrayList());
                }
                contacts.get(contact.charAt(0)).add(contact);
            }
            else if(op.equals("find")) {
                if(contacts.containsKey(contact.charAt(0))) {
                    System.out.println(find(contacts.get(contact.charAt(0)),contact));
                }
                else {
                    System.out.println(0);
                }
            }
        }
    }
}
