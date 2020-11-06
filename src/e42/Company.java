package e42;

class Company implements Owner {
    private final String vatNumber;
    private final String corporateName;

    public Company(String vatNumber, String corporateName) {
        this.vatNumber = vatNumber;
        this.corporateName = corporateName;
    }

    @Override
    public String getId() {
        return vatNumber;
    }

    @Override
    public String getName() {
        return corporateName;
    }
}

