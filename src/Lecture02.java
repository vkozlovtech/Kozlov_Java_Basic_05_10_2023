public class Lecture02 {

    public static void main(String[] args) {

        int[] shuttleNumbers = new int[100];

        int count = 0;

        while (count < shuttleNumbers.length) {
            String s = String.valueOf(++shuttleNumbers[count]);
            if ((s.contains("4") || s.contains("9"))) continue;
            System.out.println("Element " + count + " = " + shuttleNumbers[count]);
            if (count < (shuttleNumbers.length - 1)) {
                shuttleNumbers[count + 1] = Integer.parseInt(s);
                System.out.println("Element (count + 1) = " + shuttleNumbers[count + 1]);
                count++;
            } else {
                break;
            }
        }
        System.out.println("++++++++ TOTAL: " + count);


//        int count = 0, value = 0;
//        while (count < 100) {
//            String s = String.valueOf(++value);
//            if ((s.contains("4") || s.contains("9"))) continue;
//            System.out.println(value);
//            count++;
//        }
//        System.out.println("++++++++ TOTAL: " + count);



//    public static void main(String[] args) {
//        double d = 12;
//
//        int i = (int) (d * 100 - Math.floor(d)*100);
//        System.out.println(i);

//        double eps = 0.001;
//        System.out.println("Compare result: " + (Math.abs(a - b) < eps));

//        System.out.println("Compare result: " + (Math.abs(a - b) < eps));
    }
}

