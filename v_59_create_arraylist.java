import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;;

public class v_59_create_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(30, 40));
        numbers.add(1);
        numbers.add(2);
        numbers.add(4,4);
        System.out.println(numbers);

        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        stringList.add("D");
        stringList.add("E");
        // for(int i=0;i<stringList.size();i++){
        //     String letter = stringList.get(i);
        //     System.out.println(letter);
        // }
        // for(String letter: stringList){
        //     System.out.println(letter);
        // }
        // Iterator<String> iterator = stringList.iterator();
        // while(iterator.hasNext()){
        //     String letter = iterator.next();
        //     System.out.println(letter);
        // }
        // System.out.println(stringList.get(1));
        // System.out.println(stringList);
        for(String letter: stringList){
            if(letter.equals("D")){
                System.out.println("The element is found");
                break;
            }
        }
        int index = stringList.indexOf("C");
        System.out.println("The element is found at index: "+ index);

        stringList.remove(2);
        System.out.println(stringList);
        stringList.remove("A");
        System.out.println(stringList);
    }
}
