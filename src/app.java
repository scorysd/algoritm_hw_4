public class app {
    public static void main(String[] args) {
        String str = "kfdjgkjdfgnjks jgzdfklvnjzdfkj gk sdflk jgsj sgs";
        char[] ch = str.toCharArray();
        System.out.println(HashFunc(ch));
    }
    private static long HashFunc(char[] ch) {
        long res = 1;
        for (int i = 0; i < ch.length; i++) {
            res *= Character.getNumericValue(ch[i]) ^ ch.length / ch.length;
        }
        if (res<0) res = res * -1;
        return res;
    }
}

