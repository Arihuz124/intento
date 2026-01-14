package bank;
class Customer {
    public final String id;
    public final Profile profile;
    Customer(String id, Profile profile) {
        this.id = id;
        this.profile = profile;
    }
    String getId() { return id; }
    Profile getProfile() { return profile; }
}