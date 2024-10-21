package chapter10;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Video59 {
    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<>();
        try {
            // Đường dẫn tới tệp tin cụ thể
            FileReader reader = new FileReader("src/input.txt"); // Đường dẫn tương đối
            Scanner fileScanner = new Scanner(reader);
            
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                studentNames.add(line);
            }
            
            fileScanner.close();
            reader.close();
        } catch (IOException e) {
            System.out.println("Lỗi khi mở tệp tin: " + e.getMessage());
        }
        
        System.out.println("Danh sách sinh viên: " + studentNames);
    }
}
