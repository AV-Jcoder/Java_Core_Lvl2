package org.example.part_10_Input_Output_Stream.lesson_60_practice_hard.task_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static  java.nio.file.StandardOpenOption.*;

public final class ProductUtils {

    private ProductUtils() {}

    public static void writeListProductToCsvFile(Path path, List<Product> list) throws IOException {
        Files.write(path, list.stream().map(String::valueOf).toList(), CREATE, TRUNCATE_EXISTING);
    }

    public static List<Product> mergeListsProduct(List<Product> list1, List<Product> list2) {
        list1.addAll(list2);
        return new ArrayList<>(list1.stream()
                .collect(Collectors.toMap(n -> n.getId(), i -> i, (a, b) -> {
                    if (a.getName() == null) {
                        a.setName(b.getName());
                        a.setDescription(b.getDescription());
                    }
                    if (a.getPrice() == null) {
                        a.setPrice(b.getPrice());
                    }
                    return a;
                })).values());
    }

    public static List<Product> getListProductItemPriceFromCsv(Path path) throws IOException {
        return Files.lines(path)
                .map(n -> {
                    String[] columns = n.split(",");
                    Integer id = Integer.parseInt(columns[0]);
                    Double price = Double.parseDouble(columns[1]);
                    Product product = new Product();
                    product.setId(id);
                    product.setPrice(price);
                    return product;
                })
                .collect(Collectors.toList());
    }

    public static List<Product> getListProductItemNameFromCsv(Path path) throws IOException {
        return Files.lines(path)
                .map(n -> {
                    String[] columns = n.split(",");
                    Integer id = Integer.parseInt(columns[0]);
                    String name = columns[1];
                    String descr = columns[2];
                    Product product = new Product();
                    product.setId(id);
                    product.setName(name);
                    product.setDescription(descr);
                    return product;
                })
                .collect(Collectors.toList());
    }
}
