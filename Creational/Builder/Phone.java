import java.util.*;

public class Phone{
    private OS os;
    private RAM ram;
    private Phone(){}
    public RAM setRAM(int r){
        if(r==6){
            this.ram = ram6GB.getRam(); 
        }
        if(r==8){
            this.ram = ram8GB.getRam(); 
        }
        return this.ram;
    }

    public OS setOS(String os){
        if(os.equals("IOS")){
            this.os = IOS.getOS();
        }
        if(os.equals("Android")){
            this.os = Android.getOS();
        }

        return this.os;
    }

    public Phone getPhone(){
        return this;
    }
}
