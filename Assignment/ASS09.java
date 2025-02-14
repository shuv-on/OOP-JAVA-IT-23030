class Animal {
    public void displayInfo() {
        System.out.println("This is an animal.");
    }
}

class Dog extends Animal {
    @Override
    public void displayInfo() {
        System.out.println("This is a dog.");
    }
}

class ASS09 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.displayInfo();
    }
}
