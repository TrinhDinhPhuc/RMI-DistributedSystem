import java.rmi.*;

public interface RMIInterface  extends Remote{
    
    public int Cong2so(int a,int b) throws RemoteException;  
  
    public boolean KT_SoChinhPhuong(int n) throws RemoteException;

    public int[] kq_SoChinhPhuong(int a[]) throws RemoteException;

    public boolean Is_Perfect_Square(int n) throws RemoteException;
    
    public boolean KT_Fibonaci(int n) throws RemoteException;

    public int[] kq_Fibonaci(int a[]) throws RemoteException;  
    
    public int[] kq_TangDan(int a[]) throws RemoteException;
    
    public int[] kq_GiamDan(int a[]) throws RemoteException;

    public int kq_Max(int a[]) throws RemoteException;
    
    public int kq_Min(int a[]) throws RemoteException;
    
    public int kq_CongMang(int a[]) throws RemoteException;
    
    public float kq_TrungBinhMang(int a[]) throws RemoteException;
    
    public String MaSV_3SoCuoi(String a) throws RemoteException;

    public int KTnamnhuan(int a)throws RemoteException;
    
    public int Songay(int n,int nam)throws RemoteException;

    public String XepLoai(float diem)throws RemoteException;

    public double Tinhgiaithua(int n) throws RemoteException;              
                  
    public int KTChuoiDX(String s) throws RemoteException;
                  
    public String ChuanhoaSpace(String s) throws RemoteException;              
    
    public String chuanHoa(String str)  throws RemoteException;
    
    public String chuanHoaDanhTuRieng(String str)  throws RemoteException;
}
