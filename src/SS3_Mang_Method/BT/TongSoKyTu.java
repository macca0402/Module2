package SS3_Mang_Method.BT;

import java.util.Scanner;

public class TongSoKyTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi = sc.nextLine();
        chuoi = chuoi.toString();
        System.out.println("Tong so ky tu: " + chuoi.length());
    }
}
