package proxypattern;

public class ProxyPatternTest {
	public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // Image will be loaded from disk and displayed
        image1.display();

        // Image is already loaded, so just display it
        image1.display();

        // Image will be loaded from disk and displayed
        image2.display();
    }

}