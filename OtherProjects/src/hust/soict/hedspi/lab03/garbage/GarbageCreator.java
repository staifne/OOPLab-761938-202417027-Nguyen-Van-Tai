package hust.soict.hedspi.lab03.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) {
        String filename = "D:\\Tai\\JAVA\\OOPLab\\OtherProjects\\src\\hust\\soict\\hedspi\\lab03\\08DaHinh.pdf";
        byte[] inputBytes = { 0 };
        long startTime, endTime;
        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }

        startTime = System.currentTimeMillis();
        String outputString = "";
        for (byte b : inputBytes) {
            outputString += (char)b;
        }
        endTime = System.currentTimeMillis();
        System.out.println("Thời gian đọc bằng toán tử + : " + (endTime - startTime) + "ms");
    }
}