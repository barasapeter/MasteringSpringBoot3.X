class A {
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("This is class A!");
    }
}

class B extends A {
    @Override
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("This is class B!");
    }
}

class Demo {
    public static void main(String[] args) {
        B objB = new B();
        objB.showTheDataWhichBelongsToThisClass();

        A objA = new A();
        objA.showTheDataWhichBelongsToThisClass();
    }
}
