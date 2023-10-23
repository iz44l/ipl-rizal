class StandardCinema extends Cinema {
    public StandardCinema(Double price) {
        this.price = price;
    }

    Double calculateAdminFee() {
        return price * 10 / 100;
    }
}