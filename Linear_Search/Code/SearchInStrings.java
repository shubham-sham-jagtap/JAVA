package Linear_Search.Code;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Shubham";
        char n = 'k';
        boolean ans =Search(name, n);
        System.out.println(ans);
    }

    static boolean Search(String str, char target) {
        if(str.length() == 0) {
            return false;
        }

        for(int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
