
/**
 * Write a description of class StateSelector here.
 *
 * @author Julian Baker
 * @version 1.0
 */
public class StateSelector
{

    //public StateSelector(StateEnums s){
    //    this.CurrentState = s;

    //}

    public static stateEnums currentState;
    public static boolean Active;
    public static boolean Dormant;
    public static boolean Active_F1;
    public static boolean Active_F2;
    public static boolean Active_F3;
    public static boolean Active_F4;
    public static boolean Browse;
    public static boolean Youtube;

    public StateSelector(){
        // initialise instance variables
        String[]State = {"DORMANT, ACTIVE, ACTIVE_F1, ACTIVE_F2, ACTIVE_F3, ACTIVE_F4, BROWSE, YOUTUBE"};
        boolean Active = false;
        boolean Dormant = true;
        boolean Active_F1 = false;
        boolean Active_F2 = false;
        boolean Active_F3 = false;
        boolean Active_F4 = false;
        boolean Browse = false;
        boolean Youtube = false;
    }

    public void chooseState() {
        switch (currentState) {
            case ACTIVE:
            System.out.println("Glove is Currently Active, ready to choose a mode.");
            statesFalse();
            Active = true;
            break;

            case ACTIVE_F1:
            System.out.println("Glove is Currently in the f1 mode, select your character now.");
            statesFalse();
            Active_F1 = true;
            break;

            case ACTIVE_F2:
            System.out.println("Glove is Currently in the f2 mode, select your character now.");
            statesFalse();
            Active_F2 = true;
            break;

            case ACTIVE_F3:
            System.out.println("Glove is Currently in the f3 mode, select your character now.");
            statesFalse();
            Active_F3 = true;
            break;

            case ACTIVE_F4:
            System.out.println("Glove is Currently in the f4 mode, select your character now.");
            statesFalse();
            Active_F4 = true;
            break;

            case BROWSE:
            System.out.println("Glove is Currently in Browsing mode.");
            statesFalse();
            Browse = true;
            break;

            case YOUTUBE:
            System.out.println("Glove is Currently in Youtube Mode.");
            statesFalse();
            Youtube = true;
            break;

            case DORMANT:
            System.out.println("Glove is Currently Dorment");
            statesFalse();
            Dormant = true;
            break;

            default:
            System.out.println("Midweek days are so-so.");
            statesFalse();
            break;
        }
    }

    public static stateEnums getState(){
        return currentState;
    }

    public void resetStates(){
        boolean Active = false;
        boolean Dormant = true;
        boolean Active_F1 = false;
        boolean Active_F2 = false;
        boolean Active_F3 = false;
        boolean Active_F4 = false;
        boolean Browse = false;
        boolean Youtube = false;

    }

    public void statesFalse(){
        boolean Active = false;
        boolean Dormant = false;
        boolean Active_F1 = false;
        boolean Active_F2 = false;
        boolean Active_F3 = false;
        boolean Active_F4 = false;
        boolean Browse = false;
        boolean Youtube = false;
    }

    public static boolean getActive(){
        return Active;
    }

    public static boolean getActive_F1(){
        return Active_F1;
    }

    public static boolean getActive_F2(){
        return Active_F2;
    }

    public static boolean getActive_F3(){
        return Active_F3;
    }

    public static boolean getActive_F4(){
        return Active_F4;
    }

    public static boolean getBrowse(){
        return Browse;
    }

    public static boolean getYoutube(){
        return Youtube;
    }
}
