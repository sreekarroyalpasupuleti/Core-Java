 public class SumMatchingPairs {

        public static void main(String[] args) {

            int arr[] = { 2, 8, 5, 6, 4, 7,3 };

            int sum = 10;

            for (int i = 0; i < arr.length; i++) {

                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] + arr[j] == sum) {
                        System.out.println(arr[i] + "+" + arr[j] + "=" + sum);
                    }
                }
            }
        }
    }
