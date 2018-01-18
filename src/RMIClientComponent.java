import java.net.MalformedURLException;
import java.rmi.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RMIClientComponent {
     public static void main(String[] args){
        new RMIClientComponent().run();
    }
      private void CongHaiSo(){

        }
     private void run(){

        //----------a+b----------------------
        try {
            RMIInterface object=(RMIInterface) Naming.lookup("rmi://localhost:"+6666+"/RMIImplementation");
        
        //khai bao     
       
//        int a,b;
//        System.out.println("==== RMI - Distributed System  ====");
//        System.out.println("---------Cong hai so---------");
//        Scanner scan =new Scanner(System.in);
//        System.out.println("nhap a vo di: ");
//        a=scan.nextInt();
//        System.out.println("nhap b vo di: ");
//        b=scan.nextInt();
//        System.out.println("------KET QUA--------);
//
//        System.out.println(object.Cong2so(a, b)+"");
        //------------------ Nhap Mang----------------------------------------
//        int n;
//        int c[];
//        System.out.println("-------Nhap so phan tu cua mang---------");
//        System.out.println("Moi nhap: ");
//        Scanner scan1 =new Scanner(System.in);
//        n=scan1.nextInt();
//        c = new int[n];
//        for (int z=0; z<c.length;z++)
//            {
//                System.out.print("Nhap phan tu thu "+(z+1)+": ");
//                c[z] = scan1.nextInt();
//            }
//        //---------------Fibonaci------------     
//       
//        int d[]=new int[c.length];
//       
//       d=object.kq_GiamDan(object.kq_Fibonaci(c));
//
//       System.out.println("======Nhung so Fibonaci thoa man la ====");
//       
//       for(int k1=0;k1<d.length;k1++)
//       {
//           if(d[k1] != 0)
//           {
//            System.out.println(d[k1]+"");
//           }
//       }   
       //------------So chinh Phuong---------------
//        int e[]=new int[c.length];
//        e=object.kq_TangDan(object.kq_SoChinhPhuong(c));
//        System.out.println("=====So chinh Phuong==========");
//        for(int k2=0;k2<e.length;k2++)
//       {
//            if(e[k2] != 0)
//           {
//                System.out.println(e[k2]+"");
//           }
//       } 
//        float kq=object.kq_TrungBinhMang(object.kq_SoChinhPhuong(e));
//        System.out.println("kq la"+kq);
            
        
        //-------------Ma Sinh Vien---------------
//        System.out.println("Vui Long Nhap Ma So Sinh Vien:  ");
//        Scanner mssv =new Scanner(System.in);
//        String ms = mssv.nextLine();
//        System.out.println("3 so cuoi mssv la: "+object.MaSV_3SoCuoi(ms));
        
        //------------------Nam Nhuan----------------
//        System.out.println("Vui Long nhap so thang:  ");
//        Scanner thang =new Scanner(System.in);
//        int sothang =thang.nextInt();
//        System.out.println("Vui Long nhap so nam:  ");
//        Scanner nam =new Scanner(System.in);
//        int sonam =nam.nextInt();
//        System.out.println("Nam" + sonam + " Lieu Co la nam Nhuan? \n =1 La nam Nhuan \n =0 Khong la nam Nhuan \n Vay KetQua=  " +object.KTnamnhuan(sonam) );
//        System.out.println("Thang "+sothang+" Co "+object.Songay(sothang, sonam)+" Ngay");
        //-----------------XEP LOAI----------------
//        System.out.println("Vui Long Nhap So Diem  ");
//        Scanner diem =new Scanner(System.in);
//        float sodiem =diem.nextFloat();
//        System.out.println("Voi diem = " +sodiem+" Thi Hanh Kiem Cua Ban La: "+object.XepLoai(sodiem));
        //------------KT DOI XUNG - CAT CHUOI----------------
//            System.out.println("Vui Long Nhap Chuoi Do Dzo:  ");
//            Scanner chuoi =new Scanner(System.in);
//            String ktchuoi = chuoi.nextLine();
//            System.out.println("Chuoi co doi xung ko \n 1 la co \n 0 la Khong \n Vay Chuoi=: "+object.KTChuoiDX(ktchuoi));              
//            System.out.println("Chuan Hoa Danh Tu Rieng: "+object.chuanHoaDanhTuRieng(ktchuoi));  
//            
         //-------------------Giai Thua-----------------------    
//        System.out.println("Vui Long nhap so muon tinh Giai Thua:  ");
//        Scanner gt =new Scanner(System.in);
//        int sogiaithua =gt.nextInt();
//        System.out.println("Giai thua cua "+sogiaithua+" la:  "+object.Tinhgiaithua(sogiaithua));



        // khong dc sua
        } catch (NotBoundException ex) {
            Logger.getLogger(RMIClientComponent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(RMIClientComponent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(RMIClientComponent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
