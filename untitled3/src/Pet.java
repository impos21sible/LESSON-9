public abstract class Pet {
    private int powsCount;
    private String voice;

    protected Pet(int powsCount,String voice) {
        this.powsCount = powsCount;
        this.voice = voice;
    }


    public void sleep(){
        System.out.println("Сплю");
    }

    public  int getPowsCount() {
        return powsCount;
    }

    public void play(){
        System.out.println("Играю");
    }

    public  void    giveVoice(){
        System.out.println(voice);
    }









}
