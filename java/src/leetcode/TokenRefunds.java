package leetcode;

public class TokenRefunds {
    public static void main(String[] args) {
        TokenRefunds main = new TokenRefunds();



    }

//    n = 4, -пары
//    k = 90,
//    days = [(20, 5), (10, 5), (5, 5), (5, 5), (7, 5), (20, 5), (15, 5)] —> 4

//    потому что сумма возвратов от пар Алисе суммарно за дни с первого по четвертый включительно меньше 90 (10*3 + 5*3 + 5*3  + 7*3)

    public int maxConsecutiveDays(int n, long k, int[][] days) {
        int left = 0;
        int right = 0;

        int lasum = 0;
        int alsum = 0;

        int res = 0;
        while(right < days.length) {
            int[] day = days[right];
            int al = day[0];
            int la = day[1];

            lasum = lasum + la*(n-1);
            alsum = alsum + al*(n-1);

            while(left < days.length && (lasum > k || alsum > k)){
                day = days[left];
                al = day[0];
                la = day[1];
                lasum = lasum - la*(n-1);
                alsum = alsum - al*(n-1);
                left++;
            }
            res = Math.max(res, right - left + 1);

            right++;
        }

        return res;
    }


}
