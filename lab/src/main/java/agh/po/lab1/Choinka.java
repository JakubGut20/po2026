public class Choinka {
    public static void main(String[] args) {
        String choinka = "*";
        int argument = Integer.parseInt(args[0]);
        for(int i = 1; i<=argument; i++){
            System.out.println(choinka.repeat(i));
        }
    }
}
