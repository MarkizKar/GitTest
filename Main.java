import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.*;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //File file = new File("note.txt");
        /*Random rnd = new Random();
        PrintWriter print = new PrintWriter("note.txt");
        for (int i = 0; i<100; i++){
            print.println(rnd.nextInt(101));
        }
        print.close();*/

        /*Scanner scan = new Scanner(file);
        int x;
        while(scan.hasNextLine()){
            x = scan.nextInt();
                System.out.println(x+" + "+(100-x)+ " = "+ (100));
        }*/

        /*int i = 0;
        String [] tab = new String[10];
        Scanner scan = new Scanner(file);
        Random rnd = new Random();
        int index = rnd.nextInt(10);
        while(scan.hasNextLine()){
            tab [i] = scan.next();
            i++;
        }
        System.out.println(tab [index]);*/

        /*PrintWriter text = new PrintWriter("note.txt");
        Scanner scan = new Scanner(System.in);
        String huinia;
        for(int i=0;i<10;i++)
        {
            System.out.println("Впиши хуйню номер "+(i+1));
            huinia = scan.nextLine();
            text.println(huinia);
        }
        text.close();*/


        /*int temp;
        File file = new File("note.txt");
        PrintWriter write = new PrintWriter(file);
        Scanner scan = new Scanner(System.in);
        int [] tab = new int[5];
        System.out.print("Wpisz liczbę: ");
        for(int j=0; j<5; j++) {
            tab[j] = scan.nextInt();
        }

        for(int i=0; i< tab.length;i++)
        {
            for(int j=0;j< tab.length;j++)
            {
                if(tab[i]<tab[j]) {
                    temp = tab[i];
                    tab[i] = tab[j];
                    tab[j] = temp;
                }

            }
        }
        Arrays.sort(tab);
        for(int i=0; i< tab.length;i++)
        {
            write.println(tab[i]);
            System.out.println(tab[i]);
        }
        write.close();*/

        /*ArrayList<Integer>cock= new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<5; i++){
            cock.add(scan.nextInt());
        }
        int summ=0;
        for(int i=0; i<cock.size(); i++){
            summ += cock.get(i);
        }
        System.out.println(summ);*/

        /*String name = "Huesos";
        char [] tab;
        tab = name.toCharArray();
        for(int i=0; i<tab.length; i++){
            System.out.print(tab[i]+" ");
        }
        System.out.println("Z 8 marca");*/
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj pierwszą liczbę: ");
            int numb1 = scan.nextInt();
            System.out.println("Podaj drugą liczbę: ");
            int numb2 = scan.nextInt();
            System.out.println("Podaj które działanie chcesz zrobić: ");
            String numbs = scan.next();


        switch (numbs) {
            case "+" -> System.out.println("Suma = " + (numb1 + numb2));
            case "-" -> System.out.println("Odejmowanie = " + (numb1 - numb2));
            case "/" -> System.out.println("Dzielenie = " + (numb1 / numb2));
            case "*" -> System.out.println("Mnożenie = " + (numb1 * numb2));
            default -> System.out.println("No jesteś kurwa debiłem");
        }
    }
}