package Seminar2.Task2;

public abstract class Actor implements ActorBehavior {
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void setMakeOrder(){
        this.isMakeOrder= true;
    }
    @Override
    public void setTakeOrder(){
        this.isTakeOrder = true;
    }

}
