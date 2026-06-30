package Builder_Pattern;


public class Product {
    private String name;
    private  int id;
    private String email;
    private String product;
    Product(Builder bld){
        this.email= bld.email;
        this.id= bld.id;
        this.name= bld.name;
        this.product=bld.product;
    }
    @Override
    public String toString(){
        return "name= " + name + '\'' + ", id=" + id + ", email= " + email + '\'' + ", product= " + product ;
    }

    public static class Builder {
        private String name;
        private int id;
        private String email;
        private String product;

        public Builder setProduct(String product) {
            this.product = product;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }

    public static void main(String[] args) {
       Product p=new Product.Builder().setEmail("anashva@gmail.com").build();

    }
}
