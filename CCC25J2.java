import java.util.*;
import java.io.*;
public class Main {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static StringTokenizer st;
   public static void main(String[] args) throws IOException {
	   int d = readInt();
	   int e = readInt();
	   for (int i = 0; i < e; i++) {
		   char x = readChar();
		   int n = readInt();
		   if (x=='+') d+=n;
		   else d-=n;
	   }
	   System.out.println(d);
   } static String next() throws IOException {
       while (st == null || ! st.hasMoreTokens())
           st = new StringTokenizer(br.readLine().trim());
       return st.nextToken();
   }
   static long readLong() throws IOException {
       return Long.parseLong(next());
   }
   static int readInt() throws IOException {
       return Integer.parseInt(next());
   }
   static double readDouble() throws IOException {
       return Double.parseDouble(next());
   }
   static char readChar() throws IOException {
       return next().charAt(0);
   } 
   static String readLine() throws IOException {
       return br.readLine().trim();
   }
}
