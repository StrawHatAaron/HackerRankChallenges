//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Mapping{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int num_people = in.nextInt();
        Map<String, Integer> people_map = new HashMap<String, Integer>();
        for(int i = 0; i < num_people; i++){
            String name = in.next();
            int phone = in.nextInt();
            people_map.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(people_map.get(s)!=null)
                System.out.println(s+"="+people_map.get(s));
            else
                System.out.println("Not found");
        }
        in.close();
    }
}
