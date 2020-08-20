public class variables {
    // this will always be in private cuz imagine you are making it for the world
    // Principles, its always prefered that a class variables are private, private> protected >public
    // private, onlly methods inside the class can change it 
    // protected, only classes within a the classes package can change it, research packages
    // public can be changed by any class doesnt matter the type
    // make a basic calculator
    // DRY---do not repeat yourself
    //   --essentially when you code things
    private int x;
    private int y;

    /*constructor, here is to initialise instructions so when called 
    so anythng you want done when you initialise the code */
    variables(int newX, int newY){
        setX(newX);
        setY(newY);

    }
    // setters or mutators, they dont return anything so they are set to void
    //    --they prefferred to be either protected or private
    //    --they are used to initialise values
    //    -- bld blk

    private void setX(int newX){
        this.x = newX;
    }

    private void setY(int newY){
        this.y = newY;
    }


    // getters or accessors, returns the pure values
    //   --usually public, no generalised prefs
    //   --bld blk

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }
    // 



}
