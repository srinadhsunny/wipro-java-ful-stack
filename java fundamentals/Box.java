class Box{
    double length;
    double width;
    double height;
    Box(double length,double width,double height){
        this.length = length;
        this.width=width;
        this.height=height;
    }
    double volume(){
        return length*width*height;
    }

}
Boxweight extends Box{
    double weight;
     Boxweight(double length,double width,double height){
        super(length,width,height);
        this.weight=weight;

    }
    double Showdetails(){
        System.out.println("length:"+length);
        System.out.println("width:"+width);
        System.out.println("height:"+height);
        System.out.println("volume:"+volume());
        System.out.println("weight:"+weight);




    }


}

class TestBox {
    public static void main(String[] args) {
        Box box = new Box(10, 20, 15);
        System.out.println("Volume of Box: " + box.volume());
        BoxWeight boxWeight = new BoxWeight(10, 20, 15, 34.5);
        BoxWeight.showDetails();
    }
}
