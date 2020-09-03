package web.config.model;

public class Car {

    private String mark;
    private int number;
    private String model;

    public Car(){

    }

    public Car(String mark,int number, String model){
        this.setMark(mark);
        this.setNumber(number);
        this.setModel(model);
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
