import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CountNum {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("dane.txt");
        Scanner scan = new Scanner(file);
        TreeMap<Integer,Integer> numbersMap = new TreeMap<>();

        while(scan.hasNextLine()){
            int nextNum = scan.nextInt();
            numbersMap.put(nextNum,numberOfItem(nextNum));
        }

        Set<Integer> keySet = numbersMap.keySet();
        for(Integer num:keySet){
            System.out.println(num + " - liczba wystąpień: " + numbersMap.get(num));
        }
    }

    public static Integer numberOfItem(Integer a) throws FileNotFoundException {
        File file = new File("dane.txt");
        Scanner scan = new Scanner(file);
        int count=0;
        while(scan.hasNextLine()){
            if(a==scan.nextInt()){
              count++;
            }
        }
            return count;
    }

}
