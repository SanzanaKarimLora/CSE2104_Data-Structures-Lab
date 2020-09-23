
package assignment11;

public class Hashing {
      public final static int ARRAY_SIZE = 30;
 
      HashEntry[] table;
 
      public Hashing() {
            table = new HashEntry[ARRAY_SIZE];
            for (int i = 0; i < ARRAY_SIZE; i++)
                  table[i] = null;
      }
 
      public int get(int key) {
            int hash = (key % ARRAY_SIZE);
            while (table[hash] != null && table[hash].getKey() != key)
                  hash = (hash + 1) % ARRAY_SIZE;
            if (table[hash] == null)
                  return -1;
            else
                  return table[hash].getValue();
      }
 
      public void put(int key, int value) {
            int hash = (key % ARRAY_SIZE);
            while (table[hash] != null && table[hash].getKey() != key)
                  hash = (hash + 1) % ARRAY_SIZE;
            table[hash] = new HashEntry(key, value);
      }
}
