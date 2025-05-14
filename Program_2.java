/*2. Develop a Java program for adding elements [Apple, Banana, Orange] into HashSet, TreeSet and LinkedHashSet to perform the following operations directed as follows HashSet Demonstration :HashSet after adding elements: [Apple, Orange, Banana], Size of HashSet:
3, Is HashSet empty? false, Contains 'Apple'? true, Contains 'Grape'? False, After removing 'Banana':
[Apple, Orange] 
TreeSet Demonstration : TreeSet (automatically sorted): [Elephant, Lion, Tiger, Zebra]
LinkedHashSet Demonstration: LinkedHashSet (maintains insertion order): [Red, Green, Blue]
Set Operations Demonstration:Union of sets: [1, 2, 3, 4, 5, 6, 7, 8], Intersection of sets: [4, 5]
Difference of sets (set1 - set2): [1, 2, 3]
Iteration Demonstration : Using for-each loop,Using Iterator*/

package Collections;

import java.util.*;
public class MapInterfaceDemo {
public static void main(String[] args) {
// HashMap Demonstration
System.out.println("=== HashMap Demonstration ===");
Map<String, Integer> hashMap = new HashMap<>();
// 1. Basic Operations
// Adding elements
hashMap.put("Apple", 1);
hashMap.put("Banana", 2);
hashMap.put("Orange", 3);
System.out.println("Initial HashMap: " + hashMap);
// Updating value
hashMap.put("Apple", 5); // Updates existing value
System.out.println("After updating Apple's value: " + hashMap);
// putIfAbsent
hashMap.putIfAbsent("Apple", 10); // Won't update as key exists
hashMap.putIfAbsent("Grape", 4); // Will add new entry
System.out.println("After putIfAbsent operations: " + hashMap);
// 2. Accessing Elements
System.out.println("\nAccessing Elements:");
System.out.println("Value for Apple: " + hashMap.get("Apple"));
System.out.println("Value for missing key: " + hashMap.get("Mango"));
System.out.println("Value for missing key with default: " + hashMap.getOrDefault("Mango", 0));

// 3. Removing Elements
hashMap.remove("Banana");
System.out.println("After removing Banana: " + hashMap);
// Conditional remove
hashMap.remove("Apple", 5); // Removes only if value matches
System.out.println("After conditional remove: " + hashMap);
// 4. TreeMap Demonstration (Sorted Map)
System.out.println("\n=== TreeMap Demonstration ===");

TreeMap<String, Integer> scores = new TreeMap<>();
// 5 Adding elements (put operation)
scores.put("Alice", 95);
scores.put("Bob", 82);
scores.put("Charlie", 90);
scores.put("David", 78);
scores.put("Eva", 88);
// Display the TreeMap (naturally sorted by keys)
System.out.println("TreeMap contents: " + scores);
// 6 Accessing elements (get operation)
System.out.println("Charlie's score: " + scores.get("Charlie"));
// 7. removing elements
scores.remove("David");
System.out.println("After removing David: " + scores);
// 8 Navigation operations (TreeMap-specific)
// First (lowest) and last (highest) entries
System.out.println("First entry: " + scores.firstEntry());
System.out.println("Last entry: " + scores.lastEntry());
// 8 naturally ordered by keys
Map<String, Integer> treeMap = new TreeMap<>();
treeMap.put("Zebra", 1);
treeMap.put("Lion", 2);
treeMap.put("Elephant", 3);
System.out.println("TreeMap (naturally ordered by keys): " + treeMap);
// 9. eldest entry if size exceeds 3
System.out.println("\n=== LinkedHashMap Demonstration ===");
Map<String, Integer> linkedHashMap = new LinkedHashMap<>() {
@Override

protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
return size() > 3; // Remove eldest entry if size exceeds 3
}
};
linkedHashMap.put("A", 1);
linkedHashMap.put("B", 2);
linkedHashMap.put("C", 3);
System.out.println("Initial LinkedHashMap: " + linkedHashMap);
linkedHashMap.put("D", 4); // Will remove eldest entry
System.out.println("After adding D (notice removal of eldest): " + linkedHashMap);
// 10. Iterating Over Map
System.out.println("\n=== Map Iteration ===");
// Iterating over entries
System.out.println("Iterating over entries:");
for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
System.out.println(entry.getKey() + " -> " + entry.getValue());
}
// Iterating over keys
System.out.println("\nIterating over keys:");
for (String key : hashMap.keySet()) {
System.out.println("Key: " + key);
}
// Iterating over values
System.out.println("\nIterating over values:");
for (Integer value : hashMap.values()) {
System.out.println("Value: " + value);
}
// 11. Map Operations
System.out.println("\n=== Map Operations ===");
Map<String, Integer> map1 = new HashMap<>();
map1.put("A", 1);
map1.put("B", 2);
// Merging maps
Map<String, Integer> map2 = new HashMap<>();
map2.put("B", 3);
map2.put("C", 4);
// Merge with custom remapping function
map2.forEach((key, value) ->
map1.merge(key, value, (v1, v2) -> v1 + v2));
System.out.println("After merging maps: " + map1);

