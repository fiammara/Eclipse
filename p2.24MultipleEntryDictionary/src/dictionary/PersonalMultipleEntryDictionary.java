package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
	private Map<String, Set<String>> map;

	public PersonalMultipleEntryDictionary() {
		map = new HashMap<String, Set<String>>();
	}

	@Override
	public void add(String word, String entry) {
		Set<String> set2 = new HashSet<String>();
		set2.add(entry);
		if (map.containsKey(word)) {

			for (String n : map.get(word)) {
				set2.add(n);
			}
		}
		map.put(word, set2);

	}

	@Override
	public Set<String> translate(String word) {
		if (map.containsKey(word)) {
			return map.get(word);
		} else {
			return null;
		}

	}

	@Override
	public void remove(String word) {
		if (map.containsKey(word)) {

			map.remove(word);
		}

	}

}
