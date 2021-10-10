package 动物声音模拟器;

abstract class Animal{
    abstract void cry();
    abstract String getname();
}

class dog extends Animal{
    void cry(){
        System.out.println("汪!汪汪!");
    }
    String getname(){
        return"狗";
    }
}

class cat extends Animal{
    void cry(){
        System.out.println("喵!喵喵!");
    }
    String getname(){
        return"猫";
    }
}

class Simulator{
    void Playsound(Animal animal){
        System.out.println(animal.getname());
        animal.cry();
    }
}


