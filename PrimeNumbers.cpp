/* This below C++ code print all the prime numbers between the given bound i.e.,
    Print all prime numbers between [l,r].  */

#include<bits/stdc++.h>
using namespace std;

const int N = 1e7 + 10;
std::vector<bool> isPrime(N, 1);

void SieveOfEratosthenes() {
  isPrime[0] = isPrime[1] = false;

  for (int i = 2 ; i < N ; i++) {
    if (isPrime[i] == true) {
      for (int j = i * 2; j < N; j += i)
        isPrime[j] = false;
    }
  }
}


void solve() {

  SieveOfEratosthenes();
  int l, r;
  cin >> l >> r;

  for (int i = l; i <= r; ++i)
  {

    if (isPrime[i] == 1)
      cout << i << " ";
  }
  cout << endl;
}
int main() {

  solve();

  return 0;
}
