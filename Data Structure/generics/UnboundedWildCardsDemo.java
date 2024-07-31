import java.util.ArrayList;
import java.util.List;

class UnboundedWildCardsDemo
{
        public static void main(String[] args) 
        {
            List<Integer> integerList = new ArrayList<Integer>();
            integerList.add(6); 
            integerList.add(3); 
            integerList.add(10);
            print(integerList);
            System.out.println("\n----------");
            List<String> stringList = new ArrayList<String>();
            stringList.add("A");
            stringList.add("B");
            stringList.add("C");
            print(stringList);
        }
        public static void print(List<?> list)
        {
            for(Object input : list)
            {
                System.out.print(input +" ");
                //list.add(input); // LINE A
            }
        }
}