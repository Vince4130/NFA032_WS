package qcm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int xx = 10192457;
	    short zz = 9456;
	    int yy = 21;
	     boolean w = (xx % yy < 2) || !(xx / yy - zz != 3 * zz * yy ) && (yy * zz <= xx/3);
	     
	     System.out.println(w);
	     
	     Map<Long, Long> map = new HashMap<>();
	      map.put(2l, 10l);
	      map.put(23l, 60l);
	      map.put(10l, 91l);
	      Set<Long> s = new HashSet<>();
	      s.addAll(map.keySet());
	      s.addAll(map.values());

	     boolean b = s.size() == 6;
	     int sis = s.size();
	     System.out.println(b);
	     System.out.println(sis);
	}

}
