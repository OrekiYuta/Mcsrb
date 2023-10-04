package com.elias.mcsrb;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;

@Slf4j
public class QuickTest {
    public static void main(String[] args) {

        String ddl = "CREATE TABLE my_table (\n" +
                "    id INT PRIMARY KEY,\n" +
                "    name VARCHAR(50),\n" +
                "    age INT\n" +
                ");";
        String tableName = "my_table";
        int numInserts = 10; // 要生成的INSERT语句的数量

        String insertStatements = generateInsertStatements(ddl, tableName, numInserts);
        System.out.println(insertStatements);

    }

    public static String generateInsertStatements(String ddl, String tableName, int numInserts) {
        StringBuilder insertStatements = new StringBuilder();

        // 提取表的列名
        String[] columns = ddl.split("\n");
        StringBuilder columnNames = new StringBuilder();
        for (String column : columns) {
            if (column.contains("INT") || column.contains("VARCHAR")) {
                String columnName = column.trim().split(" ")[0];
                columnNames.append(columnName).append(", ");
            }
        }
        columnNames.delete(columnNames.length() - 2, columnNames.length()); // 移除最后的逗号和空格

        Random random = new Random();

        for (int i = 1; i <= numInserts; i++) {
            StringBuilder values = new StringBuilder();
            for (String column : columns) {
                if (column.contains("INT")) {
                    values.append(random.nextInt(100)).append(", ");
                } else if (column.contains("VARCHAR")) {
                    values.append("'RandomName").append(i).append("', ");
                }
            }
            values.delete(values.length() - 2, values.length()); // 移除最后的逗号和空格

            String insertStatement = String.format("INSERT INTO %s (%s) VALUES (%s);", tableName,
                    columnNames.toString(), values.toString());
            insertStatements.append(insertStatement).append("\n");
        }

        return insertStatements.toString();
    }
}
