"""
Author: Abhishek
Date Modified: 3 October 2022
"""
from heapq import *
from collections import Counter

s = "Hello Huffman"

def huffman_coding(s):
    freq = Counter(s)

    heap = [[f, [char, ""]] for f, char in freq.items()]
    heapify(heap)

    while len(heap) > 1:
        right = heappop(heap) # 0
        left = heappop(heap) # 1

        for pair in right[1:]:
            pair[1] = '0' + pair[1]
        for pair in left[1:]:
            pair[1] = '1' + pair[1]

        heappush(heap, ([right[0] + left[0]] + right[1:] + left[1:]))

    return heap

print(huffman_coding(s))
