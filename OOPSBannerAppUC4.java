public class OOPSBannerApp {
    public static void main(String[] args) {
        String[] banner = new String[5];
        banner[0] = String.join("  ", "****", "\t", "****", "\t", "*****", "\t", "****");
        banner[1] = String.join("  ", "*  *", "\t", "*  *", "\t", "*   *", "\t", "*");
        banner[2] = String.join("  ", "*  *", "\t", "*  *", "\t", "*****", "\t", "****");
        banner[3] = String.join("  ", "*  *", "\t", "*  *", "\t", "*    ", "\t", "   *");
        banner[4] = String.join("  ", "****", "\t", "****", "\t", "*    ", "\t", "****");
        for (int i = 0; i < banner.length; i++) {
            System.out.println(banner[i]);
        }
    }
}
