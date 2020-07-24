package eg00235;

public interface ShoppingCartVisitor {
	public double visit(Book book);
	public double visit(Fruit fruit);
}
