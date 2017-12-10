import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class DogFarm   {
	private List<Dogs> list;

	public DogFarm() {

		list=new ArrayList<Dogs>();
	}

	public List<Dogs> getList() {
		return list;
	}

	public void setList(List<Dogs> list) {
		this.list = list;
	}
	public List<Dogs> sortAgeDesc() {
		Comparator<Dogs> comparator = new Comparator<Dogs>() {

			public int compare(Dogs d1, Dogs d2) {
				return d2.getAmzius() - d1.getAmzius();
			}
		};

		Collections.sort(list, comparator);
		return list;
	}	
		
	public void sort() {
		Collections.sort(list);
	}

	public void print() {
		for (Dogs n:list) {
			System.out.println(n);
		}
	}
	
}
