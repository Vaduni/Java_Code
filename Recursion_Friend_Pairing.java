package Java_Code;

public class Recursion_Friend_Pairing {
    public static int pairingFriends(int n) {
        if (n <= 1) {
            return 1;
        }
        // single person
        int single = pairingFriends(n - 1);
        // in pair
        int pair = (n - 1) * pairingFriends(n - 2);
        return single + pair;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(pairingFriends(n));
    }
}
