class order {
    
    String dishName;
    double dishPrice;

    // Character method
    public void sayTheDish() {
        System.out.println("a1 " + dishName + " " + dishPrice);
    }

    // Constructor
    public order(String dN, double dP) {
        dishName = dN;
        dishPrice = dP;
    }
}
