package Qcm;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Long> liste = new ArrayList<>();
		
		liste.add(1l);
		liste.add(2l);
		liste.add(3l);
		
		for (Long e : liste) {
			if (e == 2)
				break;
			else
				System.out.print(e + " ");
		}

	}

}
