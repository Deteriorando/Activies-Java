package ClassesPacks;

public class Users {
    protected String name;
    protected String password;

    public Users(String name, String password){
        this.name = name;
        this.password = password;
    }

    public String getName(){
        return this.name;
    }

    public String getPassword(){
        return this.password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String Password){
        this.password = Password;
    }

}

    
