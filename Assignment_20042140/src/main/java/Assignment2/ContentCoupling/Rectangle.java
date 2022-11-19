package Assignment2.ContentCoupling;

public class Rectangle {
    int length = 10;
    int breadth = 5;
    int area;
    void ChangeLength(int length) {
        this.length = length;
    }
    int getLength(){return this.length;}
    int getBreadth(){return this.breadth;}
    int getArea() {
        return getLength() * getBreadth();
    }
}

//Here the getArea method is dependend on the getLength and getBreadth and the length
//        is depended on ChangeLength