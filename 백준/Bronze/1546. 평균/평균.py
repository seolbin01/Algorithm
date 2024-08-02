import sys
n=int(sys.stdin.readline())
l=list(map(int,sys.stdin.readline().split()))
M=max(l); avg=0
for i in range(n):
    l[i] = l[i]/M*100
for i in range(n):
    avg += l[i]
avg=avg/n
print(avg)