//access modifiers
/*
 private default protected public
 */

// this: this keyword is used to refer to the current object

//FOUR PILLARS OF OOPS
//1.Encapsulation- the wrapping up of data and methods under a single unit.It also implements data hiding

/*
Constructors
    its a special method which is invoked automatically at the time of object creation
    have the same name as the class or structure
    don't have a return type (not even void)
    are only called once, at object creation
    memory allocation happend when constructore is called 

    __in constructor overloading the concepts cames the Polymorphism__

Types
Non-parameterized
Parameterized
--Copy constructor   
  --shallow copy -> where copy object  references to the original object     - 1st object and 2nd object is pointing to1st (reference to 1st one)
  --deep copy  -> where new object is created for the copy one  - 1st object and 2nd object makes same copy of 1st but donot reference to it


Destrcutors             its automatic so CHILLL
__Garbage collector__ where all the unwanted var function the any other things and throw in this collector
 */

/*
//2.Inheritance
    When properties and methods of base class are passed on to a derived class
Types  --
    .Single level
    .Multilevel     base--child(base1)-child of base1
    .Hierarchial    one base class and multiple childs 
    .Hybrid         -- combo of all types AHAHAH😂😂
    .Multiple (not in Java) two three bases and one child class inherit from them
 */

/*
//3.Polymorphism achive one thing in multiple forms
-Compile Time poly (static)
    .Method Overloading
    Multiple fnc with same name but diff parameters


-Runtime poly   (dynamic)
    .Method Overriding
    Parent and child classes both contain the same fnc with a diff definiton

*/

/*
//4.Abstraction
Hiding all the unnecessary details and showing only the important parts to the user 

*/

// I

/*Interfaces        
        // also used for the implmenting the multiple inheritance   
        // but when 100% or __total abstraction__ we'r gonna do the Interfaces
    
    All methods are public, abstract and without implementation
    used to achieve total abstraction
    vars in interface are final, public and static
   
*/


/*
  //--------- STATIC KEYWORD -----------
         used to share the same va or methos of a given class
         -properties
         -fnc
         -blocks
         -nested classes
         */


public class Jan_8_9 {
    public static void main(String args[]) {
        
        /*
         Pen p1= new Pen();
         p1.setColor("white");
         p1.setTip(4);
         // p1.color="black";
         // p1.tip=33;
         // p1.print();
         System.out.println(p1.getColor());
         System.out.println(p1.getTip());
         
         // constructor
        // Student s1= new Student(44); //
        // System.out.println(s1.roll);

        // copy constructor
        Student s1 = new Student();
        s1.name = "Ola";
        s1.roll = 11;
        s1.pas = "Oala";
        s1.marks[0]=12;
        s1.marks[1]=1;
        s1.marks[2]=2;
        
        
        
        Student s2 = new Student(s1);
        //this marks array in s2 here doesn't copy the array of the s1, it just reference to the s1's array,     where i makes new own array (the copy one object) will be called deep copy
        s2.pas = "err";
        s1.marks[1]=34;
        
        // if shallow copy the changes will be seen and if deep copy no changes are seen
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
        */

        //---------- INHERITANCE -----------
        /*
         
        Fish mashi= new Fish();
        mashi.breathe();
        mashi.eat();
        mashi.swim();
        Dog paw= new Dog();
        paw.breed="kuta";
        paw.legs=6;
        paw.eat();
        System.out.println(paw.breed+" "+paw.legs);
        Mammals idk= new Mammals();
        Fish chini= new Fish();
        Bird chidi=new Bird();
        idk.walk();
        chini.swim();
        chidi.fly();
        */

        //--------------PLOYMORPHISM---------
        /*
        
        //method overloading
        Calc c= new Calc();
        System.out.println(c.sum(12, 02));
        System.out.println(c.sum((float)1.22, (float)2.23));  // before typecasting its taking these values in double
        System.out.println(c.sum(1, 02,55));
        
        //method overriding
        Suar s=new Suar();
        s.eat();
        */
        
        
        //--------------PACKAGES---------
        /* 
        Packages in Java -- Packages is a grp of similar types of classes,interfaces,and sub-packages.
        Types
        - Inbuilt
        - User Defined
        
        */
        
        //--------------ABSTRACTION---------
        /*
         Abstraction        --in mind doesn't exist
            Abstract classes
                .cannot create an instance of abstract class
                .can have abstract/non-abs methods
                .can have constructors


            // Interfaces    its just a blueprint of a class    
            
            //abstraction
            Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();

        // Al a = new Al();
        System.out.println(h.clr);
        System.out.println(c.clr);
        h.changeClr();
        c.changeClr();
        System.out.println(h.clr);
        System.out.println(c.clr);
        
        // Interfaces        
        // also used for the implmenting the multiple inheritance   
        // but when 100% or __total abstraction__ we'r gonna do the Interfaces
        Queen q= new Queen();
        q.moves();
        */

        //--------- STATIC KEYWORD -----------
        /*
         used to share the same va or methos of a given class
         -properties
         -fnc
         -blocks
         -nested classes

         Std s=new Std();
         s.schoolName="asd";
         
         Std ss=new Std();
         System.out.println(ss.schoolName);
         
        //  Std sss=new Std();
        //  sss.schoolName="ere";
         */

    //---------- SUPER KEYWORD -----------

        /*
         used to refer immediate parent class obj
            -to access parent's prpties
            -_  _   _   fncs
            -_  _   _   constructor
         */


        // NN n = new NN();

        // solving the questions are left..............................

    }
    
}

