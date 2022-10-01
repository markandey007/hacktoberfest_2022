#include <iostream>

using namespace std;

bool check(bool o[9], bool x[9], int d, string *first, string *second) {
  int z = 0;
  bool b = 0;
  for (int i = 0; i < 9; i += 3) {
    if (o[i] && o[i + 1] && o[i + 2]) {
      b = 1;
      z = 1;
    }
    if (x[i] && x[i + 1] && x[i + 2]) {
      b = 1;
      z = 2;
    }
  }

  for (int i = 0; i < 3; i++) {
    if (o[i] && o[i + 3] && o[i + 6]) {
      b = 1;
      z = 1;
    }
    if (x[i] && x[i + 3] && x[i + 6]) {
      b = 1;
      z = 2;
    }
  }

  for (int i = 0; i < 2; i++) {
    int k = 4 - 2 * i;
    int j = 2 * i;
    if (o[j] && o[j + k] && o[j + 2 * k]) {
      b = 1;
      z = 1;
    }
    if (x[j] && x[j + k] && x[j + 2 * k]) {
      b = 1;
      z = 2;
    }
  }

  if (b == 1) {
    if (z == 1) {
      cout << *first << " wins\n";
    } else if (z == 2) {
      cout << *second << " wins\n";
    }
    return true;
  }

  if (b == 0 && d == 9) {
    cout << "It's a draw\n";
    return true;
  }

  return false;
}
