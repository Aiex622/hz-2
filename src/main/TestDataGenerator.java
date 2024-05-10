package main;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class TestDataGenerator {
    public static void main(String[] args) {
        int[] sizes = {15, 150, 1500, 15000, 150000, 1500000};
        Random rand = new Random();

        for (int sz : sizes) {
            try (FileWriter fw = new FileWriter("n_" + sz + ".txt")) {
                for (int i = 0; i < sz; i++) {
                    fw.write(rand.nextInt(1000000) + " ");
                }
            } catch (IOException e) {
                System.out.println("Ошибка при записи в файл: " + e.getMessage());
            }
        }
    }
}