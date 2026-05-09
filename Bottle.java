class Bottle {
    String brand;
    String colour;
    int volume;
    
    int currentVolume=0;
    boolean isEmpty = true;
    boolean isFull = false;
    boolean isOpen = false;
    boolean isClosed = true;
    
    Bottle(String brand, String colour, int volume) {
        this.brand = brand;
        this.colour = colour;
        this.volume = volume;
    }
    
    public void openCap(){
        System.out.println("Opening cap");
        this.isOpen=true;
        this.isClosed=false;
    }
    public void closeCap(){
        System.out.println("Closing cap");
        this.isClosed=true;
        this.isOpen=false;
    }
    public void drink(int consumed){
        System.out.println("Drinking"+consumed+"ml of water");
        this.currentVolume-=consumed;
        if(this.currentVolume<=0)
            this.isEmpty=true;
        if(this.currentVolume!=this.volume)
            this.isFull=false;
    }
    public void fillWater(int volume){
        System.out.println("Filling"+volume+"ml of water");
        this.currentVolume+=volume;
        if(this.currentVolume==this.volume){
            this.isFull=true;
        }
        if(volume>0){
            this.isEmpty=false;
        }
    }
    public void display(){
        System.out.printf("%s,%s,%d,%d,%b,%b,%b,%b\n",this.brand,this.colour,this.volume,this.currentVolume,this.isFull,this.isEmpty,this.isOpen,this.isClosed);
    }
}
class Main {
    public static void main(String[]args){
        Bottle Milton=new Bottle("Milton","BLack",750);
        Milton.display();
        Milton.openCap();
        Milton.display();
        Milton.fillWater(100);
        Milton.display();
        Milton.drink(50);
        Milton.fillWater(700);
        Milton.display();
        Milton.drink(750);
        Milton.display();
        Milton.closeCap();
        Milton.display();
    }
}
