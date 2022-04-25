public class Hammasratas {
    int hammasteArv;
    int liikumine = 0;
    int ringeTehtud = 0;
    public Hammasratas(int hammasteArv) {
        this.hammasteArv = hammasteArv;
    }
    public void liigutaRatast() {
        liikumine++;
        if(liikumine == hammasteArv) {
            ringeTehtud++;
            System.out.println("Ring tehtud! (" + ringeTehtud + ")");
            liikumine = 0;
        }
    }
}
