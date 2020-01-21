import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Shop {

    List <Product> productsList = new ArrayList <Product>();

    public void addProduct (Product newProduct) {
        if (!productsList.stream().anyMatch(o -> o.getId() == newProduct.getId())) {
            productsList.add(newProduct);
            System.out.println("Продукт успешно добавлен!\n");
        } else {
            System.out.println("Продукт с таким id уже существует.\n");
        }
    }

    public List getProducts () {
        return productsList;
    }

    public void deleteProduct (int id) {
        if (productsList.stream().anyMatch(o -> o.getId() == id)) {
            Collection <Product> products = getProducts();
            for (Iterator <Product> iterator = products.iterator(); iterator.hasNext(); ) {
                Product product = iterator.next();
                if (product.getId() == id) {
                    iterator.remove();
                }
            }
            System.out.println("Продукт успешно удален!\n");
        } else {
            System.out.println("Товара с таким id не существует.\n");
        }
    }

    public void editProduct (Product editedProduct) {
        if (productsList.stream().anyMatch(o -> o.getId() == editedProduct.getId())) {
            Collection <Product> products = getProducts();
            for (Iterator <Product> iterator = products.iterator(); iterator.hasNext(); ) {
                Product product = iterator.next();
                if (product.getId() == editedProduct.getId()) {
                    iterator.remove();
                }
            }
            productsList.add(editedProduct);
            System.out.println("Продукт успешно изменен!\n");
        } else {
            System.out.println("Товара с таким id не существует.\n");
        }
    }
}
