package src.factorymethod;

public class Carrito {
    private String color;
    private String marca;
    private long numpuertas;


    public Carrito(String color, String marca, long numpuertas) {
        this.color = color;
        this.marca = marca;
        this.numpuertas = numpuertas;
    }


    public static CarritoBuilder factorymethod() {
        return new CarritoBuilder();
    }

    @Override
    public String toString() {
        return "Carrito{" +
                "Color ='" + color + '\'' +
                ", marca =" + marca + '\'' +
                ", numpuertas =" + numpuertas +
                '}';
    }

    public static class CarritoBuilder {

        private String color;
        private String marca;
        private long numpuertas;

        public CarritoBuilder color(String color) {
            this.color = color;
            return this;
        }

        public CarritoBuilder marca(String marca) {
            this.marca = marca;
            return this;
        }

        public CarritoBuilder numpuertas(long numpuertas) {
            this.numpuertas = numpuertas;
            return this;
        }


        public Carrito factorymethod() {
            return new Carrito(color, marca, numpuertas);
        }
    }

}
