package tools;

import java.util.HashSet;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {
	private Set<String> set1;
	private int counter;

	public PersonalDuplicateRemover() {
		set1 = new HashSet<String>();
	}

	@Override
	public void add(String characterString) {
		if (set1.contains(characterString) == false) {
			set1.add(characterString);
		} else {
			counter++;
		}
	}

	@Override
	public int getNumberOfDetectedDuplicates() {

		return counter;
	}

	@Override
	public Set<String> getUniqueCharacterStrings() {

		return set1;
	}

	@Override
	public void empty() {
		set1.clear();
		this.counter=0;
	}

}
