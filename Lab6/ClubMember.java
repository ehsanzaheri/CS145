class ClubMember {
    int id;
    String firstName, lastName, address, city;

    ClubMember(int id, String firstName, String lastName, String address, String city) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
    }

    public String toString() {
        return "ID: " + id + ", " + firstName + " " + lastName + ", " + address + ", " + city;
    }
}

