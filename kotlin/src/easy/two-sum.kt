package easy

class Solution {
        fun twoSum(nums: IntArray, target: Int): IntArray {
            val hashMap: MutableMap<Int, Int> = HashMap()

            for ((index, num) in nums.withIndex()) {
                hashMap.compute(num, { _, _ ->
                    index
                })
             }

            for ((index, num) in nums.withIndex()) {
                val value = target - num
                val alsoIndex = hashMap[value]

                if(alsoIndex != null && index != alsoIndex){
                    return intArrayOf(index, alsoIndex)
               }
            }

            return intArrayOf(0,0)
        }
}


fun main() {

//    val message = Solution().twoSum(intArrayOf(2, 7, 11, 15), target = 9)
    val message = Solution().twoSum(intArrayOf(3,3), target = 6)
    println(message)
}