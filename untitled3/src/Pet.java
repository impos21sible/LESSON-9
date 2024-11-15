public abstract class Pet {
    private int powsCount;
    public void sleep(){
        System.out.println("Сплю");
    }

    public  int getPowsCount() {
        return powsCount;
    }

    public void play(){
        System.out.println("Играю");
    }

    public abstract void giveVoice();

    public void catchMouse(){
        System.out.println("Поймала мышку !");
    }

    public void hideFood(){
        System.out.println("Вся еда - в щечках !");
    }

    public void bringStick(){
        System.out.println("Принёс палочку, как хороший мальчик!");
    }



}