// 12. Compute Operations
System.out.println("\n=== Compute Operations ===");
map1.compute("A", (k, v) -> (v == null) ? 1 : v * 2);
System.out.println("After computing A: " + map1);
map1.computeIfPresent("B", (k, v) -> v * 3);
System.out.println("After computeIfPresent B: " + map1);
map1.computeIfAbsent("D", k -> 10);
System.out.println("After computeIfAbsent D: " + map1);
// 13. Bulk Operations
System.out.println("\n=== Bulk Operations ===");
Map<String, Integer> newMap = new HashMap<>();
newMap.putAll(map1);
System.out.println("After putAll: " + newMap);
// Clear the map
newMap.clear();
System.out.println("After clearing: " + newMap);
// 14. Checking Operations
System.out.println("\n=== Checking Operations ===");
System.out.println("Is map empty? " + newMap.isEmpty());
System.out.println("Map size: " + map1.size());
System.out.println("Contains key 'A'? " + map1.containsKey("A"));
System.out.println("Contains value 1? " + map1.containsValue(1));
}
}

//Exercises

//Hashmap
/*1. Write a Java program to traverse / iterate all the keys with the specified value in a HashMap
(1,”Apple”), (2,”Strawberry”), (3,”Pear”), (4,”Cucumber”), (5,”Grapes”)
[ hint : 6. Iterating Over Map in the worked out example]*/


import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;

public class P1 {
	public static void main(String[] args) {
		HashMap< Integer,String> hashMap = new HashMap<>();
		hashMap.put(1,"Apple");
		hashMap.put(2,"Strawberry");
		hashMap.put(3,"Pear");
		hashMap.put(4,"Cucumber");
		hashMap.put(5,"Grapes");
	
		System.out.println("Iterating over entries:");
		for (Entry<Integer, String> entry : hashMap.entrySet()) {
		System.out.println("Key: "+entry.getKey() + " -> Value: " + entry.getValue());
		}
		
  }
}


/*2. Remove the following all elements from the HashMap then verify that its size is zero and
include once again following elements and check its size
(1,”Banana”), (2,”Orange”), (3,”Guava”), (4,”Pomegranate ”), (5,”Amla”)
[ Hint : clear() , size() and put()]*/

import java.util.HashMap;
import java.util.Map;
public class P2 {
	public static void main(String[] args) {
		Map< Integer,String> hashMap = new HashMap<>();
		// 1. Basic Operations
		// Adding elements
		hashMap.put(1,"Apple");
		hashMap.put(2,"Strawberry");
		hashMap.put(3,"Pear");
		hashMap.put(4,"Cucumber");
		hashMap.put(5,"Grapes");
		hashMap.clear();
		System.out.println("After removing All elements size : "+hashMap.size());
		hashMap.put(1,"Apple");
		hashMap.put(2,"Strawberry");
		hashMap.put(3,"Pear");
		hashMap.put(4,"Cucumber");
		hashMap.put(5,"Grapes");
		System.out.println("After Adding All elements size : "+hashMap.size());
	}

}


