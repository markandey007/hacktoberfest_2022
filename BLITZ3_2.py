# https://www.codechef.com/submit/BLITZ3_2
a=int(input())
for i in range(a):
    a,b,c=map(int,input().split())
    d=(180+a)*2
    print(d-(b+c))