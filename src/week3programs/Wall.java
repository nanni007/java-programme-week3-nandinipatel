package week3programs;
//Write a class with the name Wall. The class needs two fields (instance variables) with name width
//and height of type double.
public class Wall {
double width;
double height;
public Wall(){

}
public Wall(double width,double height){
    this.width=width;
    this.height=height;

}
public double getWidth(){
    return width;
}
public double getHeight(){
    return height;
}
public double setWidth(double width1){
    if(width1<0){
        width=0;
    }
    return width=width1;
}
public double setHeight(double height1){
    if (height1<0){
        height1=0;
    }
    return height=height1;
}
public double getArea(){
    double area = height*width;
    return area;
}

    public static void main(String[] args) {
        Wall wall = new Wall (5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}
