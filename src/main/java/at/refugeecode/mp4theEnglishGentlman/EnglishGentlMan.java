package at.refugeecode.mp4theEnglishGentlman;

import org.springframework.stereotype.Component;

@Component
public class EnglishGentlMan{


    private Monocle monocle;
    private Lighter lighter;
    private boolean hereadIt;
    private boolean heFireCigar;

    public EnglishGentlMan(Monocle monocle, Lighter lighter) {
        this.monocle = monocle;
        this.lighter = lighter;

    }

    public void read(Newspaper newspaper){
        monocle.read(newspaper);
        hereadIt=true;
    }
    public void  smoke(Cigar cigar){
        lighter.fire(cigar);
        heFireCigar =true;
    }

    public Boolean areEnjoy(){
        return hereadIt && heFireCigar;
    }

}
