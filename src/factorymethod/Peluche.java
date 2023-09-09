package src.factorymethod;

public class Peluche {
    private String materialexterior;
    private String relleno;
    private String color;


    public Peluche(String materialexterior, String relleno, String color) {
        this.materialexterior = materialexterior;
        this.relleno = relleno;
        this.color = color;
    }


    public static PelucheBuilder factorymethod() {
        return new PelucheBuilder();
    }

    @Override
    public String toString() {
        return "Peluche{" +
                "material exterior='" + materialexterior + '\'' +
                ", relleno =" + relleno + '\'' +
                ", color =" + color +
                '}';
    }

    public static class PelucheBuilder {

        private String materialexterior;
        private String relleno;
        private String color;

        public PelucheBuilder materialexterior(String materialexterior) {
            this.materialexterior = materialexterior;
            return this;
        }

        public PelucheBuilder relleno(String relleno) {
            this.relleno = relleno;
            return this;
        }

        public PelucheBuilder color(String color) {
            this.color = color;
            return this;
        }


        public Peluche factorymethod() {
            return new Peluche(materialexterior, relleno, color);
        }
    }

}
