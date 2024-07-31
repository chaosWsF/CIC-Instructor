import java.util.ArrayList;
import java.util.List;

class BoundedWildCards
{
        public static void main(String[] args)
        {
            List<Integer> integerList = new ArrayList<>();
            integerList.add(3);
            integerList.add(5);
            integerList.add(10);
            System.out.println("Integer list:");
            print(integerList);
            System.out.println();

            List<Double> doubleList = new ArrayList<>();
            doubleList.add(5.1);
            doubleList.add(7.47);
            doubleList.add(12.78);
            System.out.println("Double list:");
            print(doubleList);

        }

        public static void print(List<? extends Number> list)
        {
            for(Number input : list)
            {
                System.out.print(input +" ");
            }

        }

}