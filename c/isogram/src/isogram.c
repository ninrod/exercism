#include "isogram.h"

#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

/* void qsort(void* ptr, size_t count, size_t size, int (*comp)(const void*, const void*)); */

int comp (const void* e1, const void *e2) {
  int a = *((char*) e1);
  int b = *((char*) e2);
  if (a < b)
    return -1;
  if (a > b)
    return 1;
  return 0;
}

bool is_isogram(const char phrase[]) {
  char *s = malloc(strlen(phrase));
  strcpy(s, phrase);
  for(int i = 0; s[i]; i++){
    s[i] = tolower(s[i]);
  }
  qsort(s, strlen(s), sizeof(*s), comp);
  printf("sorted string = %s", s);
  for (size_t i = 1; i < strlen(s); ++i)
    if (s[i-1] == s[i]) {
      free(s);
      return false;
    }
  free(s);
  return true;
}

void dump_result(const char s[]) {
  bool b = is_isogram(s);
  if (b) {
    printf("%s É um isograma!\n", s);
  } else {
    printf("%s NÃO é um isograma!\n", s);
  }
}

int main() {
  dump_result("isogram");
  dump_result("filipe");
  dump_result("thumbscrew-japingly");
}