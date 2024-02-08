package pl.codegym.task.task15.task1522;

public class Earth implements Planet{

    private static Earth instance = null;

    private Earth(){
        if (instance != null){
            throw new RuntimeException("Not allowed. Please use getInstance() method");
        }
    }

    public static Earth getInstance(){
        if (instance == null){
            instance = new Earth();
        }
        return instance;
    }
}
