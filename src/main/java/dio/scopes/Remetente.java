package dio.scopes;

public class Remetente {
    private String email;
    private String name;

    public void setEmail(String email) {
        this.email = email;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "{\"name\":"+name +
                        ",\"email\":"+ email+"}";
    }
}
