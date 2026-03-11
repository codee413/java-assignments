public class OOPSBannerAppUC5 {

    public static void main(String[] args) {

        
        String[] banner = {
            String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*"),
            String.join("", "*", " ", "O", " ", "O", " ", "P", " ", "S", " ", "*"),
            String.join("", "*", " ", "O", " ", "O", " ", "P", " ", "S", " ", "*"),
            String.join("", "*", " ", "O", " ", "O", " ", "P", " ", "S", " ", "*"),
            String.join("", "*", " ", "O", " ", "O", " ", "P", " ", "S", " ", "*"),
            String.join("", "*", " ", "O", " ", "O", " ", "P", " ", "S", " ", "*"),
            String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}