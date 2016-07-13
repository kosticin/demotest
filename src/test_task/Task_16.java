package test_task;

/**
 * Created by Константин on 13.07.2016.
 * Which of the following code snippets will print exactly 10?
 */
public class Task_16 {

            // 1
        public static void main(String[] args) {
            Object t = new Integer(106);
            int k = ((Integer) t).intValue() / 10;
            System.out.println(k);
            //2
            System.out.println(100 / 9.9);
            //3
            System.out.println(100 / 10.0);
            //4
            System.out.println(100 / 10);
            //5
            System.out.println(3 + 100 / 10 * 2 - 13);
        }
}
