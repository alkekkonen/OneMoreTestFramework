package patterns.factory;

public class Factory {

    public Client getClient(String currentOS) {

        if ("win".equals(currentOS))
            return new ClientWindowsImplementation();

        else if ("mac".equals(currentOS))
            return new ClientMacImplementation();

        else if ("lin".equals(currentOS))
            return new ClientLinuxImplementation();

        return null;

    }

}
