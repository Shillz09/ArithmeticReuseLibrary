package StringUtils;

public class Conversions {

    public static String binToInt(String binNum){
        return Integer.toString(Integer.parseInt(binNum, 2));
    }

    public static String octToInt(String octNum){
        return Integer.toString(Integer.parseInt(octNum, 8));
    }

    public static String hexToInt(String hexNum){
        return Integer.toString(Integer.parseInt(hexNum, 16));
    }

    public static String intToBin(String intNum){
        return Integer.toBinaryString(Integer.parseInt(intNum));
    }

    public static String octToBin(String octNum){
        return Integer.toBinaryString(Integer.parseInt(octToInt(octNum)));
    }

    public static String hexToBin(String hexNum){
        return Integer.toBinaryString(Integer.parseInt(hexToInt(hexNum)));
    }

    public static String intToOct(String intNum){
        return Integer.toOctalString(Integer.parseInt(intNum));
    }

    public static String binToOct(String binNum){
        return Integer.toOctalString(Integer.parseInt(binToInt(binNum)));
    }

    public static String hexToOct(String hexNum){
        return Integer.toOctalString(Integer.parseInt(hexToInt(hexNum)));
    }

    public static String intToHex(String intNum){
        return Integer.toHexString(Integer.parseInt(intNum)).toUpperCase();
    }

    public static String binToHex(String binNum){
        return Integer.toHexString(Integer.parseInt(binToInt(binNum))).toUpperCase();
    }

    public static String octToHex(String octNum){
        return Integer.toHexString(Integer.parseInt(octToInt(octNum))).toUpperCase();
    }

}
