# Given an array containing positive and negative elements, find a subarray with alternating positive and negative elements, 
# and in which the subarray is as long as possible. The Longest Alternating Subarray problem differs from the problem of finding 
# the Longest Alternating subsequence. Unlike a subsequence, a subarray is required to occupy consecutive positions within the original array.

# For example, consider array { 1, -2, 6, 4, -3, 2, -4, -3 }. The longest alternating subarray is { 4, -3, 2, -4 }. 
# Note that the longest alternating subarray might not be unique.

# Function to find the length of the longest sublist with alternating
# positive and negative elements
def findLongestSublist(nums):
 
    # base case
    if not nums:
        return
 
    # stores length of longest alternating sublist found so far
    max_len = 1
 
    # stores ending index of longest alternating sublist found so far
    end_index = 0
 
    # stores length of longest alternating sublist ending at the current position
    curr_len = 1
 
    # traverse the given list starting from the second index
    for i in range(1, len(nums)):
 
        # if the current element has an opposite sign than the previous element
        if nums[i] * nums[i - 1] < 0:
 
            # include the current element in the longest alternating sublist ending at
            # the previous index
            curr_len = curr_len + 1
 
            # update result if the current sublist length is found to be greater
            if curr_len > max_len:
                max_len = curr_len
                end_index = i
 
        # reset length if the current element has the same sign as the previous element
        else:
            curr_len = 1
 
    sublist = nums[end_index - max_len + 1: end_index + 1]
    print('The longest alternating sublist is:', sublist)
 
 
if __name__ == '__main__':
 
    nums = [1, -2, 6, 4, -3, 2, -4, -3]
    findLongestSublist(nums)
