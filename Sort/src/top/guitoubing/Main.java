package top.guitoubing;

public class Main {

    private static int[] numbers = {
            3,49,35,25,24,48,41,7,8,42,47,18,31,30,39,40,19,16,14,50,27,20,10,44,28,38,34,21,9,2,0,12,37,23,15,13,45,4,36,1,6,46,26,32,17,33,11,43,22,29
    };
    public static void main(String[] args) {
        BubbleSort();
    }
    private static int[][] result = new int[50][1226];

    private static void BubbleSort() {
        int temp;
        int size = numbers.length;
        System.out.println("[");
        int flag = 0;
        for(int i = 0 ; i < size-1; i ++)
        {
            for(int j = 0 ;j < size-1-i ; j++)
            {
                if(numbers[j] > numbers[j+1])  //交换两数位置
                {
                    temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
                printNumbers();
            }
        }
        System.out.println("]");
    }

    private static void addNumbers(int flag){
        for (int i = 0; i < numbers.length; i++){
            result[i][flag] = numbers[i];
        }
    }

    private static void printNumbers(){
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i]);
            if (i != numbers.length-1)
                System.out.print(",");
        }
        System.out.println("],");
    }
}
