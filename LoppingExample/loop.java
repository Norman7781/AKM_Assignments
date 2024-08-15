package LoppingExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class loop {
    public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("pls add any number to factorize :");
         int str = Integer.parseInt(br.readLine());
        System.out.println(fact(str));
    }

    public static int fact(int i){
        if (i == 1){
            return 1;
        }
        else {
            return i * (fact(i -1 ));
        }
    }
}
