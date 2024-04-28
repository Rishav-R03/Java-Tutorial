interface Person {
    void displayName();
    void displayAge();
}

class PersonImpl implements Person {
    @Override
    public void displayName() {
        System.out.println("Rishav");
    }

    @Override
    public void displayAge() {
        System.out.println("21");
    }
}

public class Interface {
    public static void main(String[] args) {
        Person ob = new PersonImpl();
        ob.displayName();
        ob.displayAge();
    }
}
