public class Main {

    public static void main(String[] args) {
        int [] number = new int[10];

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] = (int)(Math.random() * 10));
        }
        System.out.println();

        for(int i = 0; i < number.length; i++) {
            boolean changed = false;    // 자리 바꿈이 일어났는지 체크

            for(int j = 0; j < number.length-1-i; j++) {
                if(number[j] > number[j+1]) {
                    int tmp = number[j];
                    number[j] = number[j+1];
                    number[j+1] = tmp;
                    changed = true;
                }
            }

            for(int k =0; k < number.length; k++)
                System.out.print(number[k]);
            System.out.println();

        }
    }
}

