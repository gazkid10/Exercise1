public class AsynchronousCoding {

    public static void main(String[] args) {
        String[] names = {"Andrew", "Grace", "Amara", "Rasheed", "Phillip", "Dorian",
                "rohan", "Jason", "Angelique","Octavia"};

        int i = 9;

        while (i >= 0) {
            StringBuffer reverseNames = new StringBuffer(names[i]);
            reverseNames.reverse();
            System.out.println(i + ": " +reverseNames);
            --i;
        }

    }
}
