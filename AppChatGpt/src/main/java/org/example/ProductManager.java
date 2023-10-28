package org.example;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class ProductManager {
    private final  Path productPath;
     public ProductManager() throws URISyntaxException{
         ClassLoader classLoader = ProductManager.class.getClassLoader();
         productPath = Paths.get(Objects.requireNonNull(classLoader.getResource("products.txt")).toURI());
    }

        public List<String> getAllProducts() throws URISyntaxException, IOException {



            return Files.readAllLines(productPath, StandardCharsets.UTF_8);

}
public void addProduct(String product) throws IOException, URISyntaxException {

    HashSet<String> products = new HashSet<>(getAllProducts());
    if (!products.contains(product)) {
        Files.writeString(productPath, System.lineSeparator() + product, StandardOpenOption.APPEND);
    } else {
        System.out.println("Product already exists");
    }
}
public void deleteProduct(String product) throws IOException, URISyntaxException {
    List<String> products = getAllProducts();
    if (products.contains(product)) {
        products.remove(product);
        Files.write(productPath, products, StandardCharsets.UTF_8);
    } else {
        System.out.println("Product doesn't exist");
    }

  }


}
