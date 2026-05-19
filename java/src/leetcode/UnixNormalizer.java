package leetcode;

import java.util.LinkedList;

public class UnixNormalizer {
    public static void main(String[] args) {
        UnixNormalizer main = new UnixNormalizer();

        System.out.println(main.normalize("/foo/bar//baz/asdf/quux/..")); // "/foo/bar/baz/asdf"
        System.out.println(main.normalize("./config/../etc")); // "etc"
        System.out.println(main.normalize("/////documents/root/.././../etc")); // "/etc"
        System.out.println(main.normalize("a/../../b")); // "../b"
        System.out.println(main.normalize("/a/../../b")); // "/b"

    }

    public String normalize(String input) {
        boolean isAbsolute = input.startsWith("/");

        String[] parts =  input.split("/");


        LinkedList<String> list = new LinkedList<>();
        for(int i = 0; i< parts.length; i++){
            String cur = parts[i];

            if(cur.equals("") || cur.equals(".")){
                continue;
            }

            if(cur.equals("..")){
                if(list.size() > 0){
                    list.removeLast();
                } else {
                    list.add("..");
                }
            } else {
                list.addLast(cur);
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("/");
        for(int i = 0; i< list.size();i++){
            sb.append(list.get(i));
            if(i != list.size()-1){
                sb.append("/");
            }
        }


        return sb.toString();
    }


}
