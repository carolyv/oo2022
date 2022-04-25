public class Pendel {
    double pikkus;
    Hammasratas hr;
    public Pendel(double pikkus, Hammasratas hr) {
        this.pikkus = pikkus;
        this.hr = hr;
    }
    public void tiksumine() throws InterruptedException {
        double vonkeperiood = 2 * Math.PI * Math.sqrt(pikkus / 9.8);
        int ooteaeg = (int)(vonkeperiood * 1000);
        	System.out.println(ooteaeg);
            while(true) {
                System.out.println("Tiks");
                Thread.sleep(ooteaeg * 2);
                hr.liigutaRatast();
            }
    }
}