package org.example.part_10_Input_Output_Stream.lesson_60_practice_hard.task_1;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

/**
 * Задание 1
 *
 * Даны два файла в формате CSV.
 *
 * CSV (Comma-Separated Values) файл - это обычный текстовый файл,
 * где через запятую (может использоваться и любой другой символ) перечислены значения.
 * Также может быть в первой строчке таких файлов заголовок с названием колонок.
 *
 * Формат первого файла items-price.csv:
 *
 * ID,PRICE
 * 1,9.98
 * 2,25.05
 * 3,16.45
 *
 * Формат второго файла items-name.csv:
 *
 * ID,NAME,DESCRIPTION
 * 1,Шарф,Теплый зимний шарф красного цвета
 * 2,Шапка,Вязаная зеленая шапка
 * 3,Ботинки,Осенние ботинки на толстой подошве
 *
 * Задача:
 *
 * Считать оба CSV файла и объединить их по полю ID в один result.csv, где будут следующие поля: ID,NAME,PRICE.
 *
 * Желательно реализовать доп. функционал:
 * Если для каких-то ID не будет значений в обоих файлах, то записать их в один файл errors.csv, где будет лишь одно поле ID.
 *
 */
public class TaskRunner {

    public static void main(String[] args) throws IOException {
        Path path1 = Path.of("src","main","java","org","example","part_10_Input_Output_Stream",
                "lesson_60_practice_hard","task_1","csv","items-name.csv");
        Path path2 = Path.of("src","main","java","org","example","part_10_Input_Output_Stream",
                "lesson_60_practice_hard","task_1","csv","items-price.csv");
        Path path3 = Path.of("src","main","java","org","example","part_10_Input_Output_Stream",
                "lesson_60_practice_hard","task_1","csv","result.csv");
        Path errorFilePath = Path.of("src","main","java","org","example","part_10_Input_Output_Stream",
                "lesson_60_practice_hard","task_1","csv","errors.csv");

        List<Product> list1 = ProductUtils.getListProductItemNameFromCsv(path1);
        List<Product> list2 = ProductUtils.getListProductItemPriceFromCsv(path2);
        List<Product> mergedList = ProductUtils.mergeListsProduct(list1, list2);
        for (Product product : mergedList) {
            System.out.println(product);
        }

        ProductUtils.writeListProductToCsvFile(path3, mergedList);
        ProductUtils.writeEmptyProductsToCsvFile(errorFilePath, mergedList);
    }
}
