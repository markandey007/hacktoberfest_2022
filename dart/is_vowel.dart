/**
 * Author: Rizky Pratama Syahrul Ramadhan
 * Date Modified Saturday, 1 October 2022
 */

void main() {
  print(isVowel('a'));
}

// Checks if [char] is a Vowel.
bool isVowel(String char) {
  return char == 'a' ||
      char == 'e' ||
      char == 'i' ||
      char == 'o' ||
      char == 'u' ||
      char == 'A' ||
      char == 'E' ||
      char == 'I' ||
      char == 'O' ||
      char == 'U';
}
