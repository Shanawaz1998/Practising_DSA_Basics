package DSA_KunalKushwaha;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.*;

public class Random {
    static int cnt = 1;
    public static void main(String[] args) {
        test();
    }
    static void test(){
        System.out.println("Test");
        cnt++;
        if(cnt>5) return;
        else test();

    }
}