/*3.Write a Java program to copy all mappings from the specified map to another map as shown below
Hashmap1 => ( 1, "Red") ,(2, "Green"), (3, "Black")
Hashmap2 => (4, "White"),(5, "Blue"),(6, "Orange")*/

import java.util.HashMap;
import java.util.Map;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map< Integer,String> map1 = new HashMap<>();
		map1.put( 1, "Red");
		map1.put(2, "Green");
		map1.put(3, "Black");
		// Merging maps
		Map<Integer,String> map2 = new HashMap<>();
		map2.put(4, "White");
		map2.put(5, "Blue");
		map2.put(6, "Orange");
		map2.forEach((key, value) ->
		map1.merge(key, value, (v1, v2) -> v1 + v2));
		System.out.println("After merging maps: " + map1);
	}

}


/*4.Write a Java program to check whether a map contains Key-Values mappings (empty) or not
after adding all the following elements into Hashmap and after removing all the elements from
the Hashmap.
(1, "Red"),(2, "Green"), (3, "Black"), (4, "White"),(5, "Blue")*/
import java.util.HashMap;
import java.util.Map;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map< Integer,String> map1 = new HashMap<>();
		map1.put( 1, "Red");
		map1.put(2, "Green");
		map1.put(3, "Black");
		map1.put(4, "White");
		boolean res=map1.isEmpty();
		System.out.println("Before Removing: "+res);
		map1.clear();
		
		res=map1.isEmpty();
		System.out.println("After removing: "+res);

	}

}

//TreeMap

/*1. Write a Java program to traverse / iterate all the keys with the specified value in a TreeMap
(1,”Apple”), (2,”Strawberry”), (3,”Pear”), (4,”Cucumber”), (5,”Grapes”)
[ hint : put() ; for (Map.Entry<Integer,String> entry : tree_map.entrySet()); getKey() and getValue()]*/

import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map< Integer,String> treeMap = new TreeMap<>();
		treeMap.put(1,"Apple");
		treeMap.put(2,"Strawberry");
		treeMap.put(3,"Pear");
		treeMap.put(4,"Cucumber");
		treeMap.put(5,"Grapes");
	
		System.out.println("Iterating over entries:");
		for (Entry<Integer, String> entry : treeMap.entrySet()) {
		System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}

}


/*2. Write a Java program to search for keys C4 and C5 are present or not in the following Tree Map.
("C1", "Red"); ("C2", "Green"); ("C3", "Black");("C4", "White")*/

import java.util.HashMap;
import java.util.*;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map< String,String> map1 = new TreeMap<>();
		map1.put( "c1", "Red");
		map1.put("c2", "Green");
		map1.put("c3", "Black");
		map1.put("c4", "White");
		
		System.out.println("Whehther it contains c4 or not: "+map1.containsKey("c4"));
		System.out.println("Whehther it contains c5 or not: "+map1.containsKey("c5"));

	}

}

/*3. Remove the following all elements from the TreeMap then verify that its size is zero and
include once again following elements and iterate them and check its size
(1,”Banana”), (2,”Orange”), (3,”Guava”), (4,”Pomegranate ”), (5,”Amla”)
[ Hint : clear() , size() and put()]*/

import java.util.HashMap;
import java.util.*;

public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map< Integer,String> Map = new TreeMap<>();
		// 1. Basic Operations
		// Adding elements
		Map.put(1,"Apple");
		Map.put(2,"Strawberry");
		Map.put(3,"Pear");
		Map.put(4,"Cucumber");
		Map.put(5,"Grapes");
		Map.clear();
		System.out.println("After removing All elements size : "+Map.size());
		Map.put(1,"Apple");
		Map.put(2,"Strawberry");
		Map.put(3,"Pear");
		Map.put(4,"Cucumber");
		Map.put(5,"Grapes");
		System.out.println("After Adding All elements size : "+Map.size());

	}

}


