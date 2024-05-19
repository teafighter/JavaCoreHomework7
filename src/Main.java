import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Задание 1.
        // Напишите код, с помощью которого можно напечатать только нечетные числа в консоль.
        // Код должен работать с любой последовательностью и объемом списка чисел.
        List<Integer> nums1 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer i : nums1) {
            if ((i % 2) != 0) {
                System.out.println(i); // просто распечатать
            }
        }

        nums1.removeIf(i -> (i % 2 == 0)); // удалить
        System.out.println(nums1); // и распечатать

        // Задание 2.
        // Напишите код, с помощью которого можно напечатать только четные числа без повторений в порядке возрастания.
        // Код должен работать с любой последовательностью и объемом списка чисел.
        List<Integer> nums2 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Collections.sort(nums2); // сортируем
        Set<Integer> nums2set = new HashSet<>(); // создадим сет, чтобы без повторений
        for (Integer integer : nums2) {
            if ((integer % 2) == 0) {
                nums2set.add(integer);
            }
        }
        System.out.println(nums2set); // напечатаем

        // Задание 3.
        // Напишите код, который выводит в консоль все уникальные слова из списка слов, в котором могут встречаться дубли.
        // Код должен работать с любой последовательностью и объемом списка слов.
        List<String> string1 = new ArrayList<>(List.of("mother", "frame", "frame", "washed", "mother"));
        Set<String> strings1set = new HashSet<>(string1);
        System.out.println(strings1set);

        // Задание 4.
        // Напишите код, который выводит в консоль количество дублей для каждого уникального слова.
        // Код должен работать с любой последовательностью и объемом списка слов.
        List<String> strings2 = new ArrayList<>(List.of("три", "один", "два", "три", "два", "три"));
        Set<String> strings2set = new HashSet<>(strings2); // соберем все уникальные значения
        Iterator<String> strings2Iterator = strings2set.iterator(); // заводим итератор, чтобы пройтись по сету
        Collections.sort(strings2); // отсортируем исходный лист, чтобы одинаковые элементы шли друг за другом
        while (strings2Iterator.hasNext()) { // проходимся по сету
            String currentString = strings2Iterator.next();
            int tempAmount = 0;
            for (String string : strings2) {
                if (currentString.equals(string)) {
                    tempAmount++; // считаем повторения строк
                }
            }
            System.out.println("Строка " + currentString + " повторяется " + tempAmount + " раз");
        }
    }
}