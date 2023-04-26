package _39_Day_Constructor_Overloading;



public class Odev_Pencil {

    public String color;
    public int length;
    public boolean haveEraser;


    public Odev_Pencil(){
    }

    public Odev_Pencil(String color){
        this.color=color;
    }


    public Odev_Pencil(String color, int length){
        this.color=color;
        this.length=length;
    }


    public Odev_Pencil(String color, int length, boolean haveEraser){
        this(color,length);
        this.haveEraser=haveEraser;
    }


    public void write(){
        System.out.println("Kalem " + color + " renk ile yaziyor");
    }

    public void delete() {
        if (haveEraser) {
            System.out.println("Silebilir.");
        } else {
            System.out.println("Silemez cunku silgisi yok");
        }
    }

    public String toString(){
        return "Kalem { rengi= "+color+", uzunlugu " +length+ ", silgisi var = " +haveEraser +" }" ;
    }


}

class PencilObjects{
    public static void main(String[] args) {

        Odev_Pencil pencil1= new Odev_Pencil() {};


        pencil1.color="Siyah";
        pencil1.length=17;
        pencil1.haveEraser=true;
        System.out.println("pencil1 = " + pencil1);
        pencil1.delete();
        pencil1.write();

    }




}
