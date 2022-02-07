public class Hello2 {
    public static void main(String arg[]) {
        if(arg.length == 1) {
            System.out.println("Tere, " + arg[0]);
        } else if(arg.length >= 2) {
            System.out.println("Tere " + arg[0] + " ja " + arg[1]);
        } else {
            System.out.println("Tere");
        }
    }
}