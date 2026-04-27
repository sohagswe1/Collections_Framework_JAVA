
    
    public class StringBuilderDemo {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");

        
        sb.append(" World");
        System.out.println(sb); // Hello World

        
        sb.insert(5, " Java");
        System.out.println(sb);

        sb.replace(0, 5, "Hi");
        System.out.println(sb);

    
        sb.delete(2, 7);
        System.out.println(sb);

       
        sb.deleteCharAt(1);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        System.out.println(sb.charAt(0));

      
        sb.setCharAt(0, 'X');
        System.out.println(sb);

     
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());

       
        sb.ensureCapacity(50);

       
        System.out.println(sb.substring(0, 3));

       
        System.out.println(sb.indexOf("o"));

       
        System.out.println(sb.lastIndexOf("o"));

        
        String result = sb.toString();
        System.out.println(result);

        
        sb.setLength(4);
        System.out.println(sb);
    }
}

