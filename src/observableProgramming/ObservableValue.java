package observableProgramming;

import java.util.Observable;

/**
 * @author 212607214
 * @Date 2/11/2018
 */
public class ObservableValue extends Observable
{
    private int n = 0;
    public ObservableValue(int n)
    {
        this.n = n;
    }

    public void setValue(int n)
    {
        this.n = n;
        setChanged();
        notifyObservers();
    }

    public int getValue()
    {
        return n;
    }
}
