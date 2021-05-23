
import java.util.Scanner;

public class DemSoLanXuatHien_PT {
    public static void main(String[] args)
    {
        int n, x, count = 0, i = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so phan tu trong mang:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Nhap phan tu:");
        for(i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.print("Chon phan tu xuat hien:");
        x = s.nextInt();
        for(i = 0; i < n; i++)
        {
            if(a[i] == x)
            {
                count++;
            }
        }
        System.out.println("So lan phan tu nay xuat hien:"+count);
    }
}
