package pl.codegym.task.task15.task1522;

public class Moon implements Planet{

    private static Moon instance = null;

    private Moon(){
        if (instance != null){
            throw new RuntimeException("Not allowed. Please use getInstance() method");
        }
    }

    public static Moon getInstance() {

        if (instance == null) {
            instance = new Moon();
        }
        return instance;
    }
}
