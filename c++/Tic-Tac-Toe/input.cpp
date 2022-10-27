#include <iostream>

using std::cin;
using std::cout;

bool c[9];

int input(int a) {

  if (a + 1 == 0) {
    printf("Invalid input! Enter the correct input : ");
    cin >> a;
    a = input(a - 1);
    return a;
  }

  if (c[a] == 0) {
    c[a] = 1;
    return a;
  } else {
    cout << "The block is already marked. Please select another one : ";
    cin >> a;
    a = input(a - 1);
    return a;
  }
  // return a-1;
}
