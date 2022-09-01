import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class SessionDemo1 {
    public static void main(String[] args) {

        List<Integer> obj = new ArrayList<>();

        obj.add(10);
        obj.add(15);
        obj.add(20);
        obj.add(25);
        obj.add(30);
        obj.add(35);
        obj.add(40);
        obj.add(45);
        obj.add(50);
        int count = 0;

        for(Integer element : obj){
            if(element % 2 == 0){
                count++;
            }else{
                System.out.println("element = " + element);
            }

        }
        System.out.println("Total even number " + count);
        System.out.println("obj.size() = " + obj.size());


    }
}
