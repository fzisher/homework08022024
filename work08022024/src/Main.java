import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nums1={1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] nums2={1, 2, 8, 5, 9, 4, 5, 3, 6, 7, 8};
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //first();
       // second();
        third();
        //fourth();
        //fifth();
        //sixth();
        //seventh(nums1);
        //seventh(nums2);
        //eighth(nums2, n);
    }

    public static void first() {
        int[] num={0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0};
        for (int j=0; j < num.length; j++) {
            System.out.print(num[j]);
        }
        System.out.println(" ");
        for (int i=0; i < num.length; i++) {
            if (num[i] == 1) {
                num[i]=0;
                System.out.print(num[i]);
            } else {
                num[i]=1;
                System.out.print(num[i]);
            }
        }

    }

    public static void second() {
        int[] num=new int[100];
        for (int i=0; i < num.length; i++) {
            num[i]=i+1;
            System.out.print(num[i]);
        }
    }

    public static void third() {
        int[] num={1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i=0; i < num.length; i++) {
            if (num[i] < 6) {
                num[i]=num[i] * 2;
                System.out.print(num[i]);
            } else {
                System.out.print(num[i]);
            }
        }
    }

    public static void fourth() {
        int[][] table=new int[5][5];
        for (int i=0; i < 5; i++) {
            for (int j=0; j < 5; j++) {
                if (i == j || i + j == 4) {
                    table[i][j]=1;
                    System.out.print(table[i][j] + " ");
                } else {
                    table[i][j]=0;
                    System.out.print(table[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void fifth() {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int initialValue=sc.nextInt();
        int[] num=new int[len];
        for (int i=0; i < len; i++) {
            num[i]=initialValue;
            System.out.print(num[i]);
        }
    }

    public static void sixth() {
        int[] num={1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int ma=0;
        int mi=num[0];
        for (int i=0;
             i < num.length; i++) {
            if (num[i] < mi) {
                mi=num[i];
            } else if (num[i] > ma) {
                ma=num[i];
            }
        }
        System.out.print("Максимальное число - " + ma + ",а минимальное - " + mi + ".");
    }

    public static void seventh(int[] nums) {
        int len=nums.length / 2;
        int sum1=0;
        int sum2=0;
        for (int i=0; i < nums.length; i++) {
            if (i < len) {
                sum1+=nums[i];
            } else {
                sum2+=nums[i];
            }
        }
        if (sum1 == sum2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void eighth(int[] nums, int n) {
        int bet=0;
        // можно скопировать первые н элементов и поменять просто их место в массиве
            if (nums.length <= 1) {
                return;
            }
            n %= nums.length;
            if (n < 0) {
                n += nums.length;
            }
            reverseArray(nums, 0, nums.length - 1);
            reverseArray(nums, 0, n - 1);
            reverseArray(nums, n, nums.length - 1);
            for (int i=0;i<nums.length; i++){
                System.out.print(nums[i]);
        }
        }
        private static void reverseArray(int[] numms, int start, int end) {
            while (start < end) {
                int temp = numms[start];
                numms[start] = numms[end];
                numms[end] = temp;
                start++;
                end--;
            }
        }
}
