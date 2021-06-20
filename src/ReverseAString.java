//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class ReverseAString {
    public static String Name;

    public ReverseAString() {
    }

    public static void main(String[] args) {
        System.out.println("hello GIT");
        Name = "Deepak Kumar";
        ReverseAString(Name);
        ReverseAStringUsingForLoop(Name);
    }

    public static void ReverseAString(String s) {
        StringBuffer sb = new StringBuffer(s);
        System.out.println(sb.reverse());
        System.out.println("-----------------------------------------------------");
    }

    public static void ReverseAStringUsingForLoop(String s) {
        String reverse = "";

        for(int i = Name.length() - 1; i >= 0; --i) {
            reverse = reverse + Name.charAt(i);
        }

        System.out.println(reverse);
    }
}
