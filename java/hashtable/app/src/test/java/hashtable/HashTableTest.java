package hashtable;

import junit.framework.TestCase;
import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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


  @Test public void testHashMapLeftJoin(){
    HashMap<String,String> hashmap1 = new HashMap<>();
    HashMap<String,String> hashmap2 = new HashMap<>();

    hashmap1.put("fond","enamored");
    hashmap1.put("wrath","anger");
    hashmap1.put("diligent","employed");


    hashmap2.put("fond","averse");
    hashmap2.put("wrath","delight");
    hashmap2.put("diligent","idle");


    // trying the happy path

    assertEquals("[diligent: employed , idle\n" + ", wrath: anger , delight\n" + ", fond: enamored , averse\n" + "]", HashTable.leftJoin(hashmap1,hashmap2).toString());




    hashmap1.put("outfit","garb");
    hashmap1.put("guide","usher");

    hashmap2.put("guide","follow");
    hashmap2.put("flow","jam");



    hashmap1.put("outfit","garb");
    hashmap1.put("guide","usher");

    hashmap2.put("guide","follow");
    hashmap2.put("flow","jam");


    // some data in the first is not in the second and the opposite

    assertEquals("[diligent: employed , idle\n" +
      ", outfit: garb , Null\n" +
      ", wrath: anger , delight\n" +
      ", guide: usher , follow\n" +
      ", fond: enamored , averse\n" +
      "]", HashTable.leftJoin(hashmap1,hashmap2).toString());
  }


  }
