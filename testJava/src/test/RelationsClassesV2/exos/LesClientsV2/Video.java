package test.RelationsClassesV2.exos.LesClientsV2;

public class Video extends Oeuvre {
    static Oeuvre[] videos = new Oeuvre[100];

    private int dureeVideo;

    public Video(int dureeVideo) {
        this.dureeVideo = dureeVideo;
    }

    public Video() {
        this.toutesLesVideos();
    }

    public int getDureeVideo() {
        return dureeVideo;
    }

    public String toutesLesVideos() {
        int nb = getNbVideo();
        String ret = "";
        if (nb == 0) {
            System.out.println("Il n'y a pas de video à la commande");

        } else {

            System.out.println("Toutes la Catégories vidéo:");
            for (int i = 0; i < nb; i++) {
                ret = "- " + videos[i].getVideo() + "\r\n";
            }
        }
        return ret;
    }

}
