package hashtable;

import junit.framework.TestCase;
import static org.junit.Assert.*;

import org.junit.Test;

public class HashTableTest extends TestCase {
@Test
  public void testAdd() {
  HashTable hashTable = new HashTable();
  hashTable.add("mansoor", 4);
  hashTable.add("mansoor", 5);
  hashTable.add("hi", 8);
  hashTable.add("student", 8);

  assertTrue("Should return 4",hashTable.size() == 4);
}


  @Test

  public void testGet() {
    HashTable hashTable = new HashTable();
    hashTable.add("mansoor", 4);
    hashTable.add("mansoor", 5);
    hashTable.add("ltuc", "ASAC");

    assertTrue("Should return 4", hashTable.get("mansoor").equals(4));
    assertTrue("Should return `ASAC`", hashTable.get("ltuc").equals("ASAC"));
  }
  @Test

  public void getNullForUnmatchedKey()  {
    HashTable hashTable = new HashTable();
    hashTable.add("mansoor", 4);
    hashTable.add("mansoor", 5);
    hashTable.add("ltuc", "ASAC");

    assertNull("Should return null", hashTable.get("ahmad"));
    assertTrue("Should return `ASAC`", hashTable.get("ltuc").equals("ASAC"));

  }
  @Test

  public void testSameHash() {
    HashTable hashTable = new HashTable();
    int expected = hashTable.hash("ASAC");
    int actual = hashTable.hash("ASAC");

    assertEquals("Should Equal 10", expected, actual);

  }
  @Test
  public void testNotSameHash(){
    HashTable hashTable = new HashTable();
    int expected = hashTable.hash("ASAC");
    int actual = hashTable.hash("ASAAC");

    assertNotEquals("Should Not Equal", expected, actual);
  }

  @Test
  public void testContains(){
    HashTable hashTable = new HashTable();
    hashTable.add("ASAC","asac");
    hashTable.add("Student","yes");

    assertFalse("Should return false", hashTable.contains("hello"));
    assertTrue("Should return true", hashTable.contains("ASAC"));

  }
}
