package ua.opnu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EasyTasks {

    public static void main(String[] args) {
        // Для виконання лабораторної роботи необхідно написати вміст методів згідно умовам завдання,
        // після чого протестувати метод за допомогою тестів, які знаходяться в папці
        // src\test\TaskTest.java
    }

    public static List<Integer> doubling(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (Integer n : nums) {
            result.add(n * 2);
        }
        return result;
    }

    public List<Integer> square(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (Integer n : nums) {
            result.add(n * n);
        }
        return result;
    }

    public List<String> moreY(List<String> strings) {
        List<String> out = new ArrayList<>(strings.size());
        for (String s : strings) {
            out.add("y" + s + "y");
        }
        return out;
    }

    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n >= 0)
                .toList();
    }

    public List<Integer> no9(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n % 10 != 9)
                .toList();
    }

    public List<String> noZ(List<String> strings) {
        return strings.stream()
                .filter(s -> !s.contains("z"))
                .toList();
    }

    public List<String> refinedStrings(List<String> strings) {
        return strings.stream()
                .distinct()
                .sorted((a, b) -> Integer.compare(b.length(), a.length()))
                .toList();
    }

    public List<String> flatten(List<String> strings) {
        return strings.stream()
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .toList();
    }
}
