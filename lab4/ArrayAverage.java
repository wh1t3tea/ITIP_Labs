public class ArrayAverage {
    public static void main(String[] args) {
        Object [] arr = {1, 1, 3, "4", 5};
        int sum = 0;
        int count = 0;
        int countFirstN = 5;
        
        try {
            for (int i = 0; i < countFirstN; i++) {
                sum += (int) arr[i];
                count++;
            }
            double average = (double) sum / count;
            System.out.println("Среднее арифметическое: " + average);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Ошибка: выход за границу длины массива");
        } catch (ClassCastException e) {
            System.err.println("Ошибка: неверный тип данных");
        }
    }
}