package StringUtils;

import java.text.DecimalFormat;

import static java.lang.Integer.parseInt;

public class MathFunctions {

    static DecimalFormat df = new DecimalFormat("#.#####");//format of floating point outputs (float and double)

    public static String addInts(String a, String b) {
        return Integer.toString(parseInt(a) + parseInt(b));
    }

    public static String addShorts(String a, String b) {
        return Short.toString((short) (Short.parseShort(a) + Short.parseShort(b)));
    }

    public static String addLongs(String a, String b) {
        return Long.toString(Long.parseLong(a) + Long.parseLong(b));
    }

   public static String addBinary(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a,2) + Integer.parseInt(b,2));
    }

    public static String addOctal(String a, String b) {
        return Integer.toOctalString(Integer.parseInt(a,8) + Integer.parseInt(b,8));
    }

    public static String addHex(String a, String b) {
        return Integer.toHexString(Integer.parseInt(a,16) + Integer.parseInt(b,16)).toUpperCase();
    }

    public static String addFloats(String a, String b) {
        return df.format(Float.parseFloat(a) + Float.parseFloat(b));
    }

    public static String addDoubles(String a, String b) {
        return df.format(Double.parseDouble(a) + Double.parseDouble(b));
    }

    public static String subInts(String a, String b) {//(a-b)
        return Integer.toString(parseInt(a) - parseInt(b));
    }

    public static String subShorts(String a, String b) {//(a-b)
        return Short.toString((short) (Short.parseShort(a) - Short.parseShort(b)));
    }

    public static String subLongs(String a, String b) {//(a-b)
        return Long.toString(Long.parseLong(a) - Long.parseLong(b));
    }

    public static String subBinary(String a, String b) {//(a-b)
        return Integer.toBinaryString(Integer.parseInt(a,2) - Integer.parseInt(b,2));
    }

    public static String subOctal(String a, String b) {//(a-b)
        return Integer.toOctalString(Integer.parseInt(a,8) - Integer.parseInt(b,8));
    }

    public static String subHex(String a, String b) {//(a-b)
        return Integer.toHexString(Integer.parseInt(a,16) - Integer.parseInt(b,16)).toUpperCase();
    }

    public static String subFloats(String a, String b) {//(a-b)
        return df.format(Float.parseFloat(a) - Float.parseFloat(b));
    }

    public static String subDoubles(String a, String b) {//(a-b)
        return df.format(Double.parseDouble(a) - Double.parseDouble(b));
    }

    public static String mulInts(String a, String b) {
        return Integer.toString(parseInt(a) * parseInt(b));
    }

    public static String mulShorts(String a, String b) {
        return Short.toString((short) (Short.parseShort(a) * Short.parseShort(b)));
    }

    public static String mulLongs(String a, String b) {
        return Long.toString(Long.parseLong(a) * Long.parseLong(b));
    }

    public static String mulBinary(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a,2) * Integer.parseInt(b,2));
    }

    public static String mulOctal(String a, String b) {
        return Integer.toOctalString(Integer.parseInt(a,8) * Integer.parseInt(b,8));
    }

    public static String mulHex(String a, String b) {
        return Integer.toHexString(Integer.parseInt(a,16) * Integer.parseInt(b,16)).toUpperCase();
    }

    public static String mulFloats(String a, String b) {
        return df.format(Float.parseFloat(a) * Float.parseFloat(b));
    }

    public static String mulDoubles(String a, String b) {
        return df.format(Double.parseDouble(a) * Double.parseDouble(b));
    }

    public static String divInts(String a, String b) {//(a/b)
        return Integer.toString(parseInt(a) / parseInt(b));
    }

    public static String divShorts(String a, String b) {//(a/b)
        return Short.toString((short) (Short.parseShort(a) / Short.parseShort(b)));
    }

    public static String divLongs(String a, String b) {//(a/b)
        return Long.toString(Long.parseLong(a) / Long.parseLong(b));
    }

    public static String divBinary(String a, String b) {//(a/b)
        return Integer.toBinaryString(Integer.parseInt(a,2) / Integer.parseInt(b,2));
    }

    public static String divOctal(String a, String b) {//(a/b)
        return Integer.toOctalString(Integer.parseInt(a,8) / Integer.parseInt(b,8));
    }

    public static String divHex(String a, String b) {//(a/b)
        return Integer.toHexString(Integer.parseInt(a,16) / Integer.parseInt(b,16)).toUpperCase();
    }

    public static String divFloats(String a, String b) {//(a/b)
        return df.format(Float.parseFloat(a) / Float.parseFloat(b));
    }

    public static String divDoubles(String a, String b) {//(a/b)
        return df.format(Double.parseDouble(a) / Double.parseDouble(b));
    }
}
