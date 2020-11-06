package e42;

class Person implements Owner {
    private final String id;
    private final String name;
    private final String surname;

    public Person(String id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name + " " + surname;
    }
}
