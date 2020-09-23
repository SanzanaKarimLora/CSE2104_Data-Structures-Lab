
package assignment12;

public class PackedWord {
    
    public static byte pack(byte[] vals) {
         byte result = 0;
         for (byte bit : vals)
            result = (byte)((result << 1) | (bit & 1));
         return result;
    }
    
    public static byte[] unpack(byte val) {
          byte[] result = new byte[8];
          for(int i = 0; i < 8; i++) {
              result[i] = (byte) ((val >> (7 - i)) & 1);
          }
          return result;
    }
 
    public static void main(String[] args) {
          byte[] vals = { 1, 0 , 1, 0, 1, 0, 1, 1 };
 
          byte value = pack(vals);
    }
}
