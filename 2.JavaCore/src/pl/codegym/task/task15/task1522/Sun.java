package pl.codegym.task.task15.task1522;

public class Sun implements Planet{

    private static Sun instance = null;

    private Sun(){
        if (instance != null){
            throw new RuntimeException("Not allowed. Please use getInstance() method");
        }
    }

    public static Sun getInstance(){
        if (instance == null){
            instance = new Sun();
        }
        return instance;
    }
}
