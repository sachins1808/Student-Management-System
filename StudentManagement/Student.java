class Student extends Person {

    private int id;
    private long contact;
    private Address address;

    public Student(String name, int age, int id,
                   long contact, Address address) {

        super(name, age);

        this.id = id;
        this.contact = contact;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public Address getAddress() {
        return address;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public void details() {

        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("ID: " + id);
        System.out.println("City: " + address.getCity());
        System.out.println("State: " + address.getState());
        System.out.println("--------------------------------");
    }
}
