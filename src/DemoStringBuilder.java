public class DemoStringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        //this will create an empty StringBuilder with initial capacity of 16 characters
        System.out.println("stringBuilder.length() = " + stringBuilder.length());
        System.out.println("stringBuilder.capacity() = " + stringBuilder.capacity());

        stringBuilder.append('a');
        stringBuilder.append(" World");
        System.out.println("stringBuilder.length() = " + stringBuilder.length());
        System.out.println("stringBuilder.capacity() = " + stringBuilder.capacity());

        StringBuilder stringBuilder1 = new StringBuilder("Hello");
        //this will create a StringBuilder with given string and
        // initial capacity of 16 characters + string.length()
        System.out.println("stringBuilder.length() = " + stringBuilder1.length());
        System.out.println("stringBuilder.capacity() = " + stringBuilder1.capacity());
        StringBuilder stringBuilder2 = new StringBuilder(32);

        //this will create an empty StringBuilder
        // with initial capacity of equal to the given capacity
        System.out.println("stringBuilder.length() = " + stringBuilder2.length());
        System.out.println("stringBuilder.capacity() = " + stringBuilder2.capacity());

        //void ensureCapacity(int minimumCapacity)
        stringBuilder2.ensureCapacity(16);
        System.out.println("stringBuilder.capacity() = " + stringBuilder2.capacity());

        // delete or remove a character from StringBuild
        System.out.println("stringBuilder1 = " + stringBuilder1);   // Hello
                                                                    // 01234
        stringBuilder1.delete(2,2);
        System.out.println("stringBuilder.length() = " + stringBuilder1.length());
        System.out.println("stringBuilder1 = " + stringBuilder1);
        System.out.println("stringBuilder.length() = " + stringBuilder1.length());

        //stringBuilder1.deleteCharAt(6);
        System.out.println("stringBuilder1 = " + stringBuilder1);

        //int indexOf(String str)
        StringBuilder stringBuilder3 = new StringBuilder("The quick brown fox jumps over the lazy dog");
        // 0 1 2 3 4
        // T h e   q



        for (int i = 0; i < stringBuilder3.length(); i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < stringBuilder3.length(); i++) {

            System.out.print(stringBuilder3.charAt(i) + " ");
            if(i >= 10)
                System.out.print(" ");
        }
        System.out.println();



    }
}
