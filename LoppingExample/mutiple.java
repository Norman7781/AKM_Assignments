package LoppingExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mutiple {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any number to mutiply: ");
        int str = Integer.parseInt(br.readLine());
        mul(str);

    }
    public static void mul(int i){
        for(int t = 1; t<11 ; ++t){
            System.out.println(i+"*"+t+"="+i*t);
        }
    }
}
