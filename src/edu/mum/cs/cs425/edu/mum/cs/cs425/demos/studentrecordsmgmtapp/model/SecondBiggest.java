package edu.mum.cs.cs425.edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model;

public class SecondBiggest {

        public static void main(String[] args) {

            int[] numbers1 = {1, 2, 3, 4, 5};
            int[] numbers2 = {19, 9, 11, 0, 12};
            System.out.println(findSecondBiggest(numbers1));
            System.out.println(findSecondBiggest(numbers2));
        }

        public static int findSecondBiggest(int[] numbers) {
            if (numbers.length < 2) {
                return Integer.MIN_VALUE;
            }

            int biggest = Math.max(numbers[0], numbers[1]);
            int secondBiggest = Math.min(numbers[0], numbers[1]);

            for (int i = 2; i < numbers.length; i++) {
                if (numbers[i] > biggest) {
                    secondBiggest = biggest;
                    biggest = numbers[i];
                } else if (numbers[i] > secondBiggest && numbers[i] != biggest) {
                    secondBiggest = numbers[i];
                }
            }

            return secondBiggest;
        }
    }


