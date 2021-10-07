package lsp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Initialization {
    int[] nums;

    public int[] setInit() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            System.out.print("Введи длинну массива : ");
            nums = new int[Integer.parseInt(reader.readLine())];

            for (int i = 0; i < nums.length; i++) {
                System.out.print("Введи " + i + "-й элемент массива:  ");
                nums[i] = Integer.parseInt(reader.readLine());
                System.out.println();
            }

            reader.close();
            System.out.println("Массив заполнен");
        } catch (NumberFormatException e) {
            System.out.println("Не могу прочитать");
        } catch (IOException e) {
            System.out.println(e);
        }
        return nums;
    }
}
