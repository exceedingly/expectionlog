package expectionlog;

public class ExpectionLog {

    private Object[] objects=null;
    private int ExpectionLog_Level = 0;
    private String ExpectionLog_adress = null ;
    public ExpectionLog(){

    }
    private void setAllParm(Object ... objects){
        this.objects =objects;
    }
    private void setExpectionLevel(int ExpectionLog_Level){
        this.ExpectionLog_Level = ExpectionLog_Level;
    }

    private void setExpectionAdress (String ExpectionAdress){
        this.ExpectionLog_adress =ExpectionAdress;
    }

    private int commit(){
        return 0;
    }

}
