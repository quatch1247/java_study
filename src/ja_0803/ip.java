package ja_0803;

 import java.net.*;
import java.io.*;


public class ip{
public static void main(String args[]) throws IOException{
try{
String inputLine;
Runtime r=Runtime.getRuntime();
Process p=r.exec("cmd.exe /c powercfg/batteryreport");
BufferedReader in=new BufferedReader(new InputStreamReader(p.getInputStream()));
while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
            //pingResult += inputLine;
        }
}
catch(Exception e){
System.out.println(e);
}
}
}