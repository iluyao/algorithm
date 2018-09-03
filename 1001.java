import java.util.Scanner;
import java.util.Vector;

/**
 * 使用 Vector<Long> 表示一个大整数，每个 Long 存 8 位
 * 比如：
 *     12345678901234
 * 可以表示为：
 *     789012345 123456
 */

public class Main {
    public static final long CELL_MOD = 100000000;

    // get the position of dot from right
    public static int getOffset(String str) {
        int dotPos = str.indexOf('.');

        return str.length() - (dotPos < 0 ? str.length() : dotPos + 1);
    }

    // get the value of the string ignores dot
    public static long getValue(String str) {
        long ret = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '.') {
                ret = ret * 10 + str.charAt(i) - '0';
            }
        }

        return ret;
    }

    // calculate a * b
    public static Vector<Long> multiply(Vector<Long> a, long b) {
        Vector<Long> result = new Vector<Long>();
        long prev = 0;

        for (long cell: a) {
            long value = cell * b + prev;

            result.add(value % CELL_MOD);
            prev = cell * b / CELL_MOD;
        }

        if (prev != 0) result.add(prev);

        for (int i = 0; i < result.size(); i++) {
            long cell = result.get(i);

            if (cell < CELL_MOD) continue;

            result.set(i, cell % CELL_MOD);
            if (i == result.size() - 1) {
                result.add(cell / CELL_MOD);
            } else {
                result.set(i + 1, cell + cell / CELL_MOD);
            }
        }

        return result;
    }

    // parse the num represented by Vector<Long> to String
    public static String getString(Vector<Long> num) {
        StringBuffer sb = new StringBuffer();

        // the last element should not be formated
        sb.append(num.lastElement());
        for (int i = num.size() - 2; i >= 0; i--) {
            sb.append(String.format("%08d", num.get(i)));
        }

        return sb.toString();
    }

    public static void main (String[] args) {
        Scanner cin = new Scanner(System.in);

        while (cin.hasNext()) {
            String baseStr = cin.next();
            int exp = cin.nextInt();

            long base = getValue(baseStr);
            // the offset should times exp
            int offset = getOffset(baseStr) * exp;

            // calcalate the power(base, exp)
            Vector<Long> result = new Vector<Long>();
            result.add(base);

            while (--exp > 0) {
                result = multiply(result, base);
            }

            String output = getString(result);
            // fill '0' in front if the offset greater than the length of the output
            StringBuffer sb = new StringBuffer();

            for (int i = output.length(); i < offset; i++) {
                sb.append('0');
            }
            output = sb.toString() + output;

            if (offset > 0) {
                int pos = output.length() - offset;

                output = output.substring(0, pos) + "." + output.substring(pos);
                // just trim the '0' and '.' in tail
                output = output.replaceAll("\\.?0+$", "");
            }

            System.out.println(output);
        }

        cin.close();
    }
}
