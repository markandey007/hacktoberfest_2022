#include <iostream>

using std::cin;
using std::cout;
using std::string;

void name(string *a, string *b) {
  // string s;
  cout << "Player1 enter your name: ";
  cin >> *a;
  cout << "Player2 enter your name: ";
  cin >> *b;
}
