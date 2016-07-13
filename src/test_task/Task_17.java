package test_task;

/**
 * Created by Константин on 14.07.2016.
 * Consider the following lines of code:
 */
public class Task_17 {
    public static void main (String[] args) {
        Integer i = new Integer(42);
        Long ln = new Long(42);
        Double d = new Double(42);

        //Which of the following options are valid
        //1
       // System.out.println(i == ln);
        //2
       // System.out.println(ln == d);
        //3
        System.out.println(i.equals(d));
        //4
        System.out.println(d.equals(ln));
        //5
        System.out.println(ln.equals(42));
    }
}
