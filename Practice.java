/**
 * Practice
 */

 class Animal{
    String name;
    static int totalNoOfAnimal = 0;
    static int totalTypeOfAnimal = 0;
    static int totalLegOfAnimal = 0;

    public void printDetails(){
        System.out.println("----Anmial Information----");
        System.out.println("Total no of animal : "+totalNoOfAnimal);
        System.out.println("Total Type of animal : "+totalTypeOfAnimal);
        System.out.println("Total no leg of of animal : "+totalLegOfAnimal);
    }
 }

 class Lion extends Animal{
    final int leg = 4;
    static int totalNoOfLion = 0;
    Lion(){  
        super.name = "Lion";
        totalNoOfAnimal += 1;
        totalNoOfLion += 1;
        if (totalNoOfLion == 1){
            totalTypeOfAnimal++;
        }
       
        totalLegOfAnimal += leg;
    }
    public void printDetails(){
        super.printDetails();
        System.out.println("----Lion-----");
        System.out.println("Name: "+this.name);
        System.out.println("Total  Lion : "+totalNoOfLion);
    }
 }

 class Tiger extends Animal{
    final int leg = 4;
    static int totalNoOfTiger = 0;
    Tiger(){
        super.name = "Tiger";
        totalNoOfAnimal += 1;
        totalNoOfTiger += 1;
        if (totalNoOfTiger == 1){
            totalTypeOfAnimal++;
        }
        totalLegOfAnimal += leg;
    }
    public void printDetails(){
        super.printDetails();
        System.out.println("----Tiger-----");
        System.out.println("Name: "+this.name);
        System.out.println("Total  Lion : "+totalNoOfTiger);
    }
    
 }
public class Practice {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        Lion l = new Lion();
        Lion l2 = new Lion();
        t.printDetails();
        l.printDetails();
        l2.printDetails();
        
    }
    
}