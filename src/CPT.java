import java.io.*;

public class CPT {
    public CPT(String cpt_path) {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(cpt_path));
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }


    }
    public static void main(String args[]) {
        CPT c = new CPT("sample/seis2.cpt");
    }
}

