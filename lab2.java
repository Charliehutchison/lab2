public class lab2{
    public static void helloWorld(){
        System.out.println("Hello World");
    }

    public static int[] addOne(int[] listOfNum) {
        for (int i = 0; i <= listOfNum.length; i++) {
            listOfNum[i] += 1; 
        }
        return listOfNum;
    }

    public void main(){
        helloWorld();

    }
}