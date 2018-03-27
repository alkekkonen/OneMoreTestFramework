package patterns.factory;

public class ClientLinuxImplementation implements Client{

    @Override
    public String getOS() {
        return "Linux Ubuntu";
    }

}
