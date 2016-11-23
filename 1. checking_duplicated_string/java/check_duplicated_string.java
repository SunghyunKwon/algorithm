import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class check_duplicated_string {
    public static boolean isUniqueChar(String str) {
        if (str.length() > 256) {
            return false;
        }

        boolean[] char_set = new boolean[256];
        
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val])
                return false;

            char_set[val] = true;
        }

        return true;
    }

    public static void main(String[] args) throws Exception {
        System.out.print("Enter something here : ");

        String str = null;

        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            str = bufferRead.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (str != null) {
            if (isUniqueChar(str)) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }
}
