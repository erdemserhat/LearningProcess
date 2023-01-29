package overridingExamplefortoString;

class MathematicalProcesses{
  public int calculatePerimeter(int side){ //Kare için Çevre
        return side*4;
    }
    public int calculatePerimeter(int side1, int side2){ //Dikdörtgen için Çevre
        return 2*(side1+side2);
    }
        
    public int calculatePerimeter(int side1, int side2, int side3){ //Üçgen için Çevre
        return side1+side2+side3;
    }
}
class Calculator extends MathematicalProcesses{

    
    public int calculateArea(int side){
        return side*side;
    }
    
    public int calculateArea(int side1, int side2){
        return side1*side2;
    }
    
    public double calculateArea(int side1, int side2,int side3){
        double u = (side1+side2+side3)/2;
        return Math.sqrt(u*(u-side1)*(u-side2)*(u-side3));
    }
    
    
    @Override
    public int calculatePerimeter(int side1, int side2, int side3) {
        return super.calculatePerimeter(side1, side2, side3);
    }

    @Override
    public int calculatePerimeter(int side1, int side2) {
        return super.calculatePerimeter(side1, side2);
    }

    @Override
    public int calculatePerimeter(int side) {
        return super.calculatePerimeter(side);
    }
}

public class MathemeticalProcesses {
    public static void main(String[] args) {
        
        Calculator calculator = new Calculator();
        
        System.out.println("Kenar uzunluğu 3 olan kare çevresi : "+calculator.calculatePerimeter(3));
        System.out.println("Kenar uzunlukları 5 ve 6 olan dikdörtgen çevresi : "+calculator.calculatePerimeter(5, 6));
        System.out.println("Kenar uzunluğu 5 olan kare alanı : "+calculator.calculateArea(5));
        System.out.println("Kenarları 3,4,5 olan üçgen alanı : "+calculator.calculateArea(3, 4, 5));
    } 
} 