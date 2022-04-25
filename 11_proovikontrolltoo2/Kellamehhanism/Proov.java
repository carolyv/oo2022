public class Proov {
    public static void main(String[] args) throws InterruptedException {
        Hammasratas hammasratas = new Hammasratas(3);
        Hammasratas hammasratas2 = new Hammasratas(6);
        Pendel a = new Pendel(0.07, hammasratas);
        a.tiksumine();
    }
}
