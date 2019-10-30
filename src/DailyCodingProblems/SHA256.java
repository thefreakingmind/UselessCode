package DailyCodingProblems;

import java.security.MessageDigest;
import java.util.Scanner;
import java.io.PrintWriter;

public class SHA256 {
    public void solve(int testNumber, Scanner in, PrintWriter out) throws Exception {
        MessageDigest m = MessageDigest.getInstance("SHA-256");
        m.reset();
        m.update(in.nextLine().getBytes());
        for(byte i: m.digest()){
            out.print(String.format("%02x", i));
        }
    }
}
