// Types of Inheritance in JAVA

class animals {
    void eat() {
        System.out.println("All animals eat");
    }
}
class birds extends animals {   //Single Level Inheritence
    void eat() {
        super.eat();
        System.out.println("Birds eat as well");
    }
}
class crow extends birds {  //Multi Level Inheritence
    void colour() {
        super.eat();
        System.out.println("Crow's Colour is Black");
    }
}
class insects extends animals { //Hierarcheal Inheritance
    void eat() {
        super.eat();
        System.out.println("Insects eat as well as get eaten");
    }
}
class test3 {
    public static void main(String[] args) {
        System.out.println("Crow Class ~ Multi Level Inheritance");
        crow c = new crow();
        c.colour();
        System.out.println("Insects Class ~ Hierarcheal Inheritance");
        insects i = new insects();
        i.eat();
    }
}
/* Output
PS D:\Projects\oops-lab\Cycle Test 1> java test3
Crow Class ~ Multi Level Inheritance
All animals eat
Birds eat as well
Crow's Colour is Black
Insects Class ~ Hierarcheal Inheritance
All animals eat
Insects eat as well as get eaten
PS D:\Projects\oops-lab\Cycle Test 1> 
 */