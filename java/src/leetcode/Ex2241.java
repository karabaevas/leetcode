package leetcode;

public class Ex2241 {
    public class ATM {
//    }

        int[] storage = new int[5];
        int[] mapping = new int[5];

        //    0 - 20, 1 - 50, 2 - 100, 3 - 200, 4 - 500
        public ATM() {
            mapping[0] = 20;
            mapping[1] = 50;
            mapping[2] = 100;
            mapping[3] = 200;
            mapping[4] = 500;
        }

        public void deposit(int[] banknotesCount) {
            for (int i = 0; i < banknotesCount.length; i++) {
                storage[i] = storage[i] + banknotesCount[i];
            }
        }


        public int[] withdraw(int amount) {
            if (amount < mapping[0]) {
                return new int[]{-1};
            }

            int[] res = new int[storage.length];

            for (int i = storage.length - 1; i >= 0; i--) {
                if (amount == 0) {
                    break;
                }
                if (storage[i] == 0) {
                    continue;
                }
                int nominal = mapping[i];
                if (nominal > amount) {
                    continue;
                }

                int counter = Math.min(storage[i], amount / nominal);
                res[i] = counter;
                amount = amount - counter * nominal;

            }

            if (amount > 0) {
                return new int[]{-1};
            }

            for (int i = 0; i < res.length; i++) {
                storage[i] = storage[i] - res[i];
            }

            return res;
        }

/**
 * Your ATM object will be instantiated and called as such:
 * ATM obj = new ATM();
 * obj.deposit(banknotesCount);
 * int[] param_2 = obj.withdraw(amount);
 */
    }
}
