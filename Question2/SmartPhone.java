interface Camera{
    void click();
    void record();
    
}
interface MusicPlayer{
     void play();
     void stop();
    
}
class Phone{
    public void call()
    {
        System.out.println("call method is called");

    }

    public void sms(){
        System.out.println("sms method is called");
    }
}
 public class SmartPhone extends Phone implements Camera, MusicPlayer{

    public void click(){
         System.out.println("click method is called");
    }

    public void record(){
        System.out.println("record method is called");
    }

    public void play(){
        System.out.println("play method is called");
    }

    public void stop(){
        System.out.println("stop method is called");
    }

    public static void main(String args[]){
        Phone obj = new Phone();
        Camera obj1 = new SmartPhone();
        MusicPlayer obj2 = new SmartPhone();
            obj1.click();
            obj1.record();
            obj2.play();
            obj2.stop();
            obj.call();
            obj.sms();
    }
}
