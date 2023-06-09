package databases.com;

public class products {
        private int id;
        private int seller;
        private String title;
        private String description;
        private String price;
        private int stock;

        public products() {
            super();
        }

        public products(int id, int seller, String title, String description, String price, int stock) {
            this.id = id;
            this.seller = seller;
            this.title = title;
            this.description = description;
            this.price = price;
            this.stock = stock;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getSeller() {
            return seller;
        }

        public void setSeller(int seller) {
            this.seller = seller;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public int getStock() {
            return stock;
        }

        public void setStock(int stock) {
            this.stock = stock;
        }
    }

