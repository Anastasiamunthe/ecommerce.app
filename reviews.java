package databases.com;

public class reviews {
        private int id;
        private int order;
        private int star;
        private String description;

        public reviews() {
            super();
        }

        public reviews(int id, int order, int star, String description) {
            this.id = id;
            this.order = order;
            this.star = star;
            this.description = description;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getOrder() {
            return order;
        }

        public void setOrder(int order) {
            this.order = order;
        }

        public int getStar() {
            return star;
        }

        public void setStar(int star) {
            this.star = star;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

