public class Notepad {
    private String name;
    private String date;
    private String information;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public Notepad(String name, String date, String information) {
        this.name = name;
        this.date = date;
        this.information = information;
    }
}
