
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    // instance variables - replace the example below with your own

    private stateEnums State;

  
    /**
     * Constructor for objects of class Main
     */
    public Main(){
        State = StateSelector.getState();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void main()
    {
        while(StateSelector.getActive()){

        }
        while(StateSelector.getActive_F1()){
            
        }
        while(StateSelector.getActive_F2()){

        }
        while(StateSelector.getActive_F3()){

        }
        while(StateSelector.getActive_F4()){
            
        }
        while(StateSelector.getBrowse()){
            browseState.main();
        }
        while(StateSelector.getYoutube()){

        }

    }
}
