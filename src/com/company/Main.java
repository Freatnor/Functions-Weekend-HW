package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public int sumDouble(int a, int b) {
        if(a == b)
            return a * 4;
        return a + b;
    }

    public int close10(int a, int b) {
        int aAbs = Math.abs(10 - a);
        int bAbs = Math.abs(10 - b);
        if(aAbs == bAbs)
            return 0;
        else if(aAbs > bAbs)
            return b;
        else
            return a;
    }

    public String frontBack(String str) {
        char[] chars = str.toCharArray();
        if(chars.length <= 0)
            return str;
        char temp = chars[0];
        chars[0] = chars[chars.length - 1];
        chars[chars.length - 1] = temp;
        return new String(chars);

    }

    public String notString(String str) {
        if(str.matches("^not .*"))
            return str;
        return "not " + str;
    }
}