/*4. Write a Java program to get the first (lowest) key and the last (highest) key currently in the
following Treemap.
("C2", "Red"),("C1", "Green"), ("C4", "Black"), ("C3", "White")
[ Hint : firstKey() and lastKey() ]*/

import java.util.*;
import java.util.TreeMap;

public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap< String,String> map1 = new TreeMap<>();
		map1.put( "c2", "Red");
		map1.put("c1", "Green");
		map1.put("c4", "Black");
		map1.put("c3", "White");
		System.out.println(map1);
		System.out.println("The first key is: "+map1.firstKey());
		System.out.println("The Last key is: "+map1.lastKey());

	}

}

//LinkedHashMap

/*1. Write a Java program to traverse / iterate all the keys with the specified value in a linked
HashMap (1,”Apple”), (2,”Strawberry”), (3,”Pear”), (4,”Cucumber”), (5,”Grapes”) and display
only elderly entered 4 elements only
[ hint : Refer to 5. LinkedHashMap Demonstration of worked out example]*/

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*;

public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n=== LinkedHashMap Demonstration ===");
        Map<Integer,String> Map = new LinkedHashMap<>() {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer,String> eldest) {
                return size() > 4; // Remove eldest entry if size exceeds 4
            }
        };
		Map.put(1,"Apple");
		Map.put(2,"Strawberry");
		Map.put(3,"Pear");
		Map.put(4,"Cucumber");
		Map.put(5,"Grapes");
		System.out.println("Iterating over entries:");
		for (Entry<Integer, String> entry : Map.entrySet()) {
		System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
		System.out.println("Elderly entries(To display only 4 elements):");
		System.out.println("After adding 5 (notice removal of eldest): " + Map);	
		}
	}


/*2. Include the following elements into the LinkedHashMap called programminglanguages and print all
of them.
("Java", 1995);("Python", 1991);(“JavaScript", 1995);("C++", 1985);*/

import java.util.*;
import java.util.TreeMap;

public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,Integer> programminglanguages = new LinkedHashMap<>();
		programminglanguages.put("Java", 1995);
		programminglanguages.put("Python", 1991);
		programminglanguages.put("JavaScript", 1995);
		programminglanguages.put("C++", 1985);
		System.out.println(programminglanguages);
	}

}


/*3. Include the following elements into the LinkedHashMap called programminglanguages and print as
follows.
Java was developed in 1995
Python was developed in 1991.
JavaScript was developed in 1995
C++ was developed in 1985*/

import java.util.LinkedHashMap;
import java.util.*;
import java.util.Map.Entry;

public class P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> programminglanguages = new LinkedHashMap<>();
		programminglanguages.put("Java", 1995);
		programminglanguages.put("Python", 1991);
		programminglanguages.put("JavaScript", 1995);
		programminglanguages.put("C++", 1985);
		for (Entry< String,Integer> entry : programminglanguages.entrySet()) {
			System.out.println(entry.getKey() + " was developed in " + entry.getValue());
			}
	}

}

/*4. Add elements in the same order in the LinkedHaspMap using for() loop and put()
String[] keys = {"C", "A", "B", "E", "D"};
Integer[] values = {3, 1, 2, 5, 4};*/

import java.util.LinkedHashMap;
import java.util.Map;

public class P12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] keys = {"C", "A", "B", "E", "D"};
		Integer[] values = {3, 1, 2, 5, 4};
		Map<String,Integer> lMap = new LinkedHashMap<>();
		for(int i=0;i<keys.length;i++) {
			lMap.put(keys[i], values[i]);
		}
		System.out.println(lMap);

	}

}
