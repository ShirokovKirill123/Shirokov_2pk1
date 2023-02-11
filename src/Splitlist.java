import java.util.ArrayList;
import javax.swing.*;

public class Splitlist {
    public static void printValues(ArrayList<Integer> Splitlist)
    {
        StringBuilder sourse = new StringBuilder("Sousre = ");
        StringBuilder positive = new StringBuilder("Positive = ");
        StringBuilder negative = new StringBuilder("Negative = ");
        for (Integer i : Splitlist) {
            if (i == i)
            {
                sourse.append(i).append(", ");
            }
        }
        for (Integer i : Splitlist)
        {
            if (i >= 0)
            {
                positive.append(i).append(", ");
            }
            else if(i <= 0)
            {
                negative.append(i).append(", ");
            }
        }
        sourse.delete(sourse.length() - 2, sourse.length());
        positive.delete(positive.length() - 2, positive.length());
        negative.delete(negative.length() - 2, negative.length());
        System.out.println(sourse.toString());
        System.out.println(positive.toString());
        System.out.println(negative.toString());
    }

    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        int num=Integer.parseInt(JOptionPane.showInputDialog("Сколько чисел?"));
        for (int i=0 ; i < num ; i++) {
            al.add(Integer.parseInt(JOptionPane.showInputDialog("Какие числа?")));
        }
        printValues(al);
    }
}
