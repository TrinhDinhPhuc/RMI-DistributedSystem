import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RMIServerComponent {
     public static void main(String[] args){
       try {
           new RMIServerComponent().run();
       } catch (MalformedURLException ex) {
           Logger.getLogger(RMIServerComponent.class.getName()).log(Level.SEVERE, null, ex);
       }
   } 
   private void run() throws MalformedURLException{
    
       try{
           RMIImplementation RMIImplementation =new RMIImplementation();
           Registry registry = LocateRegistry.createRegistry(6666);
           Naming.rebind("rmi://localhost:6666/RMIImplementation",RMIImplementation);
       System.out.println("Server is running...");
       }catch(RemoteException ex){
           Logger.getLogger(RMIServerComponent.class.getName()).log(Level.SEVERE,null, ex);
       }catch(MalformedURLException ex){
           Logger.getLogger(RMIServerComponent.class.getName()).log(Level.SEVERE,null, ex);
   }
}
}
