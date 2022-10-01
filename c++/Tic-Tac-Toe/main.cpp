#include <iostream>

using namespace std;

void draw(bool o[9], bool x[9]);
bool check(bool o[9], bool x[9], int i, string *first, string *second);
int input(int a);
void name(string *a, string *b);

int main(int argc, char *argv[]) {
  int a;

  string player1;
  string player2;

  name(&player1, &player2);

  bool o[9], x[9];

  for (int i = 0; i < 9; i++) {
    o[i] = 0;
    x[i] = 0;
  }

  int d = 0;

  for (int i = 0; i < 5 && check(o, x, i, &player1, &player2) == false; i++) {

    draw(o, x);

    cout << player1 << " enter the block of your choice : ";
    cin >> a;
    // d++;
    a = input(a - 1);
    o[a] = 1;
    d++;

    draw(o, x);

    if (check(o, x, d, &player1, &player2)) {
      return 0;
    }

    cout << player2 << " enter the block of your choice : ";
    cin >> a;
    a = input(a - 1);
    x[a] = 1;
    d++;

    draw(o, x);

    if (check(o, x, d, &player1, &player2)) {
      return 0;
    }
  }

  return 0;
}
