public class Books extends Product {
    private String AuthorName;
    private int ISBNNumber;
    
    public Books(int ProductId, String ProductName, double Price, String Description, String AuthorName, int ISBNNumber) {
        super(ProductId, ProductName, Price, Description);
        this.AuthorName = AuthorName;
        this.ISBNNumber = ISBNNumber;
    }
    public String getAuthorName() {
        return AuthorName;
    }
    public void setAuthorName(String AuthorName) {
        this.AuthorName = AuthorName;
    }
    public int getISBNNumber() {
        return ISBNNumber;
    }
    public void setISBNNumber(int ISBNNumber) {
        this.ISBNNumber = ISBNNumber;
    }
    @Override
    public String toString() {
        return super.toString() + " Books{" +
        "AuthorName='" + AuthorName + '\'' +
        ", ISBNNumber='" + ISBNNumber + '\'' +
        '}';
    }
}
