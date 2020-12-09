package com.ISI;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Set;

public interface Service{

    public Set<String > noDuplicate(List<String> fullWithDuplicate);
}
