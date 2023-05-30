package databases.com;

public class orders {
        private int id;
        private int buyer;
        private int note;
        private int total;
        private int discount;
        private boolean isPaid;

        public orders() {
            super();
        }

        public orders(int id, int buyer, int note, int total, int discount, boolean isPaid) {
            this.id = id;
            this.buyer = buyer;
            this.note = note;
            this.total = total;
            this.discount = discount;
            this.isPaid = isPaid;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getBuyer() {
            return buyer;
        }

        public void setBuyer(int buyer) {
            this.buyer = buyer;
        }

        public int getNote() {
            return note;
        }

        public void setNote(int note) {
            this.note = note;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public int getDiscount() {
            return discount;
        }

        public void setDiscount(int discount) {
            this.discount = discount;
        }

        public boolean isPaid() {
            return isPaid;
        }

        public void setPaid(boolean paid) {
            isPaid = paid;
        }
    }


