package src.factorymethod;

public class Peluche implements Juguete{
    private int id;
    private static String materialexterior;
    private static String relleno;
    private static String color;



    public Peluche(int id,String materialexterior, String relleno, String color) {
        this.id = id;
        Peluche.materialexterior = materialexterior;
        Peluche.relleno = relleno;
        Peluche.color = color;
    }

   public Peluche(Peluche peluche) {
        materialexterior = Peluche.materialexterior;
        relleno = Peluche.relleno;
        color = Peluche.color;
    }



    public static PelucheBuilder builder() {
        return new PelucheBuilder();
    }


    @Override
    public String toString() {
        return "Peluche{" +
                "id = " + id + '\'' +
                ", material exterior='" + materialexterior + '\'' +
                ", relleno =" + relleno + '\'' +
                ", color =" + color +
                '}';
    }


    @Override
    public Peluche clone() {
        return new Peluche(this);
    }

    @Override
    public int getid() {
        return id;
    }

    @Override
    public void setid(int id) {
        this.id = id;
    }


    public static class PelucheBuilder {

       private int id;
        private String materialexterior;
        private String relleno;
        private String color;

        public PelucheBuilder id(int id) {
            this.id = id;
            return this;
        }

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



        public Peluche build() {
            return new Peluche(id,materialexterior, relleno, color);
        }
    }

}
