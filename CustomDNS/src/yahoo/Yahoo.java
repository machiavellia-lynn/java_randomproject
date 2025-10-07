package yahoo;
import java.util.Scanner;

public class Yahoo {
    public static void main(String[] args) {
        Scanner doubleSales = new Scanner(System.in);
        
        System.out.print("Enter any domain name: ");
        String domainName = doubleSales.nextLine();
        
        String fullDomainName = "www." + domainName + ".com";

        System.out.println(fullDomainName);
        
        doubleSales.close();
    }
}