//---------- SUPER KEYWORD -----------
class HH{
    HH(){
        System.out.println("HH called>>>");
    }
}
class NN extends HH{
    NN(){
        super();
        System.out.println("NN called>>>");
    }

}



//---------- STATIC KEYWORD -----------
class Std{
    static int returnPerc(int mt,int phy,int chm){//bc this formaula will same to find the percentage even if the values are diff
        return (mt+phy+chm)/3;
    }
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    } 
    
    // void setRoll(int roll){
    //     this.roll=roll;
    // }
    // int getRoll(){
    //     return this.roll;
    // }

}



//---------- INTERFACE -----------
                    
interface ChessPlayer{
    void moves(); // by defualt public and abstract

}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("all directions");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up down left right");
    }
}


//---------- ABSTRACTION -----------

abstract class Al{
    String clr;
    Al(){
        clr="blue";
    }
    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Al{
    void changeClr(){
        clr="brown";
    }
    void walk(){
        System.out.println("Tugd tugd");
    }
}
class Chicken extends Al{
    void changeClr(){
        clr="white";
    }
    void walk(){
        System.out.println("Kukdu kuuuu");
    }
}





//---------- POLYMORPHISM -----------

//method overloading
class Calc{
    int sum(int a, int b){
        return a+b;
    }

    float sum(float a, float b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }
}   
//method overriding
class Janvar{
    void eat(){
        System.out.println("Main to Ghassss khata hoon");
    }
}
class Suar extends Janvar{
    void eat(){
        System.out.println("Main tan meet khanda");
    }
}







        //---------- INHERITANCE -----------

class Animal{  
    String color;
    void eat(){
        System.out.println("Eat fir repeat");
    }

    void breathe(){
        System.out.println("Sniffsssssss");
    }
}

// Multilevel
class Mammal extends Animal{
    int legs;
}

// Multilevel
class Dog extends Mammal{
    String breed;
}


class Fish extends Animal{  // also an single level, also hierarchial
    int fins;
    void swim(){
        System.out.println("fein fein fein");
    }
}

class Shark extends Fish{ //hybrid
    void dedleastCrt(){
        System.out.println("yumy yum");
    }
}

// hierarchial
class Bird extends Animal{
    void fly(){
        System.out.println("Panchi bnu udti phirun");
    }
}
class KingFisher extends Bird{    //hybrid
    void imBirdButSwim(){
        System.out.println("shzammmmmm");
    }
}

// hierarchial
class Mammals extends Animal{
    void walk(){
        System.out.println("Chale chlo");
    }
}



//----------------------------------------------------------------------------
class Student {
    int roll;
    String name;
    String pas;
    int marks[];
    
    // copy constructor and the shallow copy constructor
    // Student(Student s1) {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks=s1.marks;   
    // }
    //deep copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < 3; i++) {
        this.marks[i]=s1.marks[i];       
        }
    }

    // non-parameterized constructor
    Student() {
        marks = new int[3];
        System.out.println("WOrk done");
    }

    // parameterized constructor
    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }
    Student(String name) {
        marks = new int[3];
        this.name = name;
    }
}

class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String nC) {
        color = nC;
    }

    void setTip(int nT) {
        tip = nT;
    }

    void print() {
        System.out.println("The color is " + color + " and the tip is " + tip);
    }

}