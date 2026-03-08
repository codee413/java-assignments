public class OOPSBannerAppUC4 {

    public static void main(String[] args) {

        
        String[] banner = {
            String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*"),
            String.join("", "*", " ", "O", "O", "P", "S", " ", "B", "A", "N", "N", "E", "R", " ", "*"),
            String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*")
        };

       
        for (String line : banner) {
            System.out.println(line);
        }
    }
}