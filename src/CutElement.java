import java.util.Locale;

public class CutElement {
    public static String getRandomString(int length_elem){
        String znakElem = "ABCDEFGHIJKLMNOPRSTVWXYZ";
        znakElem += znakElem.toLowerCase(Locale.ROOT);
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i<length_elem; i++){
            stringBuffer.append(znakElem.charAt(getRandomInt(0, znakElem.length()-1)));
        }
        return  stringBuffer.toString();
    }
    private static int getRandomInt(int from, int to){
        return (int)(Math.random()*(to-from))+from;
    }


    public String getMain() {
        return super.toString();
    }
    public String getNoMain() {
        return super.toString();
    }
}
