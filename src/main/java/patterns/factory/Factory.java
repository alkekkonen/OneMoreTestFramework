package patterns.factory;

import com.sun.istack.internal.Nullable;

public class Factory {

    @Nullable
    public Client getClient(final String currentOS) {

        if ("win".equals(currentOS))
            return new ClientWindowsImplementation();

        else if ("lin".equals(currentOS))
            return new ClientLinuxImplementation();

        else if ("mac".equals(currentOS))
            return new ClientMacImplementation();

        return null;

    }

}
