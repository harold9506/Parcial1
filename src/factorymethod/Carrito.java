package src.factorymethod;

public class Carrito implements Juguete{
    private int id;
    private static String color;
    private static String marca;
    private static int numpuertas;


    public Carrito(int id,String color, String marca, int numpuertas) {
        this.id = id;
        Carrito.color = color;
        Carrito.marca = marca;
        Carrito.numpuertas = numpuertas;
    }

    public Carrito(Carrito carrito) {
        color = Carrito.color;
        marca = Carrito.marca;
        numpuertas = Carrito.numpuertas;
    }

    public static CarritoBuilder builder() {
        return new CarritoBuilder();
    }

    @Override
    public String toString() {
        return "Carrito{" +
               "id = " + id + '\'' +
                ", Color ='" + color + '\'' +
                ", marca =" + marca + '\'' +
                ", numpuertas =" + numpuertas +
                '}';
    }


    @Override
    public Carrito clone() {

        return new Carrito(this);
    }

    @Override
    public int getid() {
        return id;
    }

    @Override
    public int getnumpuertas() {
        return numpuertas;
    }

    @Override
    public void setid(int id) {
        this.id = id;
    }

    public static class CarritoBuilder {

        private int id;
        private String color;
        private String marca;
        private int numpuertas;

        public CarritoBuilder id(int id) {
            this.id = id;
            return this;
        }

        public CarritoBuilder color(String color) {
            this.color = color;
            return this;
        }

        public CarritoBuilder marca(String marca) {
            this.marca = marca;
            return this;
        }

        public CarritoBuilder numpuertas(int numpuertas) {
            this.numpuertas = numpuertas;
            return this;
        }

        public int getid() {
            return id;
        }

        public Carrito build() {
            return new Carrito(id,color, marca, numpuertas);
        }
    }

}
