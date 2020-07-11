package zh.codegym.task.task07.task0712;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        for(int i =0;i<10;i++){
            list.add(reader.readLine());
        }
        
        int max_length=0, min_length=0;
        int min = list.get(0).length();
        String min_str = list.get(0);
        int max = list.get(0).length();
        String max_str = list.get(0);

        for(int j=1;j<list.size();j++){
            int k =list.get(j).length();
            if(k>max){
                max = k;
                max_str= list.get(j);
                max_length = j;
            }

            if(k<min){
                min = k;
                min_str=list.get(j);
                min_length = j;
            }

        }
        if(max_length<min_length){
            System.out.println(max_str);
        }else {
            System.out.println(min_str);
        }
    }
}