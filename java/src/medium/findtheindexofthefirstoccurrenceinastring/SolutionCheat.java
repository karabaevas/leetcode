package medium.findtheindexofthefirstoccurrenceinastring;

class SolutionCheat {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        System.out.println(new SolutionCheat().strStr("aaaasadbutsad", "sad"));
    }
}