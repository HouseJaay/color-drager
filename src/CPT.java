import java.io.*;

public class CPT {
    private RGB backgroud;
    private RGB foreground;
    private RGB nan;
    private double[] value;
    private RGB[][] color;
    public CPT(String cpt_path) {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(cpt_path));
            String line = reader.readLine();
            while (line != null) {
                if (line.charAt(0) != '#') {
                    int something = 1;
                }
                line = reader.readLine();
            }
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String args[]) {
        CPT c = new CPT("sample/seis2.cpt");
    }
}

class RGB {
    private int r;
    private int g;
    private int b;
    public RGB(String rgb) {
        /**
         * form RGB from String
         * @param rgb 'r/g/b'
         */
        String[] s = rgb.split("/");
        r = Integer.valueOf(s[0]);
        g = Integer.valueOf(s[1]);
        b = Integer.valueOf(s[2]);
    }
    @Override
    public String toString() {
        return String.valueOf(r) + "/" + String.valueOf(g) + "/" + String.valueOf(b);
    }
    public static void main(String args[]) {
        RGB r = new RGB("155/0/13");
        System.out.println(r);
    }
}
