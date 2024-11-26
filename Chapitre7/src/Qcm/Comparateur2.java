package Qcm;

public class Comparateur2  { 

    private void test(int x, java.util.ArrayList<Integer> l) {
        switch (x) {
            case 4 :
                    l.add(4);
                    break;
            case 11 :
                    l.add(11);
            case 15 :
                l.add(15);
                break;
           default:
                l.add(0);
                break;
       }
   } 

    public static void main(String args[]) {
          Comparateur2 comp = new Comparateur2();
          java.util.ArrayList<Integer> liste = new java.util.ArrayList<>();
          liste.add(1);
          System.out.println(liste.size());
          int x = 11;
          comp.test(x, liste);
          System.out.println(liste.size());
    }
}
