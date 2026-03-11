public class OOPSBannerAppUC5 {
    public static void main(String[] args) {
        String[] banner = {
                String.join("  ", "****", "\t", "****", "\t", "*****", "\t", "****"),
                String.join("  ", "*  *", "\t", "*  *", "\t", "*   *", "\t", "*"),
                String.join("  ", "*  *", "\t", "*  *", "\t", "*****", "\t", "****"),
                String.join("  ", "*  *", "\t", "*  *", "\t", "*", "\t\t", "   *"),
                String.join("  ", "****", "\t", "****", "\t", "*", "\t\t", "****")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}