class Solution:
    def sequentialDigits(self, low: int, high: int) -> List[int]:
        char = '123456789'
        result = []

        for i in range (9) :
            for j in range (i , 9) :
                current = char[i : j+1]
                num = int(current)
                if low <= num <= high :
                    result.append(num)
        result.sort()
        return result
    

        