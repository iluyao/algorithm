import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Main {
    static char[] map = new char[128];
    static {
        map['0'] = '0';
        map['1'] = '1';
        map['A'] = map['B'] = map['C'] = map['2'] = '2';
        map['D'] = map['E'] = map['F'] = map['3'] = '3';
        map['G'] = map['H'] = map['I'] = map['4'] = '4';
        map['J'] = map['K'] = map['L'] = map['5'] = '5';
        map['M'] = map['N'] = map['O'] = map['6'] = '6';
        map['P'] = map['R'] = map['S'] = map['7'] = '7';
        map['T'] = map['U'] = map['V'] = map['8'] = '8';
        map['W'] = map['X'] = map['Y'] = map['9'] = '9';
    };
    public static void main (String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        TreeMap <String, Integer> dict = new TreeMap <String, Integer>();
        while(n -- > 0) {
            
            String str = cin.next();
            StringBuffer a = new StringBuffer();

            for(int i = 0, l = str.length(); i < l; i ++) {
                char ch = str.charAt(i);
                if(ch != '-') {
                    a.append(map[ch]);
                    if(a.length() == 3) {
                        a.append('-');
                    }
                }
            }
            String  nStr = a.toString();
            int count = dict.containsKey(nStr) ? dict.get(nStr) :0;
            dict.put(nStr, count + 1);
        }
        boolean duplicates = false;
        for(Entry<String, Integer> entry: dict.entrySet()) {
            int count = entry.getValue();
            if(count > 1) {
                duplicates = true;
                System.out.println(entry.getKey() + " " +entry.getValue());
            }
        }
        if(duplicates == false) {
            System.out.print("No duplicates.");
        }
   
    }
}
