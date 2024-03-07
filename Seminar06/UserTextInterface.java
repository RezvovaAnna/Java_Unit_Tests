package Seminar06;

import java.util.Arrays;
import java.util.Scanner;

public class UserTextInterface {
    public Scanner scanner;



    public int[] getInputArray(Integer numberOfArray) {
        int[] res = new int[0];
        this.scanner = new Scanner(System.in);
        try {
            System.out.println("Введите " + numberOfArray + " список чисел через пробел:");
            res = Arrays.stream(this.scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
        } catch (NumberFormatException e) {
            System.out.println("Неверный ввод! Введите целые числа. Ввод начните с числа.");
        }
        finally {
            if ( res.length == 0) {
                System.out.println("Введите " + numberOfArray + " список чисел через пробел:");
                res = Arrays.stream(this.scanner.nextLine().split("\\s+"))
                        .mapToInt(Integer::parseInt).toArray();
            }
        }
        return res;
    }

    }


