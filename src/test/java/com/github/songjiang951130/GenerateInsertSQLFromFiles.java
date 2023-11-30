package com.github.songjiang951130;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GenerateInsertSQLFromFiles {

    public static void main(String[] args) {
        String skuFilePath = "sku.txt";
        String priceFilePath = "price.txt";

        try {
            String[] skuArray = readLinesFromFile(skuFilePath);
            String[] priceArray = readLinesFromFile(priceFilePath);
            StringBuilder sql = new StringBuilder();
            if (skuArray.length == priceArray.length) {
                String pre = "INSERT INTO product_specs_bpm (specs_no, approve_price,approve_state) VALUES";
                sql.append(pre);
                for (int i = 0; i < skuArray.length; i++) {
                    String sku = skuArray[i];
                    Integer price = Integer.parseInt(priceArray[i]);

                    // 构建INSERT语句
                    String temp = String.format(" ('%s', %s,%s)", sku, price, 2);
                    sql.append(temp);
                    if (i != skuArray.length - 1) {
                        sql.append(",").append("\n");
                    } else {
                        sql.append(";");
                    }
                }
                System.out.println(sql);

            } else {
                System.out.println("Error: SKU and price files do not have the same number of lines.");
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private static String[] readLinesFromFile(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            return reader.lines().toArray(String[]::new);
        }
    }
}
