package Java_Code;

public class StringBuilder_Basic {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Vaduni");

        // charAt(index)
        System.out.println(sb.charAt(5));

        // setCharAt()
        sb.setCharAt(3, 'i');
        System.out.println(sb);

        // insert()
        sb.insert(1, 'a');
        System.out.println(sb);

        // delete()
        sb.delete(1, 2);
        System.out.println(sb);

        // append()
        sb.append("Niranjan");
        System.out.println(sb);

        // length()
        System.out.println(sb.length());

        // reverse()
        System.out.println(sb.reverse());
    }
}
