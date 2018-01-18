import java.lang.reflect.Array;
import java.util.ArrayList;
import java.rmi.*;
import java.rmi.server.*;
import java.util.Arrays;
public  class RMIImplementation extends UnicastRemoteObject implements RMIInterface {
      public RMIImplementation() throws RemoteException{    
    }
       
      public int Cong2so(int a,int b) throws RemoteException{
          return (a+b);
      }
    //so chinh phuong
    public boolean KT_SoChinhPhuong(int n) throws RemoteException {
        for (int i = 1; i <= n / 2; i++)
        if (i * i == n)
            return true; 
    return false; 
    }
    
    public int[] kq_SoChinhPhuong(int a[]) throws RemoteException{
       int j=0;
       int b[]=new int[a.length];
        
        for(int i=0;i<a.length;i++)
            if(KT_SoChinhPhuong(a[i])==true)
            {     
                b[j]=a[i];
                j++;
            }
        return b;    
    }
    
    //Fibonaci
   
    public boolean Is_Perfect_Square(int n) throws RemoteException{
        int s=(int) Math.sqrt(n);
        return (s*s==n); 
    }
    public boolean KT_Fibonaci(int n) throws RemoteException {
        // n is Fibonacci if one of 5*n*n + 4 or 5*n*n - 4 or both
        // is a perfect square
         if(Is_Perfect_Square(5*n*n + 4) ||  Is_Perfect_Square(5*n*n - 4))
             return true;
         else
             return false;
}
    public int[] kq_Fibonaci(int a[]) throws RemoteException{
    int j=0;
    int b[]=new int[a.length];
    for (int i=0;i<a.length;i++)
        if(KT_Fibonaci(a[i])==true)
        {
            b[j]=a[j];
            j++;
        }
    return b;
    }
    
    public int[] kq_GiamDan(int a[]) throws RemoteException{
    int j=0,temp=0;
    for (int i=0;i<a.length;i++)
    {
        for(int k=i+1;k<a.length;k++)
        
            if((a[i])>a[k])
            {
                temp=a[i];
                a[i]=a[k];
                a[k]=temp;
            }
        }
    return a;
    }
    public int[] kq_TangDan(int a[]) throws RemoteException{
        Arrays.sort(a);
        return a;
    }
    public int kq_Max(int a[]) throws RemoteException
    {
       int temp=0;
       for(int i=0;i<a.length;i++)
       {
            if(a[i]>temp)
            {
                temp=a[i];
            }
       }
        return temp;
    }
    public int kq_Min(int a[]) throws RemoteException
    {
       int temp=0;
       for(int i=0;i<a.length;i++)
       {
            if(a[i]<temp)
            {
                temp=a[i];
            }
       }
        return temp;
    }
    public int kq_CongMang(int a[]) throws RemoteException{
    int j=0,sum=0;
    for (int i=0;i<a.length;i++)
    {
        sum+=a[i];
    }
        return sum;
    }
    public int kq_TruMang(int a[]) throws RemoteException{
    int j=0,sum=0;
    for (int i=0;i<a.length;i++)
    {
        sum-=a[i];
    }
        return sum;
    }
    public float kq_TrungBinhMang(int a[]) throws RemoteException{
    int j=0,sum=0;
    for (int i=0;i<a.length;i++)
    {
        sum+=a[i];
    }
        float average =(float)sum/a.length;
        return average;
    }
   
     public String MaSV_3SoCuoi(String a) throws RemoteException
     {
        int lengh = a.length();
        String b= null;
        b= a.substring(lengh-3);
        return b;
     }
     public int KTnamnhuan(int a)throws RemoteException{
          if ((a%4==0)&&(a%100!=0)) return 1;
          else return 0;
      }
      public int Songay(int n,int nam)throws RemoteException{
          switch(n){
              case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                  return 31; 
              case 4: case 6: case 9: case 11:
                  return 30;
              case 2: 
                  if(KTnamnhuan(nam)==1) return 29;
                  else return 28;
              default:
                  return 0;
          }   
      }
    
      public String XepLoai(float diem)throws RemoteException{
          String XL="";
          if(diem <5) XL="HANH KIEM YEU";
          if((diem >=5)&&(diem<7)) XL="TRUNG BINH";
          if((diem>=7)&&(diem<8))  XL="KHA";
          if(diem>=8) XL="GIOI :D";
          if((diem>10)||(diem<0)) XL="DIEM KHONG HOP LE";
          return XL;     
      }
      public double Tinhgiaithua(int n) throws RemoteException{
       if(n==0) return 1;
       else return n*Tinhgiaithua(n-1);
      }
      public int KTChuoiDX(String s) throws RemoteException{
        if (s.substring(0, s.length() / 2).equals(new StringBuffer(s.substring(s.length() - (s.length() / 2))).reverse().toString())) {
             return 1;
        } else {
            return 0;
        }

      }
      public String ChuanhoaSpace(String s) throws RemoteException{
          s.trim();
          return s;
      }
      public String chuanHoa(String str)  throws RemoteException {
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        return str;
    }
      public String chuanHoaDanhTuRieng(String str)  throws RemoteException {
        str = chuanHoa(str);
        String temp[] = str.split(" ");
        str = ""; // ? ^-^
        for (int i = 0; i < temp.length; i++) {
            str += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if (i < temp.length - 1) // ? ^-^
                str += " ";
        }
        return str;
    }
      
     
}