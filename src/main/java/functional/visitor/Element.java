package functional.visitor;

public abstract class Element {

    private String uuid;

    protected Element(String uuid) {
        this.uuid = uuid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public abstract void accept(Visitor v);

}
