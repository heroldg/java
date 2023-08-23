package test.RelationsClassesV2.exos.LesClientsV2;

public class Video extends Oeuvre {
    static Oeuvre[] videos = new Oeuvre[100];

    private int dureeVideo;

    public Video(int dureeVideo) {
        this.dureeVideo = dureeVideo;
    }

    public int getDureeVideo() {
        return dureeVideo;
    }

    public String toutesLesVideos() {
        int nb = getNbVideo();
        String ret = "";
        for (int i = 0; i < nb; i++) {
            ret = "- " + videos[i].getVideo() + "\r\n";
        }
        return ret;
    }

}
