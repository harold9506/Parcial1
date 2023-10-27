package src.factorymethod;

public interface Juguete {

    Juguete clone();

    int getid();

    int getnumpuertas();

    void setid(int id);
}
