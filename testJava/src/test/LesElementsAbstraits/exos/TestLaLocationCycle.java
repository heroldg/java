package test.LesElementsAbstraits.exos;

import java.time.LocalDate;

public class TestLaLocationCycle {
    static public final int NB_CYCLES = 6;
    static LaLocationDeCycles[] aLouer = new LaLocationDeCycles[NB_CYCLES];

    public static void main(String[] args) {

        aLouer[0] = new Velos("Lapierre", "speed 400", LocalDate.of(2016, 8, 16), 27);
        aLouer[1] = new Velos("Btwin", "riverside", LocalDate.of(2016, 10, 17), 10);
        aLouer[2] = new Gyropode("Segway", "Ninebot Elite", LocalDate.of(2019, 2, 14), 40, 150);
        aLouer[3] = new Gyropode("Weebot", "Echo", LocalDate.of(2021, 7, 25), 35, 160);
        aLouer[4] = new Gyroroue("Immotion", "v8", LocalDate.of(2021, 10, 16), 40);
        aLouer[5] = new Gyroroue("Segway", "Ninebot", LocalDate.of(2023, 5, 20), 30);

        for (int i = 0; i < NB_CYCLES; i++) {
            System.out.println(aLouer[i].getInfo());
            System.out.println();

        }
    }
}
