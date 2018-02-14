package observableProgramming;

import java.util.Observable;
import java.util.Observer;

/**
 * @author 212607214
 * @Date 2/11/2018
 */
public class TextObserver implements Observer
{
    private ObservableValue ov = null;
    public TextObserver(ObservableValue ov)
    {
        this.ov = ov;
    }
    public void update(Observable obs, Object obj)
    {
        if (obs == ov)
        {
            System.out.println(ov.getValue());
        }
    }
}
