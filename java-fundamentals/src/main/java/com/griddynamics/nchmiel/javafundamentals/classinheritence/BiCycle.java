package com.griddynamics.nchmiel.javafundamentals.classinheritence;

class BiCycle{ //superclass parent
    String define_me(){
        return "a vehicle with pedals.";
    }
}

class MotorCycle extends BiCycle{ //subclass (child
    String define_me(){
        return "a cycle with an engine.";
    }

    MotorCycle(){
        System.out.println("Hello I am a motorcycle, I am "+ define_me());

        String temp = super.define_me(); //solution
//        String temp=define_me(); //Fix this line
        System.out.println("My ancestor is a cycle who is "+ temp );
    }

}
class MySolution{
    public static void main(String []args){
        MotorCycle M=new MotorCycle();
    }
}
