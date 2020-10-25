package dto;

public class ExpectionLogToDB {
    private Integer id;
    private String expection_name;
    private String expection_parm;
    private String expection_adress;
    private String  expection_level;
    private String expection_runtime;


    @Override
    public String toString() {
        return "ExpectionLogToDB{" +
                "id=" + id +
                ", expection_name='" + expection_name + '\'' +
                ", expection_parm='" + expection_parm + '\'' +
                ", expection_adress='" + expection_adress + '\'' +
                ", expection_level='" + expection_level + '\'' +
                ", expection_runtime='" + expection_runtime + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExpection_name() {
        return expection_name;
    }

    public void setExpection_name(String expection_name) {
        this.expection_name = expection_name;
    }

    public String getExpection_parm() {
        return expection_parm;
    }

    public void setExpection_parm(String expection_parm) {
        this.expection_parm = expection_parm;
    }

    public String getExpection_adress() {
        return expection_adress;
    }

    public void setExpection_adress(String expection_adress) {
        this.expection_adress = expection_adress;
    }

    public String getExpection_level() {
        return expection_level;
    }

    public void setExpection_level(String expection_level) {
        this.expection_level = expection_level;
    }

    public String getExpection_runtime() {
        return expection_runtime;
    }

    public void setExpection_runtime(String expection_runtime) {
        this.expection_runtime = expection_runtime;
    }
}
