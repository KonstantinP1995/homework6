public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

        public static void main (String[]args){
            int[] arr = generateRandomArray();
            int sum = 0;
            int max = 0;
            int min = 200_000;

            for (int j : arr) {
                sum += j;
            }
            System.out.println("Сумма затрат за месяц " + sum);

            for (int j : arr) {
                if (j > max) {
                    max = j;
                }
            }
            System.out.println("Максимальное значение массива " + max);

            for (int j : arr) {
                if (min > j) {
                    min = j;
                }
            }
            System.out.println("Минимальное значение массива " + min);

            double average = (double) sum/ arr.length;
            System.out.println("Средние затраты в месяц " + average);

            char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int i = reverseFullName.length - 1; i >= 0; i--) {
                System.out.print(reverseFullName[i]);
            }


        }


    }
