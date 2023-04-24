class Animal{

public String name;

public Animal(String name){
//this.type = type;
this.name = name;
}

public void eat(){
System.out.println("Animal is eating");
}

public void sleep(){
System.out.println("Animal is sleeping");
}

}


class Bird extends Animal{

public String birdName;

public Bird(String name, String birdName){
//super(type);
super(name);
this.birdName = birdName;
}

public void eat(){
System.out.println("Brid is eating");
}

public void sleep(){
System.out.println("Bird is sleeping");
}

public void fly(){
System.out.println("Bird is Flying");
}

}

class Mammal extends Animal{

public String mammalName;

public Mammal(String name, String mammalName){
//super(type);
super(name);
this.mammalName = mammalName;
}

public void eat(){
System.out.println("Mammal is eating");
}

public void sleep(){
System.out.println("Mammal is Sleeping");
}

public void walk(){
System.out.println("Mammal is walking");
}

public void speak(){
System.out.println("Mammal is speaking");
}

}

class Reptile extends Animal{

public String reptileName;

public Reptile(String name, String reptileName){
super(name);
this.reptileName = reptileName;
}

public void eat(){
System.out.println("Reptile is eating");
}


public void sleep(){
System.out.println("Reptile is sleeping");
}

public void crawl(){
System.out.println("Reptile is crawling");
}

}


class ZooKeeper{

public String ZooKeeperName;
public Animal animal;

public ZooKeeper(String ZooKeeperName){
this.ZooKeeperName = ZooKeeperName;
}

public void feedAnimal(Animal animal){
System.out.println("ZooKeeper is Feeding "+animal.name);
}

}


class Zoo{

public static void main(String[] args){

//Animal animal = new Animal();

Bird bird = new Bird("Bird", "Parrot");
bird.eat();
bird.sleep();
bird.fly();

Mammal mammal = new Mammal("Mammal", "Human Being");
mammal.eat();
mammal.sleep();
mammal.walk();
mammal.speak();

Reptile reptile = new Reptile("Reptile", "Snake");
reptile.crawl();
reptile.eat();
reptile.sleep();

ZooKeeper zk = new ZooKeeper("Swamy");
zk.feedAnimal(bird);
zk.feedAnimal(mammal);
zk.feedAnimal(reptile);
}
}


