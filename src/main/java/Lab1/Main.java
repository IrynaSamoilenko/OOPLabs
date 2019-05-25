package Lab1;

import Lab1.Utils.Converter;
import Lab1.Utils.DotComparator;
import Lab1.Utils.FileManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileManager fm = new FileManager();

        System.out.println("Enter size of your container => ");
        int size = sc.nextInt();
        Dots container = new Dots(size);
        container.fullContainer();
        container.print();

        System.out.println("Enter k-after-append index => ");
        int k = sc.nextInt();
        container.appendDot(k);
        container.print();

        System.out.println("Enter k-after-delete index => ");
        int kDel = sc.nextInt();
        container.deleteDot(kDel);
        container.print();

        System.out.println("Enter min distance => ");
        int d = sc.nextInt();
        System.out.println("Number of dots with distance more than entered value = "+
                           container.counterNumberOfRemoteDots(d));


        Arrays.sort(container.getDots(), new DotComparator());
        for (Dot dot: container.getDots()) {
            dot.toString();
        }

        //write a serializationed object to the file
        fm.writeFile(container.getDots());

        //read from the file and deserialization the object
        Dot[] dots = fm.readFile();
        dots.toString();

        //convert to JSON-format and write to file
        Converter.toJSON(container);

        //convert to Java-object and print
        Dots dotsRead = Converter.toJavaObject();
        dotsRead.print();

    }
}
