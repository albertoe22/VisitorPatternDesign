
// All of the products that you can purchase, visitor interface
public interface Visitor {
	double visit(MobilePhone p);
	double visit(Laptop l);
	double visit(VideoGame v);
}
