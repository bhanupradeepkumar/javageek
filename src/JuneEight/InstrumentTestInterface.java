package JuneEight;

public class InstrumentTestInterface {
    public static void main(String[] args) {

        Instrument g = new Guitar();
        g.use();
        MusicalInstrument m = new Guitar();
        m.play();
        m.use();
        StringBasedInstrument s = new Guitar();
        s.tuneStrings();
        Guitar g1 = new Guitar();
        g1.pluck();


    }
}

interface Instrument
{
    void use();
}
abstract class MusicalInstrument implements Instrument{
    abstract void play();
}
abstract class StringBasedInstrument extends MusicalInstrument{
    abstract void tuneStrings();
}
class Guitar extends StringBasedInstrument{
    public void use(){
        System.out.println("Guitar is being used...");
    }
    void tuneStrings(){
        System.out.println("tuning the guitar strings..");
    }
    void play(){
        System.out.println("playing  guitar ");
    }
    void pluck(){
        System.out.println("plucking the strings of guitar");
    }
}
class Violin extends StringBasedInstrument{
public void use(){
    System.out.println("violin is being used ");
}
void play(){
    System.out.println("violion is being played by  ramu ");
}
void tuneStrings(){
    System.out.println("tuning the violin");
}
void bowing(){
    System.out.println("bowing...");
}
}
