package altimetrik.raj;

public class Main {

    public static void main(String[] args) {
	printMegaBytesAndKiloBytes(1042);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes<0){
            System.out.println("Invalid Value");
        }
        else if (kiloBytes==0){
            System.out.println("0 KB = 0 MB and 0 KB");
        }
        else{
            int mb=kiloBytes/1024;
            int kb=kiloBytes%1024;
            System.out.println(kiloBytes +" KB = "+mb+" MB "+kb+" KB");
        }
    }
}
