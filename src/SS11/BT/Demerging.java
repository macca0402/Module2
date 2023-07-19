package SS11.BT;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class Record {
    String name;
    String gender;
    Date date;

    Record(String name, String gender, Date date) {
        this.name = name;
        this.gender = gender;
        this.date = date;
    }

}


public class Demerging {
    public static void main(String[] args) {
        //Khởi tạo danh sách
        Record[] records = {
                new Record("nghit", "nam", new Date(12 / 8 / 2003)),
                new Record("tan", "nam", new Date(12 / 8 / 2001)),
                new Record("Nhi", "nu", new Date(12 / 8 / 2009)),

        };
        Queue<Record> NU = new LinkedList<>();
        Queue<Record> NA = new LinkedList<>();
        // Phân loại và nạp vào queue
        for (Record i : records) {
            if (i.gender.equals("nu")) {
                NU.add(i);
            } else if (i.gender.equals("nam")) {
                NA.add(i);
            }
        }
        try {
            FileWriter fw = new FileWriter("G:\\\\CODEGYM\\\\MODULE2\\\\src\\\\SS11\\\\file.txt");
            while (!NU.isEmpty()) {
                Record record = NU.poll();
                fw.write(record.name + "\n");
            }
            while (!NA.isEmpty()) {
                Record record = NA.poll();
                fw.write(record.name + "\n");
            }
            //
            fw.close();
            System.out.println("Demerging thanh cong");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
