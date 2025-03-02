package experiments;

public class Exeptions {

    public static void main(String[] args) {
        String[] strArray={"str1","str2","str3"};
        uncheckedExceptions(strArray);
        try {
            pause();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    private static void uncheckedExceptions(String[] strArray){
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(strArray[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
           e.printStackTrace();
            System.out.println("created exception");
        }
        System.out.println("Program is working");
    }
    private static void pause() throws InterruptedException {
        checkException();
        System.out.println("Pause 3 sec");
    }
    private static void checkException() throws InterruptedException {
        Thread.sleep(3000);
    }

}